---
title: Class PixelMap
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Vectorization.PixelMap class. Holds the binaray pixel bitmap
type: docs
weight: 36570
url: /net/aspose.cad.vectorization/pixelmap/
---
## PixelMap class

Holds the binaray pixel bitmap

```csharp
public class PixelMap
```

## Constructors

| Name | Description |
| --- | --- |
| [PixelMap](pixelmap/)(int, int) |  |

## Properties

| Name | Description |
| --- | --- |
| [Size](../../aspose.cad.vectorization/pixelmap/size/) { get; } | The size of map |

## Methods

| Name | Description |
| --- | --- |
| [At](../../aspose.cad.vectorization/pixelmap/at/)(int, int) | The value at given coordinates |
| [Copy](../../aspose.cad.vectorization/pixelmap/copy/)() |  |
| [FindNext](../../aspose.cad.vectorization/pixelmap/findnext/)(Point2I, ref Point2I) | Searches a x and a y such that source[x,y] = 1 and source[x+1,y] 0. If this not exists, false will be returned else the result is true. |
| [FindPath](../../aspose.cad.vectorization/pixelmap/findpath/)(TurnPolicy, Point2I) | Compute a path in the binary matrix. Start path at the point (x0,x1), which must be an upper left corner of the path. Also compute the area enclosed by the path. Return a new Path object, or NULL on error (note that a legitimate path cannot have length 0). |
| [Flip](../../aspose.cad.vectorization/pixelmap/flip/)(int, int) | Flips one point |
| [Index](../../aspose.cad.vectorization/pixelmap/index/)(int) | Gets one point |
| [Majority](../../aspose.cad.vectorization/pixelmap/majority/)(int, int) | The Majority function |
| [XorPath](../../aspose.cad.vectorization/pixelmap/xorpath/)(TracePath) | XOR the path |

## Fields

| Name | Description |
| --- | --- |
| [Data](../../aspose.cad.vectorization/pixelmap/data/) |  |
| [H](../../aspose.cad.vectorization/pixelmap/h/) |  |
| [W](../../aspose.cad.vectorization/pixelmap/w/) |  |

### See Also

* namespace [Aspose.CAD.Vectorization](../../aspose.cad.vectorization/)
* assembly [Aspose.CAD](../../)


