---
title: "Aspose::Font::Cff::CffFont::GetGlyphById طريقة"
linktitle: "GetGlyphById"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById طريقة. يُرجِع الحرف بناءً على معرف الحرف. معرف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف خط CFF مثالاً على الفئة (GlyphStringId) أو الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 1800
url: /ar/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


يُرجِع الحرف بناءً على معرف الحرف. معرف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف CFF [Font](../../../aspose.font/font/) مثالاً على الفئة ([GlyphStringId](../)) أو الفئة ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


تُرجع الحرف بحسب اسم الحرف.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | System::String | اسم الشكل. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


يرجع الرمز بناءً على معرف الرمز.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | uint32_t | معرّف الشكل. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
