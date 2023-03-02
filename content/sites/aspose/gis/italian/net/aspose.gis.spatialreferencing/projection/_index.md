---
title: Class Projection
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.Projection classe. Rappresenta un metodo di proiezione con parametri che trasforma longitudine latitudine in x y.
type: docs
weight: 2240
url: /it/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Rappresenta un metodo di proiezione con parametri, che trasforma (longitudine, latitudine) in (x, y).

```csharp
public class Projection : IdentifiableObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Unità utilizzata per i parametri angolari. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Se questo identificatore di oggetti è un identificatore EPSG, restituisce il suo codice. Altrimenti - ritorna -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatore di questo oggetto identificabile. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Unità utilizzata per i parametri lineari. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nome di questo oggetto. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Ottiene una raccolta enumerabile di nomi di parametri dati a questa proiezione |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Ottiene il parametro con il nome specificato di questa proiezione. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Determina se due proiezioni sono equivalenti. Le proiezioni equivalenti mappano (longitudine, latitudine) su (x, y) nello allo stesso modo. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Ottiene il parametro con il nome specificato di questa proiezione. Se non ci sono tali parametri - ritorna`null` . |

### Guarda anche

* class [IdentifiableObject](../identifiableobject/)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


