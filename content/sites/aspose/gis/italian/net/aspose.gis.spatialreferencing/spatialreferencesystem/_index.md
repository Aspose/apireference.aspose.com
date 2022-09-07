---
title: SpatialReferenceSystem
second_title: Riferimento API Aspose.GIS per .NET
description: Il sistema di riferimento spaziale mappa le coordinate in luoghi sulla Terra. Esistono diversi tipi di SRS vedereType./spatialreferencesystem/type . Inoltre se il tipo di SRS èGeographic o Projected SRS può essere composto o singolo vedereIsCompound./spatialreferencesystem/iscompound .
type: docs
weight: 2150
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Il sistema di riferimento spaziale mappa le coordinate in luoghi sulla Terra. Esistono diversi tipi di SRS, vedere[`Type`](./type) . Inoltre, se il tipo di SRS èGeographic o Projected SRS può essere composto o singolo, vedere[`IsCompound`](./iscompound) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Restituisce questo SRS convertito in[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Usa[`IsCompound`](./iscompound) per scoprire se la conversione è possibile. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Restituisce questo SRS convertito in[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Usa[`Type`](./type) per scoprire se la conversione è possibile. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Restituisce questo SRS convertito in[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Usa[`Type`](./type) per scoprire se la conversione è possibile. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Restituisce questo SRS convertito in[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Usa[`Type`](./type) per scoprire se la conversione è possibile. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Restituisce questo SRS convertito in[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Usa[`Type`](./type) per scoprire se la conversione è possibile. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Restituisce questo SRS convertito in[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Usa[`Type`](./type) per scoprire se la conversione è possibile. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | Restituisce il numero di dimensioni in questo SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Se questo identificatore di oggetti è identificatore EPSG, restituisci il suo codice. Altrimenti - restituisce -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Restituisce il dato geografico di questo SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | Determina se questo SRS ha un dato geografico. Questo vale per ogni SRS geografico, proiettato e geocentrico. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | Restituisce se questo SRS ha il meridiano primo. Questo vale per ogni SRS geografico, proiettato e geocentrico. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identificatore di questo oggetto identificabile. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Restituisce se questo SRS è composto (unione di due SRS). Sono considerate valide le seguenti combinazioni di SRS in SRS composto: SRS geografico + SRS verticale, in questo caso il tipo di SRS composto saràGeographic . SRS proiettato + SRS verticale, in questo caso il tipo di SRS composto saràProjected . Se la combinazione di SRS è diversa, sarà il tipo di SRS compostoUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Restituisce se questo SRS è singolo (non un'unione di due SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Come[`Validate`](./validate) , ma non restituisce il messaggio di errore. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nome di questo oggetto. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Restituisce il primo meridiano di questo SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | Ottiene il tipo di questo SRS, vedere[`SpatialReferenceSystemType`](../spatialreferencesystemtype) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | Sistema di riferimento spaziale ETRS 89 (EPSG:4258). |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | Sistema di riferimento spaziale ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035). |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | Sistema di riferimento spaziale ETRS 89 / Lambert Conformal Conic (EPSG:3034). |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | Sistema di riferimento spaziale NAD 83 (EPSG:4269). |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | Sistema di riferimento spaziale OSGB 36 (EPSG:4277). |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | Sistema di riferimento spaziale OSGB 36 / British National Grid (EPSG:27700). |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Sistema di riferimento spaziale Web Mercator (EPSG:3857). |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | Sistema di riferimento spaziale WGS 72 (EPSG:4322). |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | Sistema di riferimento spaziale WGS 84 (EPSG:4326). |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | Crea un sistema di riferimento spaziale basato sul codice EPSG specificato. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | Crea un nuovo`Sistema di riferimento spaziale` basato sulla stringa WKT (Well-Known Text). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Restituisce la rappresentazione di questo SRS come stringa WKT. La stringa WKT risultante corrisponderà alla specifica OGC 01-009, solitamente denominata "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Ottieni[`Axis`](../axis) che descrive la dimensione. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Ottieni[`Unit`](../unit)di dimensione. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Rileva se questo SRS è equivalente ad altri SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Determina se questo SRS è valido. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Crea SRS composto. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | Crea SRS geocentrico da parametri personalizzati. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | Crea SRS geografico da parametri personalizzati. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Crea SRS locale. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | Crea SRS proiettato da parametri personalizzati. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | Crea SRS verticale. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | Determina se due SRS sono equivalenti. Le stesse coordinate di un SRS equivalente corrispondono allo stesso punto sulla Terra. Alcuni parametri di un SRS equivalente possono essere diversi, ad esempio[`Name`](../identifiableobject/name) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | Crea un sistema di riferimento spaziale basato sul codice EPSG specificato. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | Crea un nuovo`Sistema di riferimento spaziale` basato sulla stringa WKT (Well-Known Text). |

### Guarda anche

* class [IdentifiableObject](../identifiableobject)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
