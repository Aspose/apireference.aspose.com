---
title: "Método System::Uri::HexUnescape"
linktitle: "HexUnescape"
second_title: "Aspose.Page para C++"
description: "Método System::Uri::HexUnescape. Convierte la representación hexadecimal especificada de un carácter a un carácter en C++."
type: docs
weight: 4000
url: /es/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Convierte la representación hexadecimal especificada de un carácter a un carácter.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| patrón | const String\& | Una cadena que contiene la representación hexadecimal de un carácter |
| índice | int32_t\& | La posición en **pattern** donde comienza la representación hexadecimal de un carácter |

### ReturnValue

El carácter representado por la codificación hexadecimal en la posición **index**. Si el carácter en **index** no está codificado en hexadecimal, se devuelve el carácter en **index**. El valor de **index** se incrementa para apuntar al carácter que sigue al devuelto.

## Ver también

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
