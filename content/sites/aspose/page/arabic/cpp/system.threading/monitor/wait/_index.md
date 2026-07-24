---
title: "System::Threading::Monitor::Wait طريقة"
linktitle: "انتظار"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Monitor::Wait طريقة. يحرّر القفل على كائن ويُعرقل الخيط الحالي حتى يعيد الحصول على القفل غير مُنفّذة في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading/monitor/wait/
---
## Monitor::Wait(const SharedPtr\<Object\>\&) method


يفرج القفل عن كائن ويوقف الخيط الحالي حتى يستعيد القفل غير مُطبق.

```cpp
static bool System::Threading::Monitor::Wait(const SharedPtr<Object> &obj)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Monitor::Wait(const SharedPtr\<Object\>\&, int32_t) method


يفرج القفل عن كائن ويوقف الخيط الحالي حتى يستعيد القفل. إذا انقضى الفاصل الزمني المحدد للمهلة، ينتقل الخيط إلى طابور الجاهزية. غير مُطبق.

```cpp
static bool System::Threading::Monitor::Wait(const SharedPtr<Object> &obj, int32_t millisecondsTimeout)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Monitor::Wait(const SharedPtr\<Object\>\&, int32_t, bool) method


يفرج القفل عن كائن ويوقف الخيط الحالي حتى يستعيد القفل. إذا انقضى الفاصل الزمني المحدد للمهلة، ينتقل الخيط إلى طابور الجاهزية. يمكن اختياريًا الخروج من نطاق المزامنة للسياق المتزامن قبل الانتظار واستعادة النطاق بعد ذلك. غير مُطبق.

```cpp
static bool System::Threading::Monitor::Wait(const SharedPtr<Object> &obj, int32_t millisecondsTimeout, bool exitContext)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Monitor::Wait(const SharedPtr\<Object\>\&, TimeSpan) method


يفرج القفل عن كائن ويوقف الخيط الحالي حتى يستعيد القفل. إذا انقضى الفاصل الزمني المحدد للمهلة، ينتقل الخيط إلى طابور الجاهزية. غير مُطبق.

```cpp
static bool System::Threading::Monitor::Wait(const SharedPtr<Object> &obj, TimeSpan timeout)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Monitor::Wait(const SharedPtr\<Object\>\&, TimeSpan, bool) method


يفرج القفل عن كائن ويوقف الخيط الحالي حتى يستعيد القفل. إذا انقضى الفاصل الزمني المحدد للمهلة، ينتقل الخيط إلى طابور الجاهزية. يمكن اختياريًا الخروج من نطاق المزامنة للسياق المتزامن قبل الانتظار واستعادة النطاق بعد ذلك. غير مُطبق.

```cpp
static bool System::Threading::Monitor::Wait(const SharedPtr<Object> &obj, TimeSpan timeout, bool exitContext)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Monitor](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
