---
title: "Aspose::Page::Font::DrFont فئة"
linktitle: "DrFont"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::Font::DrFont فئة. استخدم هذه الفئة بدلاً من GDI+ Font في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.font/drfont/
---
## DrFont class


استخدم هذه الفئة بدلاً من GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كان الـ [System::Object](../../system/object/) المحدد يساوي هذه الحالة. |
| [get_AscentLis](./get_ascentlis/)() | ارتفاع الخلية لهذا الخط (lis). هذه مسافة عمودية من أعلى الخلية إلى خط القاعدة للخلية. |
| [get_AscentPoints](./get_ascentpoints/)() | يعيد صعود الخلية بالنقاط. |
| [get_CellHeightLis](./get_cellheightlis/)() | يعيد ارتفاع الخلية لهذا الخط (lis). هذا اختصار لـ [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | اختصار لـ [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | هبوط الخلية لهذا الخط (lis). هذه مسافة رأسية من أسفل الخلية إلى خط الأساس للخلية. |
| [get_DescentPoints](./get_descentpoints/)() | يعيد هبوط الخلية بالنقاط. |
| [get_FamilyName](./get_familyname/)() | يحصل على اسم هذا الخط. |
| [get_IsBold](./get_isbold/)() | يحصل على قيمة تشير إلى ما إذا كان هذا الكائن غامقًا. |
| [get_IsItalic](./get_isitalic/)() | يحصل على قيمة تشير إلى ما إذا كان هذا الكائن مائلًا. |
| [get_LeadingLis](./get_leadinglis/)() | يعيد المسافة البادئة لهذا الخط (lis). هذا اختصار لـ [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | يعيد المسافة البادئة لهذا الخط (lis). هذا اختصار لـ [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | يعيد تباعد الخلايا لهذا الخط (lis). هذه مسافة رأسية بين خطوط الأساس للرمزين. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | يعيد تباعد الخلايا لهذا الخط (النقاط). هذه مسافة رأسية بين خطوط الأساس للرمزين. |
| [get_SizePoints](./get_sizepoints/)() | يحصل على حجم هذا الخط (النقاط). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | يحصل على أحرف الخط الكبيرة. |
| [get_Style](./get_style/)() | يحصل على خط TrueType. |
| [get_StyleEx](./get_styleex/)() | هذه الخاصية تحتوي على معلومات إضافية حول نمط الخط. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | يحصل على عرض الحرف lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | يعيد عرض الحرف (النقاط). |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز تجزئة لهذه الحالة. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | يعيد صندوق قياس النص بالنقاط. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | يحصل على عرض النص lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | يحصل على عرض النص بالنقاط. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | يحصل على عرض النص بالنقاط. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | يعيد True لخط "Microsoft Sans Serif". هذا الخط يتم عرضه بشكل سيء بواسطة GDI+. راجع Test286 و Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | استبدل محتوى الخط. |
| [set_SizePoints](./set_sizepoints/)(float) | يحصل على حجم هذا الخط (النقاط). |
| [set_StyleEx](./set_styleex/)(int16_t) | هذه الخاصية تحتوي على معلومات إضافية حول نمط الخط. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
