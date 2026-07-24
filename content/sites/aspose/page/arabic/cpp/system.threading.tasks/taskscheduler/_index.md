---
title: "الفئة System::Threading::Tasks::TaskScheduler"
linktitle: "جدولة المهام"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Threading::Tasks::TaskScheduler. تمثّل كائنًا يتعامل مع العمل منخفض المستوى لجدولة المهام على الخيوط في C++."
type: docs
weight: 400
url: /ar/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


يمثل كائنًا يتعامل مع العمل منخفض المستوى في وضع المهام في قوائم الانتظار على الخيوط.

```cpp
class TaskScheduler : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | ينشئ [TaskScheduler](./) مرتبطًا بالخيط الحالي. |
| static [get_Current](./get_current/)() | يحصل على [TaskScheduler](./) المرتبط بالمهمة التي يتم تنفيذها حاليًا. |
| static [get_Default](./get_default/)() | يحصل على كائن [TaskScheduler](./) الافتراضي الذي توفره الإطار. |
| [get_Id](./get_id/)() const | يحصل على المعرف الفريد لهذا [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | يشير إلى الحد الأقصى لمستوى التزامن الذي يمكن أن يدعمه هذا [TaskScheduler](./). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
