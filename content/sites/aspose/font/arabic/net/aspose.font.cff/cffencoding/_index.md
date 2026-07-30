---
title: "الفئة CffEncoding"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Cff.CffEncoding. تمثل ترميز خط CFF."
type: docs
weight: 20
url: /ar/net/aspose.font.cff/cffencoding/
---
## CffEncoding class

يمثل ترميز خط CFF.

```csharp
public class CffEncoding : IFontEncoding, ISupportsNameAddressing
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [DecodeToGid](../../aspose.font.cff/cffencoding/decodetogid/)(uint) | يحصل على Gid للـ charCode الممرَّر. تم تصميم هذه الطريقة لـ CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف glyph هو رقم فريد للـ glyph، يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط CFF مثالاً على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)). |
| [DecodeToGidParameterized](../../aspose.font.cff/cffencoding/decodetogidparameterized/)(IEncodingParameters, uint) | طريقة فك الترميز المعلمة. غير مدعومة لنوع خط CFF. |
| [Encode](../../aspose.font.cff/cffencoding/encode/)(uint, uint) | يقوم بترميز الـ glyph. غير مدعومة لأنواع خطوط CFF. |
| [GetNameToCharCodeIndex](../../aspose.font.cff/cffencoding/getnametocharcodeindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط. |
| [GetNameToGidIndex](../../aspose.font.cff/cffencoding/getnametogidindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط. |
| [GetNameToSidIndex](../../aspose.font.cff/cffencoding/getnametosidindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط. |
| [GetSidName](../../aspose.font.cff/cffencoding/getsidname/)(int) | يحصل على الاسم للـ SID المحدد. |
| [GidToUnicode](../../aspose.font.cff/cffencoding/gidtounicode/)(GlyphId) | يفكّ شفرة Gid إلى unicode. معرف glyph هو رقم فريد للـ glyph، يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط CFF مثالاً على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)). |
| [UnicodeToGid](../../aspose.font.cff/cffencoding/unicodetogid/)(uint) | يفكّ شفرة unicode ويعيد معرف glyph. معرف glyph هو رقم فريد للـ glyph، يعتمد على نوع الخط. يمكن أن يكون معرف glyph لخط CFF مثالاً على الفئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) أو الفئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)). |

### انظر أيضاً

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* interface [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


