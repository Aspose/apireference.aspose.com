---
title: "System::Xml::XmlNamedNodeMap klasse"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamedNodeMap klasse. Vertegenwoordigt een verzameling knooppunten die toegankelijk zijn via naam of index in C++."
type: docs
weight: 2200
url: /nl/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Stelt een verzameling knooppunten voor die toegankelijk zijn op naam of index.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [begin](./begin/)() const | Haalt iterator op naar het eerste element van de collectie. |
| [cbegin](./cbegin/)() const | Haalt iterator op naar het eerste element van de collectie. |
| [cend](./cend/)() const | Haalt iterator op voor een niet-bestaand element achter het laatste element van de collectie. |
| [end](./end/)() const | Haalt iterator op voor een niet-bestaand element achter het laatste element van de collectie. |
| virtual [get_Count](./get_count/)() | Retourneert het aantal knooppunten in de [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Biedt ondersteuning voor iteratie over de verzameling knooppunten in de [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Haalt een [XmlNode](../xmlnode/) op die op naam is gespecificeerd. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Haalt een knoop op met de overeenkomende [XmlNode::get_LocalName](../xmlnode/get_localname/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) waarden. |
| virtual [Item](./item/)(int32_t) | Haalt de knoop op op de opgegeven index in de [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Verwijdert de knoop uit de [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Verwijdert een knoop met de overeenkomende [XmlNode::get_LocalName](../xmlnode/get_localname/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) waarden. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Voegt een [XmlNode](../xmlnode/) toe met behulp van zijn [XmlNode::get_Name](../xmlnode/get_name/) waarde. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [iterator](./iterator/) | Iterator type. |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
