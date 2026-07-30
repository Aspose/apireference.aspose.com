---
title: "System::String::ToByteArray-Methode"
linktitle: "ToByteArray"
second_title: "Aspose.Font für C++"
description: "System::String::ToByteArray-Methode. Konvertiert einen String oder Teilstring in ein Byte‑Array in C++."
type: docs
weight: 4700
url: /de/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Konvertiert die Zeichenkette oder Teilzeichenkette in ein Byte‑Array.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startIndex | int32_t | Startindex des Teilstrings. |
| Länge | int32_t | Länge des Teilstrings. |
| LE | bool | Wenn true, Zeichen mit Little‑Endian kodieren; andernfalls Big‑Endian verwenden. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
