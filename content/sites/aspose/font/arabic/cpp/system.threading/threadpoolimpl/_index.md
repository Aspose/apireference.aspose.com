---
title: "System::Threading::ThreadPoolImpl فئة"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::ThreadPoolImpl فئة. بيانات داخلية لمجمع الخيوط. هذا نوع مفرد مع إدارة الذاكرة تتم عبر دالة (دوال) الوصول. يجب ألا تقوم بإنشاء مثيلات منه مباشرةً في C++."
type: docs
weight: 1400
url: /ar/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | يحصل على عدد الخيوط المتاحة. |
| static [GetInitialized](./getinitialized/)() | يحصل على حالة التهيئة المفردة. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | يحصل على الحد الأقصى لعدد الخيوط المتزامنة. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | يحصل على الحد الأدنى لعدد الخيوط التي يتم إنشاؤها بواسطة المجمع. |
| [JoinAll](./joinall/)() | ينضم إلى جميع الخيوط المملوكة. ينتظر إلى ما لا نهاية. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | يضيف عنصر عمل إلى القائمة. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | يضبط عدد الخيوط المملوكة للمجمع. |
| [SetMinThreads](./setminthreads/)(int, int) | يضبط الحد الأدنى لعدد الخيوط المملوكة للمجمع. |
| [ThreadPoolImpl](./threadpoolimpl/)() | المُنشئ. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | المدمر. ينضم إلى جميع الخيوط إذا لم يتم إنهاؤها بعد. |
## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
