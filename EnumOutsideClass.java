package com.keyword;
enum Direction {NORTH,SOUTH,EAST,WEST};
public class EnumOutsideClass
{
    public static void main(String[] args)
    {
        System.out.println("The Directions are: ");
        for(Direction direction : Direction.values())
        {
            System.out.println(direction);
        }
    }
}
