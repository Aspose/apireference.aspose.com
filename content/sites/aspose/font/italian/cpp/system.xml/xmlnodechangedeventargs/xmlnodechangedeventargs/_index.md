---
title: "costruttore System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font per C++"
description: "costruttore System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. Inizializza una nuova istanza della classe XmlNodeChangedEventArgs in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Inizializza una nuova istanza della classe [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Il [XmlNode](../../xmlnode/) che ha generato l'evento. |
| oldParent | const SharedPtr\<XmlNode\>\& | Il vecchio genitore [XmlNode](../../xmlnode/) del [XmlNode](../../xmlnode/) che ha generato l'evento. |
| newParent | const SharedPtr\<XmlNode\>\& | Il nuovo genitore [XmlNode](../../xmlnode/) del [XmlNode](../../xmlnode/) che ha generato l'evento. |
| oldValue | const String\& | Il vecchio valore del [XmlNode](../../xmlnode/) che ha generato l'evento. |
| newValue | const String\& | Il nuovo valore del [XmlNode](../../xmlnode/) che ha generato l'evento. |
| action | XmlNodeChangedAction | Il [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
