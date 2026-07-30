---
title: "Type1Encoding.DecodeToGid"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة Type1Encoding. تقوم بفك تشفير Gid إلى Unicode. معرّف الحرف هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال، معرّف Type1 هو اسم حرف من فئة GlyphStringId. ومعرّف TTF هو فهرس عدد صحيح من فئة GlyphUInt32Id."
type: docs
weight: 10
url: /ar/net/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding.DecodeToGid method

يقوم بفك تشفير Gid إلى Unicode. معرّف الحرف هو رقم فريد لحرف يعتمد على نوع الخط. على سبيل المثال: معرّف Type1 هو اسم حرف، مثال على فئة ([`GlyphStringId`](../../../aspose.font/glyphs/glyphstringid/)) class. معرّف TTF هو فهرس عدد صحيح، مثال على فئة ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) class.

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | UInt32 | رمز الحرف للحصول على معرف glyph له. |

### قيمة الإرجاع

معرف glyph المتعلق برمز الحرف الممرر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Type1Encoding](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


