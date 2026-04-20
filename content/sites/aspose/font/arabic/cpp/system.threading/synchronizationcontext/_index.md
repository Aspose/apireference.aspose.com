---
title: "System::Threading::SynchronizationContext فئة"
linktitle: "SynchronizationContext"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::SynchronizationContext. توفر الوظيفة الأساسية لنشر سياق المزامنة عبر عمليات المزامنة المختلفة في C++."
type: docs
weight: 1100
url: /ar/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


يوفر الوظيفة الأساسية لنشر سياق المزامنة عبر عمليات المزامنة المختلفة.

```cpp
class SynchronizationContext : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [get_Current](./get_current/)() | يحصل على سياق المزامنة للخلية الحالية. |
| virtual [Post](./post/)(SendOrPostCallback, SharedPtr\<Object\>) | يشغل رد النداء بشكل غير متزامن. |
| virtual [Send](./send/)(SendOrPostCallback, SharedPtr\<Object\>) | يشغل رد النداء بشكل متزامن. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | يضبط سياق المزامنة للخلية الحالية. |
| [SynchronizationContext](./synchronizationcontext/)() | معلومات RTTI. |
## ملاحظات


تمكن هذه الفئة من نشر سياق المزامنة بين الخيوط وتُستخدم لنقل ردود النداء أو الاستدعاءات إلى الخيط أو سياق المزامنة المناسب.
تنفيذ تجريبي.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
