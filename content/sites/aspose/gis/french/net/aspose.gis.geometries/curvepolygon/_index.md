---
title: Class CurvePolygon
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Geometries.CurvePolygon classe. Une surface plane définie par 1 limite extérieure et 0 ou plusieurs limites intérieures.
type: docs
weight: 910
url: /fr/net/aspose.gis.geometries/curvepolygon/
---
## CurvePolygon class

Une surface plane, définie par 1 limite extérieure et 0 ou plusieurs limites intérieures.

```csharp
public class CurvePolygon : Surface, ICurvePolygon
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CurvePolygon](curvepolygon/#constructor)() | Initialise une nouvelle instance du`CurvePolygon` classe. |
| [CurvePolygon](curvepolygon/#constructor_1)(ICurve) | Initialise une nouvelle instance du`CurvePolygon` classe. |
| [CurvePolygon](curvepolygon/#constructor_2)(ICurve, IEnumerable&lt;ICurve&gt;) | Initialise une nouvelle instance du`CurvePolygon` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry/) . |
| [ExteriorRing](../../aspose.gis.geometries/curvepolygon/exteriorring/) { get; set; } | Obtient l'anneau extérieur. |
| override [GeometryType](../../aspose.gis.geometries/curvepolygon/geometrytype/) { get; } | Obtient le type de la géométrie. |
| override [HasCurveGeometry](../../aspose.gis.geometries/curvepolygon/hascurvegeometry/) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| [HasM](../../aspose.gis.geometries/curvepolygon/hasm/) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée M. |
| [HasZ](../../aspose.gis.geometries/curvepolygon/hasz/) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| [InteriorRingsCount](../../aspose.gis.geometries/curvepolygon/interiorringscount/) { get; } | Obtient le nombre d'anneaux intérieurs. |
| override [IsEmpty](../../aspose.gis.geometries/curvepolygon/isempty/) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/curvepolygon/spatialreferencesystem/) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem est inconnu. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddInteriorRing](../../aspose.gis.geometries/curvepolygon/addinteriorring/)(ICurve) | Ajoute un anneau intérieur. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| override [Clone](../../aspose.gis.geometries/curvepolygon/clone/)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [Equals](../../aspose.gis.geometries/curvepolygon/equals/#equals)(ICurvePolygon) | Indique si l'objet courant est égal à un autre objet du même type. |
| override [Equals](../../aspose.gis.geometries/curvepolygon/equals/#equals_1)(object) | Détermine si l'objet spécifié est égal à l'objet actuel. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| override [GetHashCode](../../aspose.gis.geometries/curvepolygon/gethashcode/)() | Sert de fonction de hachage par défaut. |
| [GetInteriorRing](../../aspose.gis.geometries/curvepolygon/getinteriorring/)(int) | Obtient l'anneau intérieur par son index. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Calcule la longueur de cette géométrie. |
| override [GetPointOnSurface](../../aspose.gis.geometries/curvepolygon/getpointonsurface/)() | Trouve un point dont la présence est garantie sur ce polygone courbe. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| override [SetEmpty](../../aspose.gis.geometries/curvepolygon/setempty/)() | Rend ceci[`Geometry`](../geometry/) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/curvepolygon/toeditable/#toeditable)() | Obtient une copie modifiable de cette géométrie. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |
| [operator ==](../../aspose.gis.geometries/curvepolygon/op_equality/) | Implémente l'opérateur ==. |
| [operator !=](../../aspose.gis.geometries/curvepolygon/op_inequality/) | Implémente l'opérateur !=. |

### Voir également

* class [Surface](../surface/)
* interface [ICurvePolygon](../icurvepolygon/)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Assemblée [Aspose.GIS](../../)


