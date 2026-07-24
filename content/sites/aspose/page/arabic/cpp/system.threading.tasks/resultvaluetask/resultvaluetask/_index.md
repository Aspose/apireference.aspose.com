---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask منشئ"
linktitle: "ResultValueTask"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask منشئ. ينشئ ResultValueTask فارغًا غير مهيأ في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


ينشئ [ResultValueTask](../) فارغًا غير مهيأ.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## ملاحظات



المهمة غير مكتملة ولا تحتوي على نتيجة. محاولة الحصول على النتيجة ستؤدي إلى رمي استثناء.

## انظر أيضًا

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


ينشئ [ResultValueTask](../) من مؤشر مشترك إلى [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| مهمة | const RTaskPtr\<T\>\& | المهمة التي سيتم تغليفها. يمكن أن تكون فارغة (null) لمهمة فارغة. |
## ملاحظات



ستُمثل [ResultValueTask](../) حالة ونتيجة المهمة المقدَّمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


ينشئ [ResultValueTask](../) مكتملًا بالنتيجة المحددة.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| النتيجة | const T\& | قيمة النتيجة لتغليفها في مهمة مكتملة. |
## ملاحظات



هذا ينشئ مهمة مكتملة بنجاح تُعيد القيمة فورًا.

## انظر أيضًا

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
