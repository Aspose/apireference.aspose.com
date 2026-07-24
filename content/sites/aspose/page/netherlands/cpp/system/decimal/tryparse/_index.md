---
title: "System::Decimal::TryParse methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "System::Decimal::TryParse methode. Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de gelijkwaardige Decimal‑waarde in C++."
type: docs
weight: 5800
url: /nl/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de gelijkwaardige [Decimal](../) waarde.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De tekenreeks om te converteren |
| result | Decimal\& | De referentie naar een [Decimal](../) variabele waarin het resultaat van de conversie wordt geplaatst |

### ReturnValue

True als de conversie geslaagd is, anders - false

## Zie ook

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar de equivalente [Decimal](../) waarde met behulp van de verstrekte opmaakinformatie en getalstijl.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De tekenreeks om te converteren |
| stijlen | Globalization::NumberStyles | Een bitwise combinatie van waarden van de NumberStyles enum die de toegestane stijl van de tekenreeksrepresentatie van een getal specificeert. |
| provider | const SharedPtr\<IFormatProvider\>\& | Een pointer naar een object dat de tekenreeksopmaakinformatie bevat. |
| result | Decimal\& | Een uitvoerargument; bevat het resultaat van de conversie. |

### ReturnValue

True als de conversie geslaagd is, anders - false

## Zie ook

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
