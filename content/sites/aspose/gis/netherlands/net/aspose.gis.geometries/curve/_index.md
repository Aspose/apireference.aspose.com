---
title: Class Curve
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Geometries.Curve klas. EENCurve is een reeks punten.
type: docs
weight: 900
url: /nl/net/aspose.gis.geometries/curve/
---
## Curve class

EEN`Curve` is een reeks punten.

```csharp
public abstract class Curve : Geometry, ICurve
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Krijgt het aantal coördinaatdimensies hiervoor[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Krijgt de topologische dimensie hiervan[`Geometry`](../geometry/) . |
| abstract [EndPoint](../../aspose.gis.geometries/curve/endpoint/) { get; } | Geeft een kopie van het eindpunt van de curve. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Haalt het type geometrie op. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Krijgt een waarde die aangeeft of deze geometrie kromme (niet lineaire) geometrie is of bevat. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Krijgt een waarde die aangeeft of deze instantie M-coördinaat heeft. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Krijgt een waarde die aangeeft of deze instantie een Z-coördinaat heeft. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Krijgt een waarde die aangeeft of een curve gesloten is. Een curve is gesloten als het startpunt gelijk is aan het eindpunt. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Krijgt een waarde die aangeeft of deze instantie leeg is. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Krijgt een waarde die aangeeft of deze instantie eenvoudig is vanuit SFA-standpunt. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Krijgt een waarde die aangeeft of deze instantie geldig is. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Haalt SpatialReferenceSystem van deze instantie op. Deze eigenschap kan`null` , is SpatialReferenceSystem onbekend. Het toewijzen van een nieuw SpatialReferenceSystem zal geen coördinatentransformatie uitvoeren, alleen de referentie zal veranderen. |
| abstract [StartPoint](../../aspose.gis.geometries/curve/startpoint/) { get; } | Retourneert een kopie van het beginpunt van de curve. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Vertaalt deze geometrie naar zijn welbekende binaire representatie. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Vertaalt deze geometrie naar zijn welbekende binaire representatie. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Kloont deze instantie. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bepaalt of deze geometrie wordt gedekt door een gespecificeerde geometrie. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bepaalt of deze geometrie een gespecificeerde geometrie dekt. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bepaalt of deze geometrie en een gespecificeerde geometrie elkaar kruisen. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Trekt een gespecificeerde geometrie af van deze geometrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bepaalt of deze geometrie disjunct is van een gespecificeerde geometrie. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Berekent de oppervlakte van deze geometrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Berekent een buffergebied rond deze geometrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Berekent het zwaartepunt van deze geometrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Berekent de convexe romp van deze geometrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Berekent de minimale afstand tussen deze geometrie en een gespecificeerde geometrie. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Berekent en retourneert een begrenzing van deze geometrie. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Berekent de lengte van deze geometrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bouwt een snijpunt tussen deze geometrie en een gespecificeerde geometrie. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bepaalt of deze geometrie een gespecificeerd bereik snijdt. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bepaalt of deze geometrie en een opgegeven geometrie elkaar snijden. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bepaalt of deze geometrie overlapt met een gespecificeerde geometrie. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bepaalt of DE-9IM intersectiematrix van deze geometrie en een gespecificeerde geometrie overeenkomt met het verstrekte patroon. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Krijgt polygonen weergegeven als lijnen van deze geometrie. |
| abstract [Reverse](../../aspose.gis.geometries/curve/reverse/)() | Keert deze curve om. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rondt M-coördinaat af op een opgegeven aantal decimalen. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rondt X- en Y-coördinaten af op een opgegeven aantal decimalen. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rondt de Z-coördinaat af op een opgegeven aantal decimalen. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Maakt dit[`Geometry`](../geometry/) leeg. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bepaalt of deze geometrie ruimtelijk een gespecificeerde geometrie bevat. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bepaalt of deze geometrie ruimtelijk gelijk is aan een gespecificeerde geometrie. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bouwt een symmetrisch verschil op tussen deze geometrie en een gespecificeerde geometrie. |
| [ToEditable](../../aspose.gis.geometries/curve/toeditable/#toeditable)() | Krijgt een bewerkbare kopie van deze geometrie. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Krijgt een bewerkbare kopie van deze geometrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_2)() | Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_3)(double) | Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bepaalt of deze geometrie en een opgegeven geometrie elkaar raken. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Verenigt deze geometrie en een gespecificeerde geometrie. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bepaalt of deze geometrie binnen een opgegeven bereik valt. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bepaalt of deze geometrie binnen een gespecificeerde geometrie valt. |

### Zie ook

* class [Geometry](../geometry/)
* interface [ICurve](../icurve/)
* naamruimte [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* montage [Aspose.GIS](../../)


