---
title: "System::Xml::XmlSignificantWhitespace klasse"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlSignificantWhitespace klasse. Vertegenwoordigt witruimte tussen markup in een gemengde inhoudsknoop of witruimte binnen een xml:space=''preserve'' scope. Dit wordt ook aangeduid als significante witruimte in C++."
type: docs
weight: 3700
url: /nl/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


Stelt witruimte tussen markup in een gemengd‑inhoudknooppunt of witruimte binnen een **xml:space='preserve'**‑scope voor. Dit wordt ook wel significante witruimte genoemd.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_PreviousText](./get_previoustext/)() override | Geeft het tekstknooppunt dat dit knooppunt onmiddellijk voorafgaat terug. |
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

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
