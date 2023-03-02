---
title: Feature.GetValuesList
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Ottiene i valori di una sequenza di attributi come elenco.
type: docs
weight: 70
url: /it/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Ottiene i valori di una sequenza di attributi come elenco.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parametro | Descrizione |
| --- | --- |
| T | Tipo desiderato per i valori. |
| attributeName | Nome dell'attributo. |
| separator | Una stringa utilizzata per separare il nome dell'attributo e il valore dell'indice della sequenza. |

### Valore di ritorno

Elenco dei valori degli attributi i cui nomi differiscono per il valore dell'indice di sequenza.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il nome dell'attributo è`null`. |
| ArgumentException | L'attributo con questo nome non esiste in questo livello. |
| InvalidOperationException | L'attributo non è bloccato. |
| InvalidOperationException | Il valore di questo attributo non è impostato per questa funzione. |
| InvalidCastException | Il tipo richiesto non viene implementatoIConvertible. |
| InvalidCastException | Il valore dell'attributo è`null`, ma il tipo richiesto è un tipo di valore. |
| FormatException | Conversione non riuscita perché il valore è in un formato errato. |
| OverflowException | Conversione non riuscita a causa di overflow. |

### Osservazioni

Questo usa[`GetValue`](../getvalue/) per ottenere un valore singolo. Quindi, questo metodo converte automaticamente il valore nel tipo richiesto nel parametro di tipo generico.  Se l'attributo con indice 0 non verrà trovato, verrà generatoArgumentException .

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


