---
title: "System::Security::Cryptography::Xml::XmlDsigExcC14NTransform Klasse"
linktitle: "XmlDsigExcC14NTransform"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::XmlDsigExcC14NTransform Klasse. Stellt die exklusive C14N XML-Kanonisierungs-Transformation für eine digitale Signatur ohne Kommentare dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.security.cryptography.xml/xmldsigexcc14ntransform/
---
## XmlDsigExcC14NTransform class


Stellt die exklusive C14N XML-Kanonisierungs-Transformation für eine digitale Signatur ohne Kommentare dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class XmlDsigExcC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_InclusiveNamespacesPrefixList](./get_inclusivenamespacesprefixlist/)() |  |
| [get_InputTypes](./get_inputtypes/)() override |  |
| [get_OutputTypes](./get_outputtypes/)() override |  |
| [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) override |  |
| [GetOutput](./getoutput/)() override |  |
| [GetOutput](./getoutput/)(const TypeInfo\&) override |  |
| [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) override |  |
| [LoadInput](./loadinput/)(SharedPtr\<Object\>) override |  |
| [set_InclusiveNamespacesPrefixList](./set_inclusivenamespacesprefixlist/)(String) |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)() |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)(bool) |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)(bool, String) |  |
## Siehe auch

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
