---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode طريقة"
linktitle: "GidToUnicode"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Ttf::TtfEncoding::GidToUnicode. تقوم بفك ترميز معرف الشكل إلى يونيكود. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع الخط. على سبيل المثال: معرف Type1''s هو اسم الشكل، وهو مثال على فئة (GlyphStringId). معرف TTF''s هو فهرس عدد صحيح، وهو مثال على فئة (GlyphUInt32Id) في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


يقوم بفك ترميز معرف الشكل إلى يونيكود. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../../aspose.font.type1/)'s هو اسم الشكل، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | معرف الشكل للرمز المراد فك ترميزه. |

### ReturnValue

قيمة يونيكود المرتبطة بمعرف الشكل الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
