---
title: "طريقة System::Threading::Interlocked::Exchange"
linktitle: "تبادل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Interlocked::Exchange. تقوم بتبادل القيمة على المتغيّر: تخزن القيمة الجديدة وتعيد القيمة التي كان المتغيّر يحملها مباشرةً قبل التخزين في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


يستبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المتغيّر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغيّر للتغيير. |
| value | T | القيمة المراد تخزينها. |

### ReturnValue

قيمة المتغيّر مباشرةً قبل أن يتم تغييره.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


يستبدل القيمة على المتغير: يخزن القيمة الجديدة ويعيد القيمة التي كان المتغير يحملها مباشرةً قبل التخزين. غير مُنفَّذ.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المتغيّر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغيّر للتغيير. |
| value | T | القيمة المراد تخزينها. |

### ReturnValue

قيمة المتغيّر مباشرةً قبل أن يتم تغييره.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
