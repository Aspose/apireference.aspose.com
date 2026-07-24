---
title: "System::IO::BinaryReader::Read μέθοδος"
linktitle: "Read"
second_title: "Aspose.Page για C++"
description: "System::IO::BinaryReader::Read μέθοδος. Διαβάζει έναν μοναδικό χαρακτήρα από τη ροή εισόδου σε C++."
type: docs
weight: 700
url: /el/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Διαβάζει έναν μοναδικό χαρακτήρα από τη ροή εισόδου.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Διαβάστε χαρακτήρα κωδικοποιημένο με κωδικοποίηση UTF-16· εάν ο διαβασμένος χαρακτήρας αντιπροσωπεύεται από δύο codepoints στην κωδικοποίηση UTF-16, τότε επιστρέφεται μόνο το υψηλό surragate.

## Δείτε επίσης

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Διαβάζει τον καθορισμένο αριθμό χαρακτήρων από τη ροή εισόδου, τους μετατρέπει σε κωδικοποίηση UTF-16 και γράφει τους προκύπτοντες χαρακτήρες UTF-16 στον καθορισμένο πίνακα χαρακτήρων ξεκινώντας από τη καθορισμένη θέση.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<char_t\> | Ο πίνακας χαρακτήρων UTF-16 για να γράψετε τους χαρακτήρες που διαβάστηκαν από τη ροή εισόδου |
| δείκτης | int | Ένας δείκτης μηδενικής βάσης στο **buffer** από τον οποίο θα ξεκινήσει η εγγραφή |
| count | int | Ο αριθμός των χαρακτήρων που θα διαβαστούν από τη ροή |

### ReturnValue

Ο αριθμός των χαρακτήρων που διαβάστηκαν από τη ροή εισόδου

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Διαβάζει τον καθορισμένο αριθμό byte από τη ροή εισόδου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<uint8_t\> | Ο πίνακας byte για να γραφτούν τα διαβασμένα byte |
| δείκτης | int | Μια θέση 0‑βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int | Ο αριθμός των byte για ανάγνωση |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
