---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlAttributeCollection class. Representa una colección de atributos que pueden ser accedidos por nombre o índice en C++."
type: docs
weight: 700
url: /es/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Representa una colección de atributos que pueden accederse por nombre o índice.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Inserta el atributo especificado como el último nodo en la colección. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Copia todos los objetos [XmlAttribute](../xmlattribute/) de esta colección en la matriz dada. |
| [idx_get](./idx_get/)(int32_t) | Devuelve el atributo con el índice especificado. |
| [idx_get](./idx_get/)(const String\&) | Devuelve el atributo con el nombre especificado. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Devuelve el atributo con el nombre local y el espacio de nombres Uniform Resource Identifier (URI) especificados. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Inserta el atributo especificado inmediatamente después del atributo de referencia especificado. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Inserta el atributo especificado inmediatamente antes del atributo de referencia especificado. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Inserta el atributo especificado como el primer nodo en la colección. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Elimina el atributo especificado de la colección. |
| [RemoveAll](./removeall/)() | Elimina todos los atributos de la colección. |
| [RemoveAt](./removeat/)(int32_t) | Elimina el atributo correspondiente al índice especificado de la colección. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Añade un [XmlNode](../xmlnode/) usando su resultado de [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
