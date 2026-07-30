---
title: "System::Security::Cryptography::X509Certificates::X509Certificate classe"
linktitle: "X509Certificate"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate classe. Certificat X.509 v.3. Les certificats chiffrés ne sont pas pris en charge. Seul le drapeau X509KeyStorageFlags::DefaultKeySet est pris en charge. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


Certificat X.509 v.3. Les certificats chiffrés ne sont pas pris en charge. Seul le drapeau [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) est pris en charge. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Crée un certificat à partir du fichier PKCS7 spécifié. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Crée un certificat à partir du fichier signé spécifié. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare deux certificats. |
| virtual [Export](./export/)(X509ContentType) const | Exporte l'objet actuel vers un tableau d'octets en utilisant le format spécifié. NON IMPLEMENTÉ. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Exporte l'objet actuel vers un tableau d'octets en utilisant le format spécifié. NON IMPLEMENTÉ. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Exporte l'objet actuel vers un tableau d'octets en utilisant le format spécifié. NON IMPLEMENTÉ. |
| [get_Handle](./get_handle/)() const | Obtient un handle vers le contexte de certificat Microsoft Cryptographic API. |
| [get_Issuer](./get_issuer/)() const | Obtient le nom de l'autorité de certification qui a émis le certificat X-509v3. |
| [get_Subject](./get_subject/)() const | Obtient le nom distinctif du sujet à partir du certificat. |
| virtual [GetCertHash](./getcerthash/)() const | Obtient le hachage de l'objet actuel sous forme de tableau d'octets. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Obtient le hachage de l'objet actuel sous forme de tableau d'octets. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Obtient le hachage [SHA1](../../system.security.cryptography/sha1/) de l'objet actuel sous forme de chaîne hexadécimale. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Obtient le hachage [SHA1](../../system.security.cryptography/sha1/) de l'objet actuel sous forme de chaîne hexadécimale. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Obtient la date d'effet du certificat actuel. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Obtient la date d'expiration du certificat actuel. |
| virtual [GetFormat](./getformat/)() const | Obtient le nom du format du certificat. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage du certificat. |
| virtual [GetIssuerName](./getissuername/)() const | Obtient le nom de l'autorité de certification qui a émis le certificat actuel. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Obtient les informations de clé du certificat actuel sous forme de chaîne. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Obtient les informations de clé du certificat actuel sous forme de tableau d'octets. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Obtient les informations de clé du certificat actuel sous forme de chaîne hexadécimale. |
| virtual [GetName](./getname/)() const | Obtient le nom du principal auquel le certificat actuel a été émis. |
| virtual [GetPublicKey](./getpublickey/)() const | Obtient la clé publique du certificat sous forme de tableau d'octets. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Obtient la clé publique du certificat sous forme de chaîne hexadécimale. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Obtient les données brutes du certificat sous forme de tableau d'octets. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Obtient les données brutes du certificat sous forme de chaîne hexadécimale. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Obtient le numéro de série du certificat sous forme de tableau d'octets. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Obtient le numéro de série du certificat sous forme de chaîne hexadécimale. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importe les informations du fichier de certificat spécifié. NON IMPLEMENTÉ. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Importe les informations du fichier de certificat spécifié. NON IMPLEMENTÉ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importe les informations des données de certificat spécifiées. NON IMPLEMENTÉ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Importe les informations des données de certificat spécifiées. NON IMPLEMENTÉ. |
| virtual [Import](./import/)(const String\&) | Importe les informations du fichier de certificat spécifié. NON IMPLEMENTÉ. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Importe les informations des données de certificat spécifiées. NON IMPLEMENTÉ. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Réinitialise l'état du certificat. |
| virtual [ToString](./tostring/)(bool) const | Renvoie les informations du certificat au format texte. |
| [ToString](./tostring/)() const override | Renvoie les informations du certificat au format texte. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const String\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Constructeur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Type de pointeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
