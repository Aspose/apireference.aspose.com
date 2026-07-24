---
title: "System::Xml::XPath::XPathNodeIterator class"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNodeIterator class. Biedt een iterator over een geselecteerde set knooppunten in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Biedt een iterator over een geselecteerde set knooppunten.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clone](./clone/)() | Wanneer overschreven in een afgeleide klasse, retourneert het een kloon van dit [XPathNodeIterator](./) object. |
| virtual [get_Count](./get_count/)() | Retourneert de index van het laatste knooppunt in de geselecteerde set knooppunten. |
| virtual [get_Current](./get_current/)() | Wanneer overschreven in een afgeleide klasse, haalt het de [XPathNavigator](../xpathnavigator/) object op voor deze [XPathNodeIterator](./), gepositioneerd op het huidige contextknooppunt. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Wanneer overschreven in een afgeleide klasse, haalt het de index op van de huidige positie in de geselecteerde set knooppunten. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een IEnumerator-object om door de geselecteerde knooppuntset te itereren. |
| virtual [MoveNext](./movenext/)() | Wanneer overschreven in een afgeleide klasse, verplaatst het de [XPathNavigator](../xpathnavigator/) object dat wordt geretourneerd door de [XPathNodeIterator::get_Current](./get_current/) methode naar het volgende knooppunt in de geselecteerde knooppuntset. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Initialiseert een nieuwe instantie van de [XPathNodeIterator](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
