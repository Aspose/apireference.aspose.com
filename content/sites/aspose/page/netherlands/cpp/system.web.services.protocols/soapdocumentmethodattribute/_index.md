---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute klasse"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute klasse. Geeft aan dat alle SOAP-berichten die van de methode worden doorgegeven of geretourneerd, de Document-opmaak gebruiken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten zal veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Geeft aan dat alle SOAP-berichten die van de methode worden doorgegeven of geretourneerd, de Document-opmaak gebruiken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten zal veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Action](./get_action/)() | RTTI-informatie. |
| [get_Binding](./get_binding/)() | Haalt de binding op waarvoor een XML-webservice‑methode een bewerking implementeert. |
| [get_OneWay](./get_oneway/)() | Haalt een waarde op die aangeeft of een client niet wacht tot een server de verwerking van een methode heeft voltooid. |
| [get_ParameterStyle](./get_parameterstyle/)() | Haalt een waarde op die aangeeft of parameters zijn ingekapseld in één enkel XML‑element onder het 'Body'-element. |
| [get_RequestElementName](./get_requestelementname/)() | Haalt de naam op van het XML‑element dat bij het SOAP‑verzoek hoort, zoals gedefinieerd in een servicebeschrijving als een bewerking. |
| [get_RequestNamespace](./get_requestnamespace/)() | Haalt de namespace op die bij het SOAP‑verzoek hoort. |
| [get_ResponseElementName](./get_responseelementname/)() | Haalt de naam op van het XML‑element dat bij de SOAP‑respons hoort. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Haalt de namespace op die bij de SOAP‑respons hoort. |
| [get_Use](./get_use/)() | Haalt een waarde op die de berichtcoderingmethode bepaalt. |
| [set_Action](./set_action/)(String) | Stelt een waarde in voor het 'SOAPAction'-attribuut. |
| [set_Binding](./set_binding/)(String) | Stelt de binding in waarvoor een XML-webservice‑methode een bewerking implementeert. |
| [set_OneWay](./set_oneway/)(bool) | Stelt een waarde in die aangeeft of de client niet wacht tot de server de verwerking van een methode heeft voltooid. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Stelt een waarde in die aangeeft of parameters zijn ingekapseld in één enkel XML‑element onder het 'Body'-element. |
| [set_RequestElementName](./set_requestelementname/)(String) | Stelt de naam in van het XML‑element dat bij het SOAP‑verzoek hoort, zoals gedefinieerd in een servicebeschrijving als een bewerking. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Stelt de namespace in die bij het SOAP-verzoek hoort. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Stelt de naam van het XML-element in die bij de SOAP-respons hoort. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Stelt de namespace in die bij de SOAP-respons hoort. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Stelt een waarde in die de coderingsmethode van het bericht bepaalt. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Construeert een nieuw exemplaar. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
