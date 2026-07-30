---
title: "فئة Aspose::Font::Glyphs::GlyphId"
linktitle: "GlyphId"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Glyphs::GlyphId. تمثل معرّفات الحروف المتوفرة في الخط. معرف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال من فئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال من فئة (GlyphUInt32Id) في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


تمثل معرّفات الحروف المتوفرة في [Font](../../aspose.font/font/). معرف [Glyph](../glyph/) هو رقم فريد للحرف، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم حرف، وهو مثال من فئة ([GlyphStringId](../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال من فئة ([GlyphUInt32Id](../glyphuint32id/)).

```cpp
class GlyphId : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | تُعيد true إذا لم تكن هويات glyph اثنين متساوية. |
| virtual [GetHashCode](./gethashcode/)() const | يرجع قيمة التجزئة (hashcode) للكائن. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | تحويل افتراضي إلى [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) يتجاوز لإرجاع نسخة. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | تحويل افتراضي إلى [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) يتجاوز لإرجاع نسخة. |
| virtual [ToString](./tostring/)() const | يرجع تمثيل السلسلة لمعرفة الحرف. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
