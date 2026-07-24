---
title: "System::Web::Services::Protocols::SoapClientMessage class"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapClientMessage class. Vertegenwoordigt de gegevens in een verzonden SOAP‑verzoek of een ontvangen SOAP‑respons. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Vertegenwoordigt de gegevens in een verzonden SOAP‑verzoek of een ontvangen SOAP‑respons. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Action](./get_action/)() override | Retourneert een waarde van het 'SOAPAction'-attribuut. |
| [get_Client](./get_client/)() | Retourneert een instantie van de client‑proxyklasse. |
| virtual [get_OneWay](./get_oneway/)() | Retourneert een waarde die aangeeft of een client niet wacht tot een server klaar is met het verwerken van een methode. |
| [get_SoapVersion](./get_soapversion/)() override | Retourneert de gebruikte SOAP‑versie. |
| [get_Url](./get_url/)() override | Retourneert de XML [Web](../../system.web/) service‑URL. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
