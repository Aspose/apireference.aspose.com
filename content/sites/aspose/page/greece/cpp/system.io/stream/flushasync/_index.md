---
title: "System::IO::Stream::FlushAsync μέθοδος"
linktitle: "FlushAsync"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::FlushAsync μέθοδος. Ασύγχρονα καθαρίζει όλες τις προσωρινές μνήμες για αυτό το ρεύμα, προκαλεί την εγγραφή των προσωρινών δεδομένων στη υποκείμενη συσκευή και παρακολουθεί αιτήματα ακύρωσης σε C++."
type: docs
weight: 900
url: /el/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Μία εργασία που αντιπροσωπεύει την ασύγχρονη λειτουργία εκκαθάρισης.

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Το διακριτικό για την παρακολούθηση αιτημάτων ακύρωσης. |

### ReturnValue

Μία εργασία που αντιπροσωπεύει την ασύγχρονη λειτουργία εκκαθάρισης.

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
