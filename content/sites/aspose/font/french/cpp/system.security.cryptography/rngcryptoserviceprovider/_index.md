---
title: "System::Security::Cryptography::RNGCryptoServiceProvider classe"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider classe. Générateur de nombres aléatoires qui suit la notion CSP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 3300
url: /fr/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Générateur de nombres aléatoires qui suit la notion CSP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Remplit les éléments existants du tableau avec des octets aléatoires. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Remplit les éléments de la vue du tableau existante avec des octets aléatoires. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Remplit les éléments existants du tableau avec des octets aléatoires non nuls. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Remplit les éléments de la vue du tableau existante avec des octets aléatoires non nuls. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Constructeur. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Destructeur. |
## Voir aussi

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
