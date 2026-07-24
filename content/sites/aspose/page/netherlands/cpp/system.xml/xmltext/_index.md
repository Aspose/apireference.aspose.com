---
title: "System::Xml::XmlText class"
linktitle: "XmlText"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlText class. Vertegenwoordigt de tekstinhoud van een element of attribuut in C++."
type: docs
weight: 3800
url: /nl/cpp/system.xml/xmltext/
---
## XmlText class


Stelt de tekstinhoud van een element of attribuut voor.

```cpp
class XmlText : public System::Xml::XmlCharacterData
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
| virtual [SplitText](./splittext/)(int32_t) | Splitst de knoop in twee knopen op de opgegeven offset, waarbij beide in de boom als broers en zussen behouden blijven. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). [XmlText](./)-knooppunten hebben geen kinderen, dus deze methode heeft geen effect. |
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
