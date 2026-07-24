---
title: "Μέθοδος System::Security::Cryptography::RSA::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Security::Cryptography::RSA::VerifyHash. Επαληθεύει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη σε C++."
type: docs
weight: 1400
url: /el/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Επιβεβαιώνει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
