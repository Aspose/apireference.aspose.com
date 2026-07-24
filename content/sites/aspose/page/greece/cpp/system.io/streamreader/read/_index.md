---
title: "System::IO::StreamReader::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::StreamReader::Read μέθοδος. Διαβάζει έναν μόνο χαρακτήρα από το stream σε C++."
type: docs
weight: 900
url: /el/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Διαβάζει έναν μόνο χαρακτήρα από τη ροή.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Διαβάστε χαρακτήρα κωδικοποιημένο με κωδικοποίηση UTF-16· εάν ο διαβασμένος χαρακτήρας αντιπροσωπεύεται από δύο codepoints στην κωδικοποίηση UTF-16, τότε επιστρέφεται μόνο το υψηλό surragate.

## Δείτε επίσης

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Διαβάζει τον καθορισμένο αριθμό χαρακτήρων από το ρεύμα, τους μετατρέπει σε κωδικοποίηση UTF-16 και γράφει τους προκύπτοντες χαρακτήρες UTF-16 στον καθορισμένο πίνακα χαρακτήρων, ξεκινώντας από τη καθορισμένη θέση.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
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
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
