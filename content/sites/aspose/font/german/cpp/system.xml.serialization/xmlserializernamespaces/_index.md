---
title: "System::Xml::Serialization::XmlSerializerNamespaces Klasse"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font für C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces Klasse. Enthält die XML-Namensräume und Präfixe, die der Serialization::XmlSerializer verwendet, um qualifizierte Namen in einer XML-Dokumentinstanz in C++ zu erzeugen."
type: docs
weight: 800
url: /de/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Enthält die XML-Namespace und -Präfixe, die der [Serialization::XmlSerializer](../xmlserializer/) verwendet, um qualifizierte Namen in einer XML-Dokumentinstanz zu erzeugen.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Fügt einem [Serialization::XmlSerializerNamespaces](./)-Objekt ein Präfix‑ und Namespace‑Paar hinzu. |
| [get_Count](./get_count/)() | Gibt die Anzahl der Präfix‑ und Namespace‑Paare in der Sammlung zurück. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Gibt das Array der Präfix‑ und Namespace‑Paare in einem [Serialization::XmlSerializerNamespaces](./)-Objekt zurück. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Initialisiert eine neue Instanz der Klasse [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Initialisiert eine neue Instanz der Klasse [Serialization::XmlSerializerNamespaces](./) und verwendet dabei die angegebene Instanz von **[XmlSerializerNamespaces](./)**, die die Sammlung von Präfix‑ und Namespace‑Paaren enthält. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Initialisiert eine neue Instanz der Klasse [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
