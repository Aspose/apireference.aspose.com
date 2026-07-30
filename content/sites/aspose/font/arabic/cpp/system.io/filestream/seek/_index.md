---
title: "طريقة System::IO::FileStream::Seek"
linktitle: "تحريك"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::FileStream::Seek. تضبط موضع الدفق الممثّل بواسطة الكائن الحالي في C++."
type: docs
weight: 1600
url: /ar/cpp/system.io/filestream/seek/
---
## FileStream::Seek method


يضبط موضع التدفق الممثل بالكائن الحالي.

```cpp
int64_t System::IO::FileStream::Seek(int64_t offset, SeekOrigin origin) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| إزاحة | int64_t | إزاحة البايت نسبةً إلى موضع محدد بواسطة **origin**. |
| origin | SeekOrigin | يحدد الموضع الذي يُحسب منه الإزاحة والاتجاه الذي تُحسب نحوه الإزاحة. |

### ReturnValue

الموضع الجديد للدفق.

## انظر أيضًا

* Enum [SeekOrigin](../../seekorigin/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
