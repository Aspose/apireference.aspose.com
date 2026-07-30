---
title: "Classe System::Security::Cryptography::ICspAsymmetricAlgorithm"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::ICspAsymmetricAlgorithm. Classe de base pour les algorithmes asymétriques. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Classe de base pour les algorithmes asymétriques. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Exporte le blob contenant les informations de clé. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | Informations RTTI. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Importe les informations de clé depuis le blob de données. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
