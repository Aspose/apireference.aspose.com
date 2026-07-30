---
title: "System::Security::Cryptography::AsymmetricAlgorithm classe"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm class. Classe de base abstraite pour les algorithmes de chiffrement asymétrique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Classe de base abstraite pour les algorithmes de chiffrement asymétrique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clear](./clear/)() | Libère toutes les ressources. |
| static [Create](./create/)() | Crée un algorithme par défaut. Non implémenté. |
| static [Create](./create/)(const String\&) | Crée un algorithme par son nom. Non implémenté. |
| [Dispose](./dispose/)() override | Libère les ressources détenues par l'objet actuel. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Lit les paramètres de l'algorithme à partir d'une chaîne XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Obtient l'algorithme d'échange de clés à utiliser. |
| virtual [get_KeySize](./get_keysize/)() | Informations RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Obtient le tableau des tailles de clé autorisées. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Obtient l'algorithme de signature à utiliser. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Définit la taille de la clé. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Écrit les paramètres de l'algorithme dans une chaîne XML. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
