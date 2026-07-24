---
title: "System::ICustomFormatter::Format methode"
linktitle: "Opmaak"
second_title: "Aspose.Page voor C++"
description: "System::ICustomFormatter::Format methode. Retourneert een tekenreeksrepresentatie van een waarde die wordt weergegeven door het huidige object met behulp van het opgegeven formaat in C++."
type: docs
weight: 100
url: /nl/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Retourneert een tekenreeksrepresentatie van een waarde die wordt weergegeven door het huidige object met behulp van het opgegeven formaat.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| formaat | System::String | Het tekenreeksformaat |
| arg | System::SharedPtr\<System::Object\> | Het te formatteren object |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | Het object dat de formatteringsinformatie levert. |

### ReturnValue

De tekenreeksrepresentatie van **arg** geformatteerd volgens het formaat gespecificeerd door **format** en **formatProvider**

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
