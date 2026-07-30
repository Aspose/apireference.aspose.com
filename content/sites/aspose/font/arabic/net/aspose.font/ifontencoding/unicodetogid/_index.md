---
title: "IFontEncoding.UnicodeToGid"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontEncoding. تقوم بفك ترميز Unicode وتعيد glyph id. glyph id هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال، معرف Type1 هو اسم glyph من فئة GlyphStringId. ومعرف TTF هو فهرس عدد صحيح من فئة GlyphUInt32Id."
type: docs
weight: 50
url: /ar/net/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding.UnicodeToGid method

يقوم بفك ترميز Unicode وتعيد glyph id. glyph id هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم glyph، وهو مثال على فئة ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) . ومعرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) .

```csharp
public GlyphId UnicodeToGid(uint unicode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | UInt32 | يونيكود للحصول على معرف glyph له. |

### قيمة الإرجاع

معرف glyph المتعلق بيونيكود الممرر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


