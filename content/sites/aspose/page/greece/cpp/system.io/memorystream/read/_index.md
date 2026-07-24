---
title: "System::IO::MemoryStream::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::MemoryStream::Read μέθοδος. Διαβάζει τον καθορισμένο αριθμό bytes από το stream και τους γράφει στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 1100
url: /el/cpp/system.io/memorystream/read/
---
## MemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::IO::MemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας byte για να γραφτούν τα διαβασμένα byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::IO::MemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα byte για την εγγραφή των διαβασμένων byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
