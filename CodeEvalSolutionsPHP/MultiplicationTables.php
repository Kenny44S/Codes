<?php

class MultiplicationTables{

	private $start = 1;
	private $end   = 10;
    private $until = 10;

	function __construct($start, $end, $until=10){
		$this->start = $start;
		$this->end   = $end;
		$this->until = $until;
	}

	function get_tables(){

		for($i=$this->start; $i<=$this->end; $i++){
			for($z=1; $z<=$this->until; $z++){
                $result = $i*$z;
				echo sprintf("%4d", $result);
			}
			echo PHP_EOL;
		}
	}
}


$t1 = new MultiplicationTables(1, 10, 12);
$t1->get_tables();

?>