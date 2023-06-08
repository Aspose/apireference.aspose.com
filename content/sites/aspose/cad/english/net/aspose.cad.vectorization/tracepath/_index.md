---
title: Class TracePath
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Vectorization.TracePath class. Class for path processing
type: docs
weight: 36590
url: /net/aspose.cad.vectorization/tracepath/
---
## TracePath class

Class for path processing

```csharp
public class TracePath
```

## Constructors

| Name | Description |
| --- | --- |
| [TracePath](tracepath/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [AdjustVertices](../../aspose.cad.vectorization/tracepath/adjustvertices/)() | Adjust vertices of optimal polygon: calculate the intersection of the two "optimal" line segments, then move it into the unit square if it lies outside. Return 1 with errno set on error; 0 on success. calculate "optimal" point-slope representation for each line segment. |
| [BestPolygon](../../aspose.cad.vectorization/tracepath/bestpolygon/)() | Find the optimal polygon. Fill in the m and po components. Return 1 on failure with errno set, else 0. Non-cyclic version: assumes i=0 is in the polygon. Fixme: ### implement cyclic version. |
| [CalcLon](../../aspose.cad.vectorization/tracepath/calclon/)() |  |
| [CalcSums](../../aspose.cad.vectorization/tracepath/calcsums/)() | Preparation: fill in the sum* fields of a path (used for later rapid summing). |
| [OptiCurve](../../aspose.cad.vectorization/tracepath/opticurve/)(double) | optimize the path p, replacing sequences of Bezier segments by a single segment when possible. Return 0 on success, 1 with errno set on failure. |
| [Smooth](../../aspose.cad.vectorization/tracepath/smooth/)(double) |  |

## Fields

| Name | Description |
| --- | --- |
| [area](../../aspose.cad.vectorization/tracepath/area/) |  |
| [curve](../../aspose.cad.vectorization/tracepath/curve/) |  |
| [len](../../aspose.cad.vectorization/tracepath/len/) |  |
| [maxX](../../aspose.cad.vectorization/tracepath/maxx/) |  |
| [maxY](../../aspose.cad.vectorization/tracepath/maxy/) |  |
| [minX](../../aspose.cad.vectorization/tracepath/minx/) |  |
| [minY](../../aspose.cad.vectorization/tracepath/miny/) |  |
| [pt](../../aspose.cad.vectorization/tracepath/pt/) |  |
| [sign](../../aspose.cad.vectorization/tracepath/sign/) |  |

### See Also

* namespace [Aspose.CAD.Vectorization](../../aspose.cad.vectorization/)
* assembly [Aspose.CAD](../../)


