---
title: "طريقة System::Threading::Tasks::FromException"
linktitle: "FromException"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::FromException. تنشئ مهمة تم إكمالها باستثناء محدد في C++."
type: docs
weight: 1300
url: /ar/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


ينشئ مهمة تم إكمالها باستثناء محدد.

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استثناء | const Exception\& | الاستثناء الذي يُستخدم لإكمال المهمة. |

### ReturnValue

مهمة معطوبة.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


ينشئ مهمة تم إكمالها باستثناء ونوع نتيجة محددين.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| معامل | الوصف |
| --- | --- |
| TResult | نوع نتيجة المهمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| استثناء | const Exception\& | الاستثناء الذي يُستخدم لإكمال المهمة. |

### ReturnValue

مهمة معطوبة بنوع النتيجة المحدد.

## انظر أيضًا

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
