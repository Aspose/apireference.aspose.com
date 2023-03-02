---
title: Feature.SetValues
second_title: Riferimento API Aspose.GIS per .NET
description: Feature metodo. Imposta nuovi valori per tutti gli attributi. Considera anche di utilizzareCopyValues metodo per semplificare i valori di impostazione in una chiamata.
type: docs
weight: 120
url: /it/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Imposta nuovi valori per tutti gli attributi. Considera anche di utilizzare[`CopyValues`](../copyvalues/) metodo per semplificare i valori di impostazione in una chiamata.

```csharp
public int SetValues(object[] values)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| values | Object[] | La matrice di nuovi valori. |

### Valore di ritorno

Il numero di valori di attributo impostati.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento non può essere`null`. |
| ArgumentException | L'attributo con questo nome non esiste in questo livello. |
| InvalidOperationException | L'attributo non è bloccato. |
| InvalidCastException | Il tipo del valore non viene implementatoIConvertible. |
| FormatException | Conversione non riuscita perché il valore è in un formato errato. |
| OverflowException | Conversione non riuscita a causa di overflow. |

### Osservazioni

Questo metodo converte automaticamente il valore each nel tipo dell'attributo.  La lunghezza dell'array dei valori non deve necessariamente corrispondere al numero di attributi nella feature. Se la lunghezza dell'array è maggiore del numero di attributi, tutti i valori dell'array vengono copiati negli attributi; se è minore, solo il numero di valori della lunghezza dell'array viene copiato negli attributi, a partire dal valore dell'attributo con ordinale 0.

### Guarda anche

* class [Feature](../)
* spazio dei nomi [Aspose.Gis](../../feature/)
* assemblea [Aspose.GIS](../../../)


