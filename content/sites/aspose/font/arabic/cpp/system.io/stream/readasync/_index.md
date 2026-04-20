---
title: "طريقة System::IO::Stream::ReadAsync"
linktitle: "ReadAsync"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Stream::ReadAsync. تقرأ بشكل غير متزامن تسلسلًا من البايتات من المجرى الحالي، وتُحرك الموضع داخل المجرى بعدد البايتات المقروءة، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 1900
url: /ar/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


يقرأ بشكل غير متزامن تسلسلًا من البايتات من الدفق الحالي، ويقدم الموضع داخل الدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات التي تُكتب فيها البايتات المقروءة. |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |

### ReturnValue

مهمة تمثل عملية القراءة غير المتزامنة. يحتوي قيمة معامل TResult على إجمالي عدد البايتات المقروءة إلى المخزن المؤقت. قد تكون قيمة النتيجة أقل من عدد البايتات المطلوبة إذا كان عدد البايتات المتاحة حاليًا أقل من العدد المطلوب، أو قد تكون 0 (صفر) إذا تم الوصول إلى نهاية المجرى.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


يقرأ بشكل غير متزامن تسلسلًا من البايتات من الدفق الحالي، ويقدم الموضع داخل الدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مصفوفة البايتات التي تُكتب فيها البايتات المقروءة. |
| إزاحة | int32_t | موضع يبدأ من الصفر في **buffer** للبدء بالكتابة. |
| count | int32_t | عدد البايتات التي سيتم قراءتها. |
| cancellationToken | const Threading::CancellationToken\& | الرمز المميز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية القراءة غير المتزامنة. يحتوي قيمة معامل TResult على إجمالي عدد البايتات المقروءة إلى المخزن المؤقت. قد تكون قيمة النتيجة أقل من عدد البايتات المطلوبة إذا كان عدد البايتات المتاحة حاليًا أقل من العدد المطلوب، أو قد تكون 0 (صفر) إذا تم الوصول إلى نهاية المجرى.

## انظر أيضًا

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
