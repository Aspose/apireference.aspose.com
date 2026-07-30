---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute Methode"
linktitle: "CreateAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute Methode. Erstellt einen Attributknoten im aktuellen Elementknoten unter Verwendung des Namespace-Präfixes, des lokalen Namens und des Namespace-URI, die zusammen mit dem angegebenen Wert in C++ spezifiziert werden."
type: docs
weight: 700
url: /de/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


Erstellt einen Attributknoten im aktuellen Elementknoten unter Verwendung des angegebenen Namespace-Präfixes, des lokalen Namens und des angegebenen Namespace-URI mit dem angegebenen Wert.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Präfix | String | Das Namespace-Präfix des neuen Attributknotens (falls vorhanden). |
| localName | String | Der lokale Name des neuen Attributknotens, der nicht [String::Empty](../../../system/string/empty/) oder **nullptr** sein darf. |
| namespaceURI | String | Der Namespace-URI für den neuen Attributknoten (falls vorhanden). |
| value | String | Der Wert des neuen Attributknotens. Wenn [String::Empty](../../../system/string/empty/) oder **nullptr** übergeben werden, wird ein leerer Attributknoten erstellt. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
