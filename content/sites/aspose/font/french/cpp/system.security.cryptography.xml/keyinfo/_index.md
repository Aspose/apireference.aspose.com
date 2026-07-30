---
title: "System::Security::Cryptography::Xml::KeyInfo classe"
linktitle: "KeyInfo"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::Xml::KeyInfo classe. Représente l'élément KeyInfo d'une signature numérique XML ou d'un chiffrement XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


Représente l'élément [KeyInfo](./) d'une signature numérique XML ou d'un chiffrement XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
