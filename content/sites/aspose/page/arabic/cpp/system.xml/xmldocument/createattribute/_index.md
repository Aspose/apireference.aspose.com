---
title: "طريقة System::Xml::XmlDocument::CreateAttribute"
linktitle: "CreateAttribute"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateAttribute. تُنشئ XmlAttribute بالاسم المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) بالاسم المحدد.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | const String\& | الاسم المؤهل للخاصية. إذا كان الاسم يحتوي على نقطتين، فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) تعكس الجزء من الاسم الذي يسبق النقطتين الأوليتين، وقيمة [XmlDocument::get_LocalName](../get_localname/) تعكس الجزء من الاسم الذي يلي النقطتين الأوليتين. تظل قيمة [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) فارغة ما لم يكن البادئة بادئة مدمجة معروفة مثل **xmlns**. في هذه الحالة تكون قيمة get_NamespaceURI هي [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

الـ[XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) باستخدام الـ[XmlNode::get_Prefix](../../xmlnode/get_prefix/)، و[XmlDocument::get_LocalName](../get_localname/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) المحددة.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | const String\& | بادئة الخاصية (إن وجدت). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. |
| localName | const String\& | الاسم المحلي للسمة. |
| namespaceURI | const String\& | معرف مساحة الاسم للخاصية (إن وجدت). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. إذا كان **prefix** هو **xmlns**، يجب أن تكون هذه المعلمة [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) وإلا يتم رمي استثناء. |

### ReturnValue

الـ[XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) بالاسم المؤهل المحدد و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| qualifiedName | const String\& | الاسم المؤهل للخاصية. إذا كان الاسم يحتوي على نقطتين، فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ستعكس الجزء من الاسم الذي يسبق النقطتين، وقيمة [XmlDocument::get_LocalName](../get_localname/) ستعكس الجزء من الاسم الذي يلي النقطتين. |
| namespaceURI | const String\& | معرف مساحة الاسم للخاصية. إذا كان الاسم المؤهل يتضمن بادئة **xmlns**، يجب أن تكون هذه المعلمة [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

الـ[XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
