---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue metodo"
linktitle: "ParseValue"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue metodo. Quando sovrascritto in una classe derivata, convalida la stringa specificata rispetto a un tipo semplice incorporato o definito dall'utente in C++."
type: docs
weight: 700
url: /it/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Quando sovrascritto in una classe derivata, valida la **string** specificata rispetto a un tipo semplice incorporato o definito dall'utente.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | Stringa | La **string** da convalidare rispetto al tipo semplice. |
| nameTable | SharedPtr\<XmlNameTable\> | Il [XmlNameTable](../../../system.xml/xmlnametable/) da utilizzare per l'atomizzazione durante l'analisi della **string** se questo oggetto [XmlSchemaDatatype](../) rappresenta il tipo **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) da utilizzare durante l'analisi della **string** se questo oggetto [XmlSchemaDatatype](../) rappresenta il tipo **xs:QName**. |

### ReturnValue

Un [Object](../../../system/object/) che può essere convertito in modo sicuro al tipo restituito dalla chiamata a [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
