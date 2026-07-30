---
title: "Aspose::Font::IFontEncoding class"
linktitle: "IFontEncoding"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::IFontEncoding class. يعرّف واجهة لتشفير الخط في C++."
type: docs
weight: 1400
url: /ar/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


يعرّف واجهة لتشفير [Font](../font/).

```cpp
class IFontEncoding : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | يفك شفرة رمز حرف ويعيد معرف الشكل. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم الشكل، وهو مثال من الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([GlyphUInt32Id](../)). ملاحظة: رمز الحرف ليس بالضرورة يونيكود. رمز الحرف هو فهرس حرف في جدول ترميز [Font](../font/) \"table\". |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | طريقة فك الترميز المعلمة. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | يقوم بترميز الشكل. بالنسبة لخطوط TTF يكون charCode يونيكود. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | يفك شفرة Gid إلى يونيكود. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم الشكل، وهو مثال من الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([GlyphUInt32Id](../)). |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | يفك شفرة يونيكود ويعيد معرف الشكل. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../../aspose.font.type1/) هو اسم الشكل، وهو مثال من الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([GlyphUInt32Id](../)). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
