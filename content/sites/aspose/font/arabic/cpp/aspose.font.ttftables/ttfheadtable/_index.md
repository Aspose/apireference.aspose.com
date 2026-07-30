---
title: "Aspose::Font::TtfTables::TtfHeadTable فئة"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfHeadTable فئة. يمثل جدول \"head\" لملف خط TTF في C++."
type: docs
weight: 700
url: /ar/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


يمثل جدول "head" لملف TTF [Font](../../aspose.font/font/)

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | يحصل على uint32 checkSumAdjustment. لحسابه: اضبطه على 0، احسب المجموع الاختباري لجدول 'head' وضعه في دليل الجدول، اجمع الخط بأكمله كـ uint32، ثم خزن B1B0AFBA - المجموع. لن يكون المجموع الاختباري لجدول 'head' خاطئًا. هذا مقبول. |
| [get_Created](./get_created/)() const | يحصل على longDateTime تاريخ دولي تم إنشاؤه. |
| [get_Flags](./get_flags/)() const | يحصل على uint16 flags. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | يحصل على int16 fontDirectionHint. 0 رموز مختلطة الاتجاه؛ 1 رموز من اليسار إلى اليمين فقط بقوة؛ 2 مثل 1 ولكن يحتوي أيضًا على محايدات؛ -1 رموز من اليمين إلى اليسار فقط بقوة؛ -2 مثل -1 ولكن يحتوي أيضًا على محايدات. |
| [get_FontRevision](./get_fontrevision/)() const | يحصل على fixed fontRevision المحدد من قبل صانع الخط. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | يحصل على int16 glyphDataFormat 0 للتنسيق الحالي. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | يحصل على int16 indexToLocFormat 0 للإزاحات القصيرة، 1 للطويلة. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | يحصل على uint16 lowestRecPPEM أصغر حجم قابل للقراءة بالبكسل. |
| [get_MacStyle](./get_macstyle/)() const | يحصل على uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | يحصل على uint32 magicNumber مضبوط على 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | يحصل على longDateTime تاريخ دولي معدل. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
| [get_UnitsPerEM](./get_unitsperem/)() const | يحصل على uint16 unitsPerEm النطاق من 64 إلى 16384. |
| [get_Version](./get_version/)() const | الإصدار الثابت 0x00010000 إذا (الإصدار 1.0). |
| [get_XMax](./get_xmax/)() const | يحصل على FWord xMax لجميع مربعات حدود الرموز. |
| [get_XMin](./get_xmin/)() const | يحصل على FWord xMin لجميع مربعات حدود الرموز. |
| [get_YMax](./get_ymax/)() const | يحصل على FWord yMax لجميع مربعات حدود الرموز. |
| [get_YMin](./get_ymin/)() const | يحصل على FWord yMin لجميع مربعات حدود الرموز. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
