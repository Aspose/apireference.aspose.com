---
title: "Clase System::Xml::Schema::XmlSchemaGroup"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaGroup. Representa el elemento group del XML Schema según lo especificado por el Consorcio de la World Wide Web (W3C). Esta clase define grupos a nivel de schema que son referenciados desde los tipos complejos. Agrupa un conjunto de declaraciones de elementos para que puedan incorporarse como un grupo en las definiciones de tipos complejos en C++."
type: docs
weight: 3100
url: /es/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Representa el elemento **group** del XML [Schema](../) según lo especificado por el Consorcio de la World Wide [Web](../../system.web/) (W3C). Esta clase define grupos a nivel de **schema** que son referenciados desde los tipos complejos. Agrupa un conjunto de declaraciones de elementos para que puedan incorporarse como un grupo en las definiciones de tipos complejos.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Name](./get_name/)() | Devuelve el nombre del grupo de esquema. |
| [get_Particle](./get_particle/)() | Devuelve una de las clases [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | Devuelve el nombre calificado del grupo de esquema. |
| [set_Name](./set_name/)(const String\&) | Establece el nombre del grupo de esquema. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Establece una de las clases [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | Inicializa una nueva instancia de la clase [XmlSchemaGroup](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
