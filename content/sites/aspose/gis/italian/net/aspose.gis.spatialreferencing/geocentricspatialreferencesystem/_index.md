---
title: GeocentricSpatialReferenceSystem
second_title: Riferimento API Aspose.GIS per .NET
description: LSRS geocentrico è un SRS cartesiano tridimensionale con origine al centro della terra.
type: docs
weight: 1990
url: /it/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

L'SRS geocentrico è un SRS cartesiano tridimensionale con origine al centro della terra.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Restituisce questo SRS convertito in[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Usa[`IsCompound`](../spatialreferencesystem/iscompound) per scoprire se la conversione è possibile. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric) { get; } | Restituisci questo. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Restituisce questo SRS convertito in[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Restituisce questo SRS convertito in[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Restituisce questo SRS convertito in[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Restituisce questo SRS convertito in[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder) { get; } | Ordine degli assi in questo SRS. Se questo SRS non è valido e ha direzioni degli assi errate,Invalid viene restituito. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount) { get; } | Restituisce 3, poiché SRS geocentrico è sempre tridimensionale. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Se questo identificatore di oggetti è identificatore EPSG, restituisci il suo codice. Altrimenti - restituisce -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum) { get; } | Restituisce il dato geografico di questo SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum) { get; } | Ritorno`true` , poiché gli SRS geocentrici hanno sempre un dato geografico. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian) { get; } | Ritorno`true` , poiché gli SRS geocentrici hanno sempre il primo meridiano. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identificatore di questo oggetto identificabile. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Restituisce se questo SRS è composto (unione di due SRS). Sono considerate valide le seguenti combinazioni di SRS in SRS composto: SRS geografico + SRS verticale, in questo caso il tipo di SRS composto saràGeographic . SRS proiettato + SRS verticale, in questo caso il tipo di SRS composto saràProjected . Se la combinazione di SRS è diversa, sarà il tipo di SRS compostoUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Restituisce se questo SRS è singolo (non un'unione di due SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Come[`Validate`](../spatialreferencesystem/validate) , ma non restituisce il messaggio di errore. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit) { get; } | Unità, utilizzata in questo SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nome di questo oggetto. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian) { get; } | Restituisce il primo meridiano di questo SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type) { get; } | RitornoGeocentric . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Restituisce la rappresentazione di questo SRS come stringa WKT. La stringa WKT risultante corrisponderà alla specifica OGC 01-009, solitamente denominata "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis)(int) | Ottieni[`Axis`](../axis) che descrive la dimensione. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit)(int) | Ottieni[`Unit`](../unit)di dimensione. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Rileva se questo SRS è equivalente ad altri SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate)(out string) | Determina se questo SRS è valido. Vedere[`Validate`](../spatialreferencesystem/validate) per la descrizione della validità. |

### Guarda anche

* class [SpatialReferenceSystem](../spatialreferencesystem)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
