---
title: "System::DateTimeOffset::TryParseExact metodo"
linktitle: "TryParseExact"
second_title: "Aspose.Font per C++"
description: "System::DateTimeOffset::TryParseExact metodo. Tenta di convertire la stringa specificata in un oggetto DateTimeOffset usando i formati specificati, il provider di formato e lo stile di formattazione in C++."
type: docs
weight: 5800
url: /it/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Tenta di convertire la stringa specificata in un oggetto [DateTimeOffset](../) usando i formati specificati, il provider di formato e lo stile di formattazione.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
| formati | const ArrayPtr\<String\>\& | Array di stringhe di formato. |
| provider | const SharedPtr\<IFormatProvider\>\& | Provider di formato. |
| stili | Globalization::DateTimeStyles | Stili di formattazione di data e ora. |
| result | DateTimeOffset\& | [DateTimeOffset](../) che è equivalente all'**input**. |

### ReturnValue

true se l'**input** è stato convertito con successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Tenta di convertire la stringa specificata in un oggetto [DateTimeOffset](../) usando il formato specificato, il provider di formato e lo stile di formattazione.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
| formato | const String\& | Stringa di formato. |
| provider | const SharedPtr\<IFormatProvider\>\& | Provider di formato. |
| stili | Globalization::DateTimeStyles | Stili di formattazione di data e ora. |
| result | DateTimeOffset\& | [DateTimeOffset](../) che è equivalente all'**input**. |

### ReturnValue

true se l'**input** è stato convertito con successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
