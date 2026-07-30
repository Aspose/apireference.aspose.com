---
title: "classe System::Security::Cryptography::X509Certificates::X509Extension"
linktitle: "X509Extension"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::X509Certificates::X509Extension. Objet d’extension pour conserver des informations supplémentaires associées à un certificat X.509. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Objet d’extension pour conserver des informations supplémentaires associées à un certificat X.509. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Copie les données d’extension d’un autre objet. |
| [get_Critical](./get_critical/)() const | Vérifie si l’extension est critique. |
| [set_Critical](./set_critical/)(bool) | Définit si l’extension est critique. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Informations RTTI. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Constructeur. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Constructeur. |
## Voir aussi

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
