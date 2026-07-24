---
title: "System::IO::StringReader::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::StringReader::Read μέθοδος. Διαβάζει έναν μόνο χαρακτήρα από τη ροή σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


Διαβάζει έναν μόνο χαρακτήρα από τη ροή.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

Ένας αναγνωσμένος χαρακτήρας ή -1 εάν δεν έχει διαβαστεί κανένας χαρακτήρας

## Δείτε επίσης

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


Διαβάζει τον καθορισμένο αριθμό χαρακτήρων από τη ροή στον καθορισμένο πίνακα χαρακτήρων, ξεκινώντας από τη καθορισμένη θέση.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<char_t\> | Ο πίνακας χαρακτήρων για την εγγραφή των χαρακτήρων που διαβάστηκαν από τη ροή |
| δείκτης | int | Ένας δείκτης μηδενικής βάσης στο **buffer** από τον οποίο θα ξεκινήσει η εγγραφή |
| count | int | Ο αριθμός των χαρακτήρων που θα διαβαστούν από τη ροή |

### ReturnValue

Ο αριθμός των χαρακτήρων που διαβάστηκαν από τη ροή

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
