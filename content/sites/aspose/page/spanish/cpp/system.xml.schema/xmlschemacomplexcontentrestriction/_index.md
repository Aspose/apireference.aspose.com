---
title: "Clase System::Xml::Schema::XmlSchemaComplexContentRestriction"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaComplexContentRestriction. Representa el elemento restriction del XML Schema según lo especificado por el Consorcio de la World Wide Web (W3C). Esta clase es para tipos complejos con un modelo de contenido complejo derivado por restricción. Restringe el contenido del tipo complejo a un subconjunto del tipo complejo heredado en C++."
type: docs
weight: 2000
url: /es/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Representa el elemento **restriction** del XML [Schema](../) según lo especificado por el Consorcio de la World Wide [Web](../../system.web/) (W3C). Esta clase es para tipos complejos con un modelo de contenido complejo derivado por restricción. Restringe el contenido del tipo complejo a un subconjunto del tipo complejo heredado.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Devuelve el componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modelo de contenido complejo. |
| [get_Attributes](./get_attributes/)() | Devuelve la colección de atributos para el tipo complejo. Contiene los elementos [XmlSchemaAttribute](../xmlschemaattribute/) y [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Devuelve el nombre de un tipo complejo del cual este tipo se deriva por restricción. |
| [get_Particle](./get_particle/)() | Devuelve una de las clases [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Establece el componente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) del modelo de contenido complejo. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de un tipo complejo del cual este tipo se deriva por restricción. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Establece una de las clases [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Inicializa una nueva instancia de la clase [XmlSchemaComplexContentRestriction](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
