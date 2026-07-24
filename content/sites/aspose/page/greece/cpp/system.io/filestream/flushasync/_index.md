---
title: "System::IO::FileStream::FlushAsync μέθοδος"
linktitle: "FlushAsync"
second_title: "Aspose.Page για C++"
description: "System::IO::FileStream::FlushAsync μέθοδος. Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή των δεδομένων που είναι στην προσωρινή μνήμη στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Ασύγχρονα εκκαθαρίζει όλα τα buffers για αυτή τη ροή, προκαλεί την εγγραφή τυχόν δεδομένων που είναι στη μνήμη buffer στη βασική συσκευή, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Το διακριτικό για την παρακολούθηση αιτημάτων ακύρωσης. |

### ReturnValue

Μία εργασία που αντιπροσωπεύει την ασύγχρονη λειτουργία εκκαθάρισης.

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
