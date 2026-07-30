---
title: "System::DateTime::Parse metodo"
linktitle: "Analizza"
second_title: "Aspose.Font per C++"
description: "System::DateTime::Parse metodo. Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto DateTime equivalente in C++."
type: docs
weight: 6600
url: /it/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](../) equivalente.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |

### ReturnValue

Una nuova istanza della classe [DateTime](../) che rappresenta il valore data e ora equivalente a quello rappresentato dalla stringa specificata.

## Vedi anche

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Vedi anche

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Vedi anche

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converte la rappresentazione stringa specificata di un valore di data e ora nell'oggetto [DateTime](../) equivalente utilizzando informazioni di formato specifiche per la cultura.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'oggetto [IFormatProvider](../../iformatprovider/) che fornisce informazioni di formato specifiche della cultura. |
| styles | Globalization::DateTimeStyles | Una combinazione bitwise dei valori dell'enumerazione che fornisce informazioni aggiuntive su **s**, sugli elementi di stile che possono essere presenti in **s**, o sulla conversione da **s** a un oggetto [DateTime](../). |

### ReturnValue

Una nuova istanza della classe [DateTime](../) che rappresenta il valore data e ora equivalente a quello rappresentato dalla stringa specificata.

## Vedi anche

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Vedi anche

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
