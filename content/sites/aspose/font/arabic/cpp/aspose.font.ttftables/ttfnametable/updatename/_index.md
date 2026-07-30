---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateName method"
linktitle: "UpdateName"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateName method. يقوم بتحديث الاسم في السجلات التي تتعلق بالمنصة المحددة (تكوين platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId) في C++."
type: docs
weight: 1000
url: /ar/cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


يُحدّث الاسم في السجل(ات) المتعلقة بالمنصة المحددة (توليفة platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId).

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | TtfNameTable::PlatformId | معرف المنصة |
| platformSpecificId | uint16_t | معرّف الترميز الخاص بالمنصة |
| nameId | TtfNameTable::NameId | معرّف الاسم، فئة السلسلة المنطقية، المحدد بواسطة تعداد [NameId](../nameid/). |
| languageId | uint16_t | معرف اللغة |
| newName | System::String | اسم جديد أو بيانات سلسلة جديدة |

## انظر أيضًا

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
