---
title: Class Point
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Geometries.Point classe. APoint représente un emplacement unique dans lespace de coordonnées.
type: docs
weight: 1190
url: /fr/net/aspose.gis.geometries/point/
---
## Point class

A`Point` représente un emplacement unique dans l'espace de coordonnées.

```csharp
public class Point : Geometry, IPoint
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Point](point/#constructor)() | Initialise une nouvelle instance du`Point` classe. |
| [Point](point/#constructor_1)(IPoint) | Initialise une nouvelle instance du`Point` classe. |
| [Point](point/#constructor_2)(double, double) | Initialise une nouvelle instance du`Point` classe. |
| [Point](point/#constructor_3)(double, double, double) | Initialise une nouvelle instance du`Point` classe. |
| [Point](point/#constructor_4)(double, double, double, double) | Initialise une nouvelle instance du`Point` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Obtient le nombre de dimensions de coordonnées pour ce[`Geometry`](../geometry/) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension/) { get; } | Obtient la dimension topologique de cette[`Geometry`](../geometry/) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype/) { get; } | Obtient le type de la géométrie. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Obtient une valeur indiquant si cette géométrie est ou contient une géométrie courbe (non linéaire). |
| override [HasM](../../aspose.gis.geometries/point/hasm/) { get; set; } | Obtient une valeur indiquant si cette instance a une coordonnée M. |
| override [HasZ](../../aspose.gis.geometries/point/hasz/) { get; set; } | Obtient une valeur indiquant si cette instance a la coordonnée Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Obtient une valeur indiquant si cette instance est vide. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Obtient une valeur indiquant si cette instance est simple du point de vue SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Obtient une valeur indiquant si cette instance est valide. |
| [M](../../aspose.gis.geometries/point/m/) { get; set; } | Obtient ou définit une valeur pour la coordonnée m. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem/) { get; set; } | Obtient SpatialReferenceSystem de cette instance. Cette propriété peut être`null` , si SpatialReferenceSystem est inconnu. L'attribution d'un nouveau SpatialReferenceSystem n'effectuera aucune transformation de coordonnées, seule la référence changera. |
| [X](../../aspose.gis.geometries/point/x/) { get; set; } | Obtient ou définit une valeur pour la coordonnée x. |
| [Y](../../aspose.gis.geometries/point/y/) { get; set; } | Obtient ou définit une valeur pour la coordonnée y. |
| [Z](../../aspose.gis.geometries/point/z/) { get; set; } | Obtient ou définit une valeur pour la coordonnée z. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Traduit cette géométrie en sa représentation binaire connue. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Traduit cette géométrie en sa représentation binaire connue. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportez cette géométrie vers une représentation d'image. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Traduit cette géométrie en sa représentation textuelle connue. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Traduit cette géométrie en sa représentation textuelle connue. |
| override [Clone](../../aspose.gis.geometries/point/clone/)() | Clone cette instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Détermine si cette géométrie est couverte par une géométrie spécifiée. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Détermine si cette géométrie couvre une géométrie spécifiée. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Soustrait une géométrie spécifiée de cette géométrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Détermine si cette géométrie est disjointe d'une géométrie spécifiée. |
| [Equals](../../aspose.gis.geometries/point/equals/#equals)(IPoint) | Indique si l'objet courant est égal à un autre objet du même type. |
| override [Equals](../../aspose.gis.geometries/point/equals/#equals_1)(object) | Détermine si l'objet spécifié est égal à l'objet actuel. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Calcule l'aire de cette géométrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Calcule une région tampon autour de cette géométrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Calcule le centroïde de cette géométrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Calcule l'enveloppe convexe de cette géométrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Calcule la distance minimale entre cette géométrie et une géométrie spécifiée. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Calcule et renvoie une étendue de délimitation de cette géométrie. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode/)() | Sert de fonction de hachage par défaut. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Calcule la longueur de cette géométrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Construit une intersection entre cette géométrie et une géométrie spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Détermine si cette géométrie croise une étendue spécifiée. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se croisent. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Détermine si cette géométrie chevauche une géométrie spécifiée. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Détermine si la matrice d'intersection DE-9IM de cette géométrie et une géométrie spécifiée correspond au modèle fourni. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Obtient les polygones représentés sous forme de lignes de cette géométrie. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Arrondit la coordonnée M à un nombre spécifié de chiffres fractionnaires. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Arrondit les coordonnées X et Y à un nombre spécifié de chiffres fractionnaires. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Arrondit la coordonnée Z à un nombre spécifié de chiffres fractionnaires. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty/)() | Rend ceci[`Geometry`](../geometry/) vide. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Détermine si cette géométrie contient spatialement une géométrie spécifiée. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Détermine si cette géométrie est spatialement égale à une géométrie spécifiée. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Construit une différence symétrique entre cette géométrie et une géométrie spécifiée. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable/#toeditable_1)() | Obtient une copie modifiable de cette géométrie. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Obtient une copie modifiable de cette géométrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)() | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur par défaut`tolérance` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)(double) | Obtient une version non courbe approximative ou équivalente de cette géométrie en utilisant la valeur spécifiée`tolérance` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Retourne une chaîne qui représente l'objet actuel. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Détermine si cette géométrie et une géométrie spécifiée se touchent. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Réunit cette géométrie et une géométrie spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Détermine si cette géométrie se trouve dans une étendue spécifiée. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Détermine si cette géométrie se trouve dans une géométrie spécifiée. |
| [operator ==](../../aspose.gis.geometries/point/op_equality/) | Implémente l'opérateur ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality/) | Implémente l'opérateur !=. |

### Voir également

* class [Geometry](../geometry/)
* interface [IPoint](../ipoint/)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Assemblée [Aspose.GIS](../../)


