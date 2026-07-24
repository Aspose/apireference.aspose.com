---
title: "System::Security::Cryptography::RSA::SignData-metoden"
linktitle: "SignData"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSA::SignData-metoden. Beräknar hash-värdet för den angivna dataarrayen med den angivna hash-algoritmen och padding, och signerar resultatet i C++."
type: docs
weight: 1000
url: /sv/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Beräknar hashvärdet för den angivna dataarrayen med den angivna hashalgoritmen och utfyllnad, och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Indataarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritm. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-läge. returnerar [RSA](../)-signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Beräknar hashvärdet för den angivna dataarrayen med den angivna hashalgoritmen och utfyllnad, och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Indataarray. |
| offset | int32_t | Offset i **data**. |
| count | int32_t | Antal byte att använda som indata. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritm. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-läge. returnerar [RSA](../)-signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Beräknar hashvärdet för den angivna binära strömmen med den angivna hashalgoritmen och utfyllnad, och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | const StreamPtr\& | Binär ström. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritm. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-läge. returnerar [RSA](../)-signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
