---
title: NumericFormat.General
second_title: Riferimento API Aspose.GIS per .NET
description: NumericFormat metodo. Converte un numero nella notazione scientifica oa virgola fissa più compatta a seconda del tipo di numero e della presenza di un identificatore di precisione. Consigliato da usare.
type: docs
weight: 30
url: /it/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

Converte un numero nella notazione scientifica oa virgola fissa più compatta, a seconda del tipo di numero e della presenza di un identificatore di precisione. Consigliato da usare.

```csharp
public static NumericFormat General(int precision = 0)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| precision | Int32 | La precisione definisce il numero massimo di cifre significative che possono comparire nella stringa del risultato. Se la precisione è zero, viene utilizzato il valore "15". La massima precisione disponibile è "17". |

### Valore di ritorno

L'identificatore di formato generale.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di cifre significative è minore di 0 o maggiore di 17. |

### Osservazioni

Il codice interno sta generando stringhe numeriche per WKT tramite: coordinate.ToString("G", CultureInfo.InvariantCulture).

### Guarda anche

* class [NumericFormat](../)
* spazio dei nomi [Aspose.Gis](../../numericformat/)
* assemblea [Aspose.GIS](../../../)


