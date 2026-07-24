---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash μέθοδος"
linktitle: "SignHash"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash μέθοδος. Υπολογίζει την υπογραφή για την καθορισμένη τιμή κατακερματισμού σε C++."
type: docs
weight: 1700
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Υπολογίζει την υπογραφή για την καθορισμένη τιμή κατακερματισμού.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hash | ByteArrayPtr | Τιμή κατακερματισμού. |
| hash_algorithm | HashAlgorithmName | Αλγόριθμος κατακερματισμού. |
| padding | SharedPtr\<RSASignaturePadding\> | Λειτουργία συμπλήρωσης. Επιστρέφει την υπογραφή [RSA](../../rsa/) για τον καθορισμένο κατακερματισμό. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. Δεν έχει υλοποιηθεί.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Τιμή κατακερματισμού των δεδομένων προς υπογραφή. |
| str | const String\& | Αναγνωριστικό αλγορίθμου κατακερματισμού που χρησιμοποιείται για τη δημιουργία του κατακερματισμού. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
