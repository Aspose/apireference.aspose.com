---
title: "Clase System::Xml::Schema::XmlSchemaRedefine"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaRedefine. Representa el elemento redefine del XML Schema según lo especificado por el World Wide Web Consortium (W3C). Esta clase puede usarse para permitir tipos simples y complejos, grupos y grupos de atributos de archivos de esquema externos que se redefinan en el esquema actual. También puede usarse para proporcionar versionado de los elementos del esquema en C++."
type: docs
weight: 5600
url: /es/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Representa el elemento **redefine** de XML [Schema](../) según lo especificado por el Consorcio de la World Wide [Web](../../system.web/) (W3C). Esta clase puede usarse para permitir que los tipos simples y complejos, grupos y grupos de atributos de archivos de esquema externos se redefinan en el esquema actual. Esta clase también puede usarse para proporcionar versionado de los elementos del esquema.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Devuelve la [XmlSchemaObjectTable](../xmlschemaobjecttable/), para todos los atributos en el esquema, que contiene la interpretación posterior a la compilación del valor **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Devuelve la [XmlSchemaObjectTable](../xmlschemaobjecttable/), para todos los grupos en el esquema, que contiene la interpretación posterior a la compilación del valor **Groups**. |
| [get_Items](./get_items/)() | Devuelve la colección de las siguientes clases: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), y [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Devuelve la [XmlSchemaObjectTable](../xmlschemaobjecttable/), para todos los tipos simples y complejos en el esquema, que contiene la interpretación posterior a la compilación del valor **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Inicializa una nueva instancia de la clase [XmlSchemaRedefine](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
