---
title: Node.GetWorldMatrix
second_title: Aspose.CAD for .NET API Reference
description: Node method. Gets the world matrix of this node in a given animation at a given time
type: docs
weight: 210
url: /net/aspose.cad.fileformats.glb/node/getworldmatrix/
---
## Node.GetWorldMatrix method

Gets the world matrix of this node in a given animation at a given time.

```csharp
public Matrix4x4 GetWorldMatrix(Animation animation, float time)
```

| Parameter | Type | Description |
| --- | --- | --- |
| animation | Animation | the animation to sample. |
| time | Single | the time offset within the animation. |

### Return Value

the sampled transform.

## Remarks

This is a convenience method, but it's slow, it's better to cache [`GetCurveSamplers`](../getcurvesamplers/).

### See Also

* class [Animation](../../animation/)
* class [Node](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../node/)
* assembly [Aspose.CAD](../../../)


