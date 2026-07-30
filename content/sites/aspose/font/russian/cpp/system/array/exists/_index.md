---
title: "Метод System::Array::Exists"
linktitle: "Exists"
second_title: "Aspose.Font для C++"
description: "Метод System::Array::Exists. Определяет, содержит ли указанный объект Array элемент, удовлетворяющий требованиям указанного предиката в C++."
type: docs
weight: 5000
url: /ru/cpp/system/array/exists/
---
## Array::Exists method


Определяет, содержит ли указанный объект [Array](../) элемент, удовлетворяющий требованиям указанного предиката.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Массив, в котором искать элемент |
| соответствие | std::function\\<bool(T)> | Функциональный объект, определяющий требования и проверяющий, удовлетворяет ли элемент этим требованиям |

### ReturnValue

Истина, если **arr** содержит элемент, удовлетворяющий требованиям, определённым **match**

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
