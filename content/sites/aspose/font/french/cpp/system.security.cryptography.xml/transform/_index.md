---
title: "classe System::Security::Cryptography::Xml::Transform"
linktitle: "Transformation"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::Xml::Transform. Fournit des informations sur la transformation des données par le signataire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.security.cryptography.xml/transform/
---
## Transform class


Fournit des informations sur la transformation des données par le signataire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Transform : public System::Object
```

## Méthodes

| Méthode | Description |
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
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
