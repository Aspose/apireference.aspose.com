---
title: "طريقة System::Xml::XmlAttributeCollection::SetNamedItem"
linktitle: "SetNamedItem"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlAttributeCollection::SetNamedItem. يضيف XmlNode باستخدام نتيجة XmlNode::get_Name في C++."
type: docs
weight: 1000
url: /ar/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


يضيف [XmlNode](../../xmlnode/) باستخدام نتيجته [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| العقدة | SharedPtr\<XmlNode\> | عقدة سمة لتخزينها في هذه المجموعة. ستصبح العقدة قابلة للوصول لاحقًا باستخدام اسم العقدة. إذا كانت هناك عقدة بهذا الاسم موجودة بالفعل في المجموعة، يتم استبدالها بالجديدة؛ وإلا، تُضاف العقدة إلى نهاية المجموعة. |

### ReturnValue

إذا كان **node** يستبدل عقدة موجودة بنفس الاسم، تُعاد العقدة القديمة؛ وإلا تُعاد العقدة المضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
