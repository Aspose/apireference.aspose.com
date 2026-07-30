---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName classe"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName classe. Représente le nom distinctif d'un certificat X509. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Représente le nom distinctif d'un certificat X509. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Décode le nom en utilisant les paramètres spécifiés par les indicateurs. |
| [Format](./format/)(bool) const override | Formate le nom pour l'impression. |
| [get_Name](./get_name/)() const | Obtient le nom distinctif du certificat. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | Informations RTTI. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Constructeur. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Constructeur. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Constructeur de copie. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Constructeur. |
## Voir aussi

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
