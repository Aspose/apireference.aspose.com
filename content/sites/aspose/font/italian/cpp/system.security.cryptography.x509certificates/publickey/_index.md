---
title: "System::Security::Cryptography::X509Certificates::PublicKey classe"
linktitle: "PublicKey"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey class. Rappresenta le informazioni della chiave pubblica di un certificato X509. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Rappresenta le informazioni della chiave pubblica di un certificato X509. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class PublicKey : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Ottiene il valore della chiave pubblica codificato in ASN.1. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Ottiene i parametri della chiave pubblica codificati in ASN.1. |
| [get_Key](./get_key/)() const | Ottiene un [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) o un [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | Ottiene l'identificatore (OID) della chiave pubblica. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Costruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
