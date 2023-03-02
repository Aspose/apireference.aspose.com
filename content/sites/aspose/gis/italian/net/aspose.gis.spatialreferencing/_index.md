---
title: Aspose.Gis.SpatialReferencing
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing namespace fornisce classi per lavorare con riferimenti spaziali sistemi di riferimento di coordinate.
type: docs
weight: 370
url: /it/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace fornisce classi per lavorare con riferimenti spaziali (sistemi di riferimento di coordinate).

## Classi

| Classe | Descrizione |
| --- | --- |
| [Axis](./axis/) | Un asse descrive una dimensione di SRS. |
| [BursaWolfParameters](./bursawolfparameters/) | Classe che contiene i parametri della formula Bursa-Wolf da trasformare in un altro dato. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | L'SRS composto unisce due SRS sottostanti, nessuno dei quali può essere composto. |
| [Ellipsoid](./ellipsoid/) | L'ellissoide rappresenta un ellissoide, che si avvicina alla terra. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | L'SRS geocentrico è un SRS cartesiano tridimensionale con origine al centro della terra. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | Parametri per creare SRS geocentrico. I parametri hanno impostazioni predefinite ragionevoli, quindi dovrai assegnarne solo alcuni. Se assegni`null` a qualsiasi parametro, verrà utilizzato un valore predefinito. |
| [GeographicDatum](./geographicdatum/) | Il dato geografico mette in relazione la longitudine e la latitudine con un particolare luogo sulla terra. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | Un SRS geografico è un SRS basato su longitudine e latitudine. Un SRS geografico può essere bidimensionale o tridimensionale. Se l'SRS geografico è tridimensionale, in realtà è un SRS composto di SRS bidimensionale e SRS verticale. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | Parametri per creare SRS geografici. I parametri hanno valori predefiniti ragionevoli, quindi dovrai assegnarne solo alcuni. Se assegni`null` a qualsiasi parametro, verrà utilizzato un valore predefinito. |
| [IdentifiableObject](./identifiableobject/) | Rappresenta un oggetto che potrebbe avere codice e nome EPSG. |
| [Identifier](./identifier/) | Rappresenta un identificatore - un riferimento alla descrizione esterna di un oggetto. Se crei un SRS da WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier/) corrisponde alla parola chiave "AUTHORITY". |
| [LocalDatum](./localdatum/) | Indica il metodo utilizzato per le misurazioni nel sistema di riferimento spaziale locale. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | Coordinate locali relative all'SRS di un oggetto, non della terra. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian rappresenta un meridiano in cui la longitudine è definita come 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | L'SRS proiettato è il risultato dell'applicazione di una proiezione all'SRS geografico. Un SRS proiettato può essere bidimensionale o tridimensionale. Se l'SRS proiettato è tridimensionale, allora è in realtà un SRS composto di SRS proiettato bidimensionale e verticale monodimensionale SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | Parametri per creare SRS proiettato. Alcuni parametri hanno impostazioni predefinite. Alcuni parametri hanno impostazioni predefinite ragionevoli, quindi non devi assegnarli solo. Se assegni`null` a questi parametri verrà utilizzato un valore predefinito. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) E[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) non hai valori predefiniti - devi assegnarne alcuni non`null` valore a questa proprietà. |
| [Projection](./projection/) | Rappresenta un metodo di proiezione con parametri, che trasforma (longitudine, latitudine) in (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem/) | Il sistema di riferimento spaziale mappa le coordinate dei luoghi sulla Terra. Esistono diversi tipi di SRS, vedere[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . Inoltre, se il tipo di SRS èGeographic o Projected SRS può essere composto o singolo, vedi[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | La trasformazione del sistema di riferimento spaziale trasforma le geometrie dal sistema di riferimento spaziale di origine al sistema di riferimento spaziale di destinazione. |
| [TransformationException](./transformationexception/) | L'eccezione di trasformazione viene generata quando si verifica un errore durante la trasformazione delle coordinate o durante la creazione della trasformazione. |
| [Unit](./unit/) | Rappresenta l'unità di misura. |
| [VerticalDatum](./verticaldatum/) | Indica il metodo utilizzato per le misurazioni verticali. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | L'SRS verticale è un SRS unidimensionale che descrive le coordinate di altezza. |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [AxisDirection](./axisdirection/) | La direzione dell'asse definisce la direzione in cui punta l'asse. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | Rappresenta l'ordine degli assi in SRS geocentrico. |
| [GeographicAxisesOrder](./geographicaxisesorder/) | Rappresenta l'ordine degli assi in SRS geografico. |
| [ParameterType](./parametertype/) | Determina il tipo di parametro in[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | Rappresenta l'ordine degli assi in SRS geografico. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | Rappresenta il tipo di sistema di riferimento spaziale. |


