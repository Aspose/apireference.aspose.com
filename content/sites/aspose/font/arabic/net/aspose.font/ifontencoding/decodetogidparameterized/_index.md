---
title: "IFontEncoding.DecodeToGidParameterized"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontEncoding. طريقة فك ترميز معلمة. بعض أنواع الخطوط يمكن أن تحتوي على خوارزميات/خرائط ترميز متعددة. لذلك يتم استخدام واجهة IEncodingParameters لإنشاء معلمات ترميز الخط المخصصة."
type: docs
weight: 20
url: /ar/net/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding.DecodeToGidParameterized method

طريقة فك الترميز المعلمة. بعض أنواع الخطوط يمكن أن تحتوي على خوارزميات/خرائط ترميز متعددة. لذلك، [`IEncodingParameters`](../../iencodingparameters/) تُستخدم لإنشاء معلمات ترميز الخط المخصصة.

```csharp
public GlyphId DecodeToGidParameterized(IEncodingParameters parameters, uint charCode)
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | IEncodingParameters | تنفيذ واجهة [`IEncodingParameters`](../../iencodingparameters/). |
| charCode | UInt32 | رمز الحرف للحصول على معرف glyph له. |

### قيمة الإرجاع

معرف الحرف المتعلق برمز الحرف الممرّر.

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IEncodingParameters](../../iencodingparameters/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


