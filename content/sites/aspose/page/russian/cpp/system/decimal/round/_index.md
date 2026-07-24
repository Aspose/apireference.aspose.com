---
title: "Метод System::Decimal::Round"
linktitle: "Округление"
second_title: "Aspose.Page для C++"
description: "Метод System::Decimal::Round. Округляет указанное значение до ближайшего значения с указанным числом знаков после запятой. Параметр задает поведение функции, если указанное значение находится на одинаковом расстоянии от двух ближайших чисел в C++."
type: docs
weight: 4400
url: /ru/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Округляет указанное значение до ближайшего значения с указанным числом знаков после запятой. Параметр определяет поведение функции, если указанное значение равно удалённости от двух ближайших чисел.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| d | const Decimal\& | Значение для округления |
| знаков | int | Количество знаков после запятой в округленном значении |
| mode | MidpointRounding | Указывает, как выполнять округление, если **value** находится на одинаковом расстоянии от двух ближайших чисел. |

### ReturnValue

Число с указанным количеством знаков, ближайшее к **value**

## См. также

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Округляет указанное значение до ближайшего целого числа. Параметр определяет поведение функции, если указанное значение равно удалённости от двух ближайших чисел.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| d | const Decimal\& | Значение для округления |
| mode | MidpointRounding | Указывает, как выполнять округление, если **value** находится на одинаковом расстоянии от двух ближайших чисел. |

### ReturnValue

**d** rounded to the nearest integral value

## См. также

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
