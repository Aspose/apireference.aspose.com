---
title: "فئة Aspose::Font::Glyphs::IGlyphAccessor"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Glyphs::IGlyphAccessor. تحدد الوظيفة لاسترجاع معرفات الرموز المحددة والرموز في C++."
type: docs
weight: 1000
url: /ar/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


يحدد الوظيفة لاسترجاع معرفات الحروف المحددة والحروف.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | تحديد نوع معرف [Glyph](../glyph/). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | يرجع جميع معرفات الرموز المتاحة في [Font](../../aspose.font/font/). معرف [Glyph](../glyph/) هو رقم فريد للرمز، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم رمز، وهو مثال على فئة ([GlyphStringId](../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | يرجع الرمز حسب معرف الرمز. معرف [Glyph](../glyph/) هو رقم فريد للرمز، يعتمد على نوع الخط. [GlyphId](../glyphid/) - كائن مشتق. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم رمز، وهو مثال على فئة ([GlyphStringId](../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | احصل على تمثيل الرموز للنص. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
