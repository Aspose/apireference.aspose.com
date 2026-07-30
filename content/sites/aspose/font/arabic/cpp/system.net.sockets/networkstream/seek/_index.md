---
title: "طريقة System::Net::Sockets::NetworkStream::Seek"
linktitle: "تحريك"
second_title: "Aspose.Font لـ C++"
description: "طريقة Seek في System::Net::Sockets::NetworkStream. تحدد موضع الدفق الممثل بالكائن الحالي في C++."
type: docs
weight: 2000
url: /ar/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


يضبط موضع التدفق الممثل بالكائن الحالي.

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| إزاحة | int64_t | الإزاحة بالبايت بالنسبة إلى موضع محدد بواسطة **origin** |
| origin | IO::SeekOrigin | يحدد الموضع الذي تُحسب منه الإزاحة والاتجاه الذي تُحسب إليه. |

### ReturnValue

الموضع الجديد للدفق

## انظر أيضًا

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
