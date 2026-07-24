---
title: "System::Xml::XmlSecureResolver klasse"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlSecureResolver klasse. Helpt een andere implementatie van XmlResolver te beveiligen door het XmlResolver-object te omhullen en de resources waartoe de onderliggende XmlResolver toegang heeft te beperken in C++."
type: docs
weight: 3600
url: /nl/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Helpt een andere implementatie van [XmlResolver](../xmlresolver/) te beveiligen door het [XmlResolver](../xmlresolver/) object te omhullen en de resources waartoe de onderliggende [XmlResolver](../xmlresolver/) toegang heeft te beperken.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Koppelt een URI aan een object dat de daadwerkelijke bron bevat. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Lost de absolute URI op vanuit de basis- en relatieve URI's door **ResolveUri** aan te roepen op de onderliggende [XmlResolver](../xmlresolver/). |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Stelt de inloggegevens in die worden gebruikt om webverzoeken te authenticeren. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Initialiseert een nieuw exemplaar van de [XmlSecureResolver](./) klasse met de opgegeven [XmlResolver](../xmlresolver/) en URL. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
