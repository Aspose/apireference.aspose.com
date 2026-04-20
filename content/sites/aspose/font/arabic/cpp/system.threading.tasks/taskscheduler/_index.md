---
title: "فئة System::Threading::Tasks::TaskScheduler"
linktitle: "TaskScheduler"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::Tasks::TaskScheduler. تمثل كائنًا يتعامل مع العمل منخفض المستوى لجدولة المهام على الخيوط في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


يمثل كائنًا يتعامل مع العمل منخفض المستوى لصفّ المهام على الخيوط.

```cpp
class TaskScheduler : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | ينشئ [TaskScheduler](./) مرتبطًا بالخيط الحالي. |
| static [get_Current](./get_current/)() | يحصل على [TaskScheduler](./) المرتبط بالمهمة التي يتم تنفيذها حاليًا. |
| static [get_Default](./get_default/)() | يحصل على نسخة [TaskScheduler](./) الافتراضية التي يوفرها الإطار. |
| [get_Id](./get_id/)() const | يحصل على المعرف الفريد لهذا [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | يشير إلى أقصى مستوى توازي يمكن أن يدعمه هذا [TaskScheduler](./). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
