---
title: Feature.CopyValues
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Copia i valori degli attributi da unaltra caratteristica.
type: docs
weight: 20
url: /it/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Copia i valori degli attributi da un'altra caratteristica.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputFeature | Feature | La funzione da cui copiare i valori. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| ArgumentException | L'attributo con questo nome non esiste in questo livello. |
| InvalidOperationException | L'attributo non è bloccato. |
| InvalidOperationException | Il valore di input è nullo e l'attributo in questa funzione non può essere nullo. |
| [GisException](../../gisexception/) | Un attributo ha lo stesso nome ma diversi tipi di dati nelle caratteristiche. |

### Osservazioni

Questo metodo copia solo gli attributi con nomi corrispondenti.

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


