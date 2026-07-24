---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs yapıcı"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs yapıcı. XmlNodeChangedEventArgs sınıfının yeni bir örneğini C++'ta başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Yeni bir [XmlNodeChangedEventArgs](../) sınıfı örneği başlatır.

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Etkinliği oluşturan [XmlNode](../../xmlnode/). |
| oldParent | const SharedPtr\<XmlNode\>\& | Etkinliği oluşturan [XmlNode](../../xmlnode/)'ın eski üst [XmlNode](../../xmlnode/). |
| newParent | const SharedPtr\<XmlNode\>\& | Etkinliği oluşturan [XmlNode](../../xmlnode/)'ın yeni üst [XmlNode](../../xmlnode/). |
| oldValue | const String\& | Etkinliği oluşturan [XmlNode](../../xmlnode/)'ın eski değeri. |
| newValue | const String\& | Etkinliği oluşturan [XmlNode](../../xmlnode/)'ın yeni değeri. |
| action | XmlNodeChangedAction | Bu [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
