---
title: "طريقة System::Xml::XmlAttribute::PrependChild"
linktitle: "PrependChild"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlAttribute::PrependChild. يضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


يضيف العقدة المحددة إلى بداية قائمة العقد الفرعية لهذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | العقدة [XmlNode](../../xmlnode/) المراد إضافتها. إذا كانت [XmlDocumentFragment](../../xmldocumentfragment/)، يتم نقل كامل محتويات مقطع المستند إلى قائمة العقد الفرعية لهذه العقدة. |

### ReturnValue

العقدة [XmlNode](../../xmlnode/) المضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
