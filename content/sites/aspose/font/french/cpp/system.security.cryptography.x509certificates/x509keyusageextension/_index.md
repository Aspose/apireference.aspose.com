---
title: "classe System::Security::Cryptography::X509Certificates::X509KeyUsageExtension"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::X509Certificates::X509KeyUsageExtension. Objet d’extension pour conserver des informations supplémentaires sur l’utilisation d’une clé. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1600
url: /fr/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Objet d’extension pour conserver des informations supplémentaires sur l’utilisation d’une clé. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Copie les données d’extension d’un autre objet. |
| [get_KeyUsages](./get_keyusages/)() | Obtient les utilisations de la clé. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | Informations RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Constructeur. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Constructeur. |
## Voir aussi

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
