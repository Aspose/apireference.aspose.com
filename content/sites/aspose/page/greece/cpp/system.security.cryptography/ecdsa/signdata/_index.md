---
title: "System::Security::Cryptography::ECDsa::SignData μέθοδος"
linktitle: "SignData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ECDsa::SignData μέθοδος. Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει την υπογραφή ECDSA για τα δεδομένα εισόδου. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte που θα χρησιμοποιηθούν ως δεδομένα εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει την υπογραφή ECDSA για τα δεδομένα εισόδου. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const StreamPtr\& | Δυαδική ροή. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. επιστρέφει την υπογραφή ECDSA για τα δεδομένα εισόδου. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
