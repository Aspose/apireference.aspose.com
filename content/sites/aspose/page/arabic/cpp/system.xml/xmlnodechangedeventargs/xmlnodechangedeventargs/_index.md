---
title: "منشئ System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. يهيئ مثيلًا جديدًا من الفئة XmlNodeChangedEventArgs في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


يهيئ مثيلًا جديدًا من الفئة [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | الـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| oldParent | const SharedPtr\<XmlNode\>\& | الأب القديم [XmlNode](../../xmlnode/) للـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| newParent | const SharedPtr\<XmlNode\>\& | الأب الجديد [XmlNode](../../xmlnode/) للـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| oldValue | const String\& | القيمة القديمة للـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| newValue | const String\& | القيمة الجديدة للـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| action | XmlNodeChangedAction | الـ [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
