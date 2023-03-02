---
title: Projection.GetParameterValue
second_title: Riferimento API Aspose.GIS per .NET
description: Projection metodo. Ottiene il parametro con il nome specificato di questa proiezione.
type: docs
weight: 40
url: /it/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Ottiene il parametro con il nome specificato di questa proiezione.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Nome del parametro. |
| type | ParameterType | Tipo di parametro. Definisce il fattore unitario che verrà disapplicato: se il tipo èLinear Poi[`LinearParametersUnit`](../linearparametersunit/) verrà deapplicato e il risultato sarà in metri. se il tipo èAngular Poi[`AngularParametersUnit`](../angularparametersunit/) verrà deapplicato e il risultato sarà in radianti. se il tipo èOtheril valore del parametro verrà restituito 'così com'è'. |

### Valore di ritorno

Parametro con nome specificato.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è nullo. |
| InvalidOperationException | Non esiste alcun parametro con questo nome. |

### Guarda anche

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../projection/)
* assemblea [Aspose.GIS](../../../)


