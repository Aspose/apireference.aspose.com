---
title: "System::Byte::TryParse methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParse methode van de System::Byte-klasse te gebruiken in C++."
type: docs
weight: 200
url: /nl/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar het equivalente 8‑bit unsigned integer met behulp van de opgegeven opmaakinformatie en getalstijl.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| stijlen | Globalization::NumberStyles | Een bitwise-combinatie van waarden van de NumberStyles-enumeratie die de toegestane stijl van de tekenreeksrepresentatie van een getal specificeert. |
| provider | const SharedPtr\<IFormatProvider\>\& | Een pointer naar een object dat de tekenreeksopmaakinformatie bevat. |
| result | uint8_t\& | De referentie naar een 8-bit ongetekende geheel getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 8‑bit unsigned integer.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| result | uint8_t\& | De referentie naar een 8-bit ongetekende geheel getalvariabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
