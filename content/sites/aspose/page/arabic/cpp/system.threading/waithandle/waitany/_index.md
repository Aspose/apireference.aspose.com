---
title: "طريقة System::Threading::WaitHandle::WaitAny"
linktitle: "WaitAny"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::WaitHandle::WaitAny. ينتظر أيًا من المقابض أن يُطلق في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


ينتظر حتى يُطلق أي من المقابض.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |

### ReturnValue

صحيح عندما يتلقى كل عنصر في waitHandles إشارة؛ وإلا فإن الطريقة لا تعود أبدًا.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


ينتظر حتى يُطلق أي من المقابض.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالميليثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |

### ReturnValue

صحيح إذا تم إطلاق أي مقبض، خطأ إذا تجاوز المهلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


ينتظر حتى يُطلق أي من المقابض.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |
| timeout | TimeSpan | ـ [System::TimeSpan](../../../system/timespan/) الذي يمثل عدد الميليثانية للانتظار، أو [System::TimeSpan](../../../system/timespan/) الذي يمثل -1 ميليثانية للانتظار إلى أجل غير مسمى. |

### ReturnValue

صحيح إذا تم إطلاق أي مقبض، خطأ إذا تجاوز المهلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
