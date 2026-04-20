---
title: "فئة Aspose::Font::TtfTables::TtfMaxpTable"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::TtfTables::TtfMaxpTable. تمثل جدول \"maxp\" لملف الخط TTF في C++."
type: docs
weight: 1200
url: /ar/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


تمثل جدول "maxp" لملف [Font](../../aspose.font/font/) TTF.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | يحصل على uint16 maxComponentContours عدد الخطوط في الحرف المركب. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | يحصل على uint16 maxComponentDepth مستويات التكرار، يُضبط إلى 0 إذا كان الخط يحتوي فقط على حروف بسيطة. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | يحصل على uint16 maxComponentElements عدد الحروف المشار إليها في المستوى الأعلى. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | يحصل على uint16 maxComponentPoints عدد النقاط في الحرف المركب. |
| [get_MaxContours](./get_maxcontours/)() const | يحصل على uint16 maxContours عدد الخطوط في الحرف غير المركب. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | يحصل على uint16 maxFunctionDefs عدد FDEFs. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | يحصل على عدد IDEFs (uint16 maxInstructionDefs). |
| [get_MaxPoints](./get_maxpoints/)() const | يحصل على عدد النقاط (uint16 maxPoints) في الحرف غير المركب. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | يحصل على عدد البايتات (uint16 maxSizeOfInstructions) لتعليمات الحرف. |
| [get_MaxStackElements](./get_maxstackelements/)() const | يحصل على أقصى عمق للمكدس (uint16 maxStackElements). |
| [get_MaxStorage](./get_maxstorage/)() const | يحصل على عدد مواقع منطقة التخزين (uint16 maxStorage). |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | يحصل على عدد النقاط (uint16 maxTwilightPoints) المستخدمة في منطقة الشفق (Z0). |
| [get_MaxZones](./get_maxzones/)() const | يحصل على قيمة uint16 maxZones المعينة إلى 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | يحصل على عدد الحروف (uint16 numGlyphs) في الـ[Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | يحصل على نسخة التنسيق. استخدم الخصائص MajorNumber و MinorNUmber للكائن [Version16Dot16](../) في التدوين الست عشري لتحديد النسخة المستخدمة. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
| [get_Version](./get_version/)() const | يحصل على النسخة الثابتة 0x00010000 إذا (النسخة 1.0). مهجور، استخدم خاصية [TableVersion](../) بدلاً من ذلك. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
