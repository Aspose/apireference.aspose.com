---
title: "System::IO::BasicSTDIStreamWrapper::Write μέθοδος"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDIStreamWrapper::Write μέθοδος. Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στο ρεύμα το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes· διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes σε τύπο char_type και στη συνέχεια γράφει το αποτέλεσμα στο ρεύμα. Δεν υποστηρίζεται! σε C++."
type: docs
weight: 700
url: /el/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στο ρεύμα το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes· διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes σε τύπο [char_type](../char_type/) και στη συνέχεια γράφει το αποτέλεσμα στο ρεύμα. Δεν υποστηρίζεται!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte για εγγραφή. |
| offset | int32_t | Ένας δείκτης 0-βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος προς εγγραφή. |
| count | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα που περιέχει τα byte για εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
