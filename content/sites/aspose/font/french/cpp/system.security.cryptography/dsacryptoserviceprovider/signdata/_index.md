---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignData méthode"
linktitle: "SignData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignData méthode. Calcule la signature de la valeur d'entrée spécifiée en C++."
type: docs
weight: 1500
url: /fr/cpp/system.security.cryptography/dsacryptoserviceprovider/signdata/
---
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) pour lire les données d'entrée depuis. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) pour lire les données d'entrée depuis. |
| décalage | int32_t | Indice de début de la tranche du tampon d'entrée. |
| count | int32_t | Taille de la tranche du tampon d'entrée. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Informations RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Informations RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux_d_entrée | const SharedPtr\<IO::Stream\>\& | Flux pour lire les données à signer depuis. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Informations RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
