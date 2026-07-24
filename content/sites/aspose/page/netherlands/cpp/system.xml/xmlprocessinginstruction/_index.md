---
title: "System::Xml::XmlProcessingInstruction class"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlProcessingInstruction class. Vertegenwoordigt een verwerkingsinstructie, die XML definieert om processor-specifieke informatie in de tekst van het document te behouden in C++."
type: docs
weight: 3100
url: /nl/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


Stelt een verwerkingsinstructie voor, die XML definieert om processor‑specifieke informatie in de tekst van het document te behouden.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [get_Data](./get_data/)() | Retourneert de inhoud van de verwerkingsinstructie, exclusief het doel. |
| [get_InnerText](./get_innertext/)() override | Retourneert de samengevoegde waarden van het knooppunt en al zijn kinderen. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Target](./get_target/)() | Retourneert het doel van de verwerkingsinstructie. |
| [get_Value](./get_value/)() override | Geeft de waarde van het knooppunt terug. |
| [set_Data](./set_data/)(const String\&) | Stelt de inhoud van de verwerkingsinstructie in, exclusief het doel. |
| [set_InnerText](./set_innertext/)(String) override | Stelt de samengevoegde waarden van het knooppunt en al zijn kinderen in. |
| [set_Value](./set_value/)(String) override | Stelt de waarde van het knooppunt in. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/). Omdat ProcessingInstruction-knooppunten geen kinderen hebben, heeft deze methode geen effect. |
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
