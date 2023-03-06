---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem klass. Sammansatt SRS förenar två underliggande SRS av vilka ingen kan vara sammansatt.
type: docs
weight: 2060
url: /sv/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Sammansatt SRS förenar två underliggande SRS, av vilka ingen kan vara sammansatt.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Returnera detta. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returnerar denna SRS konverterad till[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Använd[`Type`](../spatialreferencesystem/type/) för att ta reda på om konvertering är möjlig. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Returnera geografisk representation av denna SRS. Om denna sammansatta SRS verkligen representerar en geografisk SRS kommer resultatet att vara tredimensionell geografisk SRS (med dimensioner longitud, latitud, höjd). Annars kommer ett undantag att skapas. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returnerar denna SRS konverterad till[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Använd[`Type`](../spatialreferencesystem/type/) för att ta reda på om konvertering är möjlig. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Returnera projicerad representation av denna SRS. Om denna sammansatta SRS verkligen representerar en projicerad SRS, kommer resultatet att vara tredimensionell projicerad SRS (med X, Y, höjddimensioner). Annars kommer ett undantag att skapas. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returnerar denna SRS konverterad till[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Använd[`Type`](../spatialreferencesystem/type/) för att ta reda på om konvertering är möjlig. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Antal dimensioner. För sammansatt SRS är detta summan av antalet dimensioner av underliggande SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Returnera geografiskt datum för denna SRS. Om båda[`Head`](./head/) och[`Tail`](./tail/) ha geografiskt datum - returnera geografiskt datum för huvudet. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Sammansatta SRS har geografiskt datum om någon av underliggande SRS har geografiskt datum. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | Sammansatt SRS har prime meridian om någon av underliggande SRS har prime meridian. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | Första underliggande SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifierare för detta identifierbara objekt. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Returnerar`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returnerar om denna SRS är singel (inte en förening av två SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Samma som[`Validate`](../spatialreferencesystem/validate/) , men returnera inte felmeddelande. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Namn på detta objekt. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Returnera nollmeridianen för denna SRS. Om båda[`Head`](./head/) och[`Tail`](./tail/) ha nollmeridian - returnera nollmeridian för huvud. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Andra underliggande SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Typ av denna förening SRS. Kan varaGeographicif denna sammansatta SRS är en kombination av geografisk och vertikal SRS, ellerProjected if denna sammansatta SRS är en kombination av projicerad och vertikal SRS. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returnerar representation av denna SRS som WKT-sträng. Resultat-WKT-strängen matchar OGC 01-009-specifikationen, vanligtvis kallad "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Hämta[`Axis`](../axis/) som beskriver dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Hämta[`Unit`](../unit/)av dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detekterar om denna SRS är likvärdig med annan SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Bestäm om denna SRS är giltig. Ser[`Validate`](../spatialreferencesystem/validate/) för giltighetsbeskrivning. |

### Se även

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* hopsättning [Aspose.GIS](../../)


