---
title: "منشئ System::Threading::Timer::Timer"
linktitle: "Timer"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Threading::Timer::Timer. منشئ في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


منشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | الدالة التي سيتم استدعاؤها بواسطة المؤقت. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


منشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | الدالة التي سيتم استدعاؤها بواسطة المؤقت. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد الاتصال. |
| dueTime | int64_t | [Timeout](../../timeout/) قبل الاستدعاء الأول لدالة رد النداء، بالميليثانية؛ القيم السالبة لا تُجدول المؤقت بعد الإنشاء بحيث يمكن إعادة جدولته لاحقاً. |
| period | int64_t | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء، بالميليثانية؛ القيم غير الموجبة تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


منشئ.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | TimerCallback | الدالة التي سيتم استدعاؤها بواسطة المؤقت. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد الاتصال. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) قبل الاستدعاء الأول لدالة رد النداء؛ القيم السالبة لا تُجدول المؤقت بعد الإنشاء بحيث يمكن إعادة جدولته لاحقاً. |
| period | System::TimeSpan | [Timeout](../../timeout/) بين الاستدعاءات المتتالية لدالة رد النداء؛ القيم غير الموجبة تعني أن المؤقت يجب أن يُنفّذ مرة واحدة فقط. |

## انظر أيضًا

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
