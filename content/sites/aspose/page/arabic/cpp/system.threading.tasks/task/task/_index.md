---
title: "System::Threading::Tasks::Task::Task مُنشئ"
linktitle: "Task"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Tasks::Task::Task مُنشئ. مُنشئ داخلي لإنشاء مهام غير مهيأة في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


منشئ داخلي لإنشاء مهام غير مهيأة.

```cpp
System::Threading::Tasks::Task::Task()
```

## انظر أيضًا

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


ينشئ [Task](../) بإجراء حالة وكائن حالة.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإجراء | const Action\<SharedPtr\<Object\>\>\& | الإجراء للتنفيذ (يقبل كائن الحالة) |
| الحالة | const SharedPtr\<Object\>\& | كائن حالة معرف من قبل المستخدم يُمرَّر إلى الإجراء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


ينشئ [Task](../) بإجراء حالة، كائن حالة، ورمز إلغاء.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإجراء | const Action\<SharedPtr\<Object\>\>\& | الإجراء للتنفيذ (يقبل كائن الحالة) |
| الحالة | const SharedPtr\<Object\>\& | كائن حالة معرف من قبل المستخدم يُمرَّر إلى الإجراء |
| رمز الإلغاء | const CancellationToken\& | رمز لمراقبة طلبات الإلغاء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


ينشئ [Task](../) بإجراء للتنفيذ.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإجراء | const Action<>\& | الإجراء للتنفيذ بشكل غير متزامن |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


ينشئ [Task](../) بإجراء ورمز إلغاء.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإجراء | const Action<>\& | الإجراء للتنفيذ بشكل غير متزامن |
| رمز الإلغاء | const CancellationToken\& | رمز لمراقبة طلبات الإلغاء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
