---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData metodo"
linktitle: "SignData"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData metodo. Calcola la firma del valore di input specificato in C++."
type: docs
weight: 1600
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) da cui leggere i dati di input. |
| halg | const SharedPtr\<Object\>\& | Algoritmo di hash da utilizzare. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) da cui leggere i dati di input. |
| offset | int32_t | Indice di inizio della porzione del buffer di input. |
| count | int32_t | Dimensione della porzione del buffer di input. |
| halg | const SharedPtr\<Object\>\& | Algoritmo di hash da utilizzare. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream da cui leggere i dati da firmare. |
| halg | const SharedPtr\<Object\>\& | Algoritmo di hash da utilizzare. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
