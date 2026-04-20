---
title: "System::IO::MemoryStream::TryGetBuffer طريقة"
linktitle: "TryGetBuffer"
second_title: "Aspose.Font لـ C++"
description: "System::IO::MemoryStream::TryGetBuffer طريقة. تُرجِع مصفوفة من البايتات غير الموقَّعة التي تم إنشاء هذا الدفق منها في C++."
type: docs
weight: 1800
url: /ar/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


يعيد مصفوفة البايتات غير الموقعة التي تم إنشاء هذا التدفق منها.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArraySegment\\<uint8_t\\>\\& | مصفوفة بايت - معلمة إخراج. عندما تُعيد هذه الطريقة true، تُعيد مقطع مصفوفة البايت التي تم إنشاء هذا الدفق منها؛ عندما تُعيد false، تُضبط هذه المعلمة على القيمة الافتراضية. |

### ReturnValue

True إذا نجحت عملية التحويل.

## انظر أيضًا

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
