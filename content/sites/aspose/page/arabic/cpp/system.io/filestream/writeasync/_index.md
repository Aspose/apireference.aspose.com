---
title: "طريقة System::IO::FileStream::WriteAsync"
linktitle: "WriteAsync"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::FileStream::WriteAsync. تكتب بشكل غير متزامن تسلسلًا من البايتات إلى التدفق الحالي، وتُحرك الموضع الحالي داخل هذا التدفق بعدد البايتات المكتوبة، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 2000
url: /ar/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


يكتب بشكل غير متزامن تسلسلًا من البايتات إلى التدفق الحالي، ويتقدم بالموضع الحالي داخل هذا التدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | المصفوفة التي تحتوي على البايتات للكتابة. |
| الإزاحة | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة. |
| count | int32_t | عدد العناصر في النطاق الفرعي للكتابة. |
| رمز الإلغاء | const Threading::CancellationToken\& | الرمز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية الكتابة غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
