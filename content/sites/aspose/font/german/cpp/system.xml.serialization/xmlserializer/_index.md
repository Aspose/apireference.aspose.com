---
title: "System::Xml::Serialization::XmlSerializer Klasse"
linktitle: "XmlSerializer"
second_title: "Aspose.Font für C++"
description: "System::Xml::Serialization::XmlSerializer Klasse. Führt die Serialisierung und Deserialisierung von Objekten in und aus XML-Dokumenten durch. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Führt die Serialisierung und Deserialisierung von Objekten in und aus XML-Dokumenten durch. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class XmlSerializer : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Überprüft, ob ein bestimmter Reader sich im deserialisierbaren Zustand befindet. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Deserialisiert ein XML-Dokument in ein Objekt. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Deserialisiert ein XML-Dokument in ein Objekt. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Deserialisiert ein XML-Dokument in ein Objekt. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Deserialisiert ein XML-Dokument in ein Objekt. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Serialisiert das Dokument in XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Serialisiert das Dokument in XML. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Kodiert den Namespace-Namen. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL-Typen Namespace-Name. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
