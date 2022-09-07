---
title: Point
second_title: Aspose.GIS för .NET API Referens
description: APoint./point representerar en enda plats i koordinatutrymmet.
type: docs
weight: 1090
url: /sv/net/aspose.gis.geometries/point/
---
## Point class

A[`Point`](../point) representerar en enda plats i koordinatutrymmet.

```csharp
public class Point : Geometry, IPoint
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Point](point#constructor)() | Initierar en ny instans av[`Point`](../point) class. |
| [Point](point#constructor_1)(IPoint) | Initierar en ny instans av[`Point`](../point) class. |
| [Point](point#constructor_2)(double, double) | Initierar en ny instans av[`Point`](../point) class. |
| [Point](point#constructor_3)(double, double, double) | Initierar en ny instans av[`Point`](../point) class. |
| [Point](point#constructor_4)(double, double, double, double) | Initierar en ny instans av[`Point`](../point) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Hämtar antalet koordinatdimensioner för detta[`Geometry`](../geometry) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension) { get; } | Får den topologiska dimensionen av detta[`Geometry`](../geometry) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype) { get; } | Hämtar typen av geometri. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Får ett värde som indikerar om denna geometri är eller innehåller kurvgeometri (ej linjär). |
| override [HasM](../../aspose.gis.geometries/point/hasm) { get; set; } | Får ett värde som indikerar om denna instans har en M-koordinat. |
| override [HasZ](../../aspose.gis.geometries/point/hasz) { get; set; } | Får ett värde som indikerar om denna instans har Z-koordinat. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Får ett värde som anger om denna instans är tom. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Får ett värde som indikerar om denna instans är enkel ur SFA-synpunkt. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Får ett värde som indikerar om denna instans är giltig. |
| [M](../../aspose.gis.geometries/point/m) { get; set; } | Hämtar eller ställer in ett värde för m-koordinaten. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem) { get; set; } | Hämtar SpatialReferenceSystem för denna instans. Den här egenskapen kan vara`null` , är SpatialReferenceSystem är okänt. Att tilldela nytt SpatialReferenceSystem kommer inte att utföra någon koordinattransformation, bara referensen kommer att ändras. |
| [X](../../aspose.gis.geometries/point/x) { get; set; } | Hämtar eller ställer in ett värde för x-koordinaten. |
| [Y](../../aspose.gis.geometries/point/y) { get; set; } | Hämtar eller ställer in ett värde för y-koordinaten. |
| [Z](../../aspose.gis.geometries/point/z) { get; set; } | Hämtar eller ställer in ett värde för z-koordinaten. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Översätter denna geometri till dess välkända binära representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Översätter denna geometri till dess välkända binära representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Översätter denna geometri till dess välkända textrepresentation. |
| override [Clone](../../aspose.gis.geometries/point/clone)() | Klonar den här instansen. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Bestämmer om denna geometri täcks av en specificerad geometri. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Bestämmer om denna geometri täcker en specificerad geometri. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri korsar. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Subtraherar en specificerad geometri från denna geometri. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Bestämmer om denna geometri är osammanhängande från en specificerad geometri. |
| [Equals](../../aspose.gis.geometries/point/equals#equals)(IPoint) | Anger om det aktuella objektet är lika med ett annat objekt av samma typ. |
| override [Equals](../../aspose.gis.geometries/point/equals#equals_1)(object) | Bestämmer om det angivna objektet är lika med det aktuella objektet. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Beräknar arean av denna geometri. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Beräknar ett buffertområde runt denna geometri. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Beräknar tyngdpunkten för denna geometri. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Beräknar det konvexa skrovet för denna geometri. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Beräknar och returnerar en avgränsande utsträckning av denna geometri. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode)() | Fungerar som standard hash-funktion. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Beräknar längden på denna geometri. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Bygger en skärningspunkt mellan denna geometri och en specificerad geometri. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Bestämmer om denna geometri skär en specificerad utsträckning. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri skär varandra. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Bestämmer om denna geometri överlappar med en specificerad geometri. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Bestämmer om DE-9IM skärningsmatris för denna geometri och en specificerad geometri matchar det angivna mönstret. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Får polygoner representerade som linjer i denna geometri. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Avrundar M-koordinaten till ett angivet antal bråksiffror. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Avrundar X- och Y-koordinaterna till ett specificerat antal bråksiffror. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Avrundar Z-koordinaten till ett specificerat antal bråksiffror. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty)() | gör detta[`Geometry`](../geometry) tomt. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Bestämmer om denna geometri rymdmässigt innehåller en specificerad geometri. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Bestämmer om denna geometri är rumsligt lika med en specificerad geometri. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable#toeditable_1)() | Får en redigerbar kopia av denna geometri. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Får en redigerbar kopia av denna geometri. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)() | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)(double) | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Returnerar en sträng som representerar det aktuella objektet. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri berör. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Förenar denna geometri och en specificerad geometri. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Bestämmer om denna geometri är inom en specificerad omfattning. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Bestämmer om denna geometri är inom en specificerad geometri. |
| [operator ==](../../aspose.gis.geometries/point/op_equality) | Implementerar operatorn ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality) | Implementerar operatorn !=. |

### Se även

* class [Geometry](../geometry)
* interface [IPoint](../ipoint)
* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
