---
title: "منشئ System::Threading::Tasks::ResultValueTask::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Threading::Tasks::ResultValueTask::ResultValueTask. يُنشئ ResultValueTask فارغًا غير مهيأ في C++."
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



المهمة غير مكتملة ولا تحتوي على نتيجة. محاولة الحصول على النتيجة ستؤدي إلى استثناء.

## انظر أيضًا

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


ينشئ [ResultValueTask](../) من مؤشر مشترك إلى [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المهمة | const RTaskPtr\<T\>\& | المهمة التي سيتم تغليفها. يمكن أن تكون فارغة لمهمة فارغة. |
## ملاحظات



ستُمثل [ResultValueTask](../) الحالة والنتيجة للمهمة المقدمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


ينشئ [ResultValueTask](../) مكتملًا مع النتيجة المحددة.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| result | const T\& | قيمة النتيجة لتغليفها في مهمة مكتملة. |
## ملاحظات



هذا ينشئ مهمة مكتملة بنجاح تُعيد القيمة على الفور.

## انظر أيضًا

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
