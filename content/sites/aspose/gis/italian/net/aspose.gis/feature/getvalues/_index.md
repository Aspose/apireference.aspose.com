---
title: Feature.GetValues
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Restituisce i valori per tutti gli attributi in un array.
type: docs
weight: 50
url: /it/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Restituisce i valori per tutti gli attributi in un array.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| values | Object[] | Matrice in cui copiare i valori degli attributi. |
| defaultValue | Object | Il valore da restituire se il valore dell'attributo è mancante (non impostato). Il valore predefinito è`null`. Valuta di utilizzare 'DBNull.Value' per separare 'unset' e '`null` valori. |

### Valore di ritorno

Numerosi attributi copiati.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| InvalidOperationException | L'attributo non è bloccato. |

### Osservazioni

Gli attributi dei valori della funzione vengono copiati nell'array dei valori passato come parametro. Per gli attributi con valore non impostato, viene restituito il parametro 'unsetValue' specificato.  La lunghezza dell'array dei valori non deve necessariamente corrispondere al numero di attributi nell'elemento. Se la lunghezza dell'array è maggiore del numero di attributi, tutti i valori degli attributi vengono copiati nell'array; se è minore, solo il numero di lunghezza dell'array dei valori dell'attributo viene copiato nell'array, a partire dal valore dell'attributo con ordinale 0.

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


