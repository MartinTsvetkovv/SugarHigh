# SugarHigh

The program gets the standard input an array of positive integers representing the sugar content of each candy, in grams.
They are separated with comma and space.

The second input representing the maximum amount of sugar you can consume, in grams.

The method contains two parameters(threshold and candies). 
The first ArrayList takes the Candy class with two fields(index, sugarContent) and implements Comparable interfaces with the compareTo method.
The second ArrayList holds the result from the program.
After the candies were added to the first ArrayList it needs to be sorted in ascending order. 
The second  loop  checks the candy's sugar content. If it is less than the threshold it adds the sugar content  index to the result and subtracts it from the threshold.

Finally, sort and print the result.
