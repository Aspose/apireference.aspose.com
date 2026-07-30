---
title: "Classe System::Xml::Serialization::XmlSerializer"
linktitle: "XmlSerializer"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Serialization::XmlSerializer. Esegue la serializzazione e la deserializzazione di oggetti verso e da documenti XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Esegue la serializzazione e la deserializzazione di oggetti in e da documenti XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class XmlSerializer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Verifica se il lettore specifico è in uno stato deserializzabile. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Deserializza il documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Deserializza il documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Deserializza il documento XML in un oggetto. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Deserializza il documento XML in un oggetto. |
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
| static [EncodingNamespace](./encodingnamespace/) | Nome dello spazio dei nomi di codifica. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Nome dello spazio dei nomi dei tipi WSDL. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
