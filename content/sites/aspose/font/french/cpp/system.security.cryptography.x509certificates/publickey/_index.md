---
title: "classe System::Security::Cryptography::X509Certificates::PublicKey"
linktitle: "CléPublique"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::X509Certificates::PublicKey. Représente les informations de clé publique d’un certificat X509. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Représente les informations de clé publique d’un certificat X509. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class PublicKey : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Obtient la valeur de la clé publique encodée en ASN.1. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Obtient les paramètres de la clé publique encodés en ASN.1. |
| [get_Key](./get_key/)() const | Obtient un [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) ou un [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | Obtient l'identifiant (OID) de la clé publique. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Constructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
