---
title: "Clase System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaAnnotated. La clase base para cualquier elemento que pueda contener elementos de anotación en C++."
type: docs
weight: 600
url: /es/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


La clase base para cualquier elemento que pueda contener elementos de anotación.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Devuelve la propiedad **annotation**. |
| [get_Id](./get_id/)() | Devuelve el identificador de cadena. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Devuelve los atributos calificados que no pertenecen al espacio de nombres objetivo del esquema actual. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Establece la propiedad **annotation**. |
| [set_Id](./set_id/)(const String\&) | Establece el identificador de cadena. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Establece los atributos calificados que no pertenecen al espacio de nombres objetivo del esquema actual. |
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
