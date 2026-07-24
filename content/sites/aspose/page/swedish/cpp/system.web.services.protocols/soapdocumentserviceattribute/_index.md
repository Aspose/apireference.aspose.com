---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute klass"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page för C++"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute klass. Ställer in standardformatet för SOAP-begäran och -svaren. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 500
url: /sv/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Ställer in standardformatet för SOAP-begäran och -svaren. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för för att skicka den till funktioner som argument.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI-information. |
| [get_RoutingStyle](./get_routingstyle/)() | Hämtar ett värde som visar hur SOAP-meddelandena routas till tjänsten. |
| [get_Use](./get_use/)() | Hämtar parameterformateringen. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Ställer in ett värde som indikerar om parametrar är kapslade inom ett enda XML-element under 'Body'-elementet. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Ställer in ett värde som visar hur SOAP-meddelandena routas till tjänsten. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Ställer in parameterformateringen. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Skapar en ny instans. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Skapar en ny instans. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Skapar en ny instans. |
## Se även

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
