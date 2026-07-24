---
title: "Μέθοδος System::IO::TextReader::Read"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::TextReader::Read. Διαβάζει έναν μοναδικό χαρακτήρα από τη ροή σε C++."
type: docs
weight: 400
url: /el/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Διαβάζει έναν μόνο χαρακτήρα από τη ροή.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Διαβάστε χαρακτήρα κωδικοποιημένο με κωδικοποίηση UTF-16· εάν ο διαβασμένος χαρακτήρας αντιπροσωπεύεται από δύο codepoints στην κωδικοποίηση UTF-16, τότε επιστρέφεται μόνο το υψηλό surragate.

## Δείτε επίσης

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Διαβάζει τον καθορισμένο αριθμό χαρακτήρων από τη ροή και τους γράφει στον καθορισμένο πίνακα χαρακτήρων ξεκινώντας από τη καθορισμένη θέση.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<char_t\> | Ο πίνακας χαρακτήρων UTF-16 για την εγγραφή των χαρακτήρων που διαβάστηκαν από τη ροή |
| δείκτης | int | Ένας δείκτης μηδενικής βάσης στο **buffer** από τον οποίο θα ξεκινήσει η εγγραφή |
| count | int | Ο αριθμός των χαρακτήρων που θα διαβαστούν από τη ροή |

### ReturnValue

Ο αριθμός των χαρακτήρων που διαβάστηκαν από τη ροή

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
