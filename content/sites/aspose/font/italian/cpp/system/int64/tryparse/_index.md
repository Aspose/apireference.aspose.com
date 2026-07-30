---
title: "Metodo System::Int64::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParse della classe System::Int64 in C++."
type: docs
weight: 200
url: /it/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 64 bit equivalente usando le informazioni di formattazione fornite e lo stile numerico.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| stili | Globalization::NumberStyles | Una combinazione bitwise dei valori dell'enumerazione NumberStyles che specifica lo stile consentito della rappresentazione testuale di un numero. |
| provider | const SharedPtr\<IFormatProvider\>\& | Un puntatore a un oggetto che contiene le informazioni sul formato della stringa. |
| risultato | int64_t\& | Il riferimento a una variabile intera con segno a 64 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 64 bit equivalente.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| risultato | int64_t\& | Il riferimento a una variabile intera con segno a 64 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
