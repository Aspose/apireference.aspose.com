---
title: "System::Xml::XmlWriter::WriteNode methode"
linktitle: "WriteNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlWriter::WriteNode methode. Wanneer overschreven in een afgeleide klasse, kopieert het alles van de lezer naar de schrijver en verplaatst de lezer naar het begin van de volgende sibling in C++."
type: docs
weight: 2600
url: /nl/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Wanneer overschreven in een afgeleide klasse, kopieert alles van de lezer naar de schrijver en verplaatst de lezer naar het begin van de volgende sibling.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | De [XmlReader](../../xmlreader/) om van te lezen. |
| defattr | bool | **true** om de standaardattributen van de [XmlReader](../../xmlreader/) te kopiëren; anders **false**. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Kopieert alles van het XPathNavigator‑object naar de schrijver. De positie van de XPathNavigator blijft ongewijzigd.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | De XPathNavigator om van te kopiëren. |
| defattr | bool | **true** om de standaardattributen te kopiëren; anders **false**. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
