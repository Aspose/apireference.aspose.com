---
title: "System::IO::MemoryStream::MemoryStream κατασκευαστής"
linktitle: "MemoryStream"
second_title: "Aspose.Page για C++"
description: "System::IO::MemoryStream::MemoryStream κατασκευαστής. Δημιουργεί ένα νέο αντικείμενο της κλάσης MemoryStream με αρχική χωρητικότητα ίση με 0 σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Δημιουργεί ένα νέο αντικείμενο της κλάσης [MemoryStream](../) με αρχική χωρητικότητα ίση με 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Δείτε επίσης

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Δημιουργεί ένα νέο αντικείμενο της κλάσης [MemoryStream](../) που αντιπροσωπεύει μια ροή μνήμης η οποία είναι συνδεδεμένη με το καθορισμένο buffer μνήμης. Ένα παράμετρος καθορίζει αν η ροή είναι εγγράψιμη.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte που θα χρησιμοποιηθεί ως buffer μνήμης πάνω στον οποίο θα βασίζεται η ροή που αντιπροσωπεύεται από το αντικείμενο που δημιουργείται. |
| εγγράψιμη | bool | Καθορίζει αν η ροή πρέπει να είναι εγγράψιμη |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Δημιουργεί ένα νέο αντικείμενο της κλάσης [MemoryStream](../) που αντιπροσωπεύει μια ροή μνήμης η οποία είναι συνδεδεμένη με ένα τμήμα του καθορισμένου buffer μνήμης που αρχίζει από το καθορισμένο δείκτη και περιλαμβάνει τον καθορισμένο αριθμό στοιχείων. Οι παράμετροι καθορίζουν αν η ροή είναι εγγράψιμη και αν μπορεί να κληθεί η μέθοδος GetBytes().

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Ένας πίνακας byte του οποίου ένα τμήμα θα χρησιμοποιηθεί ως buffer μνήμης πάνω στον οποίο θα βασίζεται η ροή που αντιπροσωπεύεται από το αντικείμενο που δημιουργείται. |
| δείκτης | int | Ένας δείκτης 0‑βάσης του στοιχείου στο **content** στο οποίο αρχίζει το τμήμα |
| count | int | Ο αριθμός των στοιχείων του **content** που περιλαμβάνονται στο τμήμα |
| εγγράψιμη | bool | Καθορίζει αν η ροή πρέπει να είναι εγγράψιμη |
| publiclyVisible | bool | Καθορίζει αν το υποκείμενο buffer μνήμης πρέπει να διατεθεί στον καλούντα της μεθόδου GetByte() |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Δημιουργεί ένα νέο αντικείμενο της κλάσης [MemoryStream](../) που αντιπροσωπεύει μια ροή βασισμένη σε buffer μνήμης του καθορισμένου μεγέθους.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| capacity_ | int | Το μέγεθος σε bytes ενός buffer μνήμης που σχετίζεται με τη ροή που αντιπροσωπεύεται από το αντικείμενο που δημιουργείται |

## Δείτε επίσης

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
