---
title: "System::MakeYieldEnumerable метод"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Font для C++"
description: "System::MakeYieldEnumerable метод. Создаёт IEnumerable из функции‑генератора в C++."
type: docs
weight: 25400
url: /ru/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Создаёт IEnumerable из функции‑генератора.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов в последовательности |

| Параметр | Тип | Описание |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Функция‑генератор для выполнения |

### ReturnValue

Умный указатель на IEnumerable

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
