---
title: "System::String::ToByteArray yöntemi"
linktitle: "ToByteArray"
second_title: "Aspose.Page için C++"
description: "System::String::ToByteArray yöntemi. Dizeyi veya alt dizeyi C++ içinde bayt dizisine dönüştürür."
type: docs
weight: 4700
url: /tr/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Dizeyi veya alt dizeyi bayt dizisine dönüştürür.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| startIndex | int32_t | Alt dize başlangıç indeksi. |
| length | int32_t | Alt dize uzunluğu. |
| LE | bool | Doğru ise, karakterleri küçük endian kullanarak kodlar; aksi takdirde büyük endian kullanır. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
