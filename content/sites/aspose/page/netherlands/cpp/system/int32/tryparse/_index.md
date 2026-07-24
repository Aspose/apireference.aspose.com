---
title: "System::Int32::TryParse-methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "Hoe de TryParse-methode van de System::Int32-klasse te gebruiken in C++."
type: docs
weight: 200
url: /nl/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar de equivalente 32-bit signed integer met behulp van de opgegeven opmaakinformatie en getalstijl.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| stijlen | Globalization::NumberStyles | Een bitwise-combinatie van waarden van de NumberStyles-enumeratie die de toegestane stijl van de tekenreeksrepresentatie van een getal specificeert. |
| provider | const SharedPtr\<IFormatProvider\>\& | Een pointer naar een object dat de tekenreeksopmaakinformatie bevat. |
| result | int32_t\& | De referentie naar een 32-bits ondertekende integer-variabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar de equivalente 32-bit signed integer.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te converteren string. |
| result | int32_t\& | De referentie naar een 32-bits ondertekende integer-variabele waarin het resultaat van de conversie wordt geplaatst. |

### ReturnValue

True als de conversie geslaagd is, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
