---
title: "System::Security::Cryptography::DSA classe"
linktitle: "DSA"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::DSA classe. Classe base per le implementazioni dell'algoritmo DSA. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.security.cryptography/dsa/
---
## DSA class


Classe base per le implementazioni dell'algoritmo [DSA](./). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea l'implementazione predefinita dell'algoritmo [DSA](./). |
| static [Create](./create/)(const String\&) | Crea l'implementazione predefinita dell'algoritmo [DSA](./). |
| static [Create](./create/)(int32_t) | Crea l'implementazione predefinita dell'algoritmo [DSA](./) con dimensione della chiave specificata. |
| static [Create](./create/)(const DSAParameters\&) | Crea l'implementazione predefinita dell'algoritmo [DSA](./) con parametri specificati. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Crea l'implementazione predefinita dell'algoritmo [DSA](./) con parametri codificati XML specificati. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | Informazioni RTTI. |
| virtual [ExportParameters](./exportparameters/)(bool) | Esporta tutti i parametri. |
| [FromXmlString](./fromxmlstring/)(String) override | Inizializza l'oggetto usando parametri codificati in XML. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Importa tutti i parametri dalla struttura dati. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Calcola il valore hash del flusso binario specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| [ToXmlString](./toxmlstring/)(bool) override | Esporta tutti i parametri in formato XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma del flusso binario specificato sia valida. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Verifica la firma [DSA](./) per i dati specificati. |
## Vedi anche

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
