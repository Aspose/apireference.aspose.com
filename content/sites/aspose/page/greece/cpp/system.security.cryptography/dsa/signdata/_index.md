---
title: "System::Security::Cryptography::DSA::SignData μέθοδος"
linktitle: "SignData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSA::SignData μέθοδος. Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. Επιστρέφει την υπογραφή [DSA](../) για τα εισαγόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού του καθορισμένου πίνακα δεδομένων χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| δεδομένα | const ByteArrayPtr\& | Πίνακας δεδομένων εισόδου. |
| offset | int32_t | Μετατόπιση στο **data**. |
| count | int32_t | Αριθμός byte που θα χρησιμοποιηθούν ως δεδομένα εισόδου. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. Επιστρέφει την υπογραφή [DSA](../) για τα εισαγόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Υπολογίζει την τιμή κατακερματισμού της καθορισμένης δυαδικής ροής χρησιμοποιώντας τον καθορισμένο αλγόριθμο κατακερματισμού και υπογράφει το αποτέλεσμα.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const StreamPtr\& | Δυαδική ροή. |
| hash_algorithm | const HashAlgorithmName\& | Αλγόριθμος κατακερματισμού. Επιστρέφει την υπογραφή [DSA](../) για τα εισαγόμενα δεδομένα. |

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
