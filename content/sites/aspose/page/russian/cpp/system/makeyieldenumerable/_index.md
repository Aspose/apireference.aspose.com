---
title: "Метод System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page для C++"
description: "Метод System::MakeYieldEnumerable. Создаёт IEnumerable из функции‑генератора в C++."
type: docs
weight: 25300
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
| fnc | const Details::YieldFunction\<T\>\& | Функция yield для выполнения |

### ReturnValue

Умный указатель на IEnumerable

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
