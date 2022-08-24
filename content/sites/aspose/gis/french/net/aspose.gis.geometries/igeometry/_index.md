---
title: IGeometry
second_title: Référence de l'API Aspose.GIS pour .NET
description: La classe racine dinterface de la hiérarchie des géométries
type: docs
weight: 900
url: /fr/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

La classe racine d'interface de la hiérarchie des géométries

```csharp
public interface IGeometry
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension) { get; } | Obtient la dimension topologique de cette[`IGeometry`](../igeometry) . Si la dimension est inconnue (par exemple pour une GEOMETRYCOLLECTION vide)Point est renvoyé. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype) { get; } | Obtient le type de la géométrie. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| [HasM](../../aspose.gis.geometries/igeometry/hasm) { get; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz) { get; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty) { get; } | Obtient une valeur indiquant si cette instance est vide (représente l'ensemble de points vide). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem) { get; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem est inconnu. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary_1)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_1)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_2)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| [Clone](../../aspose.gis.geometries/igeometry/clone)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/igeometry/covers)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/igeometry/difference)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength)() | Calcule la longueur de cette géométrie. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects_1)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/igeometry/relate)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable#toeditable)() | Obtient une copie modifiable de cette géométrie. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable#toeditable_1)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry_1)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/igeometry/union)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/igeometry/within#within)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/igeometry/within#within_1)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |

### Voir également

* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
