---
title: "System::Xml::XmlElement::SetAttributeNode طريقة"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlElement::SetAttributeNode طريقة. يضيف XmlAttribute المحدد في C++."
type: docs
weight: 2700
url: /ar/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


يضيف [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | العقدة [XmlAttribute](../../xmlattribute/) لإضافتها إلى مجموعة السمات لهذا العنصر. |

### ReturnValue

إذا استبدلت السمة سمة موجودة بنفس الاسم، تُرجع [XmlAttribute](../../xmlattribute/) القديمة؛ وإلا، تُرجع **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


يضيف [XmlAttribute](../../xmlattribute/) المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) للإضافة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
