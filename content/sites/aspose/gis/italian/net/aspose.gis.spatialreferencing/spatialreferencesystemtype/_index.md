---
title: Enum SpatialReferenceSystemType
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType enum. Rappresenta il tipo di sistema di riferimento spaziale.
type: docs
weight: 2270
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Rappresenta il tipo di sistema di riferimento spaziale.

```csharp
public enum SpatialReferenceSystemType
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Unknown | `0` | Valore predefinito. Può essere restituito da[`Type`](../spatialreferencesystem/type/) se si tratta di un SRS composto con una combinazione non valida di SRS sottostanti. Vedere[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | L'SRS geografico si basa sulla longitudine angolare e sulla latitudine angolare. L'SRS geografico può essere convertito in[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) via[`AsGeographic`](../spatialreferencesystem/asgeographic/) metodo. |
| Geocentric | `2` | L'SRS geocentrico è un SRS cartesiano tridimensionale con origine al centro della Terra. L'SRS geocentrico può essere convertito in[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) via[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) metodo. |
| Projected | `3` | L'SRS proiettato è basato su X lineare e Y lineare. È il risultato dell'applicazione di una proiezione su unGeographic SRS. SRS proiettato può essere convertito in[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) via[`AsProjected`](../spatialreferencesystem/asprojected/) metodo. |
| Vertical | `4` | L'SRS verticale descrive la coordinata di altezza lineare. L'SRS verticale può essere convertito in[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) via[`AsVertical`](../spatialreferencesystem/asvertical/) metodo. |
| Local | `5` | L'SRS locale mette in relazione le coordinate di alcuni oggetti, altri sono la Terra. L'SRS locale può essere convertito in[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) via[`AsLocal`](../spatialreferencesystem/aslocal/) metodo. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


