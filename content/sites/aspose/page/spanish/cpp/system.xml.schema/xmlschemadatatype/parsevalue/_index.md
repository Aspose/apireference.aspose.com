---
title: "Método System::Xml::Schema::XmlSchemaDatatype::ParseValue"
linktitle: "ParseValue"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::Schema::XmlSchemaDatatype::ParseValue. Cuando se sobrescribe en una clase derivada, valida la cadena especificada contra un tipo simple incorporado o definido por el usuario en C++."
type: docs
weight: 700
url: /es/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Cuando se sobrescribe en una clase derivada, valida la **string** especificada contra un tipo simple incorporado o definido por el usuario.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | String | La **string** a validar contra el tipo simple. |
| nameTable | SharedPtr\<XmlNameTable\> | El [XmlNameTable](../../../system.xml/xmlnametable/) a usar para la atomización mientras se analiza la **string** si este objeto [XmlSchemaDatatype](../) representa el tipo **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | El objeto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) a usar mientras se analiza la **string** si este objeto [XmlSchemaDatatype](../) representa el tipo **xs:QName**. |

### ReturnValue

Un [Object](../../../system/object/) que puede convertirse de forma segura al tipo devuelto por la llamada a [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
