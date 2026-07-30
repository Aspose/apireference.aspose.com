---
title: "System::Threading::Tasks::Task::Task constructor"
linktitle: "Task"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::Task::Task constructor. مُنشئ داخلي لإنشاء مهام غير مهيأة في C++."
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
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


ينشئ [Task](../) بإجراء يحمل حالة وكائن حالة.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | الإجراء الذي سيتم تنفيذه (يقبل كائن الحالة) |
| الحالة | const SharedPtr\<Object\>\& | كائن حالة معرف من قبل المستخدم يُمرَّر إلى الإجراء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


ينشئ [Task](../) بإجراء يحمل حالة، وحالة، ورمز إلغاء.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | الإجراء الذي سيتم تنفيذه (يقبل كائن الحالة) |
| الحالة | const SharedPtr\<Object\>\& | كائن حالة معرف من قبل المستخدم يُمرَّر إلى الإجراء |
| cancellationToken | const CancellationToken\& | الرمز لمراقبة طلبات الإلغاء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


ينشئ [Task](../) بإجراء للتنفيذ.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action<>\& | الإجراء الذي سيتم تنفيذه بشكل غير متزامن |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


ينشئ [Task](../) بإجراء ورمز إلغاء.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action<>\& | الإجراء الذي سيتم تنفيذه بشكل غير متزامن |
| cancellationToken | const CancellationToken\& | الرمز لمراقبة طلبات الإلغاء |

## انظر أيضًا

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
