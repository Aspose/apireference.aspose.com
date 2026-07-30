---
title: "منشئ System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator. يهيئ نسخة جديدة من فئة XmlSchemaValidator في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaValidator](../).

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | كائن [XmlNameTable](../../../system.xml/xmlnametable/) يحتوي على أسماء العناصر والسمات كسلاسل مُذَاتية. |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | كائن [XmlSchemaSet](../../xmlschemaset/) يحتوي على مخططات لغة تعريف XML [Schema](../../) (XSD) المستخدمة في التحقق. |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) يُستخدم لحل مساحات الأسماء التي تُواجه أثناء التحقق. |
| validationFlags | XmlSchemaValidationFlags | قيمة [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) تُحدد خيارات التحقق من المخطط. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
