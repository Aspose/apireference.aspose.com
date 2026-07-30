---
title: "System::Security::Cryptography::RSACryptoServiceProvider classe"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider classe. Algoritmo RSA in forma CSP. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3500
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Decripta il messaggio. Non implementato. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Decripta i dati di input usando la modalità di padding specificata. |
| [Dispose](./dispose/)() override | Libera i dati associati all'oggetto. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Cripta il messaggio. Non implementato. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Cripta i dati di input usando la modalità di padding specificata. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Esporta blob con informazioni sulla chiave. Non implementato. |
| [ExportParameters](./exportparameters/)(bool) override | Esporta parametri CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Ottiene un oggetto [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Verifica l'algoritmo di scambio chiavi associato all'oggetto. |
| [get_KeySize](./get_keysize/)() override | Ottiene la dimensione della chiave utilizzata dall'algoritmo. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Verifica se la chiave è persistita nell'oggetto CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Verifica se è presente solo la chiave pubblica nell'oggetto CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Restituisce l'algoritmo di firma associato all'oggetto CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Verifica se la chiave persiste nello store della macchina anziché nello store dell'utente. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importa blob con informazioni sulla chiave. Non implementato. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Importa i parametri CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | Informazioni RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Costruttore. Non implementato. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Costruttore. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Costruttore. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Costruttore. Non implementato. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definisce se la chiave è persistita nell'oggetto CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definisce se la chiave persiste nello store della macchina anziché nello store dell'utente. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Calcola la firma del valore di input specificato. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Calcola la firma del valore di input specificato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Calcola la firma del valore di input specificato. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Calcola la firma per il valore hash specificato. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Calcola la firma del valore di input specificato. Non implementato. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Controlla la firma dei dati. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Controlla la firma dei dati. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Verifica che la firma dell'hash specificato sia valida. |
## Vedi anche

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
