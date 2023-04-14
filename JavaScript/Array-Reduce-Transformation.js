/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    
    for( let k=0; k<nums.length; k++ ) {
      init = fn(init, nums[k]);
    }
    return init
};
