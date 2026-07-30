---
title: "Metodo System::DateTime::TryParseExact"
linktitle: "TryParseExact"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo TryParseExact della classe System::DateTime in C++."
type: docs
weight: 7000
url: /it/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converte la rappresentazione stringa specificata di un valore data e ora nell'oggetto [DateTime](../) equivalente utilizzando i formati specificati, le informazioni di formattazione specifiche della cultura e lo stile. Il formato della rappresentazione stringa deve corrispondere esattamente a uno o più dei formati specificati.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |
| formati | const ArrayPtr\<String\>\& | L'array di formati stringa. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'oggetto [IFormatProvider](../../iformatprovider/) che fornisce informazioni di formato specifiche della cultura. |
| styles | Globalization::DateTimeStyles | Una combinazione bitwise dei valori dell'enumerazione che fornisce informazioni aggiuntive su **s**, sugli elementi di stile che possono essere presenti in **s**, o sulla conversione da **s** a un oggetto [DateTime](../). |
| risultato | DateTime\& | L'argomento di output che, se la conversione ha successo, contiene il risultato della conversione. |

### ReturnValue

True se la conversione ha successo, altrimenti - false.

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Converte la rappresentazione stringa specificata di un valore data e ora nell'oggetto [DateTime](../) equivalente utilizzando il formato specificato, le informazioni di formattazione specifiche della cultura e lo stile. Il formato della rappresentazione stringa deve corrispondere esattamente al formato specificato.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La rappresentazione stringa di un valore data e ora da convertire. |
| formato | const String\& | Il formato stringa. |
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
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Vedi anche

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
