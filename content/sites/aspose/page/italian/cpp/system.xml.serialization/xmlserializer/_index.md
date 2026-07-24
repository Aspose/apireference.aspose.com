---
title: "System::Xml::Serialization::XmlSerializer classe"
linktitle: "XmlSerializer"
second_title: "Aspose.Page per C++"
description: "System::Xml::Serialization::XmlSerializer classe. Esegue la serializzazione e la deserializzazione di oggetti verso e da documenti XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Esegue la serializzazione e la deserializzazione di oggetti verso e da documenti XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class XmlSerializer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Verifica se un lettore specifico è in uno stato deserializzabile. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Deserializza un documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Deserializza un documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Deserializza un documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Deserializza un documento XML in un oggetto. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Serializza il documento in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Serializza il documento in XML. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Codifica il nome dello spazio dei nomi. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Nome dello spazio dei nomi dei tipi WSDL. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
