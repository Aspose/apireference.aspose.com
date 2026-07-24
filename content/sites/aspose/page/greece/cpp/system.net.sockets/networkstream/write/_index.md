---
title: "System::Net::Sockets::NetworkStream::Write μέθοδος"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::NetworkStream::Write μέθοδος. Γράφει το καθορισμένο υποσύνολο byte από τον καθορισμένο πίνακα byte στη ροή σε C++."
type: docs
weight: 2500
url: /el/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte για εγγραφή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα που περιέχει τα byte για εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| size | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
