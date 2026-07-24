---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metodu"
linktitle: "ValidateElement"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement yöntemi. C++'ta geçerli bağlamdaki öğeyi doğrular."
type: docs
weight: 1700
url: /tr/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Öğeyi geçerli bağlamda doğrular.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak öğenin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak öğenin ad alanı URI'si. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin adının başarılı bir şekilde doğrulanmasıyla özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Geçerli bağlamda öğeyi belirtilen **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** ve **xsi:NoNamespaceSchemaLocation** öznitelik değerleriyle doğrular.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak öğenin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak öğenin ad alanı URI'si. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin adının başarılı bir şekilde doğrulanmasıyla özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |
| xsiType | const String\& | Öğenin **xsi:Type** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiNil | const String\& | Öğenin **xsi:Nil** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiSchemaLocation | const String\& | Öğenin **xsi:SchemaLocation** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiNoNamespaceSchemaLocation | const String\& | Öğenin **xsi:NoNamespaceSchemaLocation** öznitelik değeri. Bu parametre **nullptr** olabilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
