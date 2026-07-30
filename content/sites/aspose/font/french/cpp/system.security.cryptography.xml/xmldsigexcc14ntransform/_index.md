---
title: "classe System::Security::Cryptography::Xml::XmlDsigExcC14NTransform"
linktitle: "XmlDsigExcC14NTransform"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::Xml::XmlDsigExcC14NTransform. Représente la transformation de canonicalisation XML exclusive C14N pour une signature numérique sans commentaires. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system.security.cryptography.xml/xmldsigexcc14ntransform/
---
## XmlDsigExcC14NTransform class


Représente la transformation de canonicalisation XML exclusive C14N pour une signature numérique sans commentaires. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class XmlDsigExcC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## Méthodes

| Méthode | Description |
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
## Voir aussi

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
