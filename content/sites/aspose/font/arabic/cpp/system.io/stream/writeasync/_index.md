---
title: "System::IO::Stream::WriteAsync طريقة"
linktitle: "WriteAsync"
second_title: "Aspose.Font لـ C++"
description: "System::IO::Stream::WriteAsync طريقة. يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، يقدّم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء في C++."
type: docs
weight: 2700
url: /ar/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، ويقدم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة. |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |

### ReturnValue

مهمة تمثل عملية الكتابة غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، ويقدم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| إزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة. |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |
| cancellationToken | const Threading::CancellationToken\& | الرمز المميز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية الكتابة غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
