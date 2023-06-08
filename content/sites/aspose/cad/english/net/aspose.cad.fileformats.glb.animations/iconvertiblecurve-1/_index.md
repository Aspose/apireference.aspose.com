---
title: Interface IConvertibleCurveT
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Animations.IConvertibleCurve1T interface. Defines methods that convert the current curve to a Step Linear or Spline curve
type: docs
weight: 9720
url: /net/aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/
---
## IConvertibleCurve&lt;T&gt; interface

Defines methods that convert the current curve to a Step, Linear or Spline curve.

```csharp
public interface IConvertibleCurve<T>
```

| Parameter | Description |
| --- | --- |
| T | The type of a point of the curve |

## Properties

| Name | Description |
| --- | --- |
| [MaxDegree](../../aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/maxdegree/) { get; } | Gets a value indicating the maximum degree of the curve, current values are: 0: STEP. 1: LINEAR. 3: CUBIC. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/clone/)() | Creates a clone of this curve. |
| [ToLinearCurve](../../aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/tolinearcurve/)() | Gets a LINEAR interpolated curve. Use only when [`MaxDegree`](./maxdegree/) is 1. |
| [ToSplineCurve](../../aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/tosplinecurve/)() | Gets a CUBIC interpolated curve. Use only when [`MaxDegree`](./maxdegree/) is 3. |
| [ToStepCurve](../../aspose.cad.fileformats.glb.animations/iconvertiblecurve-1/tostepcurve/)() | Gets a STEP interpolated curve. Use only when [`MaxDegree`](./maxdegree/) is 0. |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../aspose.cad.fileformats.glb.animations/)
* assembly [Aspose.CAD](../../)


