---
title: "metodo System::Security::Cryptography::DSACryptoServiceProvider::SignData"
linktitle: "SignData"
second_title: "Aspose.Font per C++"
description: "metodo System::Security::Cryptography::DSACryptoServiceProvider::SignData. Calcola la firma del valore di input specificato in C++."
type: docs
weight: 1500
url: /it/cpp/system.security.cryptography/dsacryptoserviceprovider/signdata/
---
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) da cui leggere i dati di input. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) da cui leggere i dati di input. |
| offset | int32_t | Indice di inizio della porzione del buffer di input. |
| count | int32_t | Dimensione della porzione del buffer di input. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Informazioni RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Informazioni RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&) method


Calcola la firma del valore di input specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream da cui leggere i dati da firmare. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Informazioni RTTI.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
