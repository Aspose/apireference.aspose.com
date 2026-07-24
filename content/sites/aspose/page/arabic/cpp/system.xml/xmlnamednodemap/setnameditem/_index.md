---
title: "طريقة System::Xml::XmlNamedNodeMap::SetNamedItem"
linktitle: "SetNamedItem"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNamedNodeMap::SetNamedItem. تُضيف XmlNode باستخدام قيمته XmlNode::get_Name في C++."
type: docs
weight: 1000
url: /ar/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


تضيف [XmlNode](../../xmlnode/) باستخدام قيمته [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNode](../../xmlnode/) لتخزينه في [XmlNamedNodeMap](../). إذا كان هناك عقدة بهذا الاسم موجودة بالفعل في الخريطة، يتم استبدالها بالجديدة. |

### ReturnValue

إذا كان **node** يستبدل عقدة موجودة بنفس الاسم، تُرجع العقدة القديمة؛ وإلا تُرجع **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
