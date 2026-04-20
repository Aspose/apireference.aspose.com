---
title: "System::Threading::Timer::Timer منشئ"
linktitle: "Timer"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Threading::Timer::Timer. المنشئ في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


المُنشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | دالة يتم استدعاؤها بواسطة المؤقت. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


المُنشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | دالة يتم استدعاؤها بواسطة المؤقت. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد النداء. |
| dueTime | int64_t | [مهلة](../../timeout/) قبل الاستدعاء الأول لدالة رد النداء، بالمللي ثانية؛ القيم السلبية لا تُجدول المؤقت بعد الإنشاء بحيث يمكن إعادة جدولته لاحقًا. |
| period | int64_t | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء، بالمللي ثانية؛ القيم غير الإيجابية تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


المُنشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | دالة يتم استدعاؤها بواسطة المؤقت. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد النداء. |
| dueTime | System::TimeSpan | [مهلة](../../timeout/) قبل الاستدعاء الأول لدالة رد النداء؛ القيم السلبية لا تُجدول المؤقت بعد الإنشاء بحيث يمكن إعادة جدولته لاحقًا. |
| period | System::TimeSpan | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء؛ القيم غير الإيجابية تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
