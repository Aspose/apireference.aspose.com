---
title: "طريقة System::Xml::XmlElement::RemoveAttributeNode"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlElement::RemoveAttributeNode. تقوم بإزالة XmlAttribute المحدد في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


يزيل [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | العقدة [XmlAttribute](../../xmlattribute/) التي سيتم إزالتها. إذا كان للخاصية التي أزيلت قيمة افتراضية، يتم استبدالها فورًا. |

### ReturnValue

السمة [XmlAttribute](../../xmlattribute/) التي أزيلت أو **nullptr** إذا لم يكن **oldAttr** عقدة سمة في [XmlElement](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


يزيل [XmlAttribute](../../xmlattribute/) المحدد بالاسم المحلي ومسار مساحة الاسم. (إذا كان للخاصية التي أزيلت قيمة افتراضية، يتم استبدالها فورًا).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للسمة. |
| namespaceURI | String | مسار مساحة الاسم للسمة. |

### ReturnValue

السمة [XmlAttribute](../../xmlattribute/) التي أزيلت أو **nullptr** إذا لم يكن لدى [XmlElement](../) عقدة سمة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
