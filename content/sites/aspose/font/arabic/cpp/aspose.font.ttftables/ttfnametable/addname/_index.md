---
title: "طريقة Aspose::Font::TtfTables::TtfNameTable::AddName"
linktitle: "AddName"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::TtfTables::TtfNameTable::AddName. يضيف إدخالًا إلى الجدول. فئة بيانات السلسلة التي يجب إضافتها محددة بواسطة المعامل name في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


يضيف مدخلاً إلى الجدول. فئة بيانات السلسلة التي ستُضاف محددة بواسطة المعامل *name*.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | معرّف الاسم، فئة السلسلة المنطقية، المحدد بواسطة تعداد [NameId](../nameid/). |
| platformId | TtfNameTable::PlatformId | معرف المنصة |
| platformSpecificId | int32_t | معرف الترميز الخاص بالمنصة. يرجى استخدام قيمة من إحدى هذه التعدادات - [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). التعداد الذي يجب استخدامه يُحدَّد حسب السياق (*platformId*  المعامل) |
| languageId | int32_t | معرف اللغة. يرجى استخدام قيمة من تعداد [MSLanguageId](../mslanguageid/) أو [MacLanguageId](../maclanguageid/) حسب السياق، يُحدَّد بواسطة *platformId*  المعامل. |
| name | System::String | بيانات السلسلة الفعلية |

## انظر أيضًا

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
