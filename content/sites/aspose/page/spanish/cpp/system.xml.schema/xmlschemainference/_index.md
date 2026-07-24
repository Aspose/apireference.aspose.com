---
title: "System::Xml::Schema::XmlSchemaInference clase"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaInference clase. Infiere un esquema de Lenguaje de Definición de Esquema XML (XSD) a partir de un documento XML. La clase XmlSchemaInference no puede heredarse en C++."
type: docs
weight: 3700
url: /es/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Infiere un esquema [Schema](../) del Lenguaje de Definición (XSD) a partir de un documento XML. La clase [XmlSchemaInference](./) no puede heredarse.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Enumeración | Descripción |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Afecta la información de ocurrencia y tipo inferida por la clase [XmlSchemaInference](./) para elementos y atributos en un documento XML. |
## Métodos

| Método | Descripción |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Devuelve el valor [XmlSchemaInference::InferenceOption](./inferenceoption/) que afecta las declaraciones de ocurrencia del esquema inferidas del documento XML. |
| [get_TypeInference](./get_typeinference/)() | Devuelve el valor [XmlSchemaInference::InferenceOption](./inferenceoption/) que afecta los tipos inferidos del documento XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Infiere un esquema XML [Schema](../) del Lenguaje de Definición (XSD) a partir del documento XML contenido en el objeto [XmlReader](../../system.xml/xmlreader/) especificado. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Infiere un esquema XML [Schema](../) del Lenguaje de Definición (XSD) a partir del documento XML contenido en el objeto [XmlReader](../../system.xml/xmlreader/) especificado, y refina el esquema inferido usando un esquema existente en el objeto [XmlSchemaSet](../xmlschemaset/) especificado con el mismo espacio de nombres de destino. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Establece el valor [XmlSchemaInference::InferenceOption](./inferenceoption/) que afecta las declaraciones de ocurrencia del esquema inferidas del documento XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Establece el valor [XmlSchemaInference::InferenceOption](./inferenceoption/) que afecta a los tipos inferidos del documento XML. |
| [XmlSchemaInference](./xmlschemainference/)() | Inicializa una nueva instancia de la clase [XmlSchemaInference](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
