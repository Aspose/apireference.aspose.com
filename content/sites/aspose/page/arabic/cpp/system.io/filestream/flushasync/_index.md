---
title: "System::IO::FileStream::FlushAsync طريقة"
linktitle: "FlushAsync"
second_title: "Aspose.Page لـ C++"
description: "System::IO::FileStream::FlushAsync طريقة. تقوم بشكل غير متزامن بمسح جميع المخازن المؤقتة لهذا التدفق، وتسبب كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| رمز الإلغاء | const Threading::CancellationToken\& | الرمز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية التفريغ غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
