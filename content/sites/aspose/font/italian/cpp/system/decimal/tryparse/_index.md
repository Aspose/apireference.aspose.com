---
title: "Metodo System::Decimal::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Metodo System::Decimal::TryParse. Converte la stringa specificata contenente la rappresentazione testuale di un numero nel valore Decimal equivalente in C++."
type: docs
weight: 5800
url: /it/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nel valore [Decimal](../) equivalente.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire |
| result | Decimal\& | Il riferimento a una variabile [Decimal](../) dove viene inserito il risultato della conversione |

### ReturnValue

Vero se la conversione è riuscita, altrimenti - falso

## Vedi anche

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Converte la stringa specificata contenente la rappresentazione testuale di un numero nel valore [Decimal](../) equivalente utilizzando le informazioni di formattazione fornite e lo stile numerico.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const String\& | La stringa da convertire |
| stili | Globalization::NumberStyles | Una combinazione bitwise dei valori dell'enumerazione NumberStyles che specifica lo stile consentito della rappresentazione testuale di un numero |
| provider | const SharedPtr\<IFormatProvider\>\& | Un puntatore a un oggetto che contiene le informazioni di formattazione della stringa |
| risultato | Decimal\& | Un argomento di output; contiene il risultato della conversione |

### ReturnValue

Vero se la conversione è riuscita, altrimenti - falso

## Vedi anche

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
