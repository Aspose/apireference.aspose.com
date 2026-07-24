---
title: "طريقة System::IO::Stream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::Stream::FlushAsync. تُفرغ جميع المخازن المؤقتة لهذا الدفق بشكل غير متزامن، وتؤدي إلى كتابة أي بيانات مخزنة إلى الجهاز الأساسي، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

مهمة تمثل عملية التفريغ غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| رمز الإلغاء | const Threading::CancellationToken\& | الرمز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية التفريغ غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
