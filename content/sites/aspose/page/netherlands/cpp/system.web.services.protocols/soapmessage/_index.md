---
title: "System::Web::Services::Protocols::SoapMessage klasse"
linktitle: "SoapMessage"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapMessage klasse. Vertegenwoordigt het SOAP-bericht. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1000
url: /nl/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Vertegenwoordigt het SOAP-bericht. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class SoapMessage : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Stelt de interne collectie van de SOAP-headers in. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Zoek de header‑mapping op basis van het opgegeven header‑type. |
| virtual [get_Action](./get_action/)() | Retourneert een waarde van het 'SOAPAction'-attribuut. |
| [get_ContentEncoding](./get_contentencoding/)() | Haalt een waarde op van de 'Content-Encoding'-header. |
| [get_ContentType](./get_contenttype/)() | Haalt een waarde op van de 'Content-Type'-header. |
| [get_Exception](./get_exception/)() | Haalt de uitzondering op die wordt gegooid door de XML [Web](../../system.web/) service‑methode. |
| [get_Headers](./get_headers/)() | Retourneert de collectie van de SOAP-headers. |
| [get_InParameters](./get_inparameters/)() | Haalt de parameters op die worden doorgegeven aan de XML [Web](../../system.web/) service‑methode. |
| [get_IsSoap12](./get_issoap12/)() | Retourneert een waarde die aangeeft of SOAP‑versie 1.2 wordt gebruikt. |
| [get_OutParameters](./get_outparameters/)() | Haalt de output‑parameters op die worden doorgegeven aan de XML [Web](../../system.web/) service‑methode. |
| virtual [get_SoapVersion](./get_soapversion/)() | Retourneert de gebruikte SOAP‑versie. |
| [get_Stage](./get_stage/)() | Haalt de verwerkingsfase van een SOAP‑bericht op. |
| [get_Stream](./get_stream/)() | Haalt de stream op die de SOAP‑berichtgegevens bevat. |
| virtual [get_Url](./get_url/)() | Retourneert de XML [Web](../../system.web/) service‑URL. |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Haalt de waarde van de invoerparameter op op de opgegeven index. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Haalt de waarde van de uitvoerparameter op op de opgegeven index. |
| [GetReturnValue](./getreturnvalue/)() | Haalt de retourwaarde op van de XML [Web](../../system.web/) servicemethode. |
| [set_ContentEncoding](./set_contentencoding/)(String) | Stelt een waarde in van de 'Content-Encoding' header. |
| [set_ContentType](./set_contenttype/)(String) | Stelt een waarde in voor de 'Content-Type'-header. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Stelt de parameters in die worden doorgegeven aan de XML [Web](../../system.web/) servicemethode. |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Stelt de stream in die de SOAP-berichtgegevens bevat. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Stelt de uitvoerparameters in die worden doorgegeven aan de XML [Web](../../system.web/) servicemethode. |
| [SetException](./setexception/)(SoapException) | Stelt de uitzondering in die wordt gegooid door de XML [Web](../../system.web/) servicemethode. |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Stelt de collectie van de SOAP-headers in. |
| [SetStage](./setstage/)(SoapMessageStage) | Stelt de verwerkingsfase van het SOAP-bericht in. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Stelt de stream in die de SOAP-berichtgegevens bevat. |
| [SoapMessage](./soapmessage/)() | Construeert een nieuw exemplaar. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Werk de interne collectie van de SOAP-headers bij. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
