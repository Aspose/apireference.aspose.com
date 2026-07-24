---
title: "System::DateTimeOffset::TryParse método"
linktitle: "TryParse"
second_title: "Aspose.Page para C++"
description: "System::DateTimeOffset::TryParse método. Intenta convertir la cadena especificada a un objeto DateTimeOffset usando el proveedor de formato y el estilo de formato especificados en C++."
type: docs
weight: 5700
url: /es/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Intenta convertir la cadena especificada a un objeto [DateTimeOffset](../) usando el proveedor de formato y el estilo de formato especificados.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../string/) para convertir. |
| proveedor | const SharedPtr\<IFormatProvider\>\& | Proveedor de formato. |
| estilos | Globalization::DateTimeStyles | Estilos de formato de fecha y hora. |
| result | DateTimeOffset\& | [DateTimeOffset](../) que es equivalente a la **entrada**. |

### ReturnValue

true si la **entrada** se convierte correctamente, de lo contrario - false.

## Ver también

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Intenta convertir la cadena especificada a un objeto [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../string/) para convertir. |
| result | DateTimeOffset\& | [DateTimeOffset](../) que es equivalente a la **entrada**. |

### ReturnValue

true si la **entrada** se convierte correctamente, de lo contrario - false.

## Ver también

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
