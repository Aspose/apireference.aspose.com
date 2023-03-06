---
title: Class GeometryCollection
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Geometries.GeometryCollection klass. AGeometryCollection är enGeometry som är en samling av en eller flera geometrier.
type: docs
weight: 930
url: /sv/net/aspose.gis.geometries/geometrycollection/
---
## GeometryCollection class

A`GeometryCollection` är en[`Geometry`](../geometry/) som är en samling av en eller flera geometrier.

```csharp
public class GeometryCollection : Geometry, IGeometryCollection
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [GeometryCollection](geometrycollection/)() | Initierar en ny instans av`GeometryCollection` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Hämtar antalet koordinatdimensioner för detta[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/geometrycollection/count/) { get; } | Får antalet geometrier i den här samlingen. |
| override [Dimension](../../aspose.gis.geometries/geometrycollection/dimension/) { get; } | Får den topologiska dimensionen av detta[`Geometry`](../geometry/) . Om samlingen är tom,Point returneras. |
| override [GeometryType](../../aspose.gis.geometries/geometrycollection/geometrytype/) { get; } | Hämtar typen av geometri. |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry/) { get; } | Får ett värde som indikerar om denna geometri är eller innehåller kurvgeometri (ej linjär). |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm/) { get; set; } | Får ett värde som indikerar om denna instans har M-koordinat. |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz/) { get; set; } | Får ett värde som indikerar om denna instans har Z-koordinat. |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty/) { get; } | Får ett värde som anger om denna instans är tom. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Får ett värde som indikerar om denna instans är enkel ur SFA-synpunkt. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Får ett värde som indikerar om denna instans är giltig. |
| [Item](../../aspose.gis.geometries/geometrycollection/item/) { get; } | Får en[`IGeometry`](../igeometry/) vid angivet index. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem/) { get; set; } | Hämtar SpatialReferenceSystem för denna instans. Den här egenskapen kan vara`null` , är SpatialReferenceSystem är okänt. Att tilldela nytt SpatialReferenceSystem kommer inte att utföra någon koordinattransformation, bara referensen kommer att ändras. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add/)(IGeometry) | Lägger till den angivna geometrin till samlingen. |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange/)(IEnumerable&lt;IGeometry&gt;) | Lägger till de angivna geometrierna till samlingen. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Översätter denna geometri till dess välkända binära representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Översätter denna geometri till dess välkända binära representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Översätter denna geometri till dess välkända textrepresentation. |
| override [Clone](../../aspose.gis.geometries/geometrycollection/clone/)() | Klonar den här instansen. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bestämmer om denna geometri täcks av en specificerad geometri. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bestämmer om denna geometri täcker en specificerad geometri. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri korsar. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtraherar en specificerad geometri från denna geometri. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bestämmer om denna geometri är osammanhängande från en specificerad geometri. |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals/#equals)(IGeometryCollection) | Anger om det aktuella objektet är lika med ett annat objekt av samma typ. |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals/#equals_1)(object) | Bestämmer om det angivna objektet är lika med det aktuella objektet. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Beräknar arean av denna geometri. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Beräknar ett buffertområde runt denna geometri. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Beräknar tyngdpunkten för denna geometri. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Beräknar det konvexa skrovet för denna geometri. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri. |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator/)() | Returnerar en uppräkning som itererar genom samlingen. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Beräknar och returnerar en avgränsande utsträckning av denna geometri. |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode/)() | Fungerar som standard hash-funktion. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Beräknar längden på denna geometri. |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface/)() | Hittar en punkt som garanterat finns på en av ytorna i denna samling. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bygger en skärningspunkt mellan denna geometri och en specificerad geometri. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bestämmer om denna geometri skär en specificerad utsträckning. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri skär varandra. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bestämmer om denna geometri överlappar med en specificerad geometri. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bestämmer om DE-9IM skärningsmatris för denna geometri och en specificerad geometri matchar det angivna mönstret. |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat/)(int) | Tar bort den angivna geometrin från samlingen. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines/#replacepolygonsbylines_1)() | Får polygoner representerade som linjer i denna geometri. (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Avrundar M-koordinaten till ett angivet antal bråksiffror. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Avrundar X- och Y-koordinaterna till ett specificerat antal bråksiffror. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Avrundar Z-koordinaten till ett specificerat antal bråksiffror. |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty/)() | gör detta[`Geometry`](../geometry/) tomt. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bestämmer om denna geometri rymdmässigt innehåller en specificerad geometri. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bestämmer om denna geometri är rumsligt lika med en specificerad geometri. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri. |
| [ToEditable](../../aspose.gis.geometries/geometrycollection/toeditable/#toeditable_1)() | Får en redigerbar kopia av denna geometri. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Får en redigerbar kopia av denna geometri. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometrycollection/tolineargeometry/#tolineargeometry_2)() | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/geometrycollection/tolineargeometry/#tolineargeometry_3)(double) | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri berör. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Förenar denna geometri och en specificerad geometri. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bestämmer om denna geometri är inom en specificerad omfattning. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bestämmer om denna geometri är inom en specificerad geometri. |
| [operator ==](../../aspose.gis.geometries/geometrycollection/op_equality/) | Implementerar operatorn ==. |
| [operator !=](../../aspose.gis.geometries/geometrycollection/op_inequality/) | Implementerar operatorn !=. |

### Se även

* class [Geometry](../geometry/)
* interface [IGeometryCollection](../igeometrycollection/)
* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* hopsättning [Aspose.GIS](../../)


