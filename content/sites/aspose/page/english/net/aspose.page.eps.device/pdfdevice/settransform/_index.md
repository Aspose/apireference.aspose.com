---
title: PdfDevice.SetTransform
second_title: Aspose.Page for .NET API Reference
description: PdfDevice method. Specifies the current transform. Since most output formats do not implement this functionality the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransformTransform
type: docs
weight: 240
url: /net/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice.SetTransform method

Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform).

```csharp
public override void SetTransform(Matrix transform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| transform | Matrix | Transform to be applied. |

### See Also

* class [PdfDevice](../)
* namespace [Aspose.Page.EPS.Device](../../pdfdevice/)
* assembly [Aspose.Page](../../../)


