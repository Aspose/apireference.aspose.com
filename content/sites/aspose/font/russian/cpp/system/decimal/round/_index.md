---
title: "Метод System::Decimal::Round"
linktitle: "Round"
second_title: "Aspose.Font для C++"
description: "Метод System::Decimal::Round. Округляет указанное значение до ближайшего значения с заданным количеством знаков после запятой. Параметр указывает поведение функции, если указанное значение равно удалённо от двух ближайших чисел в C++."
type: docs
weight: 4400
url: /ru/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Округляет указанное значение до ближайшего значения с указанным числом знаков после запятой. Параметр определяет поведение функции, если указанное значение находится на одинаковом расстоянии от двух ближайших чисел.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| d | const Decimal\& | Значение для округления |
| цифры | int | Количество знаков после запятой в округлённом значении |
| режим | MidpointRounding | Указывает, как выполнять округление, если **value** равно удалённо от двух ближайших чисел. |

### ReturnValue

Число с указанным количеством разрядов, ближайшее к **value**

## См. также

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Округляет указанное значение до ближайшего целого числа. Параметр определяет поведение функции, если указанное значение находится на одинаковом расстоянии от двух ближайших чисел.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| d | const Decimal\& | Значение для округления |
| режим | MidpointRounding | Указывает, как выполнять округление, если **value** равно удалённо от двух ближайших чисел. |

### ReturnValue

**d** rounded to the nearest integral value

## См. также

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
