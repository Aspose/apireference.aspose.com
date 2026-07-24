---
title: "System::IO::BasicSTDIOStreamWrapper::Write μέθοδος"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::BasicSTDIOStreamWrapper::Write μέθοδος. Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στο ρεύμα το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes, διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes σε τύπο char_type και στη συνέχεια γράφει το αποτέλεσμα στο ρεύμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.io/basicstdiostreamwrapper/write/
---
## BasicSTDIOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Εάν η λειτουργία περιτύλιξης είναι δυαδική, γράφει στη ροή το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes, διαφορετικά μετατρέπει το καθορισμένο υποσύνολο των bytes από τον καθορισμένο πίνακα bytes σε τύπο [char_type](../char_type/) και στη συνέχεια γράφει το αποτέλεσμα στη ροή.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte προς εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποσύνολο για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα που περιέχει τα byte για εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
