---
title: Aspose::Font::MultiLanguageString class
linktitle: MultiLanguageString
second_title: Aspose.Font for C++
description: 'Aspose::Font::MultiLanguageString class. Represents multi language string in C++.'
type: docs
weight: 2800
url: /cpp/aspose.font/multilanguagestring/
---
## MultiLanguageString class


Represents multi language string.

```cpp
class MultiLanguageString : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [AddLanguageString](./addlanguagestring/)(System::String, int32_t) | Adds string of specific language. |
| [ContainsString](./containsstring/)(System::String) | Returns true if the string is present inside all the language strings. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Returns true if objects are considered equal. |
| [get_IsEmpty](./get_isempty/)() | True, if [MultiLanguageString](./) don't have strings of languages. |
| [GetAllLanguageIds](./getalllanguageids/)() | Gets language identifiers for all strings or empty array if no strings are presents. |
| [GetAllStrings](./getallstrings/)() | Returns all strings of all languages. |
| [GetEnglishString](./getenglishstring/)() | Returns english string if found. Otherwise returns first non-english string. |
| [GetHashCode](./gethashcode/)() const override | GetHashCode implementation. |
| [GetStringForLanguageId](./getstringforlanguageid/)(int32_t) | Returns string related to language identifier passed, if found. Empty string otherwise. |
| [MultiLanguageString](./multilanguagestring/)() | Creates empty multi language string. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
