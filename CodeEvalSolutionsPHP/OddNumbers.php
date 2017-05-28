<?php

function print_odd_numbers($start, $end){
    
    for($i=$start; $i<=$end; $i++){
        if($i%2 != 0){
            echo $i . PHP_EOL;
        }
    }
}

print_odd_numbers(1, 99);

?>
