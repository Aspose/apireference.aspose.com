---
title: "Clase System::Xml::Schema::XmlSchemaAny"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaAny. Representa el elemento any del Consorcio World Wide Web (W3C) en C++."
type: docs
weight: 800
url: /es/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Representa el elemento **any** del Consorcio World Wide [Web](../../system.web/) (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Devuelve los espacios de nombres que contienen los elementos que pueden usarse. |
| [get_ProcessContents](./get_processcontents/)() | Devuelve información sobre cómo una aplicación o procesador XML debe manejar la validación de documentos XML para los elementos especificados por el elemento **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | Establece los espacios de nombres que contienen los elementos que pueden usarse. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Establece información sobre cómo una aplicación o procesador XML debe manejar la validación de documentos XML para los elementos especificados por el elemento **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | Inicializa una nueva instancia de la clase [XmlSchemaAny](./). |
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
