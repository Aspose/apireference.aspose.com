---
title: "طريقة System::Threading::Interlocked::CompareExchange"
linktitle: "CompareExchange"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Interlocked::CompareExchange. تقوم بمقارنة وتبادل القيمة على المتغيّر: تتحقق مما إذا كان المتغيّر يساوي قيمة محددة وتخزن القيمة الجديدة فقط إذا تطابقت القيمة المخزنة مع المتوقعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| location1 | int32_t\& | مرجع المتغيّر للتغيير. |
| value | int32_t | القيمة المراد تخزينها. |
| comparand | int32_t | القيمة التي يُقارن بها قيمة المتغيّر قبل التبادل. |
| نجح | bool\& | مرجع إلى المتغيّر الذي يُضبط إلى true إذا حدث التبادل وإلى false غير ذلك. |

### ReturnValue

قيمة المتغيّر عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المتغيّر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغيّر للتغيير. |
| value | T | القيمة المراد تخزينها. |
| comparand | T | القيمة التي يُقارن بها قيمة المتغيّر قبل التبادل. |

### ReturnValue

قيمة المتغيّر عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


يقارن ويستبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. غير مُنفَّذ.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المتغيّر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغيّر للتغيير. |
| value | T | القيمة المراد تخزينها. |
| comparand | T | القيمة التي يُقارن بها قيمة المتغيّر قبل التبادل. |

### ReturnValue

قيمة المتغيّر عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
