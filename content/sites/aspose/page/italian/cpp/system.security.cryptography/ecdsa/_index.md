---
title: "System::Security::Cryptography::ECDsa classe"
linktitle: "ECDsa"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Cryptography::ECDsa. Classe base per le implementazioni dell'algoritmo ECDsa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Classe base per le implementazioni dell'algoritmo [ECDsa](./). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea l'implementazione predefinita dell'algoritmo ECDSA. |
| static [Create](./create/)(const ECCurve\&) | Crea l'implementazione predefinita dell'algoritmo ECDSA con una chiave appena creata sulla curva specificata. |
| static [Create](./create/)(const ECParameters\&) | Crea l'implementazione predefinita dell'algoritmo ECDSA usando i parametri specificati. |
| static [Create](./create/)(const String\&) | Crea l'implementazione specificata dell'algoritmo ECDSA. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Esporta parametri espliciti. |
| virtual [ExportParameters](./exportparameters/)(bool) | Esporta parametri nominati o espliciti. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Genera una nuova coppia di chiavi pubblica/privata per la curva specificata. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informazioni RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ottiene l'algoritmo di firma da utilizzare. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importa tutti i parametri dalla struttura dati. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Calcola il valore hash del flusso binario specificato usando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Calcola la firma del valore di input specificato. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma del flusso binario specificato sia valida. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Controlla la firma dei dati. |
## Vedi anche

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
