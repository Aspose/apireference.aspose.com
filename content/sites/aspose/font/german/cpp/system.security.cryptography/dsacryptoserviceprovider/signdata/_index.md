---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignData Methode"
linktitle: "SignData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignData Methode. Berechnet die Signatur des angegebenen Eingabewerts in C++."
type: docs
weight: 1500
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/signdata/
---
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Puffer](../../../system/buffer/) zum Lesen von Eingabedaten. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Puffer](../../../system/buffer/) zum Lesen von Eingabedaten. |
| Offset | int32_t | Startindex des Eingabepufferabschnitts. |
| count | int32_t | Größe des Eingabepufferabschnitts. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


RTTI-Informationen.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


RTTI-Informationen.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&) method


Berechnet die Signatur des angegebenen Eingabewerts.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Stream zum Lesen der zu signierenden Daten. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


RTTI-Informationen.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
