---
title: "Aspose::Font::TtfTables::TtfCMapTable class"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfCMapTable class. يمثل جدول \"cmap\" لملف خط TTF في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


يمثل جدول "cmap" لملف [Font](../../aspose.font/font/) TTF.

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | يبحث ويعيد CMap Unicode. إذا كان هناك CMap ucs-4 - يعيده أولاً؛ وإلا - يعيد أي CMap Unicode يمكنه العثور عليه. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
| [GetAllSubtables](./getallsubtables/)() | يعيد جميع الجداول الفرعية من جدول CMap. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | يعيد جداول فرعية لـ CMap للمعرف planformId والمعرف platformSpecificId. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
