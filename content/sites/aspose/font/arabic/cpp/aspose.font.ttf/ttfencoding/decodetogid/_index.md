---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid method"
linktitle: "DecodeToGid"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Ttf::TtfEncoding::DecodeToGid. تنفيذ DecodeToGlyphId لخط TTF يبحث عن جدول يونيكود ويعيد معرف الشكل لحرف يونيكود. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع الخط. على سبيل المثال: معرف Type1''s هو اسم الشكل، وهو مثال على فئة (GlyphStringId). معرف TTF''s هو فهرس عدد صحيح، وهو مثال على فئة (GlyphUInt32Id) في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/)'s تنفيذ DecodeToGlyphId يبحث عن جدول يونيكود ويعيد معرف الشكل لحرف يونيكود. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../../aspose.font.type1/)'s هو اسم الشكل، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط برمز الحرف الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
