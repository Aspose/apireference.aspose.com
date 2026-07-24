---
title: "منشئ System::Threading::Tasks::ValueTask::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Threading::Tasks::ValueTask::ValueTask. يبني ValueTask فارغًا غير مهيأ في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


يبني [ValueTask](../) فارغًا غير مهيأ.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## ملاحظات



المهمة غير مكتملة ولا تحتوي على نتيجة. محاولة الحصول على النتيجة ستؤدي إلى رمي استثناء.

## انظر أيضًا

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


يبني [ValueTask](../) من مؤشر مشترك إلى [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مهمة | const TaskPtr\& | المهمة التي سيتم تغليفها. يمكن أن تكون فارغة (null) لمهمة فارغة. |
## ملاحظات



ستُمثل [ValueTask](../) حالة المهمة المقدَّمة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
