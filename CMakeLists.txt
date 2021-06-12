cmake_minimum_required(VERSION 3.19)
project(codewars_C C)

set(CMAKE_C_STANDARD 11)

add_executable(codewars_C
        codewars-C/7kyu/growthOfAPopulation/growthOfAPopulation.c
        codewars-C/7kyu/vowelCount/get_count.c)
