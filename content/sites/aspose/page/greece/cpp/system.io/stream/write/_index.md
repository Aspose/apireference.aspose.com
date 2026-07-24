---
title: "System::IO::Stream::Write μέθοδος"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::Write μέθοδος. Γράφει το καθορισμένο υποεύρος των bytes από τον καθορισμένο πίνακα byte στη ροή σε C++."
type: docs
weight: 2600
url: /el/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte προς εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα που περιέχει τα byte για εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποεύρος των byte από τον καθορισμένο πίνακα byte στη ροή.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| N | Το μέγεθος του πίνακα στοίβας |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::StackArray\<uint8_t, N\>\& | Ο στοίβα array που περιέχει τα bytes προς εγγραφή |
| offset | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος για εγγραφή |
| count | int32_t | Ο αριθμός των στοιχείων στο υποεύρος για εγγραφή |

## Δείτε επίσης

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
