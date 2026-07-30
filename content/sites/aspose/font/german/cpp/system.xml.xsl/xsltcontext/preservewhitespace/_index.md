---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace Methode"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, bewertet sie, ob Whitespace‑Knoten für den gegebenen Kontext in C++ erhalten oder entfernt werden sollen."
type: docs
weight: 300
url: /de/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Wenn in einer abgeleiteten Klasse überschrieben, bewertet sie, ob Leerzeichenknoten für den gegebenen Kontext erhalten oder entfernt werden sollen.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Knoten | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Der Whitespace‑Knoten, der im aktuellen Kontext erhalten oder entfernt werden soll. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
