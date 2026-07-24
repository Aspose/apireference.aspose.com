---
title: "System::Xml::Schema::XmlSchemaElement clase"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaElement clase. Representa el elemento element del XML Schema según lo especificado por el Consorcio de la World Wide Web (W3C). Esta clase es la clase base para todos los tipos de partícula y se utiliza para describir un elemento en un documento XML en C++."
type: docs
weight: 2600
url: /es/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Representa el elemento **element** del XML [Schema](../) según lo especificado por el Consorcio de la World Wide [Web](../../system.web/) (W3C). Esta clase es la clase base para todos los tipos de partícula y se utiliza para describir un elemento en un documento XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Block](./get_block/)() | Devuelve una derivación **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | Devuelve la interpretación posterior a la compilación del valor **Block**. |
| [get_Constraints](./get_constraints/)() | Devuelve la colección de restricciones sobre el elemento. |
| [get_DefaultValue](./get_defaultvalue/)() | Devuelve el valor predeterminado del elemento si su contenido es un tipo simple o el contenido del elemento es **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | Devuelve un objeto [XmlSchemaType](../xmlschematype/) que representa el tipo del elemento basado en los valores [XmlSchemaElement::get_SchemaType](./get_schematype/) o [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) del elemento. |
| [get_ElementType](./get_elementtype/)() | Devuelve un objeto basado en el [XmlSchemaElement](./) o [XmlSchemaElement](./) del elemento, que contiene la interpretación posterior a la compilación del valor **ElementType**. |
| [get_Final](./get_final/)() | Devuelve el valor **Final** para indicar que no se permiten más derivaciones. |
| [get_FinalResolved](./get_finalresolved/)() | Devuelve la interpretación posterior a la compilación del valor **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | Devuelve el valor fijo. |
| [get_Form](./get_form/)() | Devuelve la forma del elemento. |
| [get_IsAbstract](./get_isabstract/)() | Devuelve información para indicar si el elemento puede usarse en un documento de instancia. |
| [get_IsNillable](./get_isnillable/)() | Devuelve información que indica si **xsi:nil** puede aparecer en los datos de instancia. Indica si se puede asignar un valor nil explícito al elemento. |
| [get_Name](./get_name/)() | Devuelve el nombre del elemento. |
| [get_QualifiedName](./get_qualifiedname/)() | Devuelve el nombre calificado real para el elemento dado. |
| [get_RefName](./get_refname/)() | Devuelve el nombre de referencia de un elemento declarado en este esquema (o en otro esquema indicado por el espacio de nombres especificado). |
| [get_SchemaType](./get_schematype/)() | Devuelve el tipo del elemento. Este puede ser un tipo complejo o un tipo simple. |
| [get_SchemaTypeName](./get_schematypename/)() | Devuelve el nombre de un tipo de datos incorporado definido en este esquema o en otro esquema indicado por el espacio de nombres especificado. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Devuelve el nombre de un elemento que está siendo sustituido por este elemento. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Establece una derivación **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Establece el valor predeterminado del elemento si su contenido es un tipo simple o el contenido del elemento es **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Establece el valor **Final** para indicar que no se permiten más derivaciones. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Establece el valor fijo. |
| [set_Form](./set_form/)(XmlSchemaForm) | Establece la forma del elemento. |
| [set_IsAbstract](./set_isabstract/)(bool) | Establece información para indicar si el elemento puede usarse en un documento de instancia. |
| [set_IsNillable](./set_isnillable/)(bool) | Establece información que indica si **xsi:nil** puede aparecer en los datos de instancia. Indica si se puede asignar un valor nulo explícito al elemento. |
| [set_Name](./set_name/)(const String\&) | Establece el nombre del elemento. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de referencia de un elemento declarado en este esquema (o en otro esquema indicado por el espacio de nombres especificado). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Establece el tipo del elemento. Esto puede ser un tipo complejo o un tipo simple. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de un tipo de datos incorporado definido en este esquema o en otro esquema indicado por el espacio de nombres especificado. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de un elemento que está siendo sustituido por este elemento. |
| [XmlSchemaElement](./xmlschemaelement/)() | Inicializa una nueva instancia de la clase [XmlSchemaElement](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
