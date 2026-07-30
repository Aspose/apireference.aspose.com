---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 classe"
linktitle: "X509Certificate2"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 classe. Représente un certificat X509. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Représente un certificat X509. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Archived](./get_archived/)() const | Obtient une valeur indiquant que le certificat est archivé. |
| [get_Extensions](./get_extensions/)() const | Obtient la collection d'objets d'extension associés au certificat. |
| [get_FriendlyName](./get_friendlyname/)() const | Obtient le nom convivial du certificat. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Vérifie si le certificat possède une clé privée. |
| [get_IssuerName](./get_issuername/)() const | Obtient le nom de l'entité qui a délivré le certificat. |
| [get_NotAfter](./get_notafter/)() const | Obtient la date et l'heure locales après lesquelles le certificat n'est plus valide. |
| [get_NotBefore](./get_notbefore/)() const | Obtient la date et l'heure locales à partir desquelles le certificat devient valide. |
| [get_PrivateKey](./get_privatekey/)() const | Obtient la clé privée associée au certificat. |
| [get_PublicKey](./get_publickey/)() const | Obtient un objet [PublicKey](../publickey/) du certificat. |
| [get_RawData](./get_rawdata/)() const | Obtient les données brutes du certificat. |
| [get_SerialNumber](./get_serialnumber/)() const | Obtient le numéro de série d'un certificat. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Obtient l'algorithme utilisé pour créer la signature d'un certificat. |
| [get_SubjectName](./get_subjectname/)() const | Obtient le nom du sujet à partir d'un certificat. |
| [get_Thumbprint](./get_thumbprint/)() const | Obtient l'empreinte du certificat. |
| [get_Version](./get_version/)() const | Obtient la version du format du certificat. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Obtient le type de certificat contenu dans le tableau d'octets spécifié. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Obtient le type de certificat contenu dans le fichier spécifié. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Obtient la clé privée [RSA](../../system.security.cryptography/rsa/). |
| [GetDSAPublicKey](./getdsapublickey/)() const | Obtient la clé publique [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Obtient la clé privée [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Obtient la clé publique [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Obtient le nom du sujet ou de l'émetteur à partir du certificat. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Obtient la clé privée [RSA](../../system.security.cryptography/rsa/). |
| [GetRSAPublicKey](./getrsapublickey/)() const | Obtient la clé publique [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importe les informations du fichier de certificat spécifié. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Importe les informations du fichier de certificat spécifié. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importe les informations des données de certificat spécifiées. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Importe les informations des données de certificat spécifiées. |
| [Import](./import/)(const String\&) override | Importe les informations du fichier de certificat spécifié. |
| [Import](./import/)(const ByteArrayPtr\&) override | Importe les informations des données de certificat spécifiées. |
| [Reset](./reset/)() override | Réinitialise l'état du certificat. |
| [set_Archived](./set_archived/)(bool) const | Définit une valeur indiquant que le certificat est archivé. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Définit le nom convivial du certificat. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Définit ou supprime la clé privée associée au certificat. |
| [ToString](./tostring/)(bool) const override | Renvoie les informations du certificat au format texte. |
| [ToString](./tostring/)() const override | Renvoie les informations du certificat au format texte. |
| [Verify](./verify/)() const | Vérifie la chaîne de certificats. |
| [X509Certificate2](./x509certificate2/)() | Construit un [X509Certificate2](./) vide. |
| [X509Certificate2](./x509certificate2/)(const String\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Constructeur. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Constructeur. |
## Voir aussi

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
