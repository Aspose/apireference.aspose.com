---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue метод"
linktitle: "ParseValue"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue метод. При переопределении в производном классе проверяет указанную строку относительно встроенного или пользовательского простого типа в C++."
type: docs
weight: 700
url: /ru/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


При переопределении в производном классе проверяет указанную **string** на соответствие встроенному или пользовательскому простому типу.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | String | Строка **string** для проверки относительно простого типа. |
| nameTable | SharedPtr\<XmlNameTable\> | Объект [XmlNameTable](../../../system.xml/xmlnametable/), используемый для атомизации при разборе **string**, если данный объект [XmlSchemaDatatype](../) представляет тип **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый при разборе **string**, если данный объект [XmlSchemaDatatype](../) представляет тип **xs:QName**. |

### ReturnValue

Объект [Object](../../../system/object/), который можно безопасно привести к типу, возвращаемому вызовом [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
