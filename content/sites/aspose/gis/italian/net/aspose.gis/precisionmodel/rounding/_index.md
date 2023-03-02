---
title: PrecisionModel.Rounding
second_title: Riferimento API Aspose.GIS per .NET
description: PrecisionModel metodo. Restituisce un modello di precisione di arrotondamento. Secondo il modello di precisione di arrotondamento solo un numero limitato di cifre è significativo.
type: docs
weight: 20
url: /it/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Restituisce un modello di precisione di arrotondamento. Secondo il modello di precisione di arrotondamento solo un numero limitato di cifre è significativo.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| significantDigits | Int32 | Numero di cifre significative. |

### Valore di ritorno

Modello di precisione di arrotondamento.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | Il numero di cifre significative è minore di 0 o maggiore di 15. |

### Osservazioni

Quando applicato a una coordinata, il seguente codice viene utilizzato per ridurre la precisione:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Guarda anche

* class [PrecisionModel](../)
* spazio dei nomi [Aspose.Gis](../../precisionmodel/)
* assemblea [Aspose.GIS](../../../)


