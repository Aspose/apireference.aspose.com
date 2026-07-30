---
title: "System::IO::Stream::FlushAsync طريقة"
linktitle: "FlushAsync"
second_title: "Aspose.Font لـ C++"
description: "System::IO::Stream::FlushAsync طريقة. يمسح جميع المخازن لهذا التدفق بشكل غير متزامن، ويتسبب في كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا الدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

مهمة تمثل عملية المسح غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا الدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | الرمز المميز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية المسح غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
