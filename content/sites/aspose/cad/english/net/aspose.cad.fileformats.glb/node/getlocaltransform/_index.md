---
title: Node.GetLocalTransform
second_title: Aspose.CAD for .NET API Reference
description: Node method. Gets the local transform of this node in a given animation at a given time
type: docs
weight: 190
url: /net/aspose.cad.fileformats.glb/node/getlocaltransform/
---
## Node.GetLocalTransform method

Gets the local transform of this node in a given animation at a given time.

```csharp
public AffineTransform GetLocalTransform(Animation animation, float time)
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

* struct [AffineTransform](../../../aspose.cad.fileformats.glb.transforms/affinetransform/)
* class [Animation](../../animation/)
* class [Node](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../node/)
* assembly [Aspose.CAD](../../../)


