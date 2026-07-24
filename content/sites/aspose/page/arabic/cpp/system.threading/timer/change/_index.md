---
title: "طريقة System::Threading::Timer::Change"
linktitle: "تغيير"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Timer::Change. تُعيد جدولة المؤقت أو تُلغيه في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


يعيد جدولة المؤقت أو يلغي تشغيله.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) قبل الاستدعاء التالي لدالة رد النداء، بالميليثانية؛ القيم السالبة تُلغي المؤقت حتى لو كان مُجدولاً. |
| period | int64_t | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء، بالميليثانية؛ القيم غير الموجبة تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


يعيد جدولة المؤقت أو يلغي تشغيله.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) قبل الاستدعاء التالي لدالة رد النداء؛ القيم السالبة تُلغي المؤقت حتى لو كان مُجدولاً. |
| period | System::TimeSpan | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء؛ القيم غير الموجبة تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
