---
title: "System::Threading::Timer::Change طريقة"
linktitle: "تغيير"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Timer::Change طريقة. يعيد جدولة أو يلغي المؤقت في C++."
type: docs
weight: 200
url: /ar/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


يعيد جدولة المؤقت أو يلغيه.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) قبل الاستدعاء التالي لدالة رد النداء، بالمللي ثانية؛ القيم السلبية تلغي المؤقت حتى لو كان مجدولاً. |
| period | int64_t | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء، بالمللي ثانية؛ القيم غير الإيجابية تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


يعيد جدولة المؤقت أو يلغيه.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) قبل الاستدعاء التالي لدالة رد النداء؛ القيم السلبية تلغي المؤقت حتى لو كان مجدولاً. |
| period | System::TimeSpan | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء؛ القيم غير الإيجابية تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
