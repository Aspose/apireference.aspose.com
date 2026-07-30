---
title: "طريقة System::Xml::XmlDocument::CreateNode"
linktitle: "CreateNode"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateNode. تنشئ XmlNode بنوع العقدة المحدد، XmlDocument::get_Name، وXmlNode::get_NamespaceURI في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


ينشئ [XmlNode](../../xmlnode/) بنوع العقدة المحدد، [XmlDocument::get_Name](../get_name/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nodeTypeString | const String\& | إصدار [String](../../../system/string/) من [XmlNodeType](../../xmlnodetype/) للعقدة الجديدة. يجب أن تكون هذه المعلمة واحدة من القيم المذكورة في الجدول أدناه. |
| name | const String\& | الاسم المؤهل للعقدة الجديدة. إذا كان الاسم يحتوي على نقطتين، يتم تحليله إلى مكوّنات [XmlNode::get_Prefix](../../xmlnode/get_prefix/) و[XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | معرف مساحة الاسم للعقدة الجديدة. |

### ReturnValue

الـ [XmlNode](../../xmlnode/) الجديد.
## ملاحظات



المعلمة **nodeTypeString** حساسة لحالة الأحرف ويجب أن تكون واحدة من القيم في الجدول التالي: |||
|-|-|
| nodeTypeString | XmlNodeType |
| خاصية | Attribute |
| قسمCDATA | CDATA |
| تعليق | تعليق |
| مستند | مستند |
| جزء المستند | جزء المستند |
| نوع المستند | نوع المستند |
| عنصر | Element |
| مرجع الكيان | مرجع كيان |
| تعليمات المعالجة | تعليمات المعالجة |
| مسافات بيضاء ذات دلالة | مسافة بيضاء هامة |
| نص | Text |
| مسافات بيضاء | مسافة بيضاء |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


ينشئ [XmlNode](../../xmlnode/) بالنوع المحدد [XmlNodeType](../../xmlnodetype/)، و[XmlDocument::get_Name](../get_name/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XmlNodeType | نوع [XmlNodeType](../../xmlnodetype/) للعقدة الجديدة. |
| name | const String\& | الاسم المؤهل للعقدة الجديدة. إذا كان الاسم يحتوي على نقطتين (:) فسيتم تحليله إلى مكوّنات [XmlNode::get_Prefix](../../xmlnode/get_prefix/) و[XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | معرف مساحة الاسم للعقدة الجديدة. |

### ReturnValue

الـ [XmlNode](../../xmlnode/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


ينشئ [XmlNode](../../xmlnode/) بالنوع المحدد [XmlNodeType](../../xmlnodetype/)، و[XmlNode::get_Prefix](../../xmlnode/get_prefix/)، و[XmlDocument::get_Name](../get_name/)، و[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XmlNodeType | نوع [XmlNodeType](../../xmlnodetype/) للعقدة الجديدة. |
| البادئة | const String\& | السابقة للعقدة الجديدة. |
| name | const String\& | الاسم المحلي للعقدة الجديدة. |
| namespaceURI | const String\& | معرف مساحة الاسم للعقدة الجديدة. |

### ReturnValue

الـ [XmlNode](../../xmlnode/) الجديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
