---
title: "طريقة System::Xml::XmlReader::ReadContentAs method"
linktitle: "ReadContentAs"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReader::ReadContentAs method. يقرأ المحتوى ككائن من النوع المحدد في C++."
type: docs
weight: 3900
url: /ar/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


يقرأ المحتوى ككائن من النوع المحدد.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| returnType | const TypeInfo\& | نوع القيمة التي سيتم إرجاعها. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) يُستخدم لحل أي بادئات مساحة اسم مرتبطة بتحويل النوع. على سبيل المثال، يمكن استخدامه عند تحويل كائن [XmlQualifiedName](../../xmlqualifiedname/) إلى **xs:string**. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

المحتوى النصي المتصل أو قيمة السمة المحوّلة إلى النوع المطلوب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
