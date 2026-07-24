---
title: "System::DateTimeOffset::TryParseExact método"
linktitle: "TryParseExact"
second_title: "Aspose.Page para C++"
description: "System::DateTimeOffset::TryParseExact método. Intenta convertir la cadena especificada a un objeto DateTimeOffset usando los formatos especificados, el proveedor de formato y el estilo de formato en C++."
type: docs
weight: 5800
url: /es/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Intenta convertir la cadena especificada a un objeto [DateTimeOffset](../) usando los formatos especificados, el proveedor de formato y el estilo de formato.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../string/) para convertir. |
| formatos | const ArrayPtr\<String\>\& | Matrices de cadenas de formato. |
| proveedor | const SharedPtr\<IFormatProvider\>\& | Proveedor de formato. |
| estilos | Globalization::DateTimeStyles | Estilos de formato de fecha y hora. |
| result | DateTimeOffset\& | [DateTimeOffset](../) que es equivalente a la **entrada**. |

### ReturnValue

true si la **entrada** se convierte correctamente, de lo contrario - false.

## Ver también

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Intenta convertir la cadena especificada a un objeto [DateTimeOffset](../) usando el formato especificado, el proveedor de formato y el estilo de formato.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../string/) para convertir. |
| formato | const String\& | Cadena de formato. |
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
