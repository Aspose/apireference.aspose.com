---
title: "منشئ System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs. يُنشئ مثيلاً جديداً من الفئة XmlNodeChangedEventArgs في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


يُنشئ مثيلاً جديداً من الفئة [XmlNodeChangedEventArgs](../).

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| oldParent | const SharedPtr\<XmlNode\>\& | العقدة الأصلية القديمة [XmlNode](../../xmlnode/) لـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| newParent | const SharedPtr\<XmlNode\>\& | العقدة الأصلية الجديدة [XmlNode](../../xmlnode/) لـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| oldValue | const String\& | القيمة القديمة لـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| newValue | const String\& | القيمة الجديدة لـ [XmlNode](../../xmlnode/) الذي أنشأ الحدث. |
| action | XmlNodeChangedAction | الـ [XmlNodeChangedAction](../../xmlnodechangedaction/). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
