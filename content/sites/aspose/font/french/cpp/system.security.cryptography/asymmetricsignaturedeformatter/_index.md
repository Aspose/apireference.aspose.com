---
title: "Classe System::Security::Cryptography::AsymmetricSignatureDeformatter"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::AsymmetricSignatureDeformatter. Classe de base pour les déformateurs de signature asymétrique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Classe de base pour les déformateurs de signature asymétrique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Informations RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Définit la clé à utiliser avec l'algorithme. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Vérifie la signature des données. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Vérifie la signature des données. Non implémenté. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
