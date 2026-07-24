---
title: "System::Security::Cryptography::Xml::Reference klasse"
linktitle: "Reference"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::Xml::Reference klasse. Vergemakkelijkt het maken van XML‑handtekeningen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.security.cryptography.xml/reference/
---
## Reference class


Vergemakkelijkt het maken van XML‑handtekeningen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Reference : public System::Object
```

## Methoden

| Methode | Beschrijving |
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
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Page for C++](../../)
