---
title: "System::Security::Cryptography::RSA::VerifyData μέθοδος"
linktitle: "VerifyData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSA::VerifyData method. Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη σε C++."
type: docs
weight: 1300
url: /el/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Υπογεγραμμένα δεδομένα. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| συμπλήρωση | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία συμπλήρωσης. Επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Υπογεγραμμένα δεδομένα. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte προς κατακερματισμό. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| συμπλήρωση | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία συμπλήρωσης. Επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const StreamPtr\& | Υπογεγραμμένα δεδομένα. |
| υπογραφή | const ByteArrayPtr\& | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| συμπλήρωση | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία συμπλήρωσης. Επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
