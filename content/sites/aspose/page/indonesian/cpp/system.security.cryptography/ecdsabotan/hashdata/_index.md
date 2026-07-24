---
title: "Metode System::Security::Cryptography::ECDsaBotan::HashData"
linktitle: "HashData"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Security::Cryptography::ECDsaBotan::HashData. Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan dalam C++."
type: docs
weight: 700
url: /id/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) untuk di-hash. |
| offset | int32_t | Offset dalam **data**. |
| count | int32_t | Jumlah byte untuk dihash. |
| hash_algorithm | HashAlgorithmName | Algoritma hash. |

### ReturnValue

Data yang di-hash.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash yang ditentukan.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | StreamPtr | Aliran biner untuk di-hash. |
| hash_algorithm | HashAlgorithmName | Algoritma hash. |

### ReturnValue

Data yang di-hash.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
