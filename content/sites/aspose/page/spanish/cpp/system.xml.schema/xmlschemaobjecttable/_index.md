---
title: "System::Xml::Schema::XmlSchemaObjectTable clase"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaObjectTable clase. Proporciona las colecciones para los elementos contenidos en la clase XmlSchema (por ejemplo, Attributes, AttributeGroups, Elements, etc.) en C++."
type: docs
weight: 5300
url: /es/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Proporciona las colecciones para los elementos contenidos en la clase [XmlSchema](../xmlschema/) (por ejemplo, Attributes, AttributeGroups, Elements, etc.).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Determina si el nombre calificado especificado existe en la colección. |
| [get_Count](./get_count/)() | Devuelve el número de elementos contenidos en el [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Devuelve una colección de todos los elementos con nombre en el [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Devuelve una colección de todos los valores de todos los elementos en el [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Devuelve un enumerador que puede iterar a través del [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Devuelve el elemento en el [XmlSchemaObjectTable](./) especificado por nombre calificado. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
