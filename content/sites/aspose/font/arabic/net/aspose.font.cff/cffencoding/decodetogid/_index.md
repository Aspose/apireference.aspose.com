---
title: "CffEncoding.DecodeToGid"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "CffEncoding طريقة. يحصل على Gid للـ charCode الممرَّر. تم تصميم هذه الطريقة لخطوط CFF CIDFonts حيث يجب أن يكون charCode قيمة CID صالحة. معرف الرمز هو رقم فريد للرمز يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط CFF مثالًا على فئة GlyphStringId أو فئة GlyphUInt32Id"
type: docs
weight: 10
url: /ar/net/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding.DecodeToGid method

يحصل على Gid للـ charCode الممرّر. تم تصميم هذه الطريقة لـ CFF CIDFonts، حيث يجب أن يكون charCode قيمة CID صالحة. معرف الحرف (Glyph id) هو رقم فريد لحرف، يعتمد على نوع الخط. يمكن أن يكون معرف حرف خط CFF مثالًا على فئة ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) أو فئة ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)).

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | UInt32 | رمز الحرف (CID) للحصول على معرف الحرف. |

### قيمة الإرجاع

معرف الحرف المتعلق بـ CID الممرّر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [CffEncoding](../)
* namespace [Aspose.Font.Cff](../../../aspose.font.cff/)
* assembly [Aspose.Font](../../../)


