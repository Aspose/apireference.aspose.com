---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 classe"
linktitle: "X509Certificate2"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 classe. Rappresenta un certificato X509. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Rappresenta un certificato X509. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Archived](./get_archived/)() const | Restituisce un valore che indica se il certificato è archiviato. |
| [get_Extensions](./get_extensions/)() const | Restituisce la collezione di oggetti di estensione associati al certificato. |
| [get_FriendlyName](./get_friendlyname/)() const | Restituisce il nome amichevole del certificato. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Verifica se il certificato ha una chiave privata. |
| [get_IssuerName](./get_issuername/)() const | Ottiene il nome della parte che ha emesso un certificato. |
| [get_NotAfter](./get_notafter/)() const | Ottiene la data e l'ora locali dopo le quali un certificato non è più valido. |
| [get_NotBefore](./get_notbefore/)() const | Ottiene la data e l'ora locali in cui un certificato diventa valido. |
| [get_PrivateKey](./get_privatekey/)() const | Ottiene la chiave privata associata al certificato. |
| [get_PublicKey](./get_publickey/)() const | Ottiene un oggetto [PublicKey](../publickey/) del certificato. |
| [get_RawData](./get_rawdata/)() const | Ottiene i dati grezzi del certificato. |
| [get_SerialNumber](./get_serialnumber/)() const | Ottiene il numero di serie di un certificato. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Ottiene l'algoritmo usato per creare la firma di un certificato. |
| [get_SubjectName](./get_subjectname/)() const | Ottiene il nome del soggetto da un certificato. |
| [get_Thumbprint](./get_thumbprint/)() const | Ottiene l'impronta digitale del certificato. |
| [get_Version](./get_version/)() const | Ottiene la versione del formato del certificato. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Ottiene il tipo di certificato contenuto nell'array di byte specificato. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Ottiene il tipo di certificato contenuto nel file specificato. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Ottiene la chiave privata [RSA](../../system.security.cryptography/rsa/); |
| [GetDSAPublicKey](./getdsapublickey/)() const | Ottiene la chiave pubblica [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Ottiene la chiave privata [RSA](../../system.security.cryptography/rsa/); |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Ottiene la chiave pubblica [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Ottiene il nome del soggetto o dell'emittente dal certificato. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Ottiene la chiave privata [RSA](../../system.security.cryptography/rsa/); |
| [GetRSAPublicKey](./getrsapublickey/)() const | Ottiene la chiave pubblica [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importa le informazioni dal file di certificato specificato. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Importa le informazioni dal file di certificato specificato. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importa le informazioni dai dati del certificato specificati. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Importa le informazioni dai dati del certificato specificati. |
| [Import](./import/)(const String\&) override | Importa le informazioni dal file di certificato specificato. |
| [Import](./import/)(const ByteArrayPtr\&) override | Importa le informazioni dai dati del certificato specificati. |
| [Reset](./reset/)() override | Reimposta lo stato del certificato. |
| [set_Archived](./set_archived/)(bool) const | Imposta un valore che indica che il certificato è archiviato. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Imposta il nome descrittivo del certificato. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Imposta o cancella la chiave privata associata al certificato. |
| [ToString](./tostring/)(bool) const override | Restituisce le informazioni del certificato in formato testo. |
| [ToString](./tostring/)() const override | Restituisce le informazioni del certificato in formato testo. |
| [Verify](./verify/)() const | Verifica la catena del certificato. |
| [X509Certificate2](./x509certificate2/)() | Costruisce un [X509Certificate2](./) vuoto. |
| [X509Certificate2](./x509certificate2/)(const String\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Costruttore. |
## Vedi anche

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
