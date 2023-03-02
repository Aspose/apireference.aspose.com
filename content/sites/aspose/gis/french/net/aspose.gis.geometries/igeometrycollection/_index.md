---
title: Interface IGeometryCollection
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Geometries.IGeometryCollection interface. AIGeometryCollection est unIGeometry qui est une collection dune ou plusieurs géométries.
type: docs
weight: 1010
url: /fr/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` est un[`IGeometry`](../igeometry/) qui est une collection d'une ou plusieurs géométries.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Obtient le nombre de géométries dans cette collection. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Obtient un[`IGeometry`](../igeometry/) à l'index spécifié. |

## Méthodes

| Nom | La description |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Trouve un point dont la présence est garantie sur l'une des surfaces de cette collection. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . |

### Voir également

* interface [IGeometry](../igeometry/)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Assemblée [Aspose.GIS](../../)


