---
title: "Clase System::Xml::Schema::XmlSchemaSimpleType"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaSimpleType. Representa el elemento simpleType para contenido simple del XML Schema según lo especificado por el World Wide Web Consortium (W3C). Esta clase define un tipo simple. Los tipos simples pueden especificar información y restricciones para el valor de atributos o elementos con contenido solo de texto en C++."
type: docs
weight: 6200
url: /es/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Representa el elemento **simpleType** para contenido simple del XML [Schema](../) según lo especificado por el World Wide [Web](../../system.web/) Consortium (W3C). Esta clase define un tipo simple. Los tipos simples pueden especificar información y restricciones para el valor de atributos o elementos con contenido solo de texto.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Content](./get_content/)() | Devuelve uno de [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), o [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Establece uno de [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), o [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Inicializa una nueva instancia de la clase [XmlSchemaSimpleType](./). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
