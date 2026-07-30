---
title: "Classe System::Security::Cryptography::RSA"
linktitle: "RSA"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::RSA. Classe base per le implementazioni dell'algoritmo RSA. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3400
url: /it/cpp/system.security.cryptography/rsa/
---
## RSA class


Classe base per le implementazioni dell'algoritmo [RSA](./). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea l'implementazione predefinita dell'algoritmo [RSA](./). |
| static [Create](./create/)(const String\&) | Crea l'implementazione predefinita dell'algoritmo [RSA](./). |
| static [Create](./create/)(int32_t) | Crea l'implementazione predefinita dell'algoritmo [RSA](./) con dimensione della chiave specificata. |
| static [Create](./create/)(const RSAParameters\&) | Crea l'implementazione predefinita dell'algoritmo [RSA](./) con parametri specificati. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Crea l'implementazione predefinita dell'algoritmo [RSA](./) con parametri codificati in XML specificati. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Decripta i dati di input usando la modalità di padding specificata. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Decripta il valore usando la chiave privata. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Cripta i dati di input usando la modalità di padding specificata. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Cripta il valore usando la chiave privata. |
| virtual [ExportParameters](./exportparameters/)(bool) | Esporta tutti i parametri. |
| [FromXmlString](./fromxmlstring/)(String) override | Inizializza l'oggetto usando parametri codificati in XML. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informazioni RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Restituisce l'algoritmo di firma associato all'oggetto CSP. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Importa tutti i parametri dalla struttura dati. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash e il padding specificati, e firma il risultato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash e il padding specificati, e firma il risultato. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcola il valore hash del flusso binario specificato utilizzando l'algoritmo hash e il padding specificati, e firma il risultato. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Calcola la firma per il valore hash specificato. |
| [ToXmlString](./toxmlstring/)(bool) override | Esporta tutti i parametri in formato XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifica che la firma del flusso binario specificato sia valida. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Verifica che la firma dell'hash specificato sia valida. |
## Vedi anche

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
