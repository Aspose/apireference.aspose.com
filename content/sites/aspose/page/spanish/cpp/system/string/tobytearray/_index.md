---
title: "Método System::String::ToByteArray"
linktitle: "ToByteArray"
second_title: "Aspose.Page para C++"
description: "Método System::String::ToByteArray. Convierte una cadena o subcadena en una matriz de bytes en C++."
type: docs
weight: 4700
url: /es/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Convierte la cadena o subcadena a una matriz de bytes.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startIndex | int32_t | Índice de inicio de la subcadena. |
| longitud | int32_t | Longitud de la subcadena. |
| LE | bool | Si es verdadero, codifica los caracteres usando little endian; de lo contrario, usa big endian. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
