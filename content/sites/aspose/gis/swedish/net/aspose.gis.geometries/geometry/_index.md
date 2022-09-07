---
title: Geometry
second_title: Aspose.GIS för .NET API Referens
description: Den abstrakta rotklassen för geometrihierarkin.
type: docs
weight: 820
url: /sv/net/aspose.gis.geometries/geometry/
---
## Geometry class

Den abstrakta rotklassen för geometrihierarkin.

```csharp
public abstract class Geometry : IGeometry
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Hämtar antalet koordinatdimensioner för detta[`Geometry`](../geometry) . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension) { get; } | Får den topologiska dimensionen av detta[`Geometry`](../geometry) . Om dimensionen är okänd (t.ex. för en tom GEOMETRYCOLLECTION)Point returneras. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | Hämtar typen av geometri. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Får ett värde som indikerar om denna geometri är eller innehåller kurvgeometri (ej linjär). |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | Får ett värde som indikerar om denna instans har M-koordinat. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | Får ett värde som indikerar om denna instans har Z-koordinat. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Får ett värde som anger om denna instans är tom. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Får ett värde som indikerar om denna instans är enkel ur SFA-synpunkt. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Får ett värde som indikerar om denna instans är giltig. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | Hämtar SpatialReferenceSystem för denna instans. Den här egenskapen kan vara`null` , är SpatialReferenceSystem är okänt. Att tilldela nytt SpatialReferenceSystem kommer inte att utföra någon koordinattransformation, bara referensen kommer att ändras. |
| static [Null](../../aspose.gis.geometries/geometry/null) { get; } | Hämtar en instans av nollgeometri. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary)() | Översätter denna geometri till dess välkända binära representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary_1)(WkbVariant) | Översätter denna geometri till dess välkända binära representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext)() | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_1)(WktVariant) | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_2)(WktVariant, NumericFormat) | Översätter denna geometri till dess välkända textrepresentation. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone)() | Klonar den här instansen. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Bestämmer om denna geometri täcks av en specificerad geometri. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Bestämmer om denna geometri täcker en specificerad geometri. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri korsar. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Subtraherar en specificerad geometri från denna geometri. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Bestämmer om denna geometri är osammanhängande från en specificerad geometri. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Beräknar arean av denna geometri. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Beräknar ett buffertområde runt denna geometri. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Beräknar tyngdpunkten för denna geometri. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Beräknar det konvexa skrovet för denna geometri. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Beräknar och returnerar en avgränsande utsträckning av denna geometri. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Beräknar längden på denna geometri. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Bygger en skärningspunkt mellan denna geometri och en specificerad geometri. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects)(Extent) | Bestämmer om denna geometri skär en specificerad utsträckning. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects_1)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri skär varandra. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Bestämmer om denna geometri överlappar med en specificerad geometri. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Bestämmer om DE-9IM skärningsmatris för denna geometri och en specificerad geometri matchar det angivna mönstret. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Får polygoner representerade som linjer i denna geometri. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Avrundar M-koordinaten till ett angivet antal bråksiffror. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Avrundar X- och Y-koordinaterna till ett specificerat antal bråksiffror. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Avrundar Z-koordinaten till ett specificerat antal bråksiffror. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | gör detta[`Geometry`](../geometry) tomt. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Bestämmer om denna geometri rymdmässigt innehåller en specificerad geometri. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Bestämmer om denna geometri är rumsligt lika med en specificerad geometri. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri. |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable#toeditable)() | Får en redigerbar kopia av denna geometri. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable#toeditable_1)() | Får en redigerbar kopia av denna geometri. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry)() | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry_1)(double) | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Returnerar en sträng som representerar det aktuella objektet. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri berör. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Förenar denna geometri och en specificerad geometri. |
| [Within](../../aspose.gis.geometries/geometry/within#within)(Extent) | Bestämmer om denna geometri är inom en specificerad omfattning. |
| [Within](../../aspose.gis.geometries/geometry/within#within_1)(IGeometry) | Bestämmer om denna geometri är inom en specificerad geometri. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary)(byte[]) | Skapar en geometri från dess välkända binära representation. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary_1)(byte[], SpatialReferenceSystem) | Skapar en geometri från dess välkända binära representation. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext)(string) | Skapar en geometri från dess välkända textrepresentation. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext_1)(string, SpatialReferenceSystem) | Skapar en geometri från dess välkända textrepresentation. |

### Se även

* interface [IGeometry](../igeometry)
* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
