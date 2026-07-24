---
title: "Clase System::Xml::Schema::XmlSchemaKeyref"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaKeyref. Esta clase representa el elemento keyref de XMLSchema según lo especificado por el Consorcio World Wide Web (W3C) en C++."
type: docs
weight: 4000
url: /es/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Esta clase representa el elemento **keyref** de XMLSchema según lo especificado por el Consorcio World Wide [Web](../../system.web/) (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Refer](./get_refer/)() | Devuelve el nombre de la clave a la que esta restricción hace referencia en otro tipo simple o complejo. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Establece el nombre de la clave a la que esta restricción hace referencia en otro tipo simple o complejo. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Inicializa una nueva instancia de la clase [XmlSchemaKeyref](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
