---
title: Struct Measurement
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Measurement struct. A number that indicates a render measurement
type: docs
weight: 4190
url: /net/aspose.gis.rendering/measurement/
---
## Measurement structure

A number that indicates a render measurement.

```csharp
public struct Measurement
```

## Constructors

| Name | Description |
| --- | --- |
| [Measurement](measurement/)(double, Unit) | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| static [Zero](../../aspose.gis.rendering/measurement/zero/) { get; } | A measurement of zero length. |
| [Unit](../../aspose.gis.rendering/measurement/unit/) { get; } | A unit of measurement. |
| [Value](../../aspose.gis.rendering/measurement/value/) { get; } | A number that indicates the length of the measurement. |

## Methods

| Name | Description |
| --- | --- |
| static [Inches](../../aspose.gis.rendering/measurement/inches/)(double) | Returns a new instance of `Measurement` that represents length in inches. |
| static [MapUnits](../../aspose.gis.rendering/measurement/mapunits/)(double) | Returns a new instance of `Measurement` that represents length in maps Spatial Reference units. |
| static [MetersOnEarth](../../aspose.gis.rendering/measurement/metersonearth/)(double) | Returns a new instance of `Measurement` that represents length in meters on the Earth. |
| static [Millimeters](../../aspose.gis.rendering/measurement/millimeters/)(double) | Returns a new instance of `Measurement` that represents length in millimeters. |
| static [Pixels](../../aspose.gis.rendering/measurement/pixels/)(double) | Returns a new instance of `Measurement` that represents length in pixels. |
| static [Points](../../aspose.gis.rendering/measurement/points/)(double) | Returns a new instance of `Measurement` that represents length in points. |
| override [ToString](../../aspose.gis.rendering/measurement/tostring/)() | Returns this instance converted to string. |
| [operator /](../../aspose.gis.rendering/measurement/op_division/) | Divide measurement by factor. |
| [implicit operator](../../aspose.gis.rendering/measurement/op_implicit/) | Returns a new instance of `Measurement` that represents length in pixels. |
| [operator *](../../aspose.gis.rendering/measurement/op_multiply/) | Multiplies measurement by factor. |

### See Also

* namespace [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* assembly [Aspose.GIS](../../)


