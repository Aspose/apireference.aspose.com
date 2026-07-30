---
title: "System::Xml::XmlWriter::WriteNode Methode"
linktitle: "WriteNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlWriter::WriteNode Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, kopiert sie alles vom Reader zum Writer und bewegt den Reader an den Anfang des nächsten Geschwisterelements in C++."
type: docs
weight: 2600
url: /de/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Wenn in einer abgeleiteten Klasse überschrieben, kopiert alles vom reader zum writer und bewegt den reader zum Beginn des nächsten Geschwisterelements.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Der [XmlReader](../../xmlreader/) zum Lesen. |
| defattr | bool | **true**, um die Standardattribute aus dem [XmlReader](../../xmlreader/) zu kopieren; andernfalls **false**. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Kopiert alles vom XPathNavigator-Objekt zum writer. Die Position des XPathNavigator bleibt unverändert.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Navigator | SharedPtr\<XPath::XPathNavigator\> | Der XPathNavigator zum Kopieren. |
| defattr | bool | **true** zum Kopieren der Standardattribute; andernfalls **false**. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
