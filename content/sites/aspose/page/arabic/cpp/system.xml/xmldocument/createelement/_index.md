---
title: "طريقة System::Xml::XmlDocument::CreateElement"
linktitle: "CreateElement"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateElement. تنشئ عنصرًا بالاسم المحدد في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


ينشئ عنصرًا بالاسم المحدد.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | const String\& | الاسم المؤهل للعنصر. إذا كان الاسم يحتوي على نقطتين رأسيتين فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) تعكس الجزء قبل النقطتين وقيمة [XmlDocument::get_LocalName](../get_localname/) تعكس الجزء بعد النقطتين. لا يمكن أن يتضمن الاسم المؤهل بادئة **xmlns**. |

### ReturnValue

الـ[XmlElement](../../xmlelement/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


ينشئ عنصرًا بالـ[XmlNode::get_Prefix](../../xmlnode/get_prefix/)، [XmlDocument::get_LocalName](../get_localname/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| prefix | const String\& | بادئة العنصر الجديد (إن وجدت). [String::Empty](../../../system/string/empty/) و**nullptr** متكافئان. |
| localName | const String\& | الاسم المحلي للعنصر الجديد. |
| namespaceURI | const String\& | معرف URI للمساحة الاسمية للعنصر الجديد (إن وجد). [String::Empty](../../../system/string/empty/) و **nullptr** متساويان. |

### ReturnValue

الـ[XmlElement](../../xmlelement/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


ينشئ [XmlElement](../../xmlelement/) بالاسم المؤهل و [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| qualifiedName | const String\& | الاسم المؤهل للعنصر. إذا كان الاسم يحتوي على النقطتين فإن قيمة [XmlNode::get_Prefix](../../xmlnode/get_prefix/) ستعكس الجزء من الاسم الذي يسبق النقطتين، وقيمة [XmlDocument::get_LocalName](../get_localname/) ستعكس الجزء من الاسم بعد النقطتين. لا يمكن أن يحتوي الاسم المؤهل على بادئة **xmlns**. |
| namespaceURI | const String\& | معرف URI للمساحة الاسمية للعنصر. |

### ReturnValue

الـ[XmlElement](../../xmlelement/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
