---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor. Initialiseert een nieuw exemplaar van de XmlNodeChangedEventArgs‑klasse in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Initialiseert een nieuw exemplaar van de [XmlNodeChangedEventArgs](../) klasse.

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | De [XmlNode](../../xmlnode/) die het evenement heeft gegenereerd. |
| oldParent | const SharedPtr\<XmlNode\>\& | De oude bovenliggende [XmlNode](../../xmlnode/) van de [XmlNode](../../xmlnode/) die het evenement heeft gegenereerd. |
| newParent | const SharedPtr\<XmlNode\>\& | De nieuwe bovenliggende [XmlNode](../../xmlnode/) van de [XmlNode](../../xmlnode/) die het evenement heeft gegenereerd. |
| oldValue | const String\& | De oude waarde van de [XmlNode](../../xmlnode/) die het evenement heeft gegenereerd. |
| newValue | const String\& | De nieuwe waarde van de [XmlNode](../../xmlnode/) die het evenement heeft gegenereerd. |
| action | XmlNodeChangedAction | De [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
