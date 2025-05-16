---
title: Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum
linktitle: CffUpdateStringIndexStrategy
second_title: Aspose.Font for C++
description: 'Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. Specifies how to add strings to CFF String INDEX storage. When we try to add some string into CFF String INDEX, there may be situation that this string is already present in String INDEX. Using option SearchForDuplicates we can force search over String INDEX to detect whether this string is already present or not. This approach saves space in the String INDEX structure, but requires more time to add the string in C++.'
type: docs
weight: 1000
url: /cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


Specifies how to add strings to CFF String INDEX storage. When we try to add some string into CFF String INDEX, there may be situation that this string is already present in String INDEX. Using option [SearchForDuplicates](./) we can force search over String INDEX to detect whether this string is already present or not. This approach saves space in the String INDEX structure, but requires more time to add the string.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| SearchForDuplicates | 0 | Specifies that the search for the string to be added should be performed in the String INDEX structure to avoid adding duplicates. |
| AddStringAsIs | 1 | Specifies that no checks for duplicates should be performed when adding a string. This approach works faster, but may result in inefficient memory usage for String INDEX. |

## See Also

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
