---
title: Class CompoundSpatialReferenceSystem
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem classe. LSRS composto unisce due SRS sottostanti nessuno dei quali può essere composto.
type: docs
weight: 2060
url: /it/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

L'SRS composto unisce due SRS sottostanti, nessuno dei quali può essere composto.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Restituisci questo. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Restituisce questo SRS convertito in[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Usa[`Type`](../spatialreferencesystem/type/) per scoprire se la conversione è possibile. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Restituisce la rappresentazione geografica di questo SRS. Se questo SRS composto rappresenta davvero un SRS geografico, il risultato sarà un SRS geografico tridimensionale (con dimensioni di longitudine, latitudine, altezza). Altrimenti verrà generata un'eccezione. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Restituisce questo SRS convertito in[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Usa[`Type`](../spatialreferencesystem/type/) per scoprire se la conversione è possibile. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Restituisce la rappresentazione proiettata di questo SRS. Se questo SRS composto rappresenta effettivamente un SRS proiettato, il risultato sarà un SRS proiettato tridimensionale (con X, Y, dimensioni dell'altezza). Altrimenti verrà generata un'eccezione. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Restituisce questo SRS convertito in[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Usa[`Type`](../spatialreferencesystem/type/) per scoprire se la conversione è possibile. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Numero di dimensioni. Per SRS composto questa è la somma del numero di dimensioni di SRS sottostante. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Se questo identificatore di oggetti è un identificatore EPSG, restituisce il suo codice. Altrimenti - ritorna -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Restituisce il dato geografico di questo SRS. Se entrambi[`Head`](./head/) E[`Tail`](./tail/) avere datum geografico - restituire il datum geografico della testa. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Gli SRS composti hanno dati geografici se uno qualsiasi degli SRS sottostanti ha dati geografici. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | L'SRS composto ha il meridiano primo se uno qualsiasi degli SRS sottostanti ha il meridiano primo. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | Primo SRS sottostante. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatore di questo oggetto identificabile. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Ritorna`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Restituisce se questo SRS è singolo (non un'unione di due SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Uguale a[`Validate`](../spatialreferencesystem/validate/) , ma non restituire il messaggio di errore. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nome di questo oggetto. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Restituisce il primo meridiano di questo SRS. Se entrambi[`Head`](./head/) E[`Tail`](./tail/) avere il primo meridiano - restituire il primo meridiano della testa. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Secondo SRS sottostante. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Tipo di questo composto SRS. Può essereGeographicif questo SRS composto è una combinazione di SRS geografico e verticale, oppureProjected if questo SRS composto è una combinazione di SRS proiettato e verticale. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Restituisce la rappresentazione di questo SRS come stringa WKT. La stringa WKT risultante corrisponderà alla specifica OGC 01-009, generalmente denominata "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Ottieni[`Axis`](../axis/) che descrive la dimensione. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Ottieni[`Unit`](../unit/)di dimensione. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Rileva se questo SRS è equivalente ad altri SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crea la trasformazione da questo`Sistema di riferimento spaziale` ad un altro`Sistema di riferimento spaziale` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Determina se questo SRS è valido. Vedere[`Validate`](../spatialreferencesystem/validate/) per la descrizione della validità. |

### Guarda anche

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


