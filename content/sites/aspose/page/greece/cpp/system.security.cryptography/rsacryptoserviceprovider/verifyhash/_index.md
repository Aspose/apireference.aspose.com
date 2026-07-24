---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash μέθοδος"
linktitle: "VerifyHash"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash μέθοδος. Επαληθεύει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη σε C++."
type: docs
weight: 1900
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Επιβεβαιώνει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hash | ByteArrayPtr | Τιμή κατακερματισμού των υπογεγραμμένων δεδομένων. |
| υπογραφή | ByteArrayPtr | Δεδομένα υπογραφής. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| συμπλήρωση | SharedPtr\<RSASignaturePadding\> | Λειτουργία συμπλήρωσης. Επιστρέφει true εάν η υπογραφή είναι έγκυρη, διαφορετικά - false. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Ελέγχει την υπογραφή δεδομένων.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash υπολογισμένο για τα ληφθέντα δεδομένα. |
| str | const String\& | Όνομα του αλγορίθμου κατακερματισμού που χρησιμοποιείται. |
| rgb_signature | const ByteArrayPtr\& | Υπογραφή όπως ελήφθη. |

### ReturnValue

True εάν η υπογραφή είναι έγκυρη, false διαφορετικά.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
