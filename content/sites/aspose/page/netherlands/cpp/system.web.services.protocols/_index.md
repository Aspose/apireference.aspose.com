---
title: "System::Web::Services::Protocols-namespace"
linktitle: "System::Web::Services::Protocols"
second_title: "Aspose.Page voor C++"
description: "Hoe de System::Web::Services::Protocols-namespace te gebruiken in C++."
type: docs
weight: 7100
url: /nl/cpp/system.web.services.protocols/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [HttpWebClientProtocol](./httpwebclientprotocol/) | Deze basisklasse wordt gebruikt in alle XML [Web](../system.web/) serviceclient‑proxy’s die HTTP gebruiken. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om het als argument aan functies door te geven. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/) | Een instantie van deze klasse wordt als argument doorgegeven aan de delegate InvokeCompletedEventHandler. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om het als argument aan functies door te geven. |
| [SoapClientMessage](./soapclientmessage/) | Stelt de gegevens in een verzonden SOAP‑verzoek of een ontvangen SOAP‑respons voor. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om het als argument aan functies door te geven. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/) | Specificeert dat alle SOAP-berichten die aan de methode worden doorgegeven of ervan worden geretourneerd de Document-opmaak gebruiken. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/) | Stelt het standaardformaat in voor de SOAP‑verzoeken en -responsen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SoapHeader](./soapheader/) | Stelt de inhoud van de SOAP‑header voor. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SoapHeaderAttribute](./soapheaderattribute/) | Specificeert de SOAP‑header die de XML‑[Web](../system.web/) servicemethode of de XML‑[Web](../system.web/) serviceclient kan verwerken. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SoapHeaderCollection](./soapheadercollection/) | Bevat een verzameling van instanties van de klasse [SoapHeader](./soapheader/). |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/) | De client‑proxyservices moeten deze klasse erven wanneer SOAP wordt gebruikt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [SoapMessage](./soapmessage/) | Stelt het SOAP‑bericht voor. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [WebClientProtocol](./webclientprotocol/) | Deze basisklasse wordt gebruikt in alle XML‑[Web](../system.web/) serviceclient‑proxy's die met ASP.NET zijn gemaakt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
## Enums

| Enum | Beschrijving |
| --- | --- |
| [SoapHeaderDirection](./soapheaderdirection/) | Enumereert de richtingen van de SOAP‑header. |
| [SoapMessageStage](./soapmessagestage/) | Enumereert de verwerkingsstadia van de SOAP‑berichten. |
| [SoapParameterStyle](./soapparameterstyle/) | Enumereert de parameterformaten in een SOAP‑bericht. |
| [SoapProtocolVersion](./soapprotocolversion/) | Enumereert de versies van SOAP. |
| [SoapServiceRoutingStyle](./soapserviceroutingstyle/) | Enumereert opties voor hoe een SOAP‑bericht wordt gerouteerd naar de XML‑[Web](../system.web/) service. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [SoapException](./soapexception/) |  |
