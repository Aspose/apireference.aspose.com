---
title: "System::Xml::XmlUrlResolver‑klasse"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlUrlResolver‑klasse. Lost externe XML‑bronnen op die worden aangeduid met een Uniform Resource Identifier (URI) in C++."
type: docs
weight: 4100
url: /nl/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Lost externe XML‑bronnen op die worden genoemd door een Uniform Resource Identifier (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Koppelt een URI aan een object dat de daadwerkelijke bron bevat. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Lost de absolute URI op uit de basis‑ en relatieve URI’s. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Stelt het cache‑beleid in voor het onderliggende WebRequest‑object. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Stelt de inloggegevens in die worden gebruikt om webverzoeken te authenticeren. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Stelt de netwerkproxy in voor het onderliggende WebRequest‑object. |
| [XmlUrlResolver](./xmlurlresolver/)() | Initialiseert een nieuw exemplaar van de [XmlUrlResolver](./)-klasse. |
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
