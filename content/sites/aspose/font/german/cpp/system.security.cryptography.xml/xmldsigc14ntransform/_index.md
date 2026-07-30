---
title: "System::Security::Cryptography::Xml::XmlDsigC14NTransform Klasse"
linktitle: "XmlDsigC14NTransform"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::XmlDsigC14NTransform Klasse. Stellt die C14N XML-Kanonisierungs-Transformation für eine digitale Signatur ohne Kommentare dar. Objekte dieser Klasse sollten ausschließlich über die System::MakeObject() Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.security.cryptography.xml/xmldsigc14ntransform/
---
## XmlDsigC14NTransform class


Stellt die C14N XML-Kanonisierungs-Transformation für eine digitale Signatur ohne Kommentare dar. Objekte dieser Klasse sollten ausschließlich über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class XmlDsigC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_InputTypes](./get_inputtypes/)() override |  |
| [get_OutputTypes](./get_outputtypes/)() override |  |
| [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) override |  |
| [GetOutput](./getoutput/)() override |  |
| [GetOutput](./getoutput/)(const TypeInfo\&) override |  |
| [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) override |  |
| [LoadInput](./loadinput/)(SharedPtr\<Object\>) override |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)() |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)(bool) |  |
## Siehe auch

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
