---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::SelectNodes method. Επιλέγει μια λίστα κόμβων που ταιριάζουν με την έκφραση XPath σε C++."
type: docs
weight: 3800
url: /el/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Επιλέγει μια λίστα κόμβων που ταιριάζουν με την έκφραση [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | const String\& | Η έκφραση [XPath](../../../system.xml.xpath/). |

### ReturnValue

Μια [XmlNodeList](../../xmlnodelist/) που περιέχει μια συλλογή κόμβων που ταιριάζουν με το ερώτημα [XPath](../../../system.xml.xpath/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Επιλέγει μια λίστα κόμβων που ταιριάζουν με την έκφραση [XPath](../../../system.xml.xpath/). Οποιοδήποτε πρόθεμα βρεθεί στην έκφραση [XPath](../../../system.xml.xpath/) επιλύεται χρησιμοποιώντας τον παρεχόμενο [XmlNamespaceManager](../../xmlnamespacemanager/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | const String\& | Η έκφραση [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Ένας [XmlNamespaceManager](../../xmlnamespacemanager/) για χρήση στην επίλυση ονοματοχώρων για προθέματα στην έκφραση [XPath](../../../system.xml.xpath/). |

### ReturnValue

Μια [XmlNodeList](../../xmlnodelist/) που περιέχει μια συλλογή κόμβων που ταιριάζουν με το ερώτημα [XPath](../../../system.xml.xpath/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
