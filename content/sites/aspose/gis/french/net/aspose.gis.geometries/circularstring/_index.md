---
title: CircularString
second_title: Référence de l'API Aspose.GIS pour .NET
description: Une courbe à plusieurs sommets avec interpolation circulaire entre les points.
type: docs
weight: 780
url: /fr/net/aspose.gis.geometries/circularstring/
---
## CircularString class

Une courbe à plusieurs sommets avec interpolation circulaire entre les points.

```csharp
public class CircularString : Curve, ICircularString
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CircularString](circularstring#constructor)() | Initialise une nouvelle instance du[`CircularString`](../circularstring) classe. |
| [CircularString](circularstring#constructor_1)(ICircularString) | Initialise une nouvelle instance du[`CircularString`](../circularstring) classe. |
| [CircularString](circularstring#constructor_2)(IEnumerable&lt;IPoint&gt;) | Initialise une nouvelle instance du[`CircularString`](../circularstring) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/circularstring/count) { get; } | Obtient le nombre de points dans le[`CircularString`](../circularstring) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry) . |
| override [EndPoint](../../aspose.gis.geometries/circularstring/endpoint) { get; } | Renvoie une copie du point final de la courbe. |
| override [GeometryType](../../aspose.gis.geometries/circularstring/geometrytype) { get; } | Obtient le type de la géométrie. |
| override [HasCurveGeometry](../../aspose.gis.geometries/circularstring/hascurvegeometry) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| [HasM](../../aspose.gis.geometries/circularstring/hasm) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| [HasZ](../../aspose.gis.geometries/circularstring/hasz) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Obtient une valeur indiquant si une courbe est fermée. Une courbe est fermée si son point de départ est égal à son point d'arrivée. |
| override [IsEmpty](../../aspose.gis.geometries/circularstring/isempty) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [Item](../../aspose.gis.geometries/circularstring/item) { get; set; } | Obtient ou définit le[`IPoint`](../ipoint) à l'index spécifié. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/circularstring/spatialreferencesystem) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem n'est pas défini. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |
| override [StartPoint](../../aspose.gis.geometries/circularstring/startpoint) { get; } | Renvoie une copie du point de départ de la courbe. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint)(IPoint) | Ajoute un point à la fin de la chaîne circulaire. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_1)(double, double) | Ajoute un point à la fin de la chaîne circulaire. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_2)(double, double, double) | Ajoute un point à la fin de la chaîne circulaire. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_3)(double, double, double, double) | Ajoute un point à la fin de la chaîne circulaire. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| override [Clone](../../aspose.gis.geometries/circularstring/clone)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [Equals](../../aspose.gis.geometries/circularstring/equals#equals)(ICircularString) | Indique si l'objet courant est égal à un autre objet du même type. |
| override [Equals](../../aspose.gis.geometries/circularstring/equals#equals_1)(object) | Détermine si l'objet spécifié est égal à l'objet actuel. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetEnumerator](../../aspose.gis.geometries/circularstring/getenumerator)() | Retourne un énumérateur qui parcourt la collection. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| override [GetHashCode](../../aspose.gis.geometries/circularstring/gethashcode)() | Sert de fonction de hachage par défaut. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcule la longueur de cette géométrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| override [Reverse](../../aspose.gis.geometries/circularstring/reverse)() | Inverse l'ordre des points dans ce[`CircularString`](../circularstring) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| override [SetEmpty](../../aspose.gis.geometries/circularstring/setempty)() | Rend ceci[`Geometry`](../geometry) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/circularstring/toeditable#toeditable)() | Obtient une copie modifiable de cette géométrie. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |
| [operator ==](../../aspose.gis.geometries/circularstring/op_equality) | Implémente l'opérateur ==. |
| [operator !=](../../aspose.gis.geometries/circularstring/op_inequality) | Implémente l'opérateur !=. |

### Remarques

Le`Chaîne circulaire` consiste en un ou plusieurs segments d'arc de cercle connectés bout à bout. Les trois premiers points définissent le premier segment. Le premier point est le point de départ de l'arc. Le deuxième point est tout point intermédiaire de l'arc autre que le point de départ ou d'arrivée. Le troisième point est la fin de l'arc. Les arcs suivants sont définis uniquement par leurs points intermédiaires et finaux, car le point de départ est implicitement défini comme le point final du segment précédent.

### Voir également

* class [Curve](../curve)
* interface [ICircularString](../icircularstring)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
