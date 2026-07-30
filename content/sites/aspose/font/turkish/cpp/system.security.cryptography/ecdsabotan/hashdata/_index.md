---
title: "System::Security::Cryptography::ECDsaBotan::HashData metodu"
linktitle: "HashData"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData metodu. Belirtilen veri dizisinin hash değerini belirtilen hash algoritmasıyla C++'da hesaplar."
type: docs
weight: 700
url: /tr/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Belirtilen hash algoritması kullanılarak belirtilen veri dizisinin hash değerini hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | ByteArrayPtr | [Veri](../../../system.data/) hash'lemek için. |
| offset | int32_t | Offset **data** içinde. |
| count | int32_t | Hashlenecek bayt sayısı. |
| hash_algorithm | HashAlgorithmName | Hash algoritması. |

### ReturnValue

Hash'lenmiş veri.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Belirtilen hash algoritması kullanılarak belirtilen ikili akışın hash değerini hesaplar.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | StreamPtr | Hash'lenmiş ikili akış. |
| hash_algorithm | HashAlgorithmName | Hash algoritması. |

### ReturnValue

Hash'lenmiş veri.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
