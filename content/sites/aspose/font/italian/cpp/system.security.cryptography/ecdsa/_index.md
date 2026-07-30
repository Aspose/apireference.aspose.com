---
title: "Classe System::Security::Cryptography::ECDsa"
linktitle: "ECDsa"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::ECDsa. Classe base per le implementazioni dell'algoritmo ECDsa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1300
url: /it/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Classe base per le implementazioni dell'algoritmo [ECDsa](./). Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Esporta i parametri espliciti. |
| virtual [ExportParameters](./exportparameters/)(bool) | Esporta i parametri nominati o espliciti. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Genera una nuova coppia di chiavi pubblica/privata per la curva specificata. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informazioni RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ottiene l'algoritmo di firma da utilizzare. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importa tutti i parametri dalla struttura dati. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Calcola il valore hash del flusso binario specificato utilizzando l'algoritmo hash specificato e firma il risultato. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Calcola la firma del valore di input specificato. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma del flusso binario specificato sia valida. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Controlla la firma dei dati. |
## Vedi anche

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
