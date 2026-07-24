---
title: "System::Security::Cryptography::ECDsaBotan::HashData method"
linktitle: "HashData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData method. Υπολογίζει την τιμή κατακερματισμού του συγκεκριμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού σε C++."
type: docs
weight: 700
url: /el/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) για κατακερματισμό. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte προς κατακερματισμό. |
| hash_algorithm | HashAlgorithmName | Αλγόριθμος κατακερματισμού. |

### ReturnValue

Κατακερματισμένα δεδομένα.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | StreamPtr | Δυαδική ροή για κατακερματισμό. |
| hash_algorithm | HashAlgorithmName | Αλγόριθμος κατακερματισμού. |

### ReturnValue

Κατακερματισμένα δεδομένα.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
