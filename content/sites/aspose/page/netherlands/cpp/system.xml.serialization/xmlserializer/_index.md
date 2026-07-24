---
title: "System::Xml::Serialization::XmlSerializer klasse"
linktitle: "XmlSerializer"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Serialization::XmlSerializer klasse. Voert serialisatie en deserialisatie van objecten naar en van XML‑documenten uit. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Voert serialisatie en deserialisatie van objecten naar en van XML‑documenten uit. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class XmlSerializer : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Controleert of een specifieke lezer zich in een deserialiseerbare toestand bevindt. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Deserialiseert een XML‑document naar een object. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Deserialiseert een XML‑document naar een object. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Deserialiseert een XML‑document naar een object. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Deserialiseert een XML‑document naar een object. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Serialiseert een document naar XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Serialiseert een document naar XML. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Encodeert de naam van de namespace. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Naam van de WSDL‑typenamespace. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
