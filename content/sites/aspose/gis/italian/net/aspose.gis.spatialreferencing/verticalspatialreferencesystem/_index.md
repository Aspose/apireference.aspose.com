---
title: VerticalSpatialReferenceSystem
second_title: Riferimento API Aspose.GIS per .NET
description: SRS verticale è un SRS unidimensionale che descrive le coordinate di altezza.
type: docs
weight: 2210
url: /it/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

SRS verticale è un SRS unidimensionale che descrive le coordinate di altezza.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Restituisce questo SRS convertito in[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Usa[`IsCompound`](../spatialreferencesystem/iscompound) per scoprire se la conversione è possibile. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Restituisce questo SRS convertito in[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Restituisce questo SRS convertito in[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Restituisce questo SRS convertito in[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Restituisce questo SRS convertito in[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Usa[`Type`](../spatialreferencesystem/type) per scoprire se la conversione è possibile. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical) { get; } | Restituisce questo SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount) { get; } | Restituisce 1, poiché SRS verticale è sempre unidimensionale. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Se questo identificatore di oggetti è identificatore EPSG, restituisci il suo codice. Altrimenti - restituisce -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum) { get; } | LanciInvalidOperationException , poiché Vertical SRS non ha datum geografico. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum) { get; } | Restituisce`false` , poiché Vertical SRS non ha datum geografico. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian) { get; } | Restituisce`false` , poiché Vertical SRS non ha il primo meridiano. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identificatore di questo oggetto identificabile. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Restituisce se questo SRS è composto (unione di due SRS). Sono considerate valide le seguenti combinazioni di SRS in SRS composto: SRS geografico + SRS verticale, in questo caso il tipo di SRS composto saràGeographic . SRS proiettato + SRS verticale, in questo caso il tipo di SRS composto saràProjected . Se la combinazione di SRS è diversa, sarà il tipo di SRS compostoUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Restituisce se questo SRS è singolo (non un'unione di due SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Come[`Validate`](../spatialreferencesystem/validate) , ma non restituisce il messaggio di errore. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nome di questo oggetto. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian) { get; } | LanciInvalidOperationException , poiché Vertical SRS non ha il primo meridiano. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type) { get; } | RitornoVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum) { get; } | Datum utilizzato in questo SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit) { get; } | Unità utilizzata in questo SRS. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Restituisce la rappresentazione di questo SRS come stringa WKT. La stringa WKT risultante corrisponderà alla specifica OGC 01-009, solitamente denominata "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis)(int) | Ottieni[`Axis`](../axis) che descrive la dimensione. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit)(int) | Ottieni[`Unit`](../unit)di dimensione. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Rileva se questo SRS è equivalente ad altri SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate)(out string) | Determina se questo SRS è valido. Vedere[`Validate`](../spatialreferencesystem/validate) per la descrizione della validità. |

### Guarda anche

* class [SpatialReferenceSystem](../spatialreferencesystem)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
