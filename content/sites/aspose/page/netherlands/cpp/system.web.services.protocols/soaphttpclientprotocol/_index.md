---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol klasse"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol klasse. De client‑proxy‑services moeten deze klasse erven wanneer SOAP wordt gebruikt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


De client‑proxy‑services moeten deze klasse erven wanneer SOAP wordt gebruikt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Discover](./discover/)() | Bindt de huidige instantie aan de XML [Web](../../system.web/) service. |
| [get_SoapVersion](./get_soapversion/)() | Haalt de SOAP‑versie op. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Initialiseert de interne velden. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Stelt de SOAP‑versie in. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Construeert een nieuw exemplaar. |
## Zie ook

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
