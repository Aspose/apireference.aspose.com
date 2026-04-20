---
title: "طريقة System::Xml::XmlReader::ReadElementContentAs"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::ReadElementContentAs. يقرأ محتوى العنصر كنوع الطلب في C++."
type: docs
weight: 5200
url: /ar/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


يقرأ محتوى العنصر كنوع مطلوب.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | نوع القيمة التي سيتم إرجاعها. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) يُستخدم لحل أي بادئات مساحة اسم مرتبطة بتحويل النوع. |

### ReturnValue

محتوى العنصر محوَّل إلى كائن النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ محتوى العنصر كنوع مطلوب.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | نوع القيمة التي سيتم إرجاعها. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) يُستخدم لحل أي بادئات مساحة اسم مرتبطة بتحويل النوع. |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف مساحة الاسم (URI) للعنصر. |

### ReturnValue

محتوى العنصر محوَّل إلى كائن النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
