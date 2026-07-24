---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute class"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute class. Stelt het standaardformaat in voor de SOAP‑verzoeken en -responsen. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Stelt het standaardformaat in voor de SOAP‑verzoeken en -responsen. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI-informatie. |
| [get_RoutingStyle](./get_routingstyle/)() | Haalt een waarde op die aangeeft hoe de SOAP‑berichten naar de service worden gerouteerd. |
| [get_Use](./get_use/)() | Haalt de parameteropmaak op. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Stelt een waarde in die aangeeft of parameters zijn ingekapseld in één enkel XML‑element onder het 'Body'-element. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Stelt een waarde in die aangeeft hoe de SOAP‑berichten naar de service worden gerouteerd. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Stelt de parameteropmaak in. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Construeert een nieuw exemplaar. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Construeert een nieuw exemplaar. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
