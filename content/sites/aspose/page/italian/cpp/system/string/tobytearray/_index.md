---
title: "Metodo System::String::ToByteArray"
linktitle: "ToByteArray"
second_title: "Aspose.Page per C++"
description: "Metodo System::String::ToByteArray. Converte una stringa o una sottostringa in un array di byte in C++."
type: docs
weight: 4700
url: /it/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Converte la stringa o la sottostringa in un array di byte.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startIndex | int32_t | Indice di inizio della sottostringa. |
| length | int32_t | Lunghezza della sottostringa. |
| LE | bool | Se true, codifica i caratteri usando il little endian; altrimenti, usa il big endian. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
