---
title: IAnimationSampler1.CreateCurveSampler
second_title: Aspose.CAD for .NET API Reference
description: IAnimationSampler method. Creates an interpolation sampler that can be used to query the value of the curve at any time
type: docs
weight: 20
url: /net/aspose.cad.fileformats.glb/ianimationsampler-1/createcurvesampler/
---
## IAnimationSampler&lt;T&gt;.CreateCurveSampler method

Creates an interpolation sampler that can be used to query the value of the curve at any time.

```csharp
public ICurveSampler<T> CreateCurveSampler(bool isolateMemory = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| isolateMemory | Boolean | If true, this call will do an internal copy of the curve data, so it will not reference the source date in the original document. |

### Return Value

An object that can be used to sample the curve at any time.

## Remarks

When *isolateMemory* is true, it also arranges the data so it's much faster to query.

### See Also

* interface [ICurveSampler&lt;T&gt;](../../../aspose.cad.fileformats.glb.animations/icurvesampler-1/)
* interface [IAnimationSampler&lt;T&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../ianimationsampler-1/)
* assembly [Aspose.CAD](../../../)


