---
title: "System::Threading::Tasks::WhenAny method"
linktitle: "WhenAny"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::WhenAny method. ينشئ مهمة ستكتمل عندما تنتهي أي من المهام المقدمة في C++."
type: docs
weight: 2800
url: /ar/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


ينشئ مهمة ستكتمل عندما تنتهي أي من المهام المقدمة.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع نتيجة المهمة المكتملة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تُعيد أول مهمة مكتملة عندما تُكمل أي مهمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


ينشئ مهمة ستكتمل عندما تنتهي أي من المهام المقدمة.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const ArrayPtr\<TaskPtr\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تمثل إكمال إحدى المهام المقدمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


ينشئ مهمة ستكتمل عندما تنتهي أي من المهام المقدمة.

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع نتيجة المهمة المكتملة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تُعيد أول مهمة مكتملة عندما تُكمل أي مهمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


ينشئ مهمة ستكتمل عندما تنتهي أي من المهام المقدمة.

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تمثل إكمال إحدى المهام المقدمة.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
