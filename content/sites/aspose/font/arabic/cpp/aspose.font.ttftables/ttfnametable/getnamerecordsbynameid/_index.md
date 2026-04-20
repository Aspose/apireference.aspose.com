---
title: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId طريقة"
linktitle: "GetNameRecordsByNameId"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId طريقة. تُرجع جميع هياكل NameRecord التي يكون حقل NameId مساويًا لقيمة nameId الممرَّرة. إذا لم يتم العثور على سجلات، سيتم إرجاع مصفوفة فارغة في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/
---
## TtfNameTable::GetNameRecordsByNameId method


يرجع جميع هياكل [NameRecord](../namerecord/) التي يكون حقل [NameId](../nameid/) مساويًا لقيمة *nameId* الممرَّرة. إذا لم يتم العثور على سجلات، سيتم إرجاع مصفوفة فارغة.

```cpp
System::ArrayPtr<System::SharedPtr<TtfNameTable::NameRecord>> Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId(TtfNameTable::NameId nameId)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | معرّف الاسم |

### ReturnValue

مصفوفة من هياكل [NameRecord](../namerecord/)

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameRecord](../namerecord/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
