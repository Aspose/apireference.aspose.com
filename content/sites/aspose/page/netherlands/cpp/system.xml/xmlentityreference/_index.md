---
title: "System::Xml::XmlEntityReference class"
linktitle: "XmlEntityReference"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlEntityReference class. Vertegenwoordigt een entiteit-referentieknooppunt in C++."
type: docs
weight: 1900
url: /nl/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Stelt een entiteitsreferatieknooppunt voor.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis Uniform Resource Identifier (URI) van het huidige knooppunt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Geeft een waarde terug die aangeeft of het knooppunt alleen-lezen is. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Retourneert de naam van het knooppunt. |
| [get_NodeType](./get_nodetype/)() override | Geeft het type van het knooppunt terug. |
| [get_Value](./get_value/)() override | Geeft de waarde van het knooppunt terug. |
| [set_Value](./set_value/)(String) override | Stelt de waarde van het knooppunt in. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
