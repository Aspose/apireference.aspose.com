---
title: "Metodo System::Xml::Schema::XmlSchemaValidator::ValidateAttribute"
linktitle: "ValidateAttribute"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::Schema::XmlSchemaValidator::ValidateAttribute. Convalida il nome dell'attributo, l'URI dello spazio dei nomi e il valore nel contesto dell'elemento corrente in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Convalida il nome dell'attributo, l'URI dello spazio dei nomi e il valore nel contesto dell'elemento corrente.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'attributo da convalidare. |
| namespaceUri | const String\& | L'URI dello spazio dei nomi dell'attributo da convalidare. |
| attributeValue | const String\& | Il valore dell'attributo da convalidare. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate al termine della convalida riuscita dell'attributo. Questo parametro può essere **nullptr**. |

### ReturnValue

Il valore dell'attributo convalidato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Convalida il nome dell'attributo, l'URI dello spazio dei nomi e il valore nel contesto dell'elemento corrente.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'attributo da convalidare. |
| namespaceUri | const String\& | L'URI dello spazio dei nomi dell'attributo da convalidare. |
| attributeValue | XmlValueGetter | Una callback [XmlValueGetter](../../xmlvaluegetter/) usata per passare il valore dell'attributo come tipo compatibile con il tipo del Linguaggio di Definizione (XSD) dello [Schema](../../) XML dell'attributo. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un oggetto [XmlSchemaInfo](../../xmlschemainfo/) le cui proprietà vengono impostate al termine della convalida riuscita dell'attributo. Questo parametro può essere **nullptr**. |

### ReturnValue

Il valore dell'attributo convalidato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
