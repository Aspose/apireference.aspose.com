---
title: "Μέθοδος System::IO::BasicSTDIStreamWrapper::Read"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::BasicSTDIStreamWrapper::Read. Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από τη ροή, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 400
url: /el/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Εάν η λειτουργία περιτύλιξης είναι δυαδική, διαβάζει τον καθορισμένο αριθμό byte από το ρεύμα, διαφορετικά διαβάζει τον καθορισμένο αριθμό χαρακτήρων και τους μετατρέπει σε τύπο uint8_t. Γράφει το αποτέλεσμα της ανάγνωσης στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα byte για την εγγραφή των διαβασμένων byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
