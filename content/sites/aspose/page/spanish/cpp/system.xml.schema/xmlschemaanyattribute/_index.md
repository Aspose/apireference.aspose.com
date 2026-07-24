---
title: "System::Xml::Schema::XmlSchemaAnyAttribute clase"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute clase. Representa el elemento anyAttribute del World Wide Web Consortium (W3C) en C++."
type: docs
weight: 900
url: /es/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


Representa el World Wide [Web](../../system.web/) Consortium (W3C) **anyAttribute** elemento.

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Devuelve los espacios de nombres que contienen los atributos que pueden usarse. |
| [get_ProcessContents](./get_processcontents/)() | Devuelve información sobre cómo una aplicación o procesador XML debe manejar la validación de documentos XML para los atributos especificados por el elemento **anyAttribute**. |
| [set_Namespace](./set_namespace/)(const String\&) | Establece los espacios de nombres que contienen los atributos que pueden usarse. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Establece información sobre cómo una aplicación o procesador XML debe manejar la validación de documentos XML para los atributos especificados por el elemento **anyAttribute**. |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | Inicializa una nueva instancia de la clase [XmlSchemaAnyAttribute](./). |
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
