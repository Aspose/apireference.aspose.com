---
title: "طريقة System::Threading::Tasks::Run"
linktitle: "Run"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::Run. تُضيف العمل المحدد إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط وتعيد مقبض Task لهذا العمل في C++."
type: docs
weight: 1600
url: /ar/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


تضيف العمل المحدد إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط وتعيد مقبض [Task](../task/) لهذا العمل.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action<>\& | العمل الذي سيتم تنفيذه بشكل غير متزامن. |

### ReturnValue

مهمة [Task](../task/) تمثل العمل المضاف إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


تضيف العمل المحدد إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط وتعيد مقبض [Task](../task/) لهذا العمل.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| action | const Action<>\& | العمل الذي سيتم تنفيذه بشكل غير متزامن. |
| cancellationToken | const CancellationToken\& | رمز إلغاء يمكن استخدامه لإلغاء العمل إذا لم يبدأ بعد. |

### ReturnValue

مهمة [Task](../task/) تمثل العمل المضاف إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


تضيف العمل المحدد إلى قائمة الانتظار للتنفيذ في مجموعة الخيوط وتعيد وكيلًا لـ [Task](../task/) الذي تُعيده الدالة.

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | العمل الذي سيتم تنفيذه بشكل غير متزامن، والذي يُعيد [Task](../task/). |

### ReturnValue

مهمة [Task](../task/) تمثل وكيلًا لـ [Task](../task/) الذي تُعيده الدالة.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


يقوم بجدولة العمل المحدد للتنفيذ على مجموعة الخيوط ويعيد مقبض [Task<TResult>](../task/) لهذا العمل.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع النتيجة التي تُرجعها المهمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| دالة | const Func\<TResult\>\& | العمل الذي سيتم تنفيذه بشكل غير متزامن. |

### ReturnValue

[Task<TResult>](../task/) الذي يمثل العمل المجدول للتنفيذ في مجموعة الخيوط.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
