---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page لـ C++"
description: "System::IO::FileStream::ReadAsync method. يقرأ بشكل غير متزامن تسلسلًا من البايتات من التدفق الحالي، ويُحَرّك الموضع داخل التدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء في C++."
type: docs
weight: 1400
url: /ar/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


يقرأ بشكل غير متزامن تسلسلًا من البايتات من التدفق الحالي، ويتقدم بالموضع داخل التدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات التي ستُكتب فيها البايتات المقروءة. |
| الإزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |
| رمز الإلغاء | const Threading::CancellationToken\& | الرمز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية القراءة غير المتزامنة. يحتوي قيمة معامل TResult على إجمالي عدد البايتات المقروءة إلى المصفوفة. قد تكون قيمة النتيجة أقل من عدد البايتات المطلوبة إذا كان عدد البايتات المتاحة حاليًا أقل من العدد المطلوب، أو قد تكون 0 (صفر) إذا تم الوصول إلى نهاية التدفق.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
