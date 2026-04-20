---
title: "طريقة System::Threading::Tasks::Delay"
linktitle: "تأخير"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::Delay. تنشئ مهمة تُكمل بعد تأخير زمني في C++."
type: docs
weight: 1000
url: /ar/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


ينشئ مهمة تُكمل بعد تأخير زمني.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsDelay | int32_t | عدد الملليثواني التي يجب الانتظار لها قبل إكمال المهمة المرجعة، أو -1 للانتظار إلى أجل غير مسمى. |

### ReturnValue

مهمة تمثل التأخير الزمني.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


ينشئ مهمة تُكمل بعد تأخير زمني ويمكن إلغاؤها.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsDelay | int32_t | عدد الملليثواني التي يجب الانتظار لها قبل إكمال المهمة المرجعة، أو -1 للانتظار إلى أجل غير مسمى. |
| cancellationToken | const CancellationToken\& | رمز الإلغاء الذي يمكن استخدامه لإلغاء التأخير. |

### ReturnValue

مهمة تمثل التأخير الزمني.

## انظر أيضًا

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
