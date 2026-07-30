---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData méthode"
linktitle: "SignData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData méthode. Calcule la signature de la valeur d'entrée spécifiée en C++."
type: docs
weight: 1600
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) pour lire les données d'entrée depuis. |
| halg | const SharedPtr\<Object\>\& | Algorithme de hachage à utiliser. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) pour lire les données d'entrée depuis. |
| décalage | int32_t | Indice de début de la tranche du tampon d'entrée. |
| count | int32_t | Taille de la tranche du tampon d'entrée. |
| halg | const SharedPtr\<Object\>\& | Algorithme de hachage à utiliser. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Calcule la signature de la valeur d'entrée spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux_d_entrée | const SharedPtr\<IO::Stream\>\& | Flux pour lire les données à signer depuis. |
| halg | const SharedPtr\<Object\>\& | Algorithme de hachage à utiliser. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
