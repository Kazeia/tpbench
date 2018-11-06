<?php

$fact2 = gmp_fact(599999); // 50 * 49 * 48, ... etc
echo gmp_strval($fact2) . "\n";
# dont forget php.ini and uncomment gmp extension
?>