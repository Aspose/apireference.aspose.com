---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs yapıcı"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs yapıcı. C++'ta XmlNodeChangedEventArgs sınıfının yeni bir örneğini başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


Yeni bir [XmlNodeChangedEventArgs](../) sınıf örneği başlatır.

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | Olayı oluşturan [XmlNode](../../xmlnode/). |
| oldParent | const SharedPtr\<XmlNode\>\& | Olayı oluşturan [XmlNode](../../xmlnode/)'in eski üst [XmlNode](../../xmlnode/). |
| newParent | const SharedPtr\<XmlNode\>\& | Olayı oluşturan [XmlNode](../../xmlnode/)'in yeni üst [XmlNode](../../xmlnode/). |
| oldValue | const String\& | Olayı oluşturan [XmlNode](../../xmlnode/)'in eski değeri. |
| newValue | const String\& | Olayı oluşturan [XmlNode](../../xmlnode/)'in yeni değeri. |
| action | XmlNodeChangedAction | Bu [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
