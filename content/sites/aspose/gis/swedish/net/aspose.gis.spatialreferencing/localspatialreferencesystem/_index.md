---
title: LocalSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: Lokala SRSrelaterade koordinater till något objekt inte jord.
type: docs
weight: 2080
url: /sv/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Lokala SRS-relaterade koordinater till något objekt, inte jord.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Returnerar denna SRS konverterad till[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Använd[`IsCompound`](../spatialreferencesystem/iscompound) för att ta reda på om konvertering är möjlig. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Returnerar denna SRS konverterad till[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Returnerar denna SRS konverterad till[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | Returnera detta. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Returnerar denna SRS konverterad till[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Returnerar denna SRS konverterad till[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | Antal dimensioner i denna SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | KastarInvalidOperationException eftersom Local SRS inte har geografiskt datum. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | Returnerar`false` eftersom Local SRS inte har geografiskt datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | Returnerar`false` , eftersom Local SRS inte har nollmeridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifierare för detta identifierbara objekt. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Returnerar om denna SRS är sammansatt (en förening av två SRS). Följande kombinationer av SRS i sammansatt SRS anses giltiga: Geografisk SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig, kommer typen av sammansatt SRS att varaUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Returnerar om denna SRS är singel (inte en förening av två SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Samma som[`Validate`](../spatialreferencesystem/validate) , men returnera inte felmeddelande. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Datum, som beskriver mätmetoden. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Namn på detta objekt. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | KastarInvalidOperationException , eftersom Local SRS inte har nollmeridian. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | ReturLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | Enhet av denna SRS. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Returnerar representation av denna SRS som WKT-sträng. Resultat-WKT-strängen matchar OGC 01-009-specifikationen, vanligtvis kallad "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | Hämta[`Axis`](../axis) som beskriver dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | Hämta[`Unit`](./unit)av dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Detekterar om denna SRS är likvärdig med annan SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Returnerar en sträng som representerar det aktuella objektet. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | Bestäm om denna SRS är giltig. Ser[`Validate`](../spatialreferencesystem/validate) för giltighetsbeskrivning. |

### Se även

* class [SpatialReferenceSystem](../spatialreferencesystem)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
