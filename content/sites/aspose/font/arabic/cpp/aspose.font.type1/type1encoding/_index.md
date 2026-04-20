---
title: "Aspose::Font::Type1::Type1Encoding فئة"
linktitle: "Type1Encoding"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Type1::Type1Encoding فئة. يمثل ترميز Type1Font في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


يمثل ترميز [Type1](../)[Font](../../aspose.font/font/).

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | يقوم بفك تشفير Gid إلى Unicode. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../) هو اسم شكل، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | طريقة فك تشفير ذات معلمات. غير مدعومة لنوع [Type1](../)[Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | يقوم بترميز الشكل. بالنسبة لخطوط TTF، رمز الحرف هو Unicode. غير مدعومة لأنواع [Type1](../)[Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز [Font](../../aspose.font/font/). |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يقوم بفك تشفير Gid إلى Unicode. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../) هو اسم شكل، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | يعيد GlyphId لـ Unicode. أو notdef إذا كان الخط لا يحتوي على شكل للـ Unicode. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف [Type1](../) هو اسم شكل، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)). |
## انظر أيضًا

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
