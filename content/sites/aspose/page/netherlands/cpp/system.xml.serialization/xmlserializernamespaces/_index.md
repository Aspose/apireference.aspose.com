---
title: "System::Xml::Serialization::XmlSerializerNamespaces klasse"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces klasse. Bevat de XML-naamruimten en -prefixen die de Serialization::XmlSerializer gebruikt om gekwalificeerde namen te genereren in een XML-documentinstantie in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Bevat de XML-naamruimten en -prefixen die de [Serialization::XmlSerializer](../xmlserializer/) gebruikt om gekwalificeerde namen te genereren in een XML-documentinstantie.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Voegt een prefix- en naamruimtepaar toe aan een [Serialization::XmlSerializerNamespaces](./) object. |
| [get_Count](./get_count/)() | Retourneert het aantal prefix- en naamruimteparen in de collectie. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Retourneert de array van prefix- en naamruimteparen in een [Serialization::XmlSerializerNamespaces](./) object. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Initialiseert een nieuw exemplaar van de [Serialization::XmlSerializerNamespaces](./) klasse. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Initialiseert een nieuw exemplaar van de [Serialization::XmlSerializerNamespaces](./) klasse, met gebruik van de opgegeven instantie van **[XmlSerializerNamespaces](./)** die de collectie van prefix- en naamruimteparen bevat. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Initialiseert een nieuw exemplaar van de [Serialization::XmlSerializerNamespaces](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
