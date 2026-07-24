---
title: "System::Xml::XmlNotation klasse"
linktitle: "XmlNotation"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNotation klasse. Vertegenwoordigt een notatiedeclaratie, zoals <!NOTATION... > in C++."
type: docs
weight: 2900
url: /nl/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Stelt een notatiedeclaratie voor, zoals **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. Notatienodes kunnen niet worden gekloond. Het aanroepen van deze methode op een [XmlNotation](./) object werpt een uitzondering. |
| [get_InnerXml](./get_innerxml/)() override | Geeft de markup terug die de kinderen van dit knooppunt vertegenwoordigt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Geeft een waarde terug die aangeeft of het knooppunt alleen-lezen is. |
| [get_LocalName](./get_localname/)() override | Retourneert de naam van het huidige knooppunt zonder het namespace‑voorvoegsel. |
| [get_Name](./get_name/)() override | Retourneert de naam van het huidige knooppunt. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_OuterXml](./get_outerxml/)() override | Retourneert de markup die dit knooppunt en al zijn kinderen weergeeft. |
| [get_PublicId](./get_publicid/)() | Retourneert de waarde van de publieke identifier op de notatiedeclaratie. |
| [get_SystemId](./get_systemid/)() | Retourneert de waarde van de systeemidentifier op de notatiedeclaratie. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de markup in die de kinderen van dit knooppunt weergeeft. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat de kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Deze methode heeft geen effect op [XmlNotation](./)-knooppunten. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Deze methode heeft geen effect op [XmlNotation](./)-knooppunten. |
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
