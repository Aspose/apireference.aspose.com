---
title: "System::Xml::Schema::IXmlSchemaInfo класс"
linktitle: "IXmlSchemaInfo"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::IXmlSchemaInfo класс. Определяет набор информации post-schema-validation проверенного XML‑узла в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml.schema/ixmlschemainfo/
---
## IXmlSchemaInfo class


Определяет пост‑валидационный инфосет проверенного XML‑узла.

```cpp
class IXmlSchemaInfo : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_IsDefault](./get_isdefault/)() | Возвращает значение, указывающее, был ли этот проверенный XML‑узел установлен в результате применения значения по умолчанию во время проверки схемы XML [Schema](../) Definition Language (XSD). |
| virtual [get_IsNil](./get_isnil/)() | Возвращает значение, указывающее, является ли значение этого проверенного XML‑узла **nil**. |
| virtual [get_MemberType](./get_membertype/)() | Возвращает динамический тип схемы для этого проверенного XML‑узла. |
| virtual [get_SchemaAttribute](./get_schemaattribute/)() | Возвращает скомпилированный [XmlSchemaAttribute](../xmlschemaattribute/), соответствующий этому проверенному XML‑узлу. |
| virtual [get_SchemaElement](./get_schemaelement/)() | Возвращает скомпилированный [XmlSchemaElement](../xmlschemaelement/), соответствующий этому проверенному XML‑узлу. |
| virtual [get_SchemaType](./get_schematype/)() | Возвращает статический тип схемы XML [Schema](../) Definition Language (XSD) для этого проверенного XML‑узла. |
| virtual [get_Validity](./get_validity/)() | Возвращает значение [XmlSchemaValidity](../xmlschemavalidity/) этого проверенного XML‑узла. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
