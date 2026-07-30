---
title: "System::Security::Cryptography::Xml::Reference classe"
linktitle: "Reference"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::Xml::Reference classe. Facilite la création des signatures XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.security.cryptography.xml/reference/
---
## Reference class


Facilite la création des signatures XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class Reference : public System::Object
```

## Méthodes

| Méthode | Description |
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
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
