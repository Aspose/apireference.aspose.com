---
title: MultiCurve
second_title: Référence de l'API Aspose.GIS pour .NET
description: AMultiCurve./multicurve est unidimensionnelGeometryCollection./geometrycollection dont les éléments sontCurve./curve s.
type: docs
weight: 1040
url: /fr/net/aspose.gis.geometries/multicurve/
---
## MultiCurve class

A[`MultiCurve`](../multicurve) est unidimensionnel[`GeometryCollection`](../geometrycollection) dont les éléments sont[`Curve`](../curve) s.

```csharp
public class MultiCurve : GeometryCollection, IMultiCurve
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [MultiCurve](multicurve)() | Initialise une nouvelle instance du[`MultiCurve`](../multicurve) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/geometrycollection/count) { get; } | Obtient le nombre de géométries dans cette collection. |
| [Dimension](../../aspose.gis.geometries/multicurve/dimension) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry) . |
| override [GeometryType](../../aspose.gis.geometries/multicurve/geometrytype) { get; } | Obtient le type de la géométrie. |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| virtual [IsClosed](../../aspose.gis.geometries/multicurve/isclosed) { get; } | Détermine si cette courbe est fermée. |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [Item](../../aspose.gis.geometries/geometrycollection/item) { get; } | Obtient un[`IGeometry`](../igeometry) à l'index spécifié. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem est inconnu. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add)(IGeometry) | Ajoute la géométrie spécifiée à la collection. |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange)(IEnumerable&lt;IGeometry&gt;) | Ajoute les géométries spécifiées à la collection. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| override [Clone](../../aspose.gis.geometries/multicurve/clone)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals)(IGeometryCollection) | Indique si l'objet courant est égal à un autre objet du même type. |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals)(object) | Détermine si l'objet spécifié est égal à l'objet actuel. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator)() | Retourne un énumérateur qui parcourt la collection. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode)() | Sert de fonction de hachage par défaut. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcule la longueur de cette géométrie. |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface)() | Trouve un point dont la présence est garantie sur l'une des surfaces de cette collection. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat)(int) | Supprime la géométrie spécifiée de la collection. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty)() | Rend ceci[`Geometry`](../geometry) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/multicurve/toeditable#toeditable_2)() | Obtient une copie modifiable de cette géométrie. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry#tolineargeometry_4)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . (3 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry#tolineargeometry_5)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . (3 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |

### Voir également

* class [GeometryCollection](../geometrycollection)
* interface [IMultiCurve](../imulticurve)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
