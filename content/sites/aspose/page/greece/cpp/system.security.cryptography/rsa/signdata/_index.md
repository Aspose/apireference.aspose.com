---
title: "System::Security::Cryptography::RSA::SignData μέθοδος"
linktitle: "SignData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSA::SignData method. Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και την padding, και υπογράφει το αποτέλεσμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία padding. Επιστρέφει την υπογραφή [RSA](../) για τα εισερχόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte που θα χρησιμοποιηθούν ως δεδομένα εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία padding. Επιστρέφει την υπογραφή [RSA](../) για τα εισερχόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και το γέμισμα, και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const StreamPtr\& | Δυαδική ροή. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Λειτουργία padding. Επιστρέφει την υπογραφή [RSA](../) για τα εισερχόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
