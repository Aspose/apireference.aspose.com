---
title: Feature.SetValue
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Imposta un nuovo valore di un attributo.
type: docs
weight: 100
url: /it/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Imposta un nuovo valore di un attributo.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di valore. |
| attributeName | Il nome dell'attributo. |
| value | Il valore dell'attributo. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il nome dell'attributo è`null`. |
| ArgumentException | L'attributo con questo nome non esiste in questo livello. |
| InvalidOperationException | L'attributo non è bloccato. |
| InvalidCastException | Il tipo del valore non viene implementatoIConvertible. |
| FormatException | Conversione non riuscita perché il valore è in un formato errato. |
| OverflowException | Conversione non riuscita a causa di overflow. |

### Osservazioni

Questo metodo converte automaticamente il valore nel tipo dell'attributo.

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


