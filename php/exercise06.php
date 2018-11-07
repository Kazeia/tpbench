<?php

function matrixChainOrder($p, $n) {
    for ($i = 1; $i < $n; $i++)
        $m[$i][$i] = 0;

    for ($L = 2; $L < $n; $L++)
    {
        for ($i = 1; $i <= $n - $L + 1; $i++)
        {
            $j = $i + $L - 1;
            $m[$i][$j] = PHP_INT_MAX;
            for ($k = $i; $k <= $j - 1; $k++)
            {
                // $q = cost/scalar multiplications
                $q = @$m[$i][$k] + @$m[$k + 1][$j] + @$p[$i - 1] * @$p[$k] * @$p[$j];
                if ($q < $m[$i][$j])
                    $m[$i][$j] = $q;
            }
        }
    }
    return $m[1][$n-1];
}

$arr = array(54,66,39,46,12,87,61,24,36,28,13,4,73,84,25,62,67);
$size = sizeof($arr);

echo "Minimum number of multiplications is ".matrixChainOrder($arr, $size);

?>