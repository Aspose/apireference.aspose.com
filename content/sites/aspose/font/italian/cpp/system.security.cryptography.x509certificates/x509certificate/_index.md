---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate class. Certificato X.509 v.3. I certificati crittografati non sono supportati. È supportata solo la flag X509KeyStorageFlags::DefaultKeySet. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


Certificato X.509 v.3. I certificati crittografati non sono supportati. È supportata solo la flag [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Crea un certificato dal file PKCS7 specificato. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Crea un certificato dal file firmato specificato. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta due certificati. |
| virtual [Export](./export/)(X509ContentType) const | Esporta l'oggetto corrente in un array di byte usando il formato specificato. NON IMPLEMENTATO. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Esporta l'oggetto corrente in un array di byte usando il formato specificato. NON IMPLEMENTATO. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Esporta l'oggetto corrente in un array di byte usando il formato specificato. NON IMPLEMENTATO. |
| [get_Handle](./get_handle/)() const | Ottiene un handle al contesto del certificato Microsoft Cryptographic API. |
| [get_Issuer](./get_issuer/)() const | Ottiene il nome dell'autorità di certificazione che ha emesso il certificato X-509v3. |
| [get_Subject](./get_subject/)() const | Ottiene il nome distinto del soggetto dal certificato. |
| virtual [GetCertHash](./getcerthash/)() const | Ottiene l'hash dell'oggetto corrente come array di byte. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Ottiene l'hash dell'oggetto corrente come array di byte. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Ottiene l'hash [SHA1](../../system.security.cryptography/sha1/) dell'oggetto corrente come stringa esadecimale. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Ottiene l'hash [SHA1](../../system.security.cryptography/sha1/) dell'oggetto corrente come stringa esadecimale. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Ottiene la data di validità del certificato corrente. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Ottiene la data di scadenza del certificato corrente. |
| virtual [GetFormat](./getformat/)() const | Ottiene il nome del formato del certificato. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash del certificato. |
| virtual [GetIssuerName](./getissuername/)() const | Ottiene il nome dell'autorità di certificazione che ha emesso il certificato corrente. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Ottiene le informazioni chiave per il certificato corrente come stringa. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Ottiene le informazioni chiave per il certificato corrente come array di byte. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Ottiene le informazioni chiave per il certificato corrente come stringa esadecimale. |
| virtual [GetName](./getname/)() const | Ottiene il nome del principal a cui è stato emesso il certificato corrente. |
| virtual [GetPublicKey](./getpublickey/)() const | Ottiene la chiave pubblica dal certificato come array di byte. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Ottiene la chiave pubblica dal certificato come stringa esadecimale. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Ottiene i dati grezzi dal certificato come array di byte. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Ottiene i dati grezzi dal certificato come stringa esadecimale. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Ottiene il numero di serie dal certificato come array di byte. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Ottiene il numero di serie dal certificato come stringa esadecimale. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importa le informazioni dal file di certificato specificato. NON IMPLEMENTATO. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Importa le informazioni dal file di certificato specificato. NON IMPLEMENTATO. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importa le informazioni dai dati di certificato specificati. NON IMPLEMENTATO. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Importa le informazioni dai dati di certificato specificati. NON IMPLEMENTATO. |
| virtual [Import](./import/)(const String\&) | Importa le informazioni dal file di certificato specificato. NON IMPLEMENTATO. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Importa le informazioni dai dati di certificato specificati. NON IMPLEMENTATO. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Reimposta lo stato del certificato. |
| virtual [ToString](./tostring/)(bool) const | Restituisce le informazioni del certificato in formato testo. |
| [ToString](./tostring/)() const override | Restituisce le informazioni del certificato in formato testo. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const String\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Costruttore. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Costruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Tipo puntatore. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
