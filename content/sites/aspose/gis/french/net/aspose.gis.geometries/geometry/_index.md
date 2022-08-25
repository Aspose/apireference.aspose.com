---
title: Geometry
second_title: Référence de l'API Aspose.GIS pour .NET
description: La classe racine abstraite de la hiérarchie des géométries.
type: docs
weight: 820
url: /fr/net/aspose.gis.geometries/geometry/
---
## Geometry class

La classe racine abstraite de la hiérarchie des géométries.

```csharp
public abstract class Geometry : IGeometry
```

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry) . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry) . Si la dimension est inconnue (par exemple pour une GEOMETRYCOLLECTION vide)Point est renvoyé. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | Obtient le type de la géométrie. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem est inconnu. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |
| static [Null](../../aspose.gis.geometries/geometry/null) { get; } | Obtient une instance de géométrie nulle. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary_1)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_1)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_2)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcule la longueur de cette géométrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects_1)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | Rend ceci[`Geometry`](../geometry) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable#toeditable)() | Obtient une copie modifiable de cette géométrie. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable#toeditable_1)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry_1)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within#within)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within#within_1)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary)(byte[]) | Crée une géométrie à partir de sa représentation binaire connue. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary_1)(byte[], SpatialReferenceSystem) | Crée une géométrie à partir de sa représentation binaire connue. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext)(string) | Crée une géométrie à partir de sa représentation Texte connu. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext_1)(string, SpatialReferenceSystem) | Crée une géométrie à partir de sa représentation Texte connu. |

### Voir également

* interface [IGeometry](../igeometry)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
