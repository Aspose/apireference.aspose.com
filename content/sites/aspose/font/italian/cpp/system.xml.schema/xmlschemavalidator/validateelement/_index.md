---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metodo"
linktitle: "ValidateElement"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metodo. Convalida l'elemento nel contesto corrente in C++."
type: docs
weight: 1700
url: /it/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Convalida l'elemento nel contesto corrente.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'elemento da convalidare. |
| namespaceUri | const String\& | L'URI dello spazio dei nomi dell'elemento da convalidare. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate al completamento con successo della convalida del nome dell'elemento. Questo parametro può essere **nullptr**. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Convalida l'elemento nel contesto corrente con i valori degli attributi **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** e **xsi:NoNamespaceSchemaLocation** specificati.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'elemento da convalidare. |
| namespaceUri | const String\& | L'URI dello spazio dei nomi dell'elemento da convalidare. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate al completamento con successo della convalida del nome dell'elemento. Questo parametro può essere **nullptr**. |
| xsiType | const String\& | Il valore dell'attributo **xsi:Type** dell'elemento. Questo parametro può essere **nullptr**. |
| xsiNil | const String\& | Il valore dell'attributo **xsi:Nil** dell'elemento. Questo parametro può essere **nullptr**. |
| xsiSchemaLocation | const String\& | Il valore dell'attributo **xsi:SchemaLocation** dell'elemento. Questo parametro può essere **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | Il valore dell'attributo **xsi:NoNamespaceSchemaLocation** dell'elemento. Questo parametro può essere **nullptr**. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
