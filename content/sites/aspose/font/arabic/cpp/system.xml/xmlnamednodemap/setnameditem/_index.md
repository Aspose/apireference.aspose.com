---
title: "طريقة System::Xml::XmlNamedNodeMap::SetNamedItem"
linktitle: "SetNamedItem"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNamedNodeMap::SetNamedItem. يضيف XmlNode باستخدام قيمته XmlNode::get_Name في C++."
type: docs
weight: 1000
url: /ar/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


يضيف [XmlNode](../../xmlnode/) باستخدام قيمته من خلال [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNode](../../xmlnode/) لتخزينه في [XmlNamedNodeMap](../). إذا كان هناك عقدة بهذا الاسم موجودة بالفعل في الخريطة، فسيتم استبدالها بالعقدة الجديدة. |

### ReturnValue

إذا كان **node** يستبدل عقدة موجودة بنفس الاسم، تُعاد العقدة القديمة؛ وإلا، تُعاد **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
