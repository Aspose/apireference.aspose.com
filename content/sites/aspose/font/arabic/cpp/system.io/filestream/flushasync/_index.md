---
title: "طريقة System::IO::FileStream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::FileStream::FlushAsync. تقوم بشكل غير متزامن بمسح جميع المخازن المؤقتة لهذا التدفق، وتؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، وتراقب طلبات الإلغاء في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا الدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | الرمز المميز لمراقبة طلبات الإلغاء. |

### ReturnValue

مهمة تمثل عملية المسح غير المتزامنة.

## انظر أيضًا

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
