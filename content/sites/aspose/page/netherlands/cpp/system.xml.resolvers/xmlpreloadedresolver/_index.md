---
title: "System::Xml::Resolvers::XmlPreloadedResolver klasse"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver klasse. Vertegenwoordigt een klasse die wordt gebruikt om de cache vooraf te vullen met DTD's of XML‑streams in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Stelt een klasse voor die wordt gebruikt om de cache vooraf te vullen met DTD's of XML‑streams.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Voegt een byte‑array toe aan de [XmlPreloadedResolver](./) opslag en koppelt deze aan een URI. Als de opslag al een koppeling voor dezelfde URI bevat, wordt de bestaande koppeling overschreven. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Voegt een byte‑array toe aan de [XmlPreloadedResolver](./) opslag en koppelt deze aan een URI. Als de opslag al een koppeling voor dezelfde URI bevat, wordt de bestaande koppeling overschreven. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Voegt een Stream toe aan de [XmlPreloadedResolver](./) opslag en koppelt deze aan een URI. Als de opslag al een koppeling voor dezelfde URI bevat, wordt de bestaande koppeling overschreven. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Voegt een tekenreeks met vooraf geladen gegevens toe aan de [XmlPreloadedResolver](./) opslag en koppelt deze aan een URI. Als de opslag al een koppeling voor dezelfde URI bevat, wordt de bestaande koppeling overschreven. |
| [get_PreloadedUris](./get_preloadeduris/)() | Retourneert een verzameling van vooraf geladen URI's. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Koppelt een URI aan een object dat de daadwerkelijke bron bevat. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Verwijdert de gegevens die overeenkomen met de URI uit de [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Lost de absolute URI op uit de basis‑ en relatieve URI’s. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Stelt de referenties in die worden gebruikt om de onderliggende [Net::WebRequest](../../system.net/webrequest/) te authenticeren. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Bepaalt of de resolver andere Types ondersteunt dan alleen Stream. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Initialiseert een nieuw exemplaar van de [XmlPreloadedResolver](./) klasse. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Initialiseert een nieuw exemplaar van de [XmlPreloadedResolver](./) klasse met de opgegeven vooraf geladen bekende DTD's. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Initialiseert een nieuw exemplaar van de [XmlPreloadedResolver](./) klasse met de opgegeven fallback‑resolver. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Initialiseert een nieuw exemplaar van de [XmlPreloadedResolver](./) klasse met de opgegeven fallback‑resolver en vooraf geladen bekende DTD's. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Initialiseert een nieuw exemplaar van de [XmlPreloadedResolver](./) klasse met de opgegeven fallback‑resolver, vooraf geladen bekende DTD's, en een URI‑gelijkheidsvergelijker. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
