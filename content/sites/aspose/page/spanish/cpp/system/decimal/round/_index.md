---
title: "System::Decimal::Round método"
linktitle: "Redondear"
second_title: "Aspose.Page para C++"
description: "System::Decimal::Round método. Redondea el valor especificado al valor más cercano con el número especificado de dígitos fraccionarios. Un parámetro especifica el comportamiento de la función si el valor especificado está igualmente cerca de dos números más cercanos en C++."
type: docs
weight: 4400
url: /es/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Redondea el valor especificado al valor más cercano con el número especificado de dígitos fraccionarios. Un parámetro especifica el comportamiento de la función si el valor especificado está igualmente cerca de los dos números más próximos.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| d | const Decimal\& | El valor a redondear |
| dígitos | int | El número de dígitos fraccionarios en el valor redondeado |
| mode | MidpointRounding | Especifica cómo realizar el redondeo si **value** está igualmente cerca de dos números más cercanos. |

### ReturnValue

El número con la cantidad especificada de dígitos más cercano a **value**

## Ver también

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Redondea el valor especificado al número entero más cercano. Un parámetro especifica el comportamiento de la función si el valor especificado está igualmente cerca de los dos números más próximos.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| d | const Decimal\& | El valor a redondear |
| mode | MidpointRounding | Especifica cómo realizar el redondeo si **value** está igualmente cerca de dos números más cercanos. |

### ReturnValue

**d** rounded to the nearest integral value

## Ver también

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
