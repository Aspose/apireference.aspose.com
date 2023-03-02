---
title: Class SpatialReferenceSystem
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem klass. Rumsliga referenssystem kartlägger koordinater till platser på jorden. Det finns olika typer av SRS seType . Vad mer om typ av SRS ärGeographic or Projected SRS kan vara sammansatt eller singel seIsCompound .
type: docs
weight: 2250
url: /sv/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Rumsliga referenssystem kartlägger koordinater till platser på jorden. Det finns olika typer av SRS, se[`Type`](./type/) . Vad mer, om typ av SRS ärGeographic or Projected SRS kan vara sammansatt eller singel, se[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Returnerar denna SRS konverterad till[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Använd[`IsCompound`](./iscompound/) för att ta reda på om konvertering är möjlig. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Returnerar denna SRS konverterad till[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Använd[`Type`](./type/) för att ta reda på om konvertering är möjlig. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Returnerar denna SRS konverterad till[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Använd[`Type`](./type/) för att ta reda på om konvertering är möjlig. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Returnerar denna SRS konverterad till[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Använd[`Type`](./type/) för att ta reda på om konvertering är möjlig. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Returnerar denna SRS konverterad till[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Använd[`Type`](./type/) för att ta reda på om konvertering är möjlig. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Returnerar denna SRS konverterad till[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Använd[`Type`](./type/) för att ta reda på om konvertering är möjlig. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Returnerar antalet dimensioner i denna SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Om denna objektidentifierare är EPSG-identifierare - returnera dess kod. Annars - returnera -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Returnerar geografiskt datum för denna SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Avgör om denna SRS har geografiskt datum. Detta gäller för alla geografiska, projicerade och geocentriska SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Returnerar om denna SRS har nollmeridian. Detta gäller för alla geografiska, projicerade och geocentriska SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifierare för detta identifierbara objekt. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Returnerar om denna SRS är sammansatt (en förening av två SRS). Följande kombinationer av SRS i sammansatt SRS anses giltiga: Geografisk SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaGeographic . Projicerad SRS + Vertikal SRS, i detta fall kommer typen av sammansatt SRS att varaProjected . Om kombinationen av SRS skiljer sig, kommer typen av sammansatt SRS att varaUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Returnerar om denna SRS är singel (inte en förening av två SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Samma som[`Validate`](./validate/) , men returnera inte felmeddelande. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Namn på detta objekt. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Returnerar nollmeridianen för denna SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Får typ av denna SRS, se[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) rumsligt referenssystem. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) rumsligt referenssystem. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) rumsligt referenssystem. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) rumsligt referenssystem. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) rumsligt referenssystem. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / British National Grid (EPSG:27700) rumsligt referenssystem. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Web Mercator (EPSG:3857) rumsligt referenssystem. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) rumsligt referenssystem. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) rumsligt referenssystem. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Skapa ett rumsligt referenssystem baserat på den angivna EPSG-koden. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Skapar en ny`SpatialReferenceSystem` baserad på WKT (välkänd text) sträng. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Returnerar representation av denna SRS som WKT-sträng. Resultat-WKT-strängen matchar OGC 01-009-specifikationen, vanligtvis kallad "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Hämta[`Axis`](../axis/) som beskriver dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Hämta[`Unit`](../unit/)av dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Detekterar om denna SRS är likvärdig med annan SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Returnerar en sträng som representerar det aktuella objektet. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Bestäm om denna SRS är giltig. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Skapa sammansatt SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Skapa geocentrisk SRS från anpassade parametrar. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Skapa geografisk SRS från anpassade parametrar. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Skapa lokal SRS. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Skapa projicerad SRS från anpassade parametrar. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Skapa vertikal SRS. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Bestämmer om två SRS är ekvivalenta. Samma koordinater för motsvarande SRS matchar samma plats på jorden. Vissa parametrar för ekvivalenta SRS kan vara olika, till exempel[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Skapa ett rumsligt referenssystem baserat på den angivna EPSG-koden. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Skapar en ny`SpatialReferenceSystem` baserad på WKT (välkänd text) sträng. |

### Se även

* class [IdentifiableObject](../identifiableobject/)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* hopsättning [Aspose.GIS](../../)


