---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaChoice class. Representa el elemento choice (compositor) del XML Schema según lo especificado por el World Wide Web Consortium (W3C). El choice permite que solo uno de sus hijos aparezca en una instancia en C++."
type: docs
weight: 1400
url: /es/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Representa el elemento **choice** (compositor) del XML [Schema](../) según lo especificado por el World Wide [Web](../../system.web/) Consortium (W3C). El **choice** permite que solo uno de sus hijos aparezca en una instancia.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Items](./get_items/)() override | Devuelve la colección de los elementos contenidos con el compositor (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), o [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Inicializa una nueva instancia de la clase [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
