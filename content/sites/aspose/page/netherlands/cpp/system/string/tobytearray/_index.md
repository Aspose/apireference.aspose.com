---
title: "System::String::ToByteArray methode"
linktitle: "ToByteArray"
second_title: "Aspose.Page voor C++"
description: "System::String::ToByteArray methode. Converteert string of substring naar array van bytes in C++."
type: docs
weight: 4700
url: /nl/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Converteert een string of substring naar een array van bytes.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | int32_t | Startindex van substring. |
| lengte | int32_t | Lengte van substring. |
| LE | bool | Als true, codeer tekens met little-endian; anders gebruik big-endian. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
