---
title: LinearRing
second_title: Référence de l'API Aspose.GIS pour .NET
description: ALinearRing./linearring est unLineString./linestring cest à la fois fermé et simple.
type: docs
weight: 1030
url: /fr/net/aspose.gis.geometries/linearring/
---
## LinearRing class

A[`LinearRing`](../linearring) est un[`LineString`](../linestring) c'est à la fois fermé et simple.

```csharp
public class LinearRing : LineString, ILinearRing
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [LinearRing](linearring#constructor)() | Initialise une nouvelle instance du[`LinearRing`](../linearring) classe. |
| [LinearRing](linearring#constructor_2)(IEnumerable&lt;IPoint&gt;) | Initialise une nouvelle instance du[`LinearRing`](../linearring) classe. |
| [LinearRing](linearring#constructor_1)(ILineString) | Initialise une nouvelle instance du[`LinearRing`](../linearring) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/linestring/count) { get; } | Obtient le nombre de points dans le[`LineString`](../linestring) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint) { get; } | Renvoie une copie du point final de la courbe. |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype) { get; } | Obtient le type de la géométrie. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| [HasM](../../aspose.gis.geometries/linestring/hasm) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Obtient une valeur indiquant si une courbe est fermée. Une courbe est fermée si son point de départ est égal à son point d'arrivée. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [Item](../../aspose.gis.geometries/linestring/item) { get; set; } | Obtient ou définit le[`IPoint`](../ipoint) à l'index spécifié. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem n'est pas défini. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint) { get; } | Renvoie une copie du point de départ de la courbe. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(IPoint) | Ajoute un point à la fin de la ligne. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double) | Ajoute un point à la fin de la ligne. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double, double) | Ajoute un point à la fin de la ligne. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double, double, double) | Ajoute un point à la fin de la ligne. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| override [Clone](../../aspose.gis.geometries/linearring/clone)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [Equals](../../aspose.gis.geometries/linestring/equals)(ILineString) | Indique si l'objet courant est égal à un autre objet du même type. |
| override [Equals](../../aspose.gis.geometries/linestring/equals)(object) | Détermine si l'objet spécifié est égal à l'objet actuel. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator)() | Retourne un énumérateur qui parcourt la collection. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode)() | Sert de fonction de hachage par défaut. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcule la longueur de cette géométrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise)() | Détermine si l'anneau a un enroulement dans le sens des aiguilles d'une montre. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse)() | Inverse l'ordre des points dans ce[`LineString`](../linestring) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty)() | Rend ceci[`Geometry`](../geometry) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable#toeditable_2)() | Obtient une copie modifiable de cette géométrie. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |

### Voir également

* class [LineString](../linestring)
* interface [ILinearRing](../ilinearring)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
