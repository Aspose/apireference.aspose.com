---
title: "Classe System::Security::Cryptography::Xml::XmlDsigC14NTransform"
linktitle: "XmlDsigC14NTransform"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::Xml::XmlDsigC14NTransform. Rappresenta la trasformazione di canonicalizzazione XML C14N per una firma digitale senza commenti. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.security.cryptography.xml/xmldsigc14ntransform/
---
## XmlDsigC14NTransform class


Rappresenta la trasformazione di canonicalizzazione XML C14N per una firma digitale senza commenti. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class XmlDsigC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## Metodi

| Metodo | Descrizione |
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
## Vedi anche

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
