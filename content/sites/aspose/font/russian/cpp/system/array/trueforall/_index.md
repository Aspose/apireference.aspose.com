---
title: "System::Array::TrueForAll метод"
linktitle: "TrueForAll"
second_title: "Aspose.Font для C++"
description: "System::Array::TrueForAll метод. Определяет, удовлетворяют ли все элементы в указанном массиве условиям, определённым заданным предикатом в C++."
type: docs
weight: 5900
url: /ru/cpp/system/array/trueforall/
---
## Array::TrueForAll method


Определяет, удовлетворяют ли все элементы в указанном массиве условиям, определённым указанным предикатом.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Элементы [Array](../), которые необходимо сравнить с условиями |
| соответствие | System::Predicate\<T\> | Предикат, определяющий условия сопоставления элементов массива |

### ReturnValue

true, если все элементы массива arr удовлетворяют условиям, определённым предикатом match, иначе false

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
