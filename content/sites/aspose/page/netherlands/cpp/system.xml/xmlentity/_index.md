---
title: "System::Xml::XmlEntity klasse"
linktitle: "XmlEntity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlEntity klasse. Vertegenwoordigt een entiteitsdeclaratie, zoals <!ENTITY... > in C++."
type: docs
weight: 1800
url: /nl/cpp/system.xml/xmlentity/
---
## XmlEntity class


Stelt een entiteitsdeclaratie voor, zoals **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. Entiteitknooppunten kunnen niet worden gekloond. Het aanroepen van deze methode op een [XmlEntity](./)‑object werpt een uitzondering. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis Uniform Resource Identifier (URI) van het huidige knooppunt. |
| [get_InnerText](./get_innertext/)() override | Retourneert de aaneengeschakelde waarden van het entiteitknooppunt en al zijn kinderen. |
| [get_InnerXml](./get_innerxml/)() override | Geeft de markup terug die de kinderen van dit knooppunt vertegenwoordigt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Geeft een waarde terug die aangeeft of het knooppunt alleen-lezen is. |
| [get_LocalName](./get_localname/)() override | Retourneert de naam van het knooppunt zonder het namespace‑voorvoegsel. |
| [get_Name](./get_name/)() override | Retourneert de naam van het knooppunt. |
| [get_NodeType](./get_nodetype/)() override | Geeft het type van het knooppunt terug. |
| [get_NotationName](./get_notationname/)() | Retourneert de naam van het optionele NDATA-attribuut in de entiteitsverklaring. |
| [get_OuterXml](./get_outerxml/)() override | Retourneert de markup die dit knooppunt en al zijn kinderen weergeeft. |
| [get_PublicId](./get_publicid/)() | Retourneert de waarde van de publieke identifier in de entiteitsverklaring. |
| [get_SystemId](./get_systemid/)() | Retourneert de waarde van de systeemidentifier in de entiteitsverklaring. |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van het entiteitsknooppunt en al zijn kinderen in. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de markup in die de kinderen van dit knooppunt weergeeft. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Voor [XmlEntity](./)-knooppunten heeft deze methode geen effect. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Voor [XmlEntity](./)-knooppunten heeft deze methode geen effect. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
