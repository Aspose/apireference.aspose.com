---
title: Class Unit
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.Unit classe. Rappresenta lunità di misura.
type: docs
weight: 2290
url: /it/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Rappresenta l'unità di misura.

```csharp
public class Unit : IdentifiableObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Ottieni l'unità che rappresenta i gradi. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Ottieni l'unità che rappresenta i metri. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Ottieni l'unità che rappresenta i radianti. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Se questo identificatore di oggetti è un identificatore EPSG, restituisce il suo codice. Altrimenti - ritorna -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Fattore in metro, se si tratta di unità di lunghezza, fattore in radianti, se si tratta di unità di angolo. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatore di questo oggetto identificabile. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nome di questo oggetto. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Converte argomento in unità, descritto da questa istanza. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Converte argomento da unità, descritto da questa istanza, in radianti o metri. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |

### Guarda anche

* class [IdentifiableObject](../identifiableobject/)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


