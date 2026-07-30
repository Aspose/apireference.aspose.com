---
title: "Classe System::Security::Cryptography::Pkcs::CmsSigner"
linktitle: "CmsSigner"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::Pkcs::CmsSigner. Fournit une API pour signer des objets en utilisant CMS. Ne signe pas les objets elle-même, utilisez la classe SignedCMS pour le faire. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Fournit une API pour signer des objets en utilisant CMS. Ne signe pas les objets elle-même, utilisez la classe SignedCMS pour le faire. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class CmsSigner : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Initialise le signataire avec un certificat X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Obtient l'algorithme de hachage utilisé avec la signature. |
| [get_IncludeOption](./get_includeoption/)() const | Vérifie quels certificats de la chaîne seront inclus dans la signature. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Définit l'algorithme de hachage utilisé avec la signature. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Spécifie quels certificats de la chaîne seront inclus dans la signature. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
