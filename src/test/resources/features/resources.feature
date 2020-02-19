Feature: Users

  Scenario: Creating user

    Given User gets resources list
    Then Values in the list are:
      | id | name           | year | color    | pantone_value |
      | 1  | fuchsia rose   | 2001 | #C74375  | 17-2031       |
      | 2  | cerulean       | 2000 | #98B2D1  | 15-4020       |
      | 3  | true red       | 2002 | ##BF1932 | 19-1664       |
      | 4  | aqua sky       | 2003 | #7BC4C4  | 14-4811       |
      | 5  | tigerlily      | 2004 | #E2583E  | 17-1456       |
      | 6  | blue turquoise | 2005 | #53B0AE  | 15-5217       |