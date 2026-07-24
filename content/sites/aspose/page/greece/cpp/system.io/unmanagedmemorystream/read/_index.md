---
title: "System::IO::UnmanagedMemoryStream::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::UnmanagedMemoryStream::Read μέθοδος. Διαβάζει τον καθορισμένο αριθμό bytes από τη ροή και τα γράφει στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 1000
url: /el/cpp/system.io/unmanagedmemorystream/read/
---
## UnmanagedMemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::UnmanagedMemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [UnmanagedMemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## UnmanagedMemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
virtual int32_t System::IO::UnmanagedMemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή του πίνακα byte για την εγγραφή των διαβασμένων byte |
| offset | int32_t | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int32_t | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Class [UnmanagedMemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
