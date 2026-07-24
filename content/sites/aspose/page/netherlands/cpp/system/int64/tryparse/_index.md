---
title: "System::Int64::TryParse-methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParse-methode van de System::Int64‑klasse te gebruiken in C++."
type: docs
weight: 200
url: /nl/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar het equivalente 64-bit ondertekende geheel getal met behulp van de opgegeven opmaakinformatie en getalstijl.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| stijlen | Globalization::NumberStyles | Een bitwise-combinatie van waarden van de NumberStyles-enumeratie die de toegestane stijl van de tekenreeksrepresentatie van een getal specificeert. |
| provider | const SharedPtr\<IFormatProvider\>\& | Een pointer naar een object dat de tekenreeksopmaakinformatie bevat. |
| result | int64_t\& | De referentie naar een 64‑bits ondertekende gehele getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Converteert de opgegeven string die de stringrepresentatie van een getal bevat naar de equivalente 64-bit signed integer.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| result | int64_t\& | De referentie naar een 64‑bits ondertekende gehele getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
