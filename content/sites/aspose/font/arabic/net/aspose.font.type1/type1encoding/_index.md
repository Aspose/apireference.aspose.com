---
title: "الفئة Type1Encoding"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Type1.Type1Encoding. تمثل ترميز خط Type1"
type: docs
weight: 1450
url: /ar/net/aspose.font.type1/type1encoding/
---
## Type1Encoding class

يمثل ترميز Type1 Font.

```csharp
public class Type1Encoding : IFontEncoding, ISupportsNameAddressing
```

## الطرق

| الاسم | الوصف |
| --- | --- |
| [DecodeToGid](../../aspose.font.type1/type1encoding/decodetogid/)(uint) | يفك تشفير Gid إلى Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| [DecodeToGidParameterized](../../aspose.font.type1/type1encoding/decodetogidparameterized/)(IEncodingParameters, uint) | طريقة فك الترميز المعلمة. غير مدعومة لنوع خط Type1. |
| [Encode](../../aspose.font.type1/type1encoding/encode/)(uint, uint) | يقوم بترميز الحرف. بالنسبة لخطوط TTF يكون رمز الحرف هو Unicode. غير مدعومة لأنواع خطوط Type1. |
| [GetNameToCharCodeIndex](../../aspose.font.type1/type1encoding/getnametocharcodeindex/)() | يرجع خريطة الترميز من الاسم إلى رمز الحرف. ملاحظة: رمز الحرف ليس يونيكود. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط. |
| [GidToUnicode](../../aspose.font.type1/type1encoding/gidtounicode/)(GlyphId) | يفك تشفير Gid إلى Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |
| [UnicodeToGid](../../aspose.font.type1/type1encoding/unicodetogid/)(uint) | يعيد GlyphId للـ Unicode. أو notdef إذا لم يحتوي الخط على حرف للـ Unicode. معرف الحرف هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال على الفئة ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)). |

### انظر أيضاً

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* interface [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


