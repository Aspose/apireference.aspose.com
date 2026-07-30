---
title: "طريقة Aspose::Font::Type1::Type1Encoding::GidToUnicode"
linktitle: "GidToUnicode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Type1::Type1Encoding::GidToUnicode طريقة. يحول Gid إلى Unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: Type1''s id هو اسم الشكل، مثال على الفئة (GlyphStringId). TTF''s id هو فهرس عدد صحيح، مثال على الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


يحول Gid إلى Unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: [Type1](../../)'s id هو اسم الشكل، مثال على الفئة ([GlyphStringId](../)) . معرف TTF هو فهرس عدد صحيح، مثال على الفئة ([GlyphUInt32Id](../)) .

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | معرف الشكل للرمز المراد فك ترميزه. |

### ReturnValue

قيمة يونيكود المرتبطة بمعرف الشكل الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
