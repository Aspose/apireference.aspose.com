---
title: "classe System::Security::Cryptography::Xml::Transform"
linktitle: "Trasformazione"
second_title: "Aspose.Font per C++"
description: "classe System::Security::Cryptography::Xml::Transform. Fornisce informazioni sulla trasformazione dei dati da parte del firmatario. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usarlo per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.security.cryptography.xml/transform/
---
## Transform class


Fornisce informazioni sulla trasformazione dei dati da parte del firmatario. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usarlo per passarlo alle funzioni come argomento.

```cpp
class Transform : public System::Object
```

## Metodi

| Metodo | Descrizione |
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
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
