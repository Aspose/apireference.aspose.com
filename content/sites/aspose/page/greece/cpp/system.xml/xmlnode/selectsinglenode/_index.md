---
title: "System::Xml::XmlNode::SelectSingleNode μέθοδος"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::SelectSingleNode μέθοδος. Επιλέγει τον πρώτο XmlNode που ταιριάζει με την έκφραση XPath σε C++."
type: docs
weight: 3900
url: /el/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Επιλέγει τον πρώτο [XmlNode](../) που ταιριάζει με την έκφραση [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | const String\& | Η έκφραση [XPath](../../../system.xml.xpath/). |

### ReturnValue

Ο πρώτος [XmlNode](../) που ταιριάζει με το ερώτημα [XPath](../../../system.xml.xpath/) ή **nullptr** εάν δεν βρεθεί αντίστοιχο κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Επιλέγει τον πρώτο [XmlNode](../) που ταιριάζει με την έκφραση [XPath](../../../system.xml.xpath/). Οποιοδήποτε πρόθεμα που βρεθεί στην έκφραση [XPath](../../../system.xml.xpath/) επιλύεται χρησιμοποιώντας το παρεχόμενο [XmlNamespaceManager](../../xmlnamespacemanager/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xpath | const String\& | Η έκφραση [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Ένας [XmlNamespaceManager](../../xmlnamespacemanager/) για χρήση στην επίλυση ονοματοχώρων για προθέματα στην έκφραση [XPath](../../../system.xml.xpath/). |

### ReturnValue

Ο πρώτος [XmlNode](../) που ταιριάζει με το ερώτημα [XPath](../../../system.xml.xpath/) ή **nullptr** εάν δεν βρεθεί αντίστοιχο κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
