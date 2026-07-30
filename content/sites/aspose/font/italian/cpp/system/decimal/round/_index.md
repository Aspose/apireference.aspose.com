---
title: "Metodo System::Decimal::Round"
linktitle: "Round"
second_title: "Aspose.Font per C++"
description: "Metodo System::Decimal::Round. Arrotonda il valore specificato al valore più vicino con il numero specificato di cifre frazionarie. Un parametro specifica il comportamento della funzione se il valore specificato è equidistante dai due numeri più vicini in C++."
type: docs
weight: 4400
url: /it/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Arrotonda il valore specificato al valore più vicino con il numero specificato di cifre frazionarie. Un parametro specifica il comportamento della funzione se il valore specificato è equidistante dai due numeri più vicini.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | const Decimal\& | Il valore da arrotondare |
| cifre | int | Il numero di cifre frazionarie nel valore arrotondato |
| mode | MidpointRounding | Specifica come eseguire l'arrotondamento se **value** è equidistante dai due numeri più vicini. |

### ReturnValue

Il numero con il numero specificato di cifre più vicino a **value**

## Vedi anche

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Arrotonda il valore specificato al numero intero più vicino. Un parametro specifica il comportamento della funzione se il valore specificato è equidistante dai due numeri più vicini.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | const Decimal\& | Il valore da arrotondare |
| mode | MidpointRounding | Specifica come eseguire l'arrotondamento se **value** è equidistante dai due numeri più vicini. |

### ReturnValue

**d** rounded to the nearest integral value

## Vedi anche

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
