---
title: "واجهة IGlyphAccessor"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "واجهة Aspose.Font.Glyphs.IGlyphAccessor. تحدد الوظيفة لاسترجاع معرفات الحروف المحددة والحروف"
type: docs
weight: 460
url: /ar/net/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor interface

يعرف الوظيفة لاسترجاع معرفات الحروف المحددة والحروف.

```csharp
public interface IGlyphAccessor
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [GlyphIdType](../../aspose.font.glyphs/iglyphaccessor/glyphidtype/) { get; } | مواصفات نوع Glyph id. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [GetAllGlyphIds](../../aspose.font.glyphs/iglyphaccessor/getallglyphids/)() | يرجع جميع معرفات الحروف المتاحة في الخط. معرف Glyph هو رقم فريد لحرف، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال من الفئة ([`GlyphStringId`](../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([`GlyphUInt32Id`](../glyphuint32id/)). |
| [GetGlyphById](../../aspose.font.glyphs/iglyphaccessor/getglyphbyid/)(GlyphId) | يرجع الحرف بحسب معرف Glyph. معرف Glyph هو رقم فريد لحرف، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرف Type1 هو اسم حرف، وهو مثال من الفئة ([`GlyphStringId`](../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال من الفئة ([`GlyphUInt32Id`](../glyphuint32id/)). |
| [GetGlyphsForText](../../aspose.font.glyphs/iglyphaccessor/getglyphsfortext/)(string) | احصل على تمثيل الأشكال للنص. |

### انظر أيضاً

* namespace [Aspose.Font.Glyphs](../../aspose.font.glyphs/)
* assembly [Aspose.Font](../../)


