---
title: "System::Threading::Tasks::WhenAll method"
linktitle: "WhenAll"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::WhenAll method. ينشئ مهمة ستكتمل عندما تكتمل جميع المهام الموردة في C++."
type: docs
weight: 2400
url: /ar/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


ينشئ مهمة ستكتمل عندما تكتمل جميع المهام الموردة.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع نتائج المهام المكتملة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const ArrayPtr\<RTaskPtr\<TResult\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تُعيد مصفوفة من جميع النتائج عندما تكتمل جميع المهام.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


ينشئ مهمة ستكتمل عندما تكتمل جميع المهام الموردة.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const ArrayPtr\<TaskPtr\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تمثل إكمال جميع المهام الموردة.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


ينشئ مهمة ستكتمل عندما تكتمل جميع المهام الموردة.

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع نتائج المهام المكتملة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تُعيد مصفوفة من جميع النتائج عندما تكتمل جميع المهام.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


ينشئ مهمة ستكتمل عندما تكتمل جميع المهام الموردة.

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مهام | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | المهام التي يجب الانتظار عليها لإكمالها. |

### ReturnValue

مهمة تمثل إكمال جميع المهام الموردة.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
