---
title: "طريقة System::Xml::XmlElement::RemoveAttributeNode"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlElement::RemoveAttributeNode. تُزيل الـ XmlAttribute المحدد في C++."
type: docs
weight: 2100
url: /ar/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


تُزيل الـ [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | عقدة [XmlAttribute](../../xmlattribute/) التي سيتم إزالتها. إذا كان للخاصية المُزالة قيمة افتراضية، يتم استبدالها فورًا. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) المُزالة أو **nullptr** إذا كان **oldAttr** ليس عقدة خاصية من [XmlElement](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


تُزيل الـ [XmlAttribute](../../xmlattribute/) المحدد بالاسم المحلي ومسار URI للمساحة الاسمية. (إذا كان للخاصية المُزالة قيمة افتراضية، يتم استبدالها فورًا).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

العنصر [XmlAttribute](../../xmlattribute/) المُزال أو **nullptr** إذا لم يكن لدى [XmlElement](../) عقدة سمة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
