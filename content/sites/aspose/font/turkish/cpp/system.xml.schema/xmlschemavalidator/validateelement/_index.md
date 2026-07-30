---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metodu"
linktitle: "ValidateElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metodu. C++'ta geçerli bağlamdaki öğeyi doğrular."
type: docs
weight: 1700
url: /tr/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Geçerli bağlamda öğeyi doğrular.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak öğenin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak öğenin ad alanı URI'si. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin adının başarılı doğrulaması sonucunda özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Belirtilen **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** ve **xsi:NoNamespaceSchemaLocation** öznitelik değerleriyle geçerli bağlamda öğeyi doğrular.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | const String\& | Doğrulanacak öğenin yerel adı. |
| namespaceUri | const String\& | Doğrulanacak öğenin ad alanı URI'si. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin adının başarılı doğrulaması sonucunda özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |
| xsiType | const String\& | Öğenin **xsi:Type** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiNil | const String\& | Öğenin **xsi:Nil** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiSchemaLocation | const String\& | Elementin **xsi:SchemaLocation** öznitelik değeri. Bu parametre **nullptr** olabilir. |
| xsiNoNamespaceSchemaLocation | const String\& | Elementin **xsi:NoNamespaceSchemaLocation** öznitelik değeri. Bu parametre **nullptr** olabilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
