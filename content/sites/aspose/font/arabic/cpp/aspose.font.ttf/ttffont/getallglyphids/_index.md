---
title: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds طريقة"
linktitle: "GetAllGlyphIds"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds طريقة. تُرجع مصفوفة من جميع معرفات الرموز، المتاحة في الخط. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على الفئة (GlyphStringId) أو الفئة (GlyphUInt32Id). يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لمعالجة الرموز بالاسم في C++."
type: docs
weight: 1700
url: /ar/cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


تُرجع مصفوفة من جميع معرفات الرموز، المتاحة في [Font](../../../aspose.font/font/). معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF [Font](../../../aspose.font/font/) مثالًا على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الرموز بالاسم (سلسلة) للخطوط TTF عبر تعيين جدول Post. في حالة وجود [Font](../../../aspose.font/font/) CFF داخل، تُستخدم هياكل CFF لمعالجة الرموز بالاسم.

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

معرفات الرموز.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
