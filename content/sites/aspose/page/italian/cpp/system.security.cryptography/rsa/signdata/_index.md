---
title: "Metodo System::Security::Cryptography::RSA::SignData"
linktitle: "SignData"
second_title: "Aspose.Page per C++"
description: "Metodo System::Security::Cryptography::RSA::SignData. Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash e il padding specificati, e firma il risultato in C++."
type: docs
weight: 1000
url: /it/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash e il padding specificati, e firma il risultato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Array di dati di input. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce la firma [RSA](../) per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash e il padding specificati, e firma il risultato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Array di dati di input. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Numero di byte da utilizzare come dati di input. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce la firma [RSA](../) per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcola il valore hash del flusso binario specificato utilizzando l'algoritmo hash e il padding specificati, e firma il risultato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | `const StreamPtr\&` | Flusso binario. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce la firma [RSA](../) per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
