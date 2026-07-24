---
title: "طريقة System::IO::MemoryStream::TryGetBuffer"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::MemoryStream::TryGetBuffer. تُرجع مصفوفة البايتات غير الموقعة التي تم إنشاء هذا الدفق منها في C++."
type: docs
weight: 1800
url: /ar/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


يعيد مصفوفة البايتات غير الموقعة التي تم إنشاء هذا التدفق منها.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | ArraySegment\\<uint8_t\\>\\& | مصفوفة بايت - معامل إخراج. عندما تُعيد هذه الطريقة صواب، يكون مقطع مصفوفة البايت التي تم إنشاء هذا الدفق منها؛ عندما تُعيد الطريقة خطأ، يتم تعيين هذا المعامل إلى القيمة الافتراضية. |

### ReturnValue

صحيح إذا نجحت عملية التحويل.

## انظر أيضًا

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
