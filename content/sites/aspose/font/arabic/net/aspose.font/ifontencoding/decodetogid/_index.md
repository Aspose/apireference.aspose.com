---
title: "IFontEncoding.DecodeToGid"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontEncoding. تقوم بفك ترميز رمز حرف وتعيد glyph id. glyph id هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال، معرف Type1 هو اسم glyph من فئة GlyphStringId. ومعرف TTF هو فهرس عدد صحيح من فئة GlyphUInt32Id. ملاحظة: رمز الحرف ليس بالضرورة Unicode. رمز الحرف هو فهرس حرف في جدول ترميز الخط."
type: docs
weight: 10
url: /ar/net/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding.DecodeToGid method

يقوم بفك ترميز رمز حرف وتعيد glyph id. glyph id هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم glyph، وهو مثال على فئة ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) . ومعرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) . ملاحظة: رمز الحرف ليس بالضرورة Unicode. رمز الحرف هو فهرس حرف في "جدول" ترميز الخط.

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | UInt32 | رمز الحرف للحصول على معرف glyph له. |

### قيمة الإرجاع

معرف الرمز المتعلق بـ charCode الممرَّر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


