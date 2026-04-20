---
title: "فئة Aspose::Font::Ttf::TtfEncoding"
linktitle: "TtfEncoding"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::Ttf::TtfEncoding. تمثل ترميز خط TTF في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


تمثل ترميز خط TTF [Font](../../aspose.font/font/).

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | تنفيذ DecodeToGlyphId لخط TTF [Font](../../aspose.font/font/) يجد جدول Unicode ويعيد معرف الرمز للحرف Unicode. معرف الرمز هو رقم فريد للرمز، ويعتمد على نوع الخط. على سبيل المثال: معرف خط [Type1](../../aspose.font.type1/) هو اسم رمز، وهو مثال على الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | الإصدار المعلم يسمح باستخدام جدول CMap محدد (ليس Unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | يقوم بترميز الرمز. بالنسبة لخطوط TTF يكون رمز الحرف هو Unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يفك تشفير معرف الشكل إلى Unicode. معرف الشكل هو رقم فريد لشكل، وهو يعتمد على نوع الخط. على سبيل المثال: [Type1](../../aspose.font.type1/)'s id هو اسم الشكل، وهو مثال من الفئة ([GlyphStringId](../)) class. معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([GlyphUInt32Id](../)) class. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | يفك تشفير Unicode ويعيد معرف الشكل. |
## انظر أيضًا

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
