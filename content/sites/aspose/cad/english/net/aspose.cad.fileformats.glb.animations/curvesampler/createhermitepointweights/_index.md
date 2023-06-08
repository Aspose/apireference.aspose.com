---
title: CurveSampler.CreateHermitePointWeights
second_title: Aspose.CAD for .NET API Reference
description: CurveSampler method. Calculates the Hermite point weights for a given amount
type: docs
weight: 10
url: /net/aspose.cad.fileformats.glb.animations/curvesampler/createhermitepointweights/
---
## CurveSampler.CreateHermitePointWeights method

Calculates the Hermite point weights for a given *amount*

```csharp
public static (float StartPosition, float EndPosition, float StartTangent, float EndTangent) 
    CreateHermitePointWeights(float amount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| amount | Single | The input amount (must be between 0 and 1) |

### Return Value

The output weights. - StartPosition: Weight for Start point - EndPosition: Weight for End point - StartTangent: Weight for Start Outgoing Tangent - EndTangent: Weight for End Incoming Tangent

### See Also

* class [CurveSampler](../)
* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../curvesampler/)
* assembly [Aspose.CAD](../../../)


