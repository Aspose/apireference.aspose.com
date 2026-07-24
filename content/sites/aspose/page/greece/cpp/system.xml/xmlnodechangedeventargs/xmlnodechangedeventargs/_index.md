---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs κατασκευαστής"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs κατασκευαστής. Αρχικοποιεί μια νέα παρουσία της κλάσης XmlNodeChangedEventArgs σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Το [XmlNode](../../xmlnode/) που δημιούργησε το συμβάν. |
| oldParent | const SharedPtr\<XmlNode\>\& | Ο παλιός γονέας [XmlNode](../../xmlnode/) του [XmlNode](../../xmlnode/) που δημιούργησε το συμβάν. |
| newParent | const SharedPtr\<XmlNode\>\& | Ο νέος γονέας [XmlNode](../../xmlnode/) του [XmlNode](../../xmlnode/) που δημιούργησε το συμβάν. |
| oldValue | const String\& | Η παλιά τιμή του [XmlNode](../../xmlnode/) που δημιούργησε το συμβάν. |
| newValue | const String\& | Η νέα τιμή του [XmlNode](../../xmlnode/) που δημιούργησε το συμβάν. |
| action | XmlNodeChangedAction | Το [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
