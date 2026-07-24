---
title: "System::Int16::TryParse methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParse-methode van de System::Int16-klasse te gebruiken in C++."
type: docs
weight: 200
url: /nl/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 16‑bit ondertekende integer met behulp van de opgegeven opmaakinformatie en getalstijl.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| stijlen | Globalization::NumberStyles | Een bitwise-combinatie van waarden van de NumberStyles-enumeratie die de toegestane stijl van de tekenreeksrepresentatie van een getal specificeert. |
| provider | const SharedPtr\<IFormatProvider\>\& | Een pointer naar een object dat de tekenreeksopmaakinformatie bevat. |
| result | int16_t\& | De referentie naar een 16-bits ondertekend geheel getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 16‑bit ondertekende integer.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| result | int16_t\& | De referentie naar een 16-bits ondertekend geheel getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
