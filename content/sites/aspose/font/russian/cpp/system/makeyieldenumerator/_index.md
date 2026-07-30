---
title: "Метод System::MakeYieldEnumerator"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font для C++"
description: "Метод System::MakeYieldEnumerator. Создаёт IEnumerator из функции yield в C++."
type: docs
weight: 25500
url: /ru/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Создает IEnumerator из функции yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов в последовательности |

| Параметр | Тип | Описание |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Функция‑генератор для выполнения |

### ReturnValue

Разделяемый указатель на IEnumerator

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
