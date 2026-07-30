---
title: "System::Security::Cryptography::ECDsaBotan class"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ECDsaBotan classe. Algoritmo ECDsa in forma Botan. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Costruttore. Usa i parametri predefiniti. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Costruttore. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Costruttore. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Costruttore. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Costruttore. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Costruttore. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Esporta i parametri espliciti. |
| [ExportParameters](./exportparameters/)(bool) override | Esporta i parametri nominati o espliciti. |
| [FromXmlString](./fromxmlstring/)(String) override | Inizializza l'oggetto usando parametri codificati in XML. Non implementato. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Inizializza l'oggetto usando parametri codificati in XML. Non implementato. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Genera una nuova coppia di chiavi pubblica/privata per la curva specificata. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Ottiene l'algoritmo di hash. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Calcola il valore hash dell'array di dati specificato usando l'algoritmo di hash specificato. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Calcola il valore hash del flusso binario specificato usando l'algoritmo di hash specificato. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Importa tutti i parametri dalla struttura dati. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Imposta l'algoritmo di hash. |
| [set_KeySize](./set_keysize/)(int32_t) override | Imposta la dimensione della chiave. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Calcola il valore hash dell'array di dati specificato e firma il risultato. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Calcola il valore hash dell'array di dati specificato e firma il risultato. |
| [SignData](./signdata/)(const StreamPtr\&) | Calcola il valore hash del flusso binario specificato e firma il risultato. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informazioni RTTI. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informazioni RTTI. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informazioni RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Calcola la firma del valore di input specificato. |
| [ToXmlString](./toxmlstring/)(bool) override | Esporta tutti i parametri in formato XML. Non implementato. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Esporta tutti i parametri in formato XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Verifica che la firma del flusso binario specificato sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma dei dati specificati sia valida. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifica che la firma del flusso binario specificato sia valida. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Controlla la firma dei dati. |
## Vedi anche

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
