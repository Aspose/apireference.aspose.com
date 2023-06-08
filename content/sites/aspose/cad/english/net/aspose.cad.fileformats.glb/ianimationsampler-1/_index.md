---
title: Interface IAnimationSamplerT
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.IAnimationSampler1T interface. Represents an interface to a curve made of timevalue points
type: docs
weight: 10340
url: /net/aspose.cad.fileformats.glb/ianimationsampler-1/
---
## IAnimationSampler&lt;T&gt; interface

Represents an interface to a curve made of time-value points.

```csharp
public interface IAnimationSampler<T>
```

| Parameter | Description |
| --- | --- |
| T | The curve point value type. |

## Properties

| Name | Description |
| --- | --- |
| [InterpolationMode](../../aspose.cad.fileformats.glb/ianimationsampler-1/interpolationmode/) { get; } | Gets a value indicating the interpolation being used. If the value is STEP or LINEAR, [`GetLinearKeys`](./getlinearkeys/) should be used. If the value is CUBICSPLINE, [`GetCubicKeys`](./getcubickeys/) should be used. |

## Methods

| Name | Description |
| --- | --- |
| [CreateCurveSampler](../../aspose.cad.fileformats.glb/ianimationsampler-1/createcurvesampler/)(bool) | Creates an interpolation sampler that can be used to query the value of the curve at any time. |
| [GetCubicKeys](../../aspose.cad.fileformats.glb/ianimationsampler-1/getcubickeys/)() | Gets the cubic animation entries fot CUBICSPLINE mode. |
| [GetLinearKeys](../../aspose.cad.fileformats.glb/ianimationsampler-1/getlinearkeys/)() | Gets the linear animation entries for STEP and LINEAR modes. |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


