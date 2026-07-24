---
title: "طريقة System::Xml::XmlReader::ReadElementContentAs"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReader::ReadElementContentAs method. يقرأ محتوى العنصر كنوع مطلوب في C++."
type: docs
weight: 5200
url: /ar/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


يقرأ محتوى العنصر كالنوع المطلوب.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | نوع القيمة التي سيتم إرجاعها. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) يُستخدم لحل أي بادئات مساحة اسم مرتبطة بتحويل النوع. |

### ReturnValue

محتوى العنصر محوَّل إلى كائن من النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ محتوى العنصر كالنوع المطلوب.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | نوع القيمة التي سيتم إرجاعها. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) يُستخدم لحل أي بادئات مساحة اسم مرتبطة بتحويل النوع. |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف URI للمساحة الاسمية للعنصر. |

### ReturnValue

محتوى العنصر محوَّل إلى كائن من النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
