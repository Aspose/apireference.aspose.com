---
title: "System::Security::Cryptography::Xml::Reference classe"
linktitle: "Reference"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::Xml::Reference classe. Facilita la creazione delle firme XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.security.cryptography.xml/reference/
---
## Reference class


Facilita la creazione delle firme XML. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class Reference : public System::Object
```

## Metodi

| Metodo | Descrizione |
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
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
