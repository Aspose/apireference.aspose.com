---
title: toArray
second_title: Aspose.Sildes for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.slides/fontfallbackrule/toarray/
---

## toArray()  function

 Creates and returns an array with all FallBack fonts for this rule.
 

### Result
String


---


## toArray(int startIndex, int count)  function

 Creates and returns an array with all FallBack fonts from the specified range in list.
 
 // Create a rule contains a list of fonts.
 IFontFallBackRule newRule = new FontFallBackRule(0x3040, 0x309F, "MS Mincho, MS Gothic, Tahoma, Times New Roman");
 // Get a last two font names as array.
 String[] fontNames = newRule.toArray(2, 2);
 
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| startIndex | int | An index of a first font to add. |
| count | int | A number of fonts to add. |

### Result
String


---


