---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute yöntemi"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute yöntemi. Mevcut öğe bağlamında öznitelik adını, ad alanı URI'sini ve değerini C++ içinde doğrular."
type: docs
weight: 1600
url: /tr/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sını ve değerini doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak özniteliğin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak özniteliğin ad alanı URI'si. |
| attributeValue | const String\& | Doğrulanacak özniteliğin değeri. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Özniteliğin başarılı doğrulaması sırasında özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

### ReturnValue

Doğrulanan özniteliğin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sını ve değerini doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak özniteliğin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak özniteliğin ad alanı URI'si. |
| attributeValue | XmlValueGetter | Özniteliğin değerini, özniteliğin XML [Schema](../../) Tanım Dili (XSD) türüyle uyumlu bir tip olarak geçirmek için kullanılan bir [XmlValueGetter](../../xmlvaluegetter/) geri çağırma. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Özniteliğin başarılı doğrulaması sırasında özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

### ReturnValue

Doğrulanan özniteliğin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
