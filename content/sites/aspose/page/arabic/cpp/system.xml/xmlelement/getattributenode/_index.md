---
title: "System::Xml::XmlElement::GetAttributeNode method"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlElement::GetAttributeNode method. يُرجع XmlAttribute بالاسم المحلي ومعرف URI للمساحة الاسمية المحددين في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


يرجع الـ [XmlAttribute](../../xmlattribute/) بالاسم المحلي ومعرف URI للمساحة الاسمية المحددين.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للسمة. |
| namespaceURI | String | مسار مساحة الاسم للسمة. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) المحدد أو **nullptr** إذا لم يتم العثور على خاصية مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


يرجع الـ [XmlAttribute](../../xmlattribute/) بالاسم المحدد.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم الخاصية المراد استرجاعها. هذا اسم مؤهل. يتم مطابقته مع قيمة **get_Name** للعقدة المطابقة. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) المحدد أو **nullptr** إذا لم يتم العثور على خاصية مطابقة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
