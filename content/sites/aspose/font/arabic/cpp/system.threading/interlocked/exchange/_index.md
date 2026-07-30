---
title: "System::Threading::Interlocked::Exchange طريقة"
linktitle: "Exchange"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Interlocked::Exchange طريقة. يتبادل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


يبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المتغير. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغير للتغيير. |
| قيمة | T | القيمة لتخزينها. |

### ReturnValue

قيمة المتغير مباشرةً قبل تغييره.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::Exchange(T\&, T) method


يبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. غير مُنفّذ.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المتغير. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغير للتغيير. |
| قيمة | T | القيمة لتخزينها. |

### ReturnValue

قيمة المتغير مباشرةً قبل تغييره.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
