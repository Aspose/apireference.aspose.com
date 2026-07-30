---
title: "واجهة IFontEncoding"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "واجهة Aspose.Font.IFontEncoding. تُعرّف واجهة لتشفير الخط"
type: docs
weight: 490
url: /ar/net/aspose.font/ifontencoding/
---
## IFontEncoding interface

يحدد واجهة لترميز الخط.

```csharp
public interface IFontEncoding
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [DecodeToGid](../../aspose.font/ifontencoding/decodetogid/)(uint) | يفكّ شفرة رمز حرف ويعيد معرف الحرف (glyph id). معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على فئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) class. ملاحظة: رمز الحرف ليس بالضرورة يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط. |
| [DecodeToGidParameterized](../../aspose.font/ifontencoding/decodetogidparameterized/)(IEncodingParameters, uint) | طريقة فكّ شفرة معلمة. بعض أنواع الخطوط قد تحتوي على خوارزميات/خرائط تشفير متعددة. لذا، تُستخدم واجهة [`IEncodingParameters`](../iencodingparameters/) لإنشاء معلمات تشفير الخط المخصصة. |
| [Encode](../../aspose.font/ifontencoding/encode/)(uint, uint) | يقوم بتشفير الحرف. بالنسبة لخطوط TTF، يكون charCode يونيكود. |
| [GidToUnicode](../../aspose.font/ifontencoding/gidtounicode/)(GlyphId) | يفك تشفير Gid إلى Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| [UnicodeToGid](../../aspose.font/ifontencoding/unicodetogid/)(uint) | يفكّ شفرة يونيكود ويعيد معرف الحرف. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم الحرف، وهو مثال على فئة ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) class. معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) class. |

### انظر أيضاً

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


