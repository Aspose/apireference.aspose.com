---
title: "Clase System::Xml::Schema::XmlSchemaAttributeGroupRef"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaAttributeGroupRef. Representa el elemento attributeGroup con el atributo ref del Esquema XML según lo especificado por el . AttributesGroupRef es la referencia para un attributeGroup, la propiedad name contiene el grupo de atributos al que se hace referencia en C++."
type: docs
weight: 1300
url: /es/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Representa el elemento **attributeGroup** con el atributo **ref** del [Esquema](../) XML según lo especificado por el [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef es la referencia para un attributeGroup, la propiedad name contiene el grupo de atributos al que se hace referencia.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_RefName](./get_refname/)() | Devuelve el nombre del elemento **attributeGroup** referenciado. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre del elemento **attributeGroup** referenciado. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Inicializa una nueva instancia de la clase [XmlSchemaAttributeGroupRef](./). |
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
