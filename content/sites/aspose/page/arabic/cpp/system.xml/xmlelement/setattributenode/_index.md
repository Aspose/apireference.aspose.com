---
title: "System::Xml::XmlElement::SetAttributeNode method"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlElement::SetAttributeNode. يضيف XmlAttribute المحدد في C++."
type: docs
weight: 2700
url: /ar/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


يضيف [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | العقدة [XmlAttribute](../../xmlattribute/) لإضافتها إلى مجموعة السمات لهذا العنصر. |

### ReturnValue

إذا استبدلت السمة سمة موجودة بنفس الاسم، يتم إرجاع [XmlAttribute](../../xmlattribute/) القديمة؛ وإلا، يتم إرجاع **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


يضيف [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للسمة. |
| namespaceURI | String | مسار مساحة الاسم للسمة. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) للإضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
