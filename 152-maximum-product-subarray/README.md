<h2><a href="https://leetcode.com/problems/maximum-product-subarray/">152. Maximum Product Subarray</a></h2><h3>Medium</h3><hr><div><p>Given an integer array <code>nums</code>, find a contiguous non-empty subarray within the array that has the largest product, and return <em>the product</em>.</p>





<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,3,-2,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [2,3] has the largest product 6.
</pre>





<div>
	<p>
		Given an array [2,3,-2,4] Find the maximum product obtained by its sub-array

First-Brute force method.

So this can be implemented by traversing from the first element of the array to the last element,  store the max productand again traverse from the second element to the last element, calculate the product, and update the max product value. Continue this process until the last element. This approach will take O(n^2) time.

Optimize!

Suppose the elements are: A,B,C,D,E;

what we did initially was find the product A*B

then A*B*C, upto A*B*C*D*E;Store the max product.

Then in the next itereation we start from B ,Calculate the product as B*C

then B*C*D upto B*C*D*E ———→ `This the check point.`

This can also be written as E*D*C*B ,which is it product from the left side.

So instead of doing the same thing in n^2 time complexity lets do the forward product calculation first and then the backward product calculation so that time complexity become O(n)

Calculate the products from each side(left & Right).If encountered with zero you have to re initialize. Find max of left product and right product .</p>
	</div>
