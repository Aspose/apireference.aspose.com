---
title: "System::String::ToByteArray‑metod"
linktitle: "ToByteArray"
second_title: "Aspose.Page för C++"
description: "System::String::ToByteArray‑metod. Konverterar sträng eller delsträng till en bytearray i C++."
type: docs
weight: 4700
url: /sv/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Konverterar strängen eller delsträngen till en bytearray.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| startIndex | int32_t | Startindex för delsträng. |
| längd | int32_t | Längd för delsträng. |
| LE | bool | Om true, koda tecken med little‑endianness; annars, använd big‑endianness. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
