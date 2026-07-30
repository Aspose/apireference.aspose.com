---
title: "System::Security::Cryptography::Xml::Transform Klasse"
linktitle: "Transformation"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::Transform Klasse. Liefert Informationen über die Transformation der Daten durch den Unterzeichner. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.security.cryptography.xml/transform/
---
## Transform class


Stellt Informationen über die Transformation der Daten durch den Unterzeichner bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Transform : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Algorithm](./get_algorithm/)() |  |
| [get_Context](./get_context/)() |  |
| virtual [get_InputTypes](./get_inputtypes/)() |  |
| virtual [get_OutputTypes](./get_outputtypes/)() |  |
| [get_PropagatedNamespaces](./get_propagatednamespaces/)() |  |
| virtual [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) |  |
| virtual [GetOutput](./getoutput/)() |  |
| virtual [GetOutput](./getoutput/)(const TypeInfo\&) |  |
| virtual [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) |  |
| virtual [LoadInput](./loadinput/)(SharedPtr\<Object\>) |  |
| [set_Algorithm](./set_algorithm/)(String) |  |
| [set_Context](./set_context/)(SharedPtr\<System::Xml::XmlElement\>) |  |
| [set_Resolver](./set_resolver/)(SharedPtr\<System::Xml::XmlResolver\>) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
