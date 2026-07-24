---
title: "System::Security::Cryptography::Pkcs::SignedCms classe"
linktitle: "SignedCms"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::Pkcs::SignedCms classe. Signe le contenu conformément à la norme CMS/PKCS #7. Non implémentée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Signe le contenu conformément à la norme CMS/PKCS #7. Non implémentée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class SignedCms : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Crée une signature. |
| [Encode](./encode/)() | Encode le message CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Constructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
