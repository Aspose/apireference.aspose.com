---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs-Konstruktor"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs-Konstruktor. Initialisiert eine neue Instanz der XmlNodeChangedEventArgs-Klasse in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Initialisiert eine neue Instanz der [XmlNodeChangedEventArgs](../)-Klasse.

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Der [XmlNode](../../xmlnode/), der das Ereignis ausgelöst hat. |
| oldParent | const SharedPtr\<XmlNode\>\& | Der alte übergeordnete [XmlNode](../../xmlnode/) des [XmlNode](../../xmlnode/), der das Ereignis ausgelöst hat. |
| newParent | const SharedPtr\<XmlNode\>\& | Der neue übergeordnete [XmlNode](../../xmlnode/) des [XmlNode](../../xmlnode/), der das Ereignis ausgelöst hat. |
| oldValue | const String\& | Der alte Wert des [XmlNode](../../xmlnode/), der das Ereignis ausgelöst hat. |
| newValue | const String\& | Der neue Wert des [XmlNode](../../xmlnode/), der das Ereignis ausgelöst hat. |
| action | XmlNodeChangedAction | Der [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
