---
title: "Aspose::Font::Cff::CffEncoding class"
linktitle: "CffEncoding"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Cff::CffEncoding class. يمثل ترميز خط CFF في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


يمثل ترميز CFF [Font](../../aspose.font/font/).

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | يحصل على Gid للـ charCode الممرَّر. تم تصميم هذه الطريقة لخطوط CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف glyph هو رقم فريد للـ glyph، ويتوقف على نوع الخط. يمكن أن يكون معرف glyph لخط CFF [Font](../../aspose.font/font/) مثالًا على فئة ([GlyphStringId](../)) أو فئة ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | طريقة فك ترميز معلمة. غير مدعومة لنوع CFF [Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | يقوم بترميز الـ glyph. غير مدعومة لأنواع CFF [Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز [Font](../../aspose.font/font/). |
| [GetNameToGidIndex](./getnametogidindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز [Font](../../aspose.font/font/). |
| [GetNameToSidIndex](./getnametosidindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز [Font](../../aspose.font/font/). |
| [GetSidName](./getsidname/)(int32_t) | يحصل على الاسم للـ SID المحدد. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | يفك تشفير Gid إلى يونيكود. معرف glyph هو رقم فريد للـ glyph، ويتوقف على نوع الخط. يمكن أن يكون معرف glyph لخط CFF [Font](../../aspose.font/font/) مثالًا على فئة ([GlyphStringId](../)) أو فئة ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | يفك تشفير يونيكود ويعيد معرف glyph. معرف glyph هو رقم فريد للـ glyph، ويتوقف على نوع الخط. يمكن أن يكون معرف glyph لخط CFF [Font](../../aspose.font/font/) مثالًا على فئة ([GlyphStringId](../)) أو فئة ([GlyphUInt32Id](../)). |
## انظر أيضًا

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
