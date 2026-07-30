---
title: "System::Threading::Interlocked::CompareExchange method"
linktitle: "CompareExchange"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Interlocked::CompareExchange method. يقارن ويبدل القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة معينة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| location1 | int32_t\& | مرجع المتغير للتغيير. |
| قيمة | int32_t | القيمة لتخزينها. |
| comparand | int32_t | القيمة التي يُقارن بها قيمة المتغير قبل التبادل. |
| نجح | bool\& | مرجع إلى المتغير الذي يُضبط على true إذا حدث التبادل وإلى false غير ذلك. |

### ReturnValue

قيمة المتغير عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المتغير. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغير للتغيير. |
| قيمة | T | القيمة لتخزينها. |
| comparand | T | القيمة التي يُقارن بها قيمة المتغير قبل التبادل. |

### ReturnValue

قيمة المتغير عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


قارن-التبادلات القيمة على المتغير: يتحقق مما إذا كان المتغير يساوي قيمة محددة ويخزن القيمة الجديدة فقط إذا كانت القيمة المخزنة تطابق المتوقعة. غير مُنفّذ.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المتغير. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| location1 | T\& | مرجع المتغير للتغيير. |
| قيمة | T | القيمة لتخزينها. |
| comparand | T | القيمة التي يُقارن بها قيمة المتغير قبل التبادل. |

### ReturnValue

قيمة المتغير عند بدء العملية بغض النظر عما إذا تم تغييره أم لا.

## انظر أيضًا

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
