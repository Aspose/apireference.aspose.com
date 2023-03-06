---
title: Feature.GetValue
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Ottiene il valore di un attributo.
type: docs
weight: 30
url: /it/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Ottiene il valore di un attributo.

```csharp
public T GetValue<T>(string attributeName)
```

| Parametro | Descrizione |
| --- | --- |
| T | Tipo desiderato per il valore. |
| attributeName | Nome dell'attributo. |

### Valore di ritorno

Valore dell'attributo.

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

Questo metodo converte automaticamente il valore nel tipo richiesto nel parametro di tipo generico.  Se il layer non richiede che le sue caratteristiche abbiano valori per tutti gli attributi definiti per il layer, questo metodo potrebbe fallire conInvalidOperationException quando viene richiesto un valore mancante. Quando si lavora con tali livelli, prendere in considerazione l'utilizzo[`GetValueOrDefault`](../getvalueordefault/) .

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Ottiene il valore di un attributo.

```csharp
public object GetValue(string attributeName)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| attributeName | String | Nome dell'attributo. |

### Valore di ritorno

Valore dell'attributo.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il nome dell'attributo è`null`. |
| ArgumentException | L'attributo con questo nome non esiste in questo livello. |
| InvalidOperationException | L'attributo non è bloccato. |
| InvalidOperationException | Il valore di questo attributo non è impostato per questa funzione. |

### Osservazioni

Se il layer non richiede che le sue caratteristiche abbiano valori per tutti gli attributi definiti per il layer, questo metodo potrebbe fallire conInvalidOperationException quando viene richiesto un valore mancante. Quando si lavora con tali livelli, prendere in considerazione l'utilizzo[`GetValueOrDefault`](../getvalueordefault/) .

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


