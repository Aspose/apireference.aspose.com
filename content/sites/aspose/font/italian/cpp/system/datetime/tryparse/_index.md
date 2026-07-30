---
title: "Metodo System::DateTime::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParse della classe System::DateTime in C++."
type: docs
weight: 6900
url: /it/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](../) equivalente utilizzando le informazioni di formato specifiche della cultura e lo stile specificati.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'oggetto [IFormatProvider](../../iformatprovider/) che fornisce informazioni di formato specifiche della cultura. |
| styles | Globalization::DateTimeStyles | Una combinazione bitwise dei valori dell'enumerazione che fornisce informazioni aggiuntive su **s**, sugli elementi di stile che possono essere presenti in **s**, o sulla conversione da **s** a un oggetto [DateTime](../). |
| risultato | DateTime\& | L'argomento di output che, se la conversione ha successo, contiene il risultato della conversione. |

### ReturnValue

True se la conversione ha successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](../) equivalente.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |
| risultato | DateTime\& | L'argomento di output che, se la conversione ha successo, contiene il risultato della conversione. |

### ReturnValue

True se la conversione ha successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
