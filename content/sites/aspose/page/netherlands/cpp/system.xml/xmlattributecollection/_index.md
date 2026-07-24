---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlAttributeCollection class. Vertegenwoordigt een verzameling attributen die in C++ toegankelijk zijn via naam of index."
type: docs
weight: 700
url: /nl/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Stelt een verzameling attributen voor die toegankelijk zijn op naam of index.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Voegt het opgegeven attribuut in als het laatste knooppunt in de collectie. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Kopieert alle [XmlAttribute](../xmlattribute/) objecten uit deze collectie naar de opgegeven array. |
| [idx_get](./idx_get/)(int32_t) | Retourneert het attribuut met de opgegeven index. |
| [idx_get](./idx_get/)(const String\&) | Retourneert het attribuut met de opgegeven naam. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Retourneert het attribuut met de opgegeven lokale naam en namespace Uniform Resource Identifier (URI). |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Voegt het opgegeven attribuut direct na het opgegeven referentie‑attribuut in. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Voegt het opgegeven attribuut direct vóór het opgegeven referentie‑attribuut in. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Voegt het opgegeven attribuut als het eerste knooppunt in de collectie in. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Verwijdert het opgegeven attribuut uit de collectie. |
| [RemoveAll](./removeall/)() | Verwijdert alle attributen uit de collectie. |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert het attribuut dat overeenkomt met de opgegeven index uit de collectie. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Voegt een [XmlNode](../xmlnode/) toe met behulp van het resultaat van zijn [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
