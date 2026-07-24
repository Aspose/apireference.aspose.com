---
title: "System::UriBuilder klasse"
linktitle: "UriBuilder"
second_title: "Aspose.Page voor C++"
description: "System::UriBuilder klasse. Biedt methoden om universele resource-identifiers (URI's) te construeren en te wijzigen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 6800
url: /nl/cpp/system/uribuilder/
---
## UriBuilder class


Biedt methoden om universele resource-identifiers (URI's) te construeren en te wijzigen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class UriBuilder : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Retourneert het schema van de URI die door het huidige object is geconstrueerd. |
| [get_Uri](./get_uri/)() const | Retourneert het [Uri](../uri/) object dat door het huidige object is geconstrueerd. |
| [set_Port](./set_port/)(int) | Stelt het poortnummer van de URI in. |
| [set_Scheme](./set_scheme/)(const String\&) | Stelt het schema van de door het huidige object geconstrueerde URI in op de opgegeven waarde. |
| [ToString](./tostring/)() const override | Retourneert de tekenreeksrepresentatie van de door het huidige object geconstrueerde URI. |
| [UriBuilder](./uribuilder/)(const String\&) | Construeert een [UriBuilder](./) object dat de opgegeven URI vertegenwoordigt. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Construeert een [UriBuilder](./) object dat de opgegeven URI vertegenwoordigt. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
