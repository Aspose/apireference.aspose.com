---
title: "فئة System::Threading::SynchronizationContext"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page لـ C++"
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
| static [get_Current](./get_current/)() | يحصل على سياق المزامنة للخيط الحالي. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | يضبط سياق المزامنة للخيط الحالي. |
| [SynchronizationContext](./synchronizationcontext/)() | معلومات RTTI. |
## ملاحظات


تمكن هذه الفئة من نشر سياق المزامنة بين الخيوط وتُستخدم لتوجيه ردود النداء أو الاستدعاءات إلى الخيط المناسب أو سياق المزامنة.
تنفيذ تجريبي.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
