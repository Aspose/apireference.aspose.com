---
title: "طريقة System::Xml::XmlDocument::CreateAttribute"
linktitle: "CreateAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateAttribute. تنشئ XmlAttribute بالاسم المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) بالاسم المحدد.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | الاسم المؤهل للخاصية. إذا كان الاسم يحتوي على نقطتين، فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) تعكس الجزء من الاسم الذي يسبق أول نقطتين، وتُظهر قيمة [XmlDocument::get_LocalName](../get_localname/) الجزء الذي يلي أول نقطتين. يبقى [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) فارغًا ما لم يكن البادئة (prefix) بادئة مدمجة معروفة مثل **xmlns**. في هذه الحالة تكون قيمة get_NamespaceURI هي [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) بالـ [XmlNode::get_Prefix](../../xmlnode/get_prefix/)، [XmlDocument::get_LocalName](../get_localname/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) المحددة.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | const String\& | بادئة الخاصية (إن وجدت). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. |
| localName | const String\& | الاسم المحلي للخاصية. |
| namespaceURI | const String\& | معرف مساحة الاسم للخاصية (إن وجد). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. إذا كان **prefix** هو **xmlns**، يجب أن تكون هذه المعلمة [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) وإلا سيتم رمي استثناء. |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


ينشئ [XmlAttribute](../../xmlattribute/) بالاسم المؤهل المحدد و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| qualifiedName | const String\& | الاسم المؤهل للخاصية. إذا كان الاسم يحتوي على نقطتين، فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ستعكس الجزء الذي يسبق النقطتين، وستعكس قيمة [XmlDocument::get_LocalName](../get_localname/) الجزء الذي يلي النقطتين. |
| namespaceURI | const String\& | معرف مساحة الاسم للخاصية. إذا كان الاسم المؤهل يتضمن بادئة **xmlns**، يجب أن تكون هذه المعلمة [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

الـ [XmlAttribute](../../xmlattribute/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
