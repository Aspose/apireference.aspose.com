---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionEnumerator classe"
linktitle: "X509ExtensionEnumerator"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionEnumerator classe. Énumérateur pour parcourir la collection d'extensions. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.security.cryptography.x509certificates/x509extensionenumerator/
---
## X509ExtensionEnumerator class


Énumérateur pour parcourir la collection d'extensions. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class X509ExtensionEnumerator : public System::Collections::Generic::SimpleEnumerator<X509ExtensionCollection::vector_t>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [X509ExtensionEnumerator](./x509extensionenumerator/)(const SharedPtr\<X509ExtensionCollection\>\&) | Crée un énumérateur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Type parent. |
| [ThisType](./thistype/) | Ce type. |
## Voir aussi

* Class [SimpleEnumerator](../../system.collections.generic/simpleenumerator/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
