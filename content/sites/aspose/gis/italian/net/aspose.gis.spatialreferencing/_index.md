---
title: Aspose.Gis.SpatialReferencing
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing namespace fornisce classi per lavorare con i riferimenti spaziali sistemi di riferimento di coordinate.
type: docs
weight: 330
url: /it/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace fornisce classi per lavorare con i riferimenti spaziali (sistemi di riferimento di coordinate).

## Classi

| Classe | Descrizione |
| --- | --- |
| [Axis](./axis) | Un asse descrive una dimensione di SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Classe che contiene i parametri della formula di Bursa-Wolf da trasformare in un altro dato. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | SRS composto unisce due SRS sottostanti, nessuno dei quali può essere composto. |
| [Ellipsoid](./ellipsoid) | L'ellissoide rappresenta un ellissoide, che approssima la terra. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | L'SRS geocentrico è un SRS cartesiano tridimensionale con origine al centro della terra. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Parametri per creare SRS geocentrici. I parametri hanno valori predefiniti ragionevoli, quindi dovrai assegnarne solo alcuni. Se assegni`null` per qualsiasi parametro verrà utilizzato un valore predefinito. |
| [GeographicDatum](./geographicdatum) | Il dato geografico mette in relazione longitudine e latitudine con un luogo particolare sulla terra. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Un SRS geografico è un SRS basato su longitudine e latitudine. Un SRS geografico può essere bidimensionale o tridimensionale. Se SRS geografico è tridimensionale, allora è in realtà un SRS composto di SRS bidimensionale e SRS verticale. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Parametri per creare SRS geografici. I parametri hanno valori predefiniti ragionevoli, quindi dovrai assegnarne solo alcuni. Se assegni`null` per qualsiasi parametro verrà utilizzato un valore predefinito. |
| [IdentifiableObject](./identifiableobject) | Rappresenta un oggetto che potrebbe avere un codice e un nome EPSG. |
| [Identifier](./identifier) | Rappresenta un identificatore - un riferimento alla descrizione esterna di un oggetto. Se crei un SRS da WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier) corrisponde alla parola chiave "AUTHORITY". |
| [LocalDatum](./localdatum) | Indica il metodo utilizzato per le misurazioni nel sistema di riferimento spaziale locale. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Coordinate relative a SRS locali per qualche oggetto, non per la terra. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian rappresenta un meridiano in cui la longitudine è definita come 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | L'SRS proiettato è il risultato dell'applicazione di una proiezione all'SRS geografico. Un SRS proiettato può essere bidimensionale o tridimensionale. Se l'SRS proiettato è tridimensionale, allora è in realtà un SRS composto di SRS proiettato bidimensionale e verticale unidimensionale SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Parametri per creare SRS proiettati. Alcuni parametri hanno valori predefiniti. Alcuni parametri hanno valori predefiniti ragionevoli, quindi non devi assegnarli solo. Se assegni`null` per questi parametri verrà utilizzato un valore predefinito. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) e[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) non hanno valori predefiniti - devi assegnarne alcuni non`null` valore a questa proprietà. |
| [Projection](./projection) | Rappresenta un metodo di proiezione con parametri, che trasforma (longitudine, latitudine) in (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | Il sistema di riferimento spaziale mappa le coordinate in luoghi sulla Terra. Esistono diversi tipi di SRS, vedere[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . Inoltre, se il tipo di SRS èGeographic o Projected SRS può essere composto o singolo, vedere[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | La trasformazione del sistema di riferimento spaziale trasforma le geometrie dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione. |
| [TransformationException](./transformationexception) | Viene generata un'eccezione di trasformazione quando si verifica un errore durante la trasformazione della coordinata o durante la creazione della trasformazione. |
| [Unit](./unit) | Rappresenta l'unità di misura. |
| [VerticalDatum](./verticaldatum) | Indica il metodo utilizzato per le misurazioni verticali. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | SRS verticale è un SRS unidimensionale che descrive le coordinate di altezza. |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [AxisDirection](./axisdirection) | La direzione dell'asse definisce la direzione a cui punta l'asse. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Rappresenta l'ordine degli assi in SRS geocentrico. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Rappresenta l'ordine degli assi nell'SRS geografico. |
| [ParameterType](./parametertype) | Determina il tipo di parametro in[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Rappresenta l'ordine degli assi nell'SRS geografico. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Rappresenta il tipo di sistema di riferimento spaziale. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
