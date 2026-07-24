---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page para C++"
description: "Constructor de System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. Inicializa una nueva instancia de la clase XmlNodeChangedEventArgs en C++."
type: docs
weight: 100
url: /es/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Inicializa una nueva instancia de la clase [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | El [XmlNode](../../xmlnode/) que generó el evento. |
| oldParent | const SharedPtr\<XmlNode\>\& | El padre anterior [XmlNode](../../xmlnode/) del [XmlNode](../../xmlnode/) que generó el evento. |
| newParent | const SharedPtr\<XmlNode\>\& | El nuevo padre [XmlNode](../../xmlnode/) del [XmlNode](../../xmlnode/) que generó el evento. |
| oldValue | const String\& | El valor anterior del [XmlNode](../../xmlnode/) que generó el evento. |
| newValue | const String\& | El nuevo valor del [XmlNode](../../xmlnode/) que generó el evento. |
| action | XmlNodeChangedAction | El [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
