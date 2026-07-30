---
title: "System::Int16::TryParse metodo"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParse della classe System::Int16 in C++."
type: docs
weight: 200
url: /it/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 16 bit equivalente utilizzando le informazioni di formattazione fornite e lo stile numerico.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| stili | Globalization::NumberStyles | Una combinazione bitwise dei valori dell'enumerazione NumberStyles che specifica lo stile consentito della rappresentazione testuale di un numero. |
| provider | const SharedPtr\<IFormatProvider\>\& | Un puntatore a un oggetto che contiene le informazioni sul formato della stringa. |
| risultato | int16_t\& | Il riferimento a una variabile intera con segno a 16 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero con segno a 16 bit equivalente.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| risultato | int16_t\& | Il riferimento a una variabile intera con segno a 16 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
