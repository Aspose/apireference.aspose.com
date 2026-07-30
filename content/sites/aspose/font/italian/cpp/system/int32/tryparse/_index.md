---
title: "System::Int32::TryParse metodo"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParse della classe System::Int32 in C++."
type: docs
weight: 200
url: /it/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 32 bit equivalente utilizzando le informazioni di formattazione fornite e lo stile numerico.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| stili | Globalization::NumberStyles | Una combinazione bitwise dei valori dell'enumerazione NumberStyles che specifica lo stile consentito della rappresentazione testuale di un numero. |
| provider | const SharedPtr\<IFormatProvider\>\& | Un puntatore a un oggetto che contiene le informazioni sul formato della stringa. |
| risultato | int32_t\& | Il riferimento a una variabile intera con segno a 32 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 32 bit equivalente.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| risultato | int32_t\& | Il riferimento a una variabile intera con segno a 32 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
