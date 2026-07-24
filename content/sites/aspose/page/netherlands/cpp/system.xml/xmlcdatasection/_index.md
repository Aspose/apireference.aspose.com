---
title: "System::Xml::XmlCDataSection klasse"
linktitle: "XmlCDataSection"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlCDataSection klasse. Vertegenwoordigt een CDATA‑sectie in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml/xmlcdatasection/
---
## XmlCDataSection class


Stelt een CDATA‑sectie voor.

```cpp
class XmlCDataSection : public System::Xml::XmlCharacterData
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_PreviousText](./get_previoustext/)() override | Geeft het tekstknooppunt dat dit knooppunt onmiddellijk voorafgaat terug. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat de kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
