---
title: "System::IO::FileStream::Write method"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::FileStream::Write method. Γράφει το καθορισμένο υποσύνολο byte από τον καθορισμένο πίνακα byte στη ροή σε C++."
type: docs
weight: 1900
url: /el/cpp/system.io/filestream/write/
---
## FileStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
void System::IO::FileStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte για εγγραφή. |
| offset | int32_t | Ένας δείκτης 0-βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος προς εγγραφή. |
| count | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
void System::IO::FileStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή πίνακα που περιέχει τα byte προς εγγραφή. |
| offset | int32_t | Ένας δείκτης 0-βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος προς εγγραφή. |
| count | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |

## Δείτε επίσης

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
