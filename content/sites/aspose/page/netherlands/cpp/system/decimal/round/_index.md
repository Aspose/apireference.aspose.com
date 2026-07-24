---
title: "System::Decimal::Round methode"
linktitle: "Rond"
second_title: "Aspose.Page voor C++"
description: "System::Decimal::Round methode. Rondt de opgegeven waarde af naar de dichtstbijzijnde waarde met het opgegeven aantal fractionele cijfers. Een parameter specificeert het gedrag van de functie als de opgegeven waarde even dicht bij twee dichtstbijzijnde getallen ligt in C++."
type: docs
weight: 4400
url: /nl/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Rondt de opgegeven waarde af naar de dichtstbijzijnde waarde met het opgegeven aantal fractionele cijfers. Een parameter bepaalt het gedrag van de functie als de opgegeven waarde even dicht bij twee dichtstbijzijnde getallen ligt.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | const Decimal\& | De waarde om af te ronden |
| cijfers | int | Het aantal fractionele cijfers in de afgeronde waarde |
| mode | MidpointRounding | Specificeert hoe het afronden moet worden uitgevoerd als **value** even dicht bij twee dichtstbijzijnde getallen ligt. |

### ReturnValue

Het getal met het opgegeven aantal cijfers dat het dichtst bij **value** ligt

## Zie ook

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Rondt de opgegeven waarde af op het dichtstbijzijnde gehele getal. Een parameter bepaalt het gedrag van de functie als de opgegeven waarde even dicht bij twee dichtstbijzijnde getallen ligt.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | const Decimal\& | De waarde om af te ronden |
| mode | MidpointRounding | Specificeert hoe het afronden moet worden uitgevoerd als **value** even dicht bij twee dichtstbijzijnde getallen ligt. |

### ReturnValue

**d** rounded to the nearest integral value

## Zie ook

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
