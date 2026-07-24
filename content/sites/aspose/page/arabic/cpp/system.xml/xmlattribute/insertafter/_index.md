---
title: "System::Xml::XmlAttribute::InsertAfter طريقة"
linktitle: "InsertAfter"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlAttribute::InsertAfter طريقة. يُدرج العقدة المحددة مباشرةً بعد عقدة المرجع المحددة في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


يدرج العقدة المحددة مباشرةً بعد عقدة المرجع المحددة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | العنصر [XmlNode](../../xmlnode/) المراد إدراجه. |
| refChild | SharedPtr\<XmlNode\> | العنصر [XmlNode](../../xmlnode/) الذي هو عقدة المرجع. الـ **newChild** يُوضع بعد الـ **refChild**. |

### ReturnValue

العنصر [XmlNode](../../xmlnode/) المُدرج.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
