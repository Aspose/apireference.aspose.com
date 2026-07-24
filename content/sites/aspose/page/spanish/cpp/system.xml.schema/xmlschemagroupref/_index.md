---
title: "Clase System::Xml::Schema::XmlSchemaGroupRef"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaGroupRef. Representa el elemento group con el atributo ref del XML Schema según lo especificado por el World Wide Web Consortium (W3C). Esta clase se utiliza dentro de tipos complejos que hacen referencia a un group definido a nivel de schema en C++."
type: docs
weight: 3300
url: /es/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Representa el elemento **group** con atributo **ref** del XML [Schema](../) según lo especificado por el World Wide [Web](../../system.web/) Consortium (W3C). Esta clase se utiliza dentro de tipos complejos que hacen referencia a un **group** definido a nivel de **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Particle](./get_particle/)() | Devuelve una de las clases [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) o [XmlSchemaSequence](../xmlschemasequence/), que contiene la interpretación posterior a la compilación del valor **Particle**. |
| [get_RefName](./get_refname/)() | Devuelve el nombre de un group definido en este schema (o en otro schema indicado por el espacio de nombres especificado). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de un group definido en este schema (o en otro schema indicado por el espacio de nombres especificado). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Inicializa una nueva instancia de la clase [XmlSchemaGroupRef](./). |
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
