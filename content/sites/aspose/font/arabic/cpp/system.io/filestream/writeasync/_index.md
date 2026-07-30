---
title: "طريقة System::IO::FileStream::WriteAsync"
linktitle: "WriteAsync"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::FileStream::WriteAsync. تقوم بكتابة تسلسل من البايتات إلى الدفق الحالي بشكل غير متزامن، وتُحَرّك الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 2000
url: /ar/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، ويقدم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
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
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
