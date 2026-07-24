---
title: "System::Xml::XmlWriter::WriteNode Methode"
linktitle: "WriteNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlWriter::WriteNode Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, kopiert sie alles vom Reader zum Writer und bewegt den Reader zum Beginn des nächsten Geschwisterelements in C++."
type: docs
weight: 2600
url: /de/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Wenn in einer abgeleiteten Klasse überschrieben, kopiert es alles vom Reader zum Writer und bewegt den Reader zum Anfang des nächsten Geschwisters.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Der [XmlReader](../../xmlreader/) zum Lesen. |
| defattr | bool | **true**, um die Standardattribute vom [XmlReader](../../xmlreader/) zu kopieren; andernfalls **false**. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Kopiert alles vom XPathNavigator‑Objekt zum Writer. Die Position des XPathNavigator bleibt unverändert.

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
* Library [Aspose.Page for C++](../../../)
