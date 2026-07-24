---
title: "System::IO::FileStream::Read method"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::FileStream::Read method. Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 1300
url: /el/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας byte στον οποίο θα γραφτούν τα διαβασμένα bytes. |
| offset | int32_t | Μια θέση με βάση το 0 στο **buffer** για να ξεκινήσει η εγγραφή. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν. |

### ReturnValue

Ο αριθμός των διαβασμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const System::Details::ArrayView\<uint8_t\>\& | Η προβολή πίνακα byte για να γραφούν τα διαβασμένα byte. |
| offset | int32_t | Μια θέση με βάση το 0 στο **buffer** για να ξεκινήσει η εγγραφή. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν. |

### ReturnValue

Ο αριθμός των διαβασμένων byte.

## Δείτε επίσης

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
