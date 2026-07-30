---
title: "طريقة System::Xml::Schema::XmlSchemaDatatype::ChangeType"
linktitle: "ChangeType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaDatatype::ChangeType. تُحوّل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثّل بواسطة XmlSchemaDatatype، إلى نوع وقت التشغيل المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


تُحوّل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثّل بواسطة [XmlSchemaDatatype](../)، إلى نوع وقت التشغيل المحدد.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | SharedPtr\<Object\> | القيمة المدخلة للتحويل إلى النوع المحدد. |
| targetType | const TypeInfo\& | نوع الهدف لتحويل القيمة المدخلة إليه. |

### ReturnValue

القيمة المدخلة المحوّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


يقوم بتحويل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثّل بواسطة [XmlSchemaDatatype](../)، إلى نوع وقت التشغيل المحدد باستخدام [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) إذا كان [XmlSchemaDatatype](../) يمثل النوع **xs:QName** أو نوعًا مشتقًا منه.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | SharedPtr\<Object\> | القيمة المدخلة للتحويل إلى النوع المحدد. |
| targetType | const TypeInfo\& | نوع الهدف لتحويل القيمة المدخلة إليه. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | ‏[IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) يُستخدم لحل بادئات النطاق. لا يكون مفيدًا إلا إذا كان [XmlSchemaDatatype](../) يمثل النوع **xs:QName** أو نوعًا مشتقًا منه. |

### ReturnValue

القيمة المدخلة المحوّلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
