---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignData yöntemi"
linktitle: "SignData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignData yöntemi. Belirtilen giriş değerinin imzasını C++'ta hesaplar."
type: docs
weight: 1500
url: /tr/cpp/system.security.cryptography/dsacryptoserviceprovider/signdata/
---
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&) method


Belirtilen giriş değerinin imzasını hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) giriş verilerini okumak için. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t) method


Belirtilen giriş değerinin imzasını hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) giriş verilerini okumak için. |
| offset | int32_t | Giriş tampon diliminin başlangıç indeksi. |
| count | int32_t | Giriş tampon diliminin boyutu. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


RTTI bilgisi.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


RTTI bilgisi.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&) method


Belirtilen giriş değerinin imzasını hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | İmzalanan verileri okumak için akış. |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


RTTI bilgisi.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
