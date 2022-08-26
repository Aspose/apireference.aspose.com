---
title: GeographicSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: En Geographic SRS är en SRS som är baserad på longitud och latitud. En Geographic SRS kan vara tvådimensionell eller tredimensionell. Om geografisk SRS är tredimensionell så är det faktiskt en sammansatt SRS av tvådimensionell SRS och vertikal SRS.
type: docs
weight: 2030
url: /sv/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

En Geographic SRS är en SRS som är baserad på longitud och latitud. En Geographic SRS kan vara tvådimensionell eller tredimensionell. Om geografisk SRS är tredimensionell, så är det faktiskt en sammansatt SRS av tvådimensionell SRS och vertikal SRS.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit) { get; } | Enhet, används för vinkelmått, i denna SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Returnerar denna SRS konverterad till[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Använd[`IsCompound`](../spatialreferencesystem/iscompound) för att ta reda på om konvertering är möjlig. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Returnerar denna SRS konverterad till[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic) { get; } | Returnerar detta. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Returnerar denna SRS konverterad till[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Returnerar denna SRS konverterad till[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Returnerar denna SRS konverterad till[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Använd[`Type`](../spatialreferencesystem/type) för att ta reda på om konvertering är möjlig. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder) { get; } | Axlarnas ordning i denna SRS. Om denna SRS inte är giltig och har fel axelriktningar,Invalid returneras. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount) { get; } | Returnerar antalet dimensioner i denna SRS. För geografisk SRS kan detta vara: two - om detta är singelgeografisk SRS. three - om detta är sammansatt SRS, som består av enkel, tvådimensionell, geografisk SRS och vertikal SRS, som lägger till den tredje dimensionen. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Returnerar geografiskt datum för denna SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum) { get; } | Returnerar`true` , eftersom geografiska SRS alltid har nollmeridian. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian) { get; } | Returnerar`true` , eftersom geografiska SRS alltid har nollmeridian. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifierare för detta identifierbara objekt. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Returnerar om denna SRS är sammansatt (en förening av två SRS). Följande kombinationer av SRS i sammansatt SRS anses giltiga: Geografisk SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig, kommer typen av sammansatt SRS att varaUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Returnerar om denna SRS är singel (inte en förening av två SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Samma som[`Validate`](../spatialreferencesystem/validate) , men returnera inte felmeddelande. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Namn på detta objekt. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Returnerar nollmeridianen för denna SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type) { get; } | ReturnerarGeographic . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Returnerar representation av denna SRS som WKT-sträng. Resultat-WKT-strängen matchar OGC 01-009-specifikationen, vanligtvis kallad "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Hämta[`Axis`](../axis) som beskriver dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Hämta[`Unit`](../unit)av dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Detekterar om denna SRS är likvärdig med annan SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Returnerar en sträng som representerar det aktuella objektet. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Bestäm om denna SRS är giltig. |

### Se även

* class [SpatialReferenceSystem](../spatialreferencesystem)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
