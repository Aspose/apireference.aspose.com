---
title: "Classe System::Security::Cryptography::RSAPKCS1SignatureFormatter"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::RSAPKCS1SignatureFormatter. Signe les données avec une signature RSA PKCS # 1 v1.5. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3800
url: /fr/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Signe les données avec une signature [RSA](../rsa/) PKCS # 1 v1.5. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Signe les données. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | Informations RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Constructeur. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Définit l'algorithme de hachage à utiliser. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Définit la valeur de la clé. Non implémenté. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Destructeur. |
## Voir aussi

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
