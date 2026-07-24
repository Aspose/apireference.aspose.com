---
title: "System::Security::Cryptography::ECDsaBotan::HashData‑metod"
linktitle: "HashData"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData‑metod. Beräknar hash‑värdet för den angivna dataarrayen med den angivna hash‑algoritmen i C++."
type: docs
weight: 700
url: /sv/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Beräknar hashvärdet för den angivna dataarrayen med den angivna hash-algoritmen.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) att hasha. |
| offset | int32_t | Offset i **data**. |
| count | int32_t | Antal byte att hash:a. |
| hash_algorithm | HashAlgorithmName | Hash-algoritm. |

### ReturnValue

Hashad data.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Beräknar hashvärdet för den angivna binära strömmen med den angivna hash-algoritmen.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | StreamPtr | Binär ström för hashning. |
| hash_algorithm | HashAlgorithmName | Hash-algoritm. |

### ReturnValue

Hashad data.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
