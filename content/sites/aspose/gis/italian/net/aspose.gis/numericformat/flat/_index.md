---
title: NumericFormat.Flat
second_title: Riferimento API Aspose.GIS per .NET
description: NumericFormat metodo. Converte un numero in un testo a virgola fissa senza notazione scientifica.
type: docs
weight: 20
url: /it/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Converte un numero in un testo a virgola fissa senza notazione scientifica.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| significantDigits | Int32 | Numero di cifre significative. La massima precisione disponibile è "308" |

### Valore di ritorno

L'identificatore di precisione dell'arrotondamento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di cifre significative è minore di 0 o maggiore di 308. |

### Osservazioni

Il codice interno sta generando stringhe numeriche per WKT tramite: coordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Guarda anche

* class [NumericFormat](../)
* spazio dei nomi [Aspose.Gis](../../numericformat/)
* assemblea [Aspose.GIS](../../../)


