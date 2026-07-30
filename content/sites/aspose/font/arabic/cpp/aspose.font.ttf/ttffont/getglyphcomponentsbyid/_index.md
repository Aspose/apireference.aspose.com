---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById method"
linktitle: "GetGlyphComponentsById"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById method. يحصل على شكل باستخدام معرف الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. يمكن أن يكون معرف شكل خط TTF مثالاً على الفئة (GlyphStringId) أو الفئة (GlyphUInt32Id). يتم دعم عنونة الشكل بالاسم (string) لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعناوين الأشكال بالاسم في C++."
type: docs
weight: 1900
url: /ar/cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


يحصل على شكل باستخدام معرف الشكل الممرّر ويملأ القائمة الممرّرة لمعرفات الأشكال بمكونات هذا الشكل. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. يمكن أن يكون معرف شكل TTF [Font](../../../aspose.font/font/) مثالاً على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الشكل بالاسم (string) لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF [Font](../../../aspose.font/font/) داخل، تُستخدم هياكل CFF لعناوين الأشكال بالاسم.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | System::SharedPtr\<Glyphs::GlyphId\> | معرّف الشكل. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | قائمة بمعرفات الأشكال لتعبئتها. |
## ملاحظات


يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة بمعرفات مكونات الشكل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


يحصل على رمز بناءً على الاسم الممرَّر ويملأ القائمة الممرَّرة لمعرفات الرموز بمكونات هذا الرمز.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | System::String | اسم الشكل. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | قائمة بمعرفات الأشكال لتعبئتها. |
## ملاحظات


يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة بمعرفات مكونات الشكل.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


يحصل على رمز بناءً على الفهرس الممرَّر ويملأ القائمة الممرَّرة لمعرفات الرموز بمكونات هذا الرمز.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | uint32_t | فهرس الشكل. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | قائمة بمعرفات الأشكال لتعبئتها. |
## ملاحظات


يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة بمعرفات مكونات الشكل.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
