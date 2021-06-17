package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheDoubleCharTest {

  private String[] charParams = {
      "The",
      "AAbb",
      "Hi-There",
      "Word!",
      "!!",
      "",
      "a",
      ".",
      "aa"
  };

  private String[] charExpected = {
      "TThhee",
      "AAAAbbbb",
      "HHii--TThheerree",
      "WWoorrdd!!",
      "!!!!",
      "",
      "aa",
      "..",
      "aaaa"
  };

  @Test
  void testCases() {
    for (int i = 0; i < charParams.length; i++) {
      String actual = CodingBatTheDoubleChar.doubleChar(charParams[i]);
      Assertions.assertEquals(actual, charExpected[i]);
    }
  }

}