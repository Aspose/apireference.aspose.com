---
title: "الفئة TtfEncoding"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.Ttf.TtfEncoding. تمثل ترميز خط TTF"
type: docs
weight: 850
url: /ar/net/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class

يمثل ترميز خط TTF.

```csharp
public class TtfEncoding : IFontEncoding
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [DecodeToGid](../../aspose.font.ttf/ttfencoding/decodetogid/)(uint) | تنفيذ DecodeToGlyphId لخط TTF يجد جدول Unicode ويعيد معرف الشكل لحرف Unicode. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الشكل، وهو مثال على فئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) . معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) . |
| [DecodeToGidParameterized](../../aspose.font.ttf/ttfencoding/decodetogidparameterized/)(IEncodingParameters, uint) | الإصدار المعلم يسمح باستخدام جدول CMap محدد (ليس Unicode). |
| [Encode](../../aspose.font.ttf/ttfencoding/encode/)(uint, uint) | يقوم بترميز الشكل. بالنسبة لخطوط TTF يكون رمز الحرف هو Unicode. |
| [GidToUnicode](../../aspose.font.ttf/ttfencoding/gidtounicode/)(GlyphId) | يفك ترميز معرف الشكل إلى Unicode. معرف الشكل هو رقم فريد لشكل، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الشكل، وهو مثال على فئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) . معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) . |
| [UnicodeToGid](../../aspose.font.ttf/ttfencoding/unicodetogid/)(uint) | يفك ترميز Unicode ويعيد معرف الشكل. |

### انظر أيضاً

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


