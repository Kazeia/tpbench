<?php 
// PHP code for calculating number 
// of ways to distribute m mangoes 
// amongst n people where all 
// mangoes and people are identical 

// function used to generate 
// binomial coefficient 
// time complexity O(m) 
function binomial_coefficient($n, $m) 
{ 
	$res = 1; 

	if ($m > $n - $m) 
		$m = $n - $m; 

	for ($i = 0; $i < $m; ++$i) 
	{ 
		$res *= ($n - $i); 
		$res /= ($i + 1); 
	} 

	return $res; 
} 

// Helper function for generating 
// no of ways to distribute m. 
// mangoes amongst n people 
function calculate_ways($m, $n) 
{ 
	// not enough mangoes to 
	// be distributed 
	if ($m < $n) 
		return 0; 
	
	// ways -> (n+m-1)C(n-1) 
	$ways = binomial_coefficient($n + $m - 1, 
									$n - 1); 
	return $ways; 
} 

// Driver Code 

// m represents number of mangoes 
// n represents number of people 
$m = 7; 
$n = 5; 

$result = calculate_ways($m, $n); 
echo $result; 

// This code is contributed 
// by Shivi_Aggarwal 
?> 
