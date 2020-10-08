package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  static final String[] inputValues1 = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      "",
  };

  static final boolean[] expectedValues2 = {

      true,
      false,
      true,
      false,
      true,
      true,

  };


  @Test
  void testRecursive() {

    for( int i = 0; i < inputValues1.length; i++) {
      String input = inputValues1[i];
      boolean expected = expectedValues2[i];
      boolean actual = Palindromes.testRecursive(input);
      assertEquals(expected, actual);
    }
  }
}