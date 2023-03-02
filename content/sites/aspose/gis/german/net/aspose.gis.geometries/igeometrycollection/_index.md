---
title: Interface IGeometryCollection
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Geometries.IGeometryCollection koppel. AIGeometryCollection ist einIGeometry das ist eine Sammlung von einer oder mehreren Geometrien.
type: docs
weight: 1010
url: /de/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` ist ein[`IGeometry`](../igeometry/) das ist eine Sammlung von einer oder mehreren Geometrien.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Ruft die Anzahl der Geometrien in dieser Sammlung ab. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | erhält a[`IGeometry`](../igeometry/) am angegebenen Index. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Findet einen Punkt, der sich garantiert auf einer der Flächen in dieser Sammlung befindet. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Ruft Polygone ab, die als Linien dieser Geometrie dargestellt werden. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Ruft eine bearbeitbare Kopie dieser Geometrie ab. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` . |

### Siehe auch

* interface [IGeometry](../igeometry/)
* namensraum [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Montage [Aspose.GIS](../../)


