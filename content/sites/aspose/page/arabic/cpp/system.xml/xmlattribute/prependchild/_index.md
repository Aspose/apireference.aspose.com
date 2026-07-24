---
title: "طريقة System::Xml::XmlAttribute::PrependChild"
linktitle: "PrependChild"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlAttribute::PrependChild. تُضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


يضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | [XmlNode](../../xmlnode/) لإضافتها. إذا كانت [XmlDocumentFragment](../../xmldocumentfragment/)، يتم نقل كامل محتويات مقطع المستند إلى قائمة العقد الفرعية لهذه العقدة. |

### ReturnValue

العنصر [XmlNode](../../xmlnode/) المُضاف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
