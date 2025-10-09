---
title: Interface ICompoundCurve
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.ICompoundCurve interface. A curve that represents a sequence of contiguous curves such that adjacent curves are joined at their end points
type: docs
weight: 2750
url: /net/aspose.gis.geometries/icompoundcurve/
---
## ICompoundCurve interface

A curve that represents a sequence of contiguous curves such that adjacent curves are joined at their end points.

```csharp
public interface ICompoundCurve : ICurve, IEnumerable<ICurve>, IEquatable<ICompoundCurve>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.gis.geometries/icompoundcurve/count/) { get; } | Gets the number of curves in the `ICompoundCurve`. |
| [Item](../../aspose.gis.geometries/icompoundcurve/item/) { get; } | Gets the [`ICurve`](../icurve/) at the specified index. |

## Methods

| Name | Description |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icompoundcurve/toeditable/)() | Gets an editable copy of this geometry. |

### See Also

* interface [ICurve](../icurve/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


