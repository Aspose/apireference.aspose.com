---
title: "System::IO::BasicSTDIOStreamWrapper::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read μέθοδος. Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό bytes από το ρεύμα, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα bytes σε C++."
type: docs
weight: 400
url: /el/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από το ρεύμα, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας byte για να γραφτούν τα διαβασμένα byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Αριθμός byte ή χαρακτήρων που διαβάστηκαν

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα byte για την εγγραφή των διαβασμένων byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
