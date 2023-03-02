---
title: Interface IGeometryCollection
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Geometries.IGeometryCollection interfaccia. AIGeometryCollection è unIGeometry ovvero una raccolta di una o più geometrie.
type: docs
weight: 1010
url: /it/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` è un[`IGeometry`](../igeometry/) ovvero una raccolta di una o più geometrie.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Ottiene il numero di geometrie in questa raccolta. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Ottiene a[`IGeometry`](../igeometry/) all'indice specificato. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Trova un punto che si trova sicuramente su una delle superfici di questa raccolta. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` . |

### Guarda anche

* interface [IGeometry](../igeometry/)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assemblea [Aspose.GIS](../../)


