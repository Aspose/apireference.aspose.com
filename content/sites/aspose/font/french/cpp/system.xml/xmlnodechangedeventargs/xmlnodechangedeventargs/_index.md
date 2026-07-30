---
title: "Constructeur System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. Initialise une nouvelle instance de la classe XmlNodeChangedEventArgs en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Initialise une nouvelle instance de la classe [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Le [XmlNode](../../xmlnode/) qui a généré l'événement. |
| oldParent | const SharedPtr\<XmlNode\>\& | L'ancien parent [XmlNode](../../xmlnode/) du [XmlNode](../../xmlnode/) qui a généré l'événement. |
| newParent | const SharedPtr\<XmlNode\>\& | Le nouveau parent [XmlNode](../../xmlnode/) du [XmlNode](../../xmlnode/) qui a généré l'événement. |
| oldValue | const String\& | L'ancienne valeur du [XmlNode](../../xmlnode/) qui a généré l'événement. |
| newValue | const String\& | La nouvelle valeur du [XmlNode](../../xmlnode/) qui a généré l'événement. |
| action | XmlNodeChangedAction | Le [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
