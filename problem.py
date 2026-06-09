import collections

def least_steps_to_home(prohibited, data):
    """
    Finds the least number of steps for Andy the ant to reach position x.

    Args:
        prohibited: A list of positions Andy cannot jump to.
        data: A list [a, b, x] where a=forward jump, b=backward jump, x=target.

    Returns:
        The least number of steps, or -1 if unreachable.
    """
    
    # Check for valid input data structure
    if not data or len(data) != 3:
        return -1
        
    a = data[0]  # Forward jump distance
    b = data[1]  # Backward jump distance
    x = data[2]  # Target home position
    
    # 1. Setup Prohibited Positions and Visited Set
    
    # Convert prohibited list to a set for fast O(1) lookups
    prohibited_set = set(prohibited)
    
    if x in prohibited_set:
        return -1

    # A safe upper limit for the search space to prevent infinite forward travel.
    # Any position far beyond the target + a few backward jumps is unlikely 
    # to be on the optimal path.
    MAX_POS = x + 2 * b + 100 
    
    # Visited set stores (position, last_was_backward) tuples.
    # This prevents processing the same state (position + previous move history) twice.
    visited = set()
    
    # 2. Initialize BFS
    
    # Queue stores (position, steps, last_was_backward)
    # Start: position 0, 0 steps, last move was NOT backward (False/0)
    queue = collections.deque([(0, 0, False)])
    visited.add((0, False))

    # 3. Execute BFS
    while queue:
        current_pos, steps, last_was_backward = queue.popleft()

        # GOAL CHECK
        if current_pos == x:
            return steps

        # --- A. Forward Jump (+a) ---
        next_pos_fwd = current_pos + a
        
        # New state will always have last_was_backward = False
        next_state_fwd = (next_pos_fwd, False)
        
        # Check constraints for forward jump:
        if (next_pos_fwd <= MAX_POS and 
            next_pos_fwd not in prohibited_set and 
            next_state_fwd not in visited):
            
            visited.add(next_state_fwd)
            queue.append((next_pos_fwd, steps + 1, False))

        # --- B. Backward Jump (-b) ---
        next_pos_bwd = current_pos - b
        
        # New state will always have last_was_backward = True
        next_state_bwd = (next_pos_bwd, True)
        
        # Check constraints for backward jump:
        # 1. Must not have scurried backward twice in a row.
        # 2. Must land at a position > 0 (Cannot jump to 0 or negative).
        if (not last_was_backward and               # Rule 1: Prevents consecutive -b moves
            next_pos_bwd > 0 and                    # Rule 2: Must be > 0
            next_pos_bwd not in prohibited_set and  
            next_state_bwd not in visited):
            
            visited.add(next_state_bwd)
            queue.append((next_pos_bwd, steps + 1, True))
            
    # If the queue is empty and the target was not reached
    return -1

# --- Example Usage (Python 2 print statement format) ---

# Example 1 from the problem description:
# Input: prohibited = [14, 4, 18, 1, 15], data = [3, 15, 9] -> a=3, b=15, x=9
prohibited_1 = [14, 4, 18, 1, 15]
data_1 = [3, 15, 9]
result_1 = least_steps_to_home(prohibited_1, data_1)
print ("Example 1 Input: prohibited={}, data={}".format(prohibited_1, data_1))
print ("Example 1 Output: {} (Expected: 3)".format(result_1))

print ("---")

# Example 2 (Hypothetical: Unreachable)
prohibited_2 = [10]
data_2 = [2, 4, 1] # a=2, b=4, x=1. Target is odd, steps are even, unreachable.
result_2 = least_steps_to_home(prohibited_2, data_2)
print ("Example 2 Input: prohibited={}, data={}".format(prohibited_2, data_2))
print ("Example 2 Output: {} (Expected: -1)".format(result_2)) 

print ("---")

# Example 3 (Hypothetical: Requires backward jump)
prohibited_3 = [40]
data_3 = [15, 7, 10] 