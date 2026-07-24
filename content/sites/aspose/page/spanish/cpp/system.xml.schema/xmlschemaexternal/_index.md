---
title: "Clase System::Xml::Schema::XmlSchemaExternal"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaExternal. Proporciona información sobre el esquema incluido en C++."
type: docs
weight: 2800
url: /es/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Proporciona información sobre el esquema incluido.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Id](./get_id/)() | Devuelve el identificador de cadena. |
| [get_Schema](./get_schema/)() | Devuelve el [XmlSchema](../xmlschema/) del esquema referenciado. |
| [get_SchemaLocation](./get_schemalocation/)() | Devuelve la ubicación del Identificador Uniforme de Recursos (URI) del esquema, que indica al procesador de esquemas dónde reside físicamente el esquema. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Devuelve los atributos calificados, que no pertenecen al espacio de nombres de destino del esquema. |
| [set_Id](./set_id/)(const String\&) | Establece el identificador de cadena. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Establece el [XmlSchema](../xmlschema/) para el esquema referenciado. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Establece la ubicación del Identificador Uniforme de Recursos (URI) para el esquema, lo que indica al procesador de esquemas dónde se encuentra físicamente el esquema. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Establece los atributos calificados, que no pertenecen al espacio de nombres objetivo del esquema. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Inicializa una nueva instancia de la clase [XmlSchemaExternal](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
