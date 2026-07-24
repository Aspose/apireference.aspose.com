---
title: "System::Xml::XmlDocumentFragment class"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocumentFragment class. Vertegenwoordigt een lichtgewicht object dat nuttig is voor boom-invoegbewerkingen in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Stelt een lichtgewicht object voor dat nuttig is voor boom‑invoegbewerkingen.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_InnerXml](./get_innerxml/)() override | Geeft de markup terug die de kinderen van dit knooppunt vertegenwoordigt. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Retourneert het [XmlDocument](../xmldocument/) waartoe dit knooppunt behoort. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de markup in die de kinderen van dit knooppunt weergeeft. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
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
