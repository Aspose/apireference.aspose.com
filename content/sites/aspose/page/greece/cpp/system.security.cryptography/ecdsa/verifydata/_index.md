---
title: "System::Security::Cryptography::ECDsa::VerifyData μέθοδος"
linktitle: "VerifyData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ECDsa::VerifyData μέθοδος. Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη σε C++."
type: docs
weight: 900
url: /el/cpp/system.security.cryptography/ecdsa/verifydata/
---
## ECDsa::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Υπογεγραμμένα δεδομένα. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Υπογεγραμμένα δεδομένα. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte προς κατακερματισμό. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const StreamPtr\& | Υπογεγραμμένα δεδομένα. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
