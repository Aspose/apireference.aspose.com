---
title: "System::Xml::XmlElement::GetAttributeNode طريقة"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlElement::GetAttributeNode طريقة. تُرجع XmlAttribute بالاسم المحلي المحدد ومسار مساحة الاسم في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


تُرجع [XmlAttribute](../../xmlattribute/) بالاسم المحلي المحدد ومسار مساحة الاسم.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) المحدد أو **nullptr** إذا لم يتم العثور على سمة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


تُرجع [XmlAttribute](../../xmlattribute/) بالاسم المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم الخاصية المراد استرجاعها. هذا اسم مؤهل. يتم مطابقته مع قيمة **get_Name** للعقدة المطابقة. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) المحدد أو **nullptr** إذا لم يتم العثور على سمة مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
