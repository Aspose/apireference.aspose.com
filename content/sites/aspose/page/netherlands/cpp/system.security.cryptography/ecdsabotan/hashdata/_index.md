---
title: "System::Security::Cryptography::ECDsaBotan::HashData-methode"
linktitle: "HashData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData-methode. Berekent de hash‑waarde van de opgegeven data‑array met behulp van het opgegeven hash‑algoritme in C++."
type: docs
weight: 700
url: /nl/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash‑algoritme.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) om te hashen. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Aantal bytes om te hashen. |
| hash_algorithm | HashAlgorithmName | Hash-algoritme. |

### ReturnValue

Gehasht data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Berekent de hashwaarde van de opgegeven binaire stroom met het opgegeven hash‑algoritme.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | StreamPtr | Binaire stream om te hashen. |
| hash_algorithm | HashAlgorithmName | Hash-algoritme. |

### ReturnValue

Gehasht data.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
