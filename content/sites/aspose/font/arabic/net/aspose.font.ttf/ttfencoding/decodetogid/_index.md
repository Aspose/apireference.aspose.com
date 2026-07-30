---
title: "TtfEncoding.DecodeToGid"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة TtfEncoding. تنفيذ DecodeToGlyphId لخطوط TTF يجد جدول يونيكود ويعيد معرف glyph للحرف يونيكود. معرف glyph هو رقم فريد للglyph يعتمد على نوع الخط. على سبيل المثال، معرف Type1 هو اسم glyph من فئة GlyphStringId. ومعرف TTF هو فهرس عدد صحيح من فئة GlyphUInt32Id."
type: docs
weight: 10
url: /ar/net/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding.DecodeToGid method

تنفيذ DecodeToGlyphId لخط TTF يجد جدول يونيكود ويعيد معرف glyph للحرف يونيكود. معرف glyph هو رقم فريد للglyph، يعتمد على نوع الخط. على سبيل المثال: معرف Type1 هو اسم glyph، مثال على فئة ([`GlyphStringId`](../../../aspose.font/glyphs/glyphstringid/)) . ومعرف TTF هو فهرس عدد صحيح، مثال على فئة ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) .

```csharp
public GlyphId DecodeToGid(uint unicode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | UInt32 | رمز الحرف للحصول على معرف glyph له. |

### قيمة الإرجاع

معرف glyph المتعلق برمز الحرف الممرر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfEncoding](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


