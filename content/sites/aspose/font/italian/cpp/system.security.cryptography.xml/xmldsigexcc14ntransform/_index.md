---
title: "classe System::Security::Cryptography::Xml::XmlDsigExcC14NTransform"
linktitle: "XmlDsigExcC14NTransform"
second_title: "Aspose.Font per C++"
description: "classe System::Security::Cryptography::Xml::XmlDsigExcC14NTransform. Rappresenta la trasformazione di canonicalizzazione XML C14N esclusiva per una firma digitale senza commenti. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usarlo per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system.security.cryptography.xml/xmldsigexcc14ntransform/
---
## XmlDsigExcC14NTransform class


Rappresenta la trasformazione di canonicalizzazione XML C14N esclusiva per una firma digitale senza commenti. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usarlo per passarlo alle funzioni come argomento.

```cpp
class XmlDsigExcC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## Metodi

| Metodo | Descrizione |
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
## Vedi anche

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
