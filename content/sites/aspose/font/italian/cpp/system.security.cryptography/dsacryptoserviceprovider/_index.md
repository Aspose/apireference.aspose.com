---
title: "classe System::Security::Cryptography::DSACryptoServiceProvider"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::DSACryptoServiceProvider. Algoritmo DSA in forma CSP. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Crea una firma [DSA](../dsa/) per i dati specificati. |
| [Dispose](./dispose/)() override | Libera i dati associati all'oggetto. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Costruttore. Usa i parametri predefiniti. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Costruttore. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Costruttore. Non implementato. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Costruttore. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Costruttore. Non implementato. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Esporta blob con informazioni sulla chiave. Non implementato. |
| [ExportParameters](./exportparameters/)(bool) override | Esporta parametri CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Ottiene un oggetto [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Verifica l'algoritmo di scambio chiavi associato all'oggetto. |
| [get_KeySize](./get_keysize/)() override | Ottiene la dimensione della chiave. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Verifica se la chiave è persistita nell'oggetto CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Verifica se è presente solo la chiave pubblica nell'oggetto CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ottiene l'algoritmo di firma da utilizzare. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Verifica se la chiave persiste nello store della macchina anziché nello store dell'utente. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importa blob con informazioni sulla chiave. Non implementato. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Importa tutti i parametri dalla struttura dati. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definisce se la chiave è persistita nell'oggetto CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definisce se la chiave persiste nello store della macchina anziché nello store dell'utente. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Calcola la firma del valore di input specificato. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Calcola la firma del valore di input specificato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Calcola la firma del valore di input specificato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informazioni RTTI. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informazioni RTTI. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informazioni RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Calcola la firma del valore di input specificato. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Controlla la firma dei dati. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma del flusso binario specificato sia valida. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Controlla la firma dei dati. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Verifica la firma [DSA](../dsa/) per i dati specificati. |
## Vedi anche

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
