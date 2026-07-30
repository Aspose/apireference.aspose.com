---
title: "System::Security::Cryptography::Xml::Reference Klasse"
linktitle: "Reference"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::Reference Klasse. Erleichtert die Erstellung von XML-Signaturen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.security.cryptography.xml/reference/
---
## Reference class


Erleichtert die Erstellung von XML-Signaturen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Reference : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddTransform](./addtransform/)(SharedPtr\<Transform\>) |  |
| [get_DigestMethod](./get_digestmethod/)() |  |
| [get_DigestValue](./get_digestvalue/)() |  |
| [get_Id](./get_id/)() |  |
| [get_TransformChain](./get_transformchain/)() |  |
| [get_Type](./get_type/)() |  |
| [get_Uri](./get_uri/)() |  |
| [GetXml](./getxml/)() |  |
| [LoadXml](./loadxml/)(SharedPtr\<System::Xml::XmlElement\>) |  |
| [Reference](./reference/)() |  |
| [Reference](./reference/)(SharedPtr\<IO::Stream\>) |  |
| [Reference](./reference/)(String) |  |
| [set_DigestMethod](./set_digestmethod/)(String) |  |
| [set_DigestValue](./set_digestvalue/)(ArrayPtr\<uint8_t\>) |  |
| [set_Id](./set_id/)(String) |  |
| [set_TransformChain](./set_transformchain/)(SharedPtr\<TransformChain\>) |  |
| [set_Type](./set_type/)(String) |  |
| [set_Uri](./set_uri/)(String) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
