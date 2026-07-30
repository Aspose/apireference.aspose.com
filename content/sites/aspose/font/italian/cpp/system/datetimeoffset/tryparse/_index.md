---
title: "Metodo System::DateTimeOffset::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Metodo System::DateTimeOffset::TryParse. Prova a convertire la stringa specificata in un oggetto DateTimeOffset utilizzando il provider di formato specificato e lo stile di formattazione in C++."
type: docs
weight: 5700
url: /it/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](../) utilizzando il provider di formato specificato e lo stile di formattazione.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
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
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Prova a convertire la stringa specificata in un oggetto [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
| result | DateTimeOffset\& | [DateTimeOffset](../) che è equivalente all'**input**. |

### ReturnValue

true se l'**input** è stato convertito con successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
