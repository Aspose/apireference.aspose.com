---
title: "طريقة Aspose::Font::Ttf::TtfFont::GetGlyphById"
linktitle: "GetGlyphById"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Ttf::TtfFont::GetGlyphById. تُرجِع الحرف بناءً على معرف الحرف. معرف الحرف هو رقم فريد لكل حرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف TTF Font مثالًا على الفئة (GlyphStringId) أو الفئة (GlyphUInt32Id). يتم دعم عنونة الحرف بالاسم (string) للخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لعناوين الحروف بالاسم في C++."
type: docs
weight: 1800
url: /ar/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


تُرجِع الحرف بناءً على معرف الحرف. معرف الحرف هو رقم فريد لكل حرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف TTF [Font](../../../aspose.font/font/) مثالًا على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)). يتم دعم عنونة الحرف بالاسم (string) للخطوط TTF عبر تعيين جدول Post. في حالة وجود [Font](../../../aspose.font/font/) CFF داخل، تُستخدم هياكل CFF لعناوين الحروف بالاسم.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | System::SharedPtr\<Glyphs::GlyphId\> | معرّف الشكل. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


تُرجِع الحرف بناءً على اسم الحرف. يتم دعم عنونة الحرف بالاسم (string) للخطوط TTF عبر تعيين جدول Post. في حالة وجود [Font](../../../aspose.font/font/) CFF داخل، تُستخدم هياكل CFF لعناوين الحروف بالاسم.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | System::String | معرف سلسلة الحرف. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


يرجع الرمز بناءً على معرف الرمز.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | uint32_t | فهرس الشكل. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
