---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapHeader class. Vertegenwoordigt de inhoud van de SOAP-header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Vertegenwoordigt de inhoud van de SOAP-header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SoapHeader : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Actor](./get_actor/)() | Haalt de URI op van de ontvanger van de SOAP-header wanneer SOAP-versie 1.1 wordt gebruikt. |
| [get_DidUnderstand](./get_didunderstand/)() | Haalt een waarde op die aangeeft of de SOAP-header correct is verwerkt. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Haalt een waarde op van het 'mustUnderstand'-attribuut wanneer SOAP-versie 1.1 wordt gebruikt. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Haalt een waarde op van het 'mustUnderstand'-attribuut wanneer SOAP-versie 1.2 wordt gebruikt. |
| [get_EncodedRelay](./get_encodedrelay/)() | Haalt een tekenreeksrepresentatie op van de waarde van het 'relay'-attribuut. |
| [get_MustUnderstand](./get_mustunderstand/)() | Haalt een waarde op die aangeeft of de SOAP-header begrepen moet worden. |
| [get_Relay](./get_relay/)() | Haalt een waarde op van het 'relay'-attribuut. |
| [get_Role](./get_role/)() | Haalt de URI op van de ontvanger van de SOAP-header wanneer SOAP-versie 1.2 wordt gebruikt. |
| [set_Actor](./set_actor/)(String) | Stelt de URI van de SOAP-headerontvanger in wanneer SOAP-versie 1.1 wordt gebruikt. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Stelt een waarde in die aangeeft of de SOAP-header correct is verwerkt. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Stelt een waarde in voor het 'mustUnderstand'-attribuut wanneer SOAP-versie 1.1 wordt gebruikt. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Stelt een waarde in voor het 'mustUnderstand'-attribuut wanneer SOAP-versie 1.2 wordt gebruikt. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Stelt een tekenreeksrepresentatie van de waarde van het 'relay'-attribuut in. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Stelt een waarde in die aangeeft of de SOAP-header begrepen moet worden. |
| [set_Relay](./set_relay/)(bool) | Stelt een waarde in voor het 'relay'-attribuut. |
| [set_Role](./set_role/)(String) | Stelt de URI van de SOAP-headerontvanger in wanneer SOAP-versie 1.2 wordt gebruikt. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
