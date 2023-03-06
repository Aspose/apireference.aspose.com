---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters classe. Parametri per creare SRS proiettato. Alcuni parametri hanno impostazioni predefinite. Alcuni parametri hanno impostazioni predefinite ragionevoli quindi non devi assegnarli solo. Se assegninull a questi parametri verrà utilizzato un valore predefinito. ProjectionMethodName EBase non hai valori predefiniti  devi assegnarne alcuni nonnull valore a questa proprietà.
type: docs
weight: 2230
url: /it/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parametri per creare SRS proiettato. Alcuni parametri hanno impostazioni predefinite. Alcuni parametri hanno impostazioni predefinite ragionevoli, quindi non devi assegnarli solo. Se assegni`null` a questi parametri verrà utilizzato un valore predefinito. [`ProjectionMethodName`](./projectionmethodname/) E[`Base`](./base/) non hai valori predefiniti - devi assegnarne alcuni non`null` valore a questa proprietà.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Ordine degli assi. L'impostazione predefinita èXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | SRS geografico di base (SRS a cui viene applicata la proiezione). È NECESSARIO impostare questa proprietà su non`null` valore per creare SRS valido, questa proprietà non ha alcun valore predefinito. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Unità da utilizzare in questo SRS. L'impostazione predefinita è[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Nome dell'SRS proiettato. L'impostazione predefinita è "Senza nome". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Identificativo del metodo di proiezione. Non esiste un valore predefinito, è possibile impostare questo parametro su not`null` value, se vuoi allegare l'identificatore alla proiezione. Se lo fai, sta a te assicurarti che l'identificatore sia coerente con il nome del metodo di proiezione (il nome del metodo di proiezione non cambierà quando imposti questa proprietà). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Nome del metodo di proiezione. Non esiste un valore predefinito e DEVI impostare questo parametro su not`null` value, poiché SRS proiettato senza nome di proiezione è inutile. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Asse che descrive la dimensione X (orizzontale). Il valore predefinito è l'asse con direzione est. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Asse che descrive la quota Y (verticale). L'impostazione predefinita è l'asse con direzione nord. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Aggiunge il parametro di proiezione a questo SRS. Se il parametro con tale nome è già stato aggiunto, aggiornalo. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Ottiene il parametro di proiezione con il nome specificato. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


