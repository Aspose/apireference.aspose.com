---
title: "System::IO::MemoryStream::TryGetBuffer μέθοδος"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page για C++"
description: "System::IO::MemoryStream::TryGetBuffer μέθοδος. Επιστρέφει τον πίνακα των μη υπογεγραμμένων byte από τα οποία δημιουργήθηκε αυτό το stream σε C++."
type: docs
weight: 1800
url: /el/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Επιστρέφει τον πίνακα των μη υπογεγραμμένων byte από τα οποία δημιουργήθηκε αυτή η ροή.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArraySegment\<uint8_t\>\& | byte array - out παράμετρος. Όταν αυτή η μέθοδος επιστρέφει true, το τμήμα byte array από το οποίο δημιουργήθηκε αυτό το stream· όταν επιστρέφει false, αυτή η παράμετρος ορίζεται στην προεπιλογή. |

### ReturnValue

Αληθές εάν η μετατροπή ολοκληρώθηκε με επιτυχία.

## Δείτε επίσης

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
