---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDocument::CreateElement method. ينشئ عنصرًا بالاسم المحدد في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


ينشئ عنصرًا بالاسم المحدد.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | الاسم المؤهل للعنصر. إذا كان الاسم يحتوي على نقطتين (:) فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) تعكس الجزء من الاسم الذي يسبق النقطتين، وتُظهر قيمة [XmlDocument::get_LocalName](../get_localname/) الجزء الذي يلي النقطتين. لا يمكن أن يتضمن الاسم المؤهل سابقة **xmlns**. |

### ReturnValue

العنصر الجديد [XmlElement](../../xmlelement/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


ينشئ عنصرًا باستخدام القيم المحددة لـ [XmlNode::get_Prefix](../../xmlnode/get_prefix/)، و[XmlDocument::get_LocalName](../get_localname/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| prefix | const String\& | بادئة العنصر الجديد (إن وجدت). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. |
| localName | const String\& | الاسم المحلي للعنصر الجديد. |
| namespaceURI | const String\& | معرف مساحة الاسم للعنصر الجديد (إن وجد). [String::Empty](../../../system/string/empty/) و **nullptr** متكافئان. |

### ReturnValue

العنصر الجديد [XmlElement](../../xmlelement/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


ينشئ [XmlElement](../../xmlelement/) بالاسم المؤهل و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| qualifiedName | const String\& | الاسم المؤهل للعنصر. إذا كان الاسم يحتوي على نقطتين (:), فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ستعكس الجزء قبل النقطتين، وقيمة [XmlDocument::get_LocalName](../get_localname/) ستعكس الجزء بعد النقطتين. لا يمكن أن يحتوي الاسم المؤهل على بادئة **xmlns**. |
| namespaceURI | const String\& | معرف مساحة الاسم (URI) للعنصر. |

### ReturnValue

العنصر الجديد [XmlElement](../../xmlelement/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
