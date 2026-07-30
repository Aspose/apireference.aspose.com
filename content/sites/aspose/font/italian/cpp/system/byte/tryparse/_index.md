---
title: "System::Byte::TryParse metodo"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParse della classe System::Byte in C++."
type: docs
weight: 200
url: /it/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente, utilizzando le informazioni di formattazione fornite e lo stile numerico.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| stili | Globalization::NumberStyles | Una combinazione bitwise dei valori dell'enumerazione NumberStyles che specifica lo stile consentito della rappresentazione testuale di un numero. |
| provider | const SharedPtr\<IFormatProvider\>\& | Un puntatore a un oggetto che contiene le informazioni sul formato della stringa. |
| risultato | uint8_t\& | Il riferimento a una variabile intero senza segno a 8 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire. |
| risultato | uint8_t\& | Il riferimento a una variabile intero senza segno a 8 bit dove viene inserito il risultato della conversione. |

### ReturnValue

Vero se la conversione ha avuto successo, altrimenti - falso.

## Vedi anche

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
