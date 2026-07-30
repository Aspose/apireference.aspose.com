---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes metodo"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes. Convalida i vincoli di identità sugli attributi predefiniti e popola la List specificata con oggetti XmlSchemaAttribute per tutti gli attributi con valori predefiniti che non sono stati precedentemente convalidati utilizzando il metodo XmlSchemaValidator::ValidateAttribute nel contesto dell'elemento in C++."
type: docs
weight: 900
url: /it/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


Convalida i vincoli di identità sugli attributi predefiniti e popola la List specificata con oggetti [XmlSchemaAttribute](../../xmlschemaattribute/) per tutti gli attributi con valori predefiniti che non sono stati precedentemente convalidati utilizzando il metodo [XmlSchemaValidator::ValidateAttribute](../validateattribute/) nel contesto dell'elemento.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | Una List da popolare con oggetti [XmlSchemaAttribute](../../xmlschemaattribute/) per tutti gli attributi non ancora incontrati durante la convalida nel contesto dell'elemento. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
