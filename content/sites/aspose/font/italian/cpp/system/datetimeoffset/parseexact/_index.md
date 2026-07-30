---
title: "System::DateTimeOffset::ParseExact metodo"
linktitle: "ParseExact"
second_title: "Aspose.Font per C++"
description: "System::DateTimeOffset::ParseExact metodo. Converte la stringa specificata in un oggetto DateTimeOffset utilizzando i formati specificati, il provider di formato e lo stile di formattazione in C++."
type: docs
weight: 5600
url: /it/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converte la stringa specificata in un oggetto [DateTimeOffset](../) utilizzando i formati specificati, il provider di formato e lo stile di formattazione.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) di stringhe di formato. |
| provider | const SharedPtr\<IFormatProvider\>\& | Provider di formato. |
| stili | Globalization::DateTimeStyles | Stili di formattazione di data e ora. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Vedi anche

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converte la stringa specificata in un oggetto [DateTimeOffset](../) utilizzando il formato specificato, il provider di formato e lo stile di formattazione.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../string/) da convertire. |
| formato | const String\& | Stringa di formato. |
| provider | const SharedPtr\<IFormatProvider\>\& | Provider di formato. |
| stili | Globalization::DateTimeStyles | Stili di formattazione di data e ora. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Vedi anche

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
