---
title: GeocentricSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: Geocentric SRS är 3dimensionell kartesisk SRS med ursprung i jordens centrum.
type: docs
weight: 1990
url: /sv/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geocentric SRS är 3-dimensionell kartesisk SRS med ursprung i jordens centrum.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Returnerar denna SRS konverterad till[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Använd[`IsCompound`](../spatialreferencesystem/iscompound) för att ta reda på om konvertering är möjlig. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric) { get; } | Returnera detta. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Returnerar denna SRS konverterad till[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Returnerar denna SRS konverterad till[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Returnerar denna SRS konverterad till[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Returnerar denna SRS konverterad till[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder) { get; } | Axlarnas ordning i denna SRS. Om denna SRS inte är giltig och har fel axelriktningar,Invalid returneras. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount) { get; } | Retur 3, eftersom geocentrisk SRS alltid är tredimensionell. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum) { get; } | Returnera geografiskt datum för denna SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum) { get; } | Retur`true` , eftersom geocentriska SRS alltid har geografiskt datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian) { get; } | Retur`true` , eftersom geocentriska SRS alltid har nollmeridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifierare för detta identifierbara objekt. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Returnerar om denna SRS är sammansatt (en förening av två SRS). Följande kombinationer av SRS i sammansatt SRS anses giltiga: Geografisk SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig, kommer typen av sammansatt SRS att varaUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Returnerar om denna SRS är singel (inte en förening av två SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Samma som[`Validate`](../spatialreferencesystem/validate) , men returnera inte felmeddelande. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit) { get; } | Enhet, används i denna SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Namn på detta objekt. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian) { get; } | Returnera nollmeridianen för denna SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type) { get; } | ReturGeocentric . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Returnerar representation av denna SRS som WKT-sträng. Resultat-WKT-strängen matchar OGC 01-009-specifikationen, vanligtvis kallad "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis)(int) | Hämta[`Axis`](../axis) som beskriver dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit)(int) | Hämta[`Unit`](../unit)av dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Detekterar om denna SRS är likvärdig med annan SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Returnerar en sträng som representerar det aktuella objektet. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate)(out string) | Bestäm om denna SRS är giltig. Ser[`Validate`](../spatialreferencesystem/validate) för giltighetsbeskrivning. |

### Se även

* class [SpatialReferenceSystem](../spatialreferencesystem)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
