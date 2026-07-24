---
title: "System::Security::Cryptography::ECDsaBotan::HashData metodu"
linktitle: "HashData"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData metodu. C++'ta belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar."
type: docs
weight: 700
url: /tr/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Belirtilen karma algoritması kullanılarak belirtilen veri dizisinin karma değerini hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) hashlemek için. |
| offset | int32_t | **data** içinde ofset. |
| count | int32_t | Hashlenecek bayt sayısı. |
| hash_algorithm | HashAlgorithmName | Hash algoritması. |

### ReturnValue

Hashlenmiş veri.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Belirtilen karma algoritması kullanılarak belirtilen ikili akışın karma değerini hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | StreamPtr | Hashlenmek için ikili akış. |
| hash_algorithm | HashAlgorithmName | Hash algoritması. |

### ReturnValue

Hashlenmiş veri.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
