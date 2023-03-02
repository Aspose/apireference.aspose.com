---
title: Feature.GetValuesDump
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Restituisce i valori per tutti gli attributi in un array. Si consideri lutilizzoGetValues metodo per evitare lallocazione di memoria aggiuntiva.
type: docs
weight: 60
url: /it/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Restituisce i valori per tutti gli attributi in un array. Si consideri l'utilizzo[`GetValues`](../getvalues/) metodo per evitare l'allocazione di memoria aggiuntiva.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| defaultValue | Object | Il valore da restituire se il valore dell'attributo è mancante (non impostato). Il valore predefinito è`null`. Valuta di utilizzare 'DBNull.Value' per separare 'unset' e '`null` valori. |

### Valore di ritorno

Un nuovo array in cui copiare i valori degli attributi.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |
| InvalidOperationException | L'attributo non è bloccato. |

### Osservazioni

Gli attributi dei valori della funzione vengono copiati nell'array dei valori passato come parametro. Per gli attributi con valore non impostato, viene restituito il parametro 'unsetValue' specificato.

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


