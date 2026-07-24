---
title: "Clase System::Xml::Serialization::XmlSerializer"
linktitle: "XmlSerializer"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Serialization::XmlSerializer. Realiza la serialización y deserialización de objetos hacia y desde documentos XML. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 600
url: /es/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Realiza la serialización y deserialización de objetos hacia y desde documentos XML. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en el puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class XmlSerializer : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Comprueba si el lector específico está en estado deserializable. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Deserializa el documento XML en un objeto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Deserializa el documento XML en un objeto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Deserializa el documento XML en un objeto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Deserializa el documento XML en un objeto. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Serializa el documento en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Serializa el documento en XML. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Codifica el nombre del espacio de nombres. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Nombre del espacio de nombres de tipos WSDL. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
