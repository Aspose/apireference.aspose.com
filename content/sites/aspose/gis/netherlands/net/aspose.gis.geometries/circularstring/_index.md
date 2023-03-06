---
title: Class CircularString
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Geometries.CircularString klas. Een curve met meerdere hoekpunten met circulaire interpolatie tussen punten.
type: docs
weight: 880
url: /nl/net/aspose.gis.geometries/circularstring/
---
## CircularString class

Een curve met meerdere hoekpunten met circulaire interpolatie tussen punten.

```csharp
public class CircularString : Curve, ICircularString
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [CircularString](circularstring/#constructor)() | Initialiseert een nieuw exemplaar van het`CircularString` klasse. |
| [CircularString](circularstring/#constructor_1)(ICircularString) | Initialiseert een nieuw exemplaar van het`CircularString` klasse. |
| [CircularString](circularstring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Initialiseert een nieuw exemplaar van het`CircularString` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Krijgt het aantal coördinaatdimensies hiervoor[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/circularstring/count/) { get; } | Krijgt het aantal punten in de`CircularString` . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Krijgt de topologische dimensie hiervan[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/circularstring/endpoint/) { get; } | Geeft een kopie van het eindpunt van de curve. |
| override [GeometryType](../../aspose.gis.geometries/circularstring/geometrytype/) { get; } | Haalt het type geometrie op. |
| override [HasCurveGeometry](../../aspose.gis.geometries/circularstring/hascurvegeometry/) { get; } | Krijgt een waarde die aangeeft of deze geometrie kromme (niet lineaire) geometrie is of bevat. |
| [HasM](../../aspose.gis.geometries/circularstring/hasm/) { get; set; } | Krijgt een waarde die aangeeft of deze instantie M-coördinaat heeft. |
| [HasZ](../../aspose.gis.geometries/circularstring/hasz/) { get; set; } | Krijgt een waarde die aangeeft of deze instantie een Z-coördinaat heeft. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Krijgt een waarde die aangeeft of een curve gesloten is. Een curve is gesloten als het startpunt gelijk is aan het eindpunt. |
| override [IsEmpty](../../aspose.gis.geometries/circularstring/isempty/) { get; } | Krijgt een waarde die aangeeft of deze instantie leeg is. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Krijgt een waarde die aangeeft of deze instantie eenvoudig is vanuit SFA-standpunt. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Krijgt een waarde die aangeeft of deze instantie geldig is. |
| [Item](../../aspose.gis.geometries/circularstring/item/) { get; set; } | Haalt of stelt de[`IPoint`](../ipoint/) op de opgegeven index. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/circularstring/spatialreferencesystem/) { get; set; } | Haalt SpatialReferenceSystem van deze instantie op. Deze eigenschap kan`null` , als SpatialReferenceSystem niet is ingesteld. Het toewijzen van een nieuw SpatialReferenceSystem zal geen coördinatentransformatie uitvoeren, alleen de referentie zal veranderen. |
| override [StartPoint](../../aspose.gis.geometries/circularstring/startpoint/) { get; } | Retourneert een kopie van het beginpunt van de curve. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint)(IPoint) | Voegt een punt toe aan het einde van de cirkelvormige tekenreeks. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_1)(double, double) | Voegt een punt toe aan het einde van de cirkelvormige tekenreeks. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_2)(double, double, double) | Voegt een punt toe aan het einde van de cirkelvormige tekenreeks. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_3)(double, double, double, double) | Voegt een punt toe aan het einde van de cirkelvormige tekenreeks. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Vertaalt deze geometrie naar zijn welbekende binaire representatie. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Vertaalt deze geometrie naar zijn welbekende binaire representatie. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exporteer deze geometrie naar een afbeelding. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Vertaalt deze geometrie naar zijn welbekende tekstweergave. |
| override [Clone](../../aspose.gis.geometries/circularstring/clone/)() | Kloont deze instantie. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bepaalt of deze geometrie wordt gedekt door een gespecificeerde geometrie. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bepaalt of deze geometrie een gespecificeerde geometrie dekt. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bepaalt of deze geometrie en een gespecificeerde geometrie elkaar kruisen. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Trekt een gespecificeerde geometrie af van deze geometrie. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bepaalt of deze geometrie disjunct is van een gespecificeerde geometrie. |
| [Equals](../../aspose.gis.geometries/circularstring/equals/#equals)(ICircularString) | Geeft aan of het huidige object gelijk is aan een ander object van hetzelfde type. |
| override [Equals](../../aspose.gis.geometries/circularstring/equals/#equals_1)(object) | Bepaalt of het opgegeven object gelijk is aan het huidige object. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Berekent de oppervlakte van deze geometrie. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Berekent een buffergebied rond deze geometrie. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Berekent het zwaartepunt van deze geometrie. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Berekent de convexe romp van deze geometrie. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Berekent de minimale afstand tussen deze geometrie en een gespecificeerde geometrie. |
| [GetEnumerator](../../aspose.gis.geometries/circularstring/getenumerator/)() | Retourneert een enumerator die de verzameling doorloopt. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Berekent en retourneert een begrenzing van deze geometrie. |
| override [GetHashCode](../../aspose.gis.geometries/circularstring/gethashcode/)() | Dient als de standaard hash-functie. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Berekent de lengte van deze geometrie. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bouwt een snijpunt tussen deze geometrie en een gespecificeerde geometrie. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bepaalt of deze geometrie een gespecificeerd bereik snijdt. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bepaalt of deze geometrie en een opgegeven geometrie elkaar snijden. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bepaalt of deze geometrie overlapt met een gespecificeerde geometrie. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bepaalt of DE-9IM intersectiematrix van deze geometrie en een gespecificeerde geometrie overeenkomt met het verstrekte patroon. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Krijgt polygonen weergegeven als lijnen van deze geometrie. |
| override [Reverse](../../aspose.gis.geometries/circularstring/reverse/)() | Keert hierin de volgorde van de punten om`CircularString` . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rondt M-coördinaat af op een opgegeven aantal decimalen. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rondt X- en Y-coördinaten af op een opgegeven aantal decimalen. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rondt de Z-coördinaat af op een opgegeven aantal decimalen. |
| override [SetEmpty](../../aspose.gis.geometries/circularstring/setempty/)() | Maakt dit[`Geometry`](../geometry/) leeg. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bepaalt of deze geometrie ruimtelijk een gespecificeerde geometrie bevat. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bepaalt of deze geometrie ruimtelijk gelijk is aan een gespecificeerde geometrie. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bouwt een symmetrisch verschil op tussen deze geometrie en een gespecificeerde geometrie. |
| [ToEditable](../../aspose.gis.geometries/circularstring/toeditable/#toeditable)() | Krijgt een bewerkbare kopie van deze geometrie. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Krijgt een bewerkbare kopie van deze geometrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Retourneert een tekenreeks die het huidige object vertegenwoordigt. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bepaalt of deze geometrie en een opgegeven geometrie elkaar raken. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Verenigt deze geometrie en een gespecificeerde geometrie. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bepaalt of deze geometrie binnen een opgegeven bereik valt. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bepaalt of deze geometrie binnen een gespecificeerde geometrie valt. |
| [operator ==](../../aspose.gis.geometries/circularstring/op_equality/) | Implementeert de operator ==. |
| [operator !=](../../aspose.gis.geometries/circularstring/op_inequality/) | Implementeert de operator !=. |

### Opmerkingen

De`Circulaire tekenreeks` bestaat uit een of meer cirkelboogsegmenten die met de uiteinden aan elkaar zijn verbonden. De eerste drie punten definiëren het eerste segment. Het eerste punt is het beginpunt van de boog. Het tweede punt is elk tussenliggend punt op de boog behalve het begin- of eindpunt. Het derde punt is het einde van de boog. Volgende bogen worden alleen gedefinieerd door hun tussen- en eindpunten, aangezien het startpunt impliciet wordt gedefinieerd als het eindpunt van het vorige segment.

### Zie ook

* class [Curve](../curve/)
* interface [ICircularString](../icircularstring/)
* naamruimte [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* montage [Aspose.GIS](../../)


