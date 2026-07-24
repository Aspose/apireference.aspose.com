---
title: "System::Xml::Serialization::XmlSerializerNamespaces klass"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page för C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces klass. Innehåller XML-namnrymderna och prefixen som Serialization::XmlSerializer använder för att generera kvalificerade namn i en XML-dokumentinstans i C++."
type: docs
weight: 800
url: /sv/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Innehåller XML-namnrymderna och prefixen som [Serialization::XmlSerializer](../xmlserializer/) använder för att generera kvalificerade namn i en XML-dokumentinstans.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Lägger till ett prefix‑ och namnrymdspar till ett [Serialization::XmlSerializerNamespaces](./)‑objekt. |
| [get_Count](./get_count/)() | Returnerar antalet prefix‑ och namnrymdspar i samlingen. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Returnerar arrayen med prefix‑ och namnrymdspar i ett [Serialization::XmlSerializerNamespaces](./)‑objekt. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Initierar en ny instans av klassen [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Initierar en ny instans av klassen [Serialization::XmlSerializerNamespaces](./), med den angivna instansen av **[XmlSerializerNamespaces](./)** som innehåller samlingen av prefix‑ och namnrymdspar. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Initierar en ny instans av klassen [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
