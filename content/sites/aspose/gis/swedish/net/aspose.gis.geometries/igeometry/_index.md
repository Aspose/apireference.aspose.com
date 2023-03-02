---
title: Interface IGeometry
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Geometries.IGeometry gränssnitt. Gränssnittsrotklassen för Geometries hierarchy
type: docs
weight: 1000
url: /sv/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

Gränssnittsrotklassen för Geometries hierarchy

```csharp
public interface IGeometry
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | Får den topologiska dimensionen av detta`IGeometry` . Om dimensionen är okänd (t.ex. för en tom GEOMETRYCOLLECTION)Point returneras. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | Hämtar typen av geometri. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | Får ett värde som indikerar om denna geometri är eller innehåller kurvgeometri (ej linjär). |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | Får ett värde som indikerar om denna instans har M-koordinat. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | Får ett värde som indikerar om denna instans har Z-koordinat. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | Får ett värde som indikerar om denna instans är tom (representerar den tomma punktuppsättningen). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | Får ett värde som indikerar om denna instans är enkel ur SFA-synpunkt. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | Får ett värde som indikerar om denna instans är giltig. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | Hämtar SpatialReferenceSystem för denna instans. Den här egenskapen kan vara`null` , om SpatialReferenceSystem är okänt. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | Översätter denna geometri till dess välkända binära representation. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | Översätter denna geometri till dess välkända binära representation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Exportera denna geometri till en bildrepresentation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | Översätter denna geometri till dess välkända textrepresentation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | Översätter denna geometri till dess välkända textrepresentation. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | Klonar den här instansen. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | Bestämmer om denna geometri täcks av en specificerad geometri. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | Bestämmer om denna geometri täcker en specificerad geometri. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri korsar. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | Subtraherar en specificerad geometri från denna geometri. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | Bestämmer om denna geometri är osammanhängande från en specificerad geometri. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | Beräknar arean av denna geometri. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | Beräknar ett buffertområde runt denna geometri. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | Beräknar tyngdpunkten för denna geometri. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | Beräknar det konvexa skrovet för denna geometri. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | Beräknar och returnerar en avgränsande utsträckning av denna geometri. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | Beräknar längden på denna geometri. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | Bygger en skärningspunkt mellan denna geometri och en specificerad geometri. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | Bestämmer om denna geometri skär en specificerad utsträckning. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri skär varandra. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | Bestämmer om denna geometri överlappar med en specificerad geometri. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | Bestämmer om DE-9IM skärningsmatris för denna geometri och en specificerad geometri matchar det angivna mönstret. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | Får polygoner representerade som linjer i denna geometri. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | Bestämmer om denna geometri rymdmässigt innehåller en specificerad geometri. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | Bestämmer om denna geometri är rumsligt lika med en specificerad geometri. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | Bygger en symmetrisk skillnad mellan denna geometri och en specificerad geometri. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | Får en redigerbar kopia av denna geometri. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | Får en redigerbar kopia av denna geometri. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | Bestämmer om denna geometri och en specificerad geometri berör. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | Förenar denna geometri och en specificerad geometri. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | Bestämmer om denna geometri är inom en specificerad omfattning. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | Bestämmer om denna geometri är inom en specificerad geometri. |

### Se även

* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* hopsättning [Aspose.GIS](../../)


