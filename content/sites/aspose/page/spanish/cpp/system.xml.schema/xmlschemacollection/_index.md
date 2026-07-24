---
title: "Clase System::Xml::Schema::XmlSchemaCollection"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaCollection. Contiene una caché de esquemas de lenguaje de definición XML Schema (XSD) y XML-Data Reduced (XDR) en C++."
type: docs
weight: 1500
url: /es/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Contiene una caché de esquemas de lenguaje de definición XML [Schema](../) (XSD) y XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Agrega el esquema localizado por la URL proporcionada a la colección de esquemas. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Agrega el esquema contenido en el [XmlReader](../../system.xml/xmlreader/) a la colección de esquemas. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Agrega el esquema contenido en el [XmlReader](../../system.xml/xmlreader/) a la colección de esquemas. El [XmlResolver](../../system.xml/xmlresolver/) especificado se usa para resolver cualquier recurso externo. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Agrega el [XmlSchema](../xmlschema/) a la colección. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Agrega el [XmlSchema](../xmlschema/) a la colección. El [XmlResolver](../../system.xml/xmlresolver/) especificado se usa para resolver cualquier referencia externa. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Agrega todos los espacios de nombres definidos en la colección dada (incluidos sus esquemas asociados) a esta colección. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Devuelve un valor que indica si el **targetNamespace** del [XmlSchema](../xmlschema/) especificado está en la colección. |
| [Contains](./contains/)(const String\&) | Devuelve un valor que indica si un esquema con el espacio de nombres especificado está en la colección. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Copia todos los objetos [XmlSchema](../xmlschema/) de esta colección en la matriz proporcionada comenzando en el índice indicado. |
| [get_Count](./get_count/)() | Devuelve el número de espacios de nombres definidos en esta colección. |
| [get_NameTable](./get_nametable/)() | Devuelve la [XmlNameTable](../../system.xml/xmlnametable/) predeterminada utilizada por la [XmlSchemaCollection](./) al cargar nuevos esquemas. |
| [GetEnumerator](./getenumerator/)() override | Proporciona soporte para la iteración sobre la colección de esquemas. |
| [idx_get](./idx_get/)(const String\&) | Devuelve el [XmlSchema](../xmlschema/) asociado con el URI del espacio de nombres proporcionado. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Inicializa una nueva instancia de la clase [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Inicializa una nueva instancia de la clase [XmlSchemaCollection](./) con la [XmlNameTable](../../system.xml/xmlnametable/) especificada. La [XmlNameTable](../../system.xml/xmlnametable/) se usa al cargar esquemas. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones


## Deprecated
La clase XmlSchemaCollection está obsoleta. Use XmlSchemaSet en su lugar.

Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
