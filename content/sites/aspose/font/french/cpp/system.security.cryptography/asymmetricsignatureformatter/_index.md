---
title: "Classe System::Security::Cryptography::AsymmetricSignatureFormatter"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter class. Classe de base pour les formatteurs de signature asymétrique. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Classe de base pour les formatteurs de signature asymétrique. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | Informations RTTI. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Crée la signature pour la valeur de hachage spécifiée. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Définit l'algorithme de hachage à utiliser. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Définit l'algorithme asymétrique à utiliser lors du calcul de la signature. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
