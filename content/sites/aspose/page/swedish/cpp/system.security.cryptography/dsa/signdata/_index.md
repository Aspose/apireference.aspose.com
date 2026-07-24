---
title: "System::Security::Cryptography::DSA::SignData metod"
linktitle: "SignData"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::DSA::SignData metod. Beräknar hash‑värdet för den angivna dataarrayen med den angivna hash‑algoritmen och signerar resultatet i C++."
type: docs
weight: 500
url: /sv/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Beräknar hashvärdet för den angivna dataarrayen med den angivna hashalgoritmen och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Indataarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash‑algoritm. returnerar [DSA](../) signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Beräknar hashvärdet för den angivna dataarrayen med den angivna hashalgoritmen och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | const ByteArrayPtr\& | Indataarray. |
| offset | int32_t | Offset i **data**. |
| count | int32_t | Antal byte att använda som indata. |
| hash_algorithm | const HashAlgorithmName\& | Hash‑algoritm. returnerar [DSA](../) signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Beräknar hashvärdet för den angivna binära strömmen med den angivna hashalgoritmen och signerar resultatet.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | const StreamPtr\& | Binär ström. |
| hash_algorithm | const HashAlgorithmName\& | Hash‑algoritm. returnerar [DSA](../) signatur för indata. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
