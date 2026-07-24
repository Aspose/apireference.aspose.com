---
title: "System::IO::Stream::WriteAsync μέθοδος"
linktitle: "WriteAsync"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::WriteAsync μέθοδος. Γράφει ασύγχρονα μια ακολουθία byte στη τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των γραμμένων byte, και παρακολουθεί αιτήματα ακύρωσης σε C++."
type: docs
weight: 2700
url: /el/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Ασύγχρονα γράφει μια ακολουθία byte στην τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των byte που γράφτηκαν, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte για εγγραφή. |
| offset | int32_t | Ένας δείκτης 0-βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος προς εγγραφή. |
| count | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |

### ReturnValue

Μία εργασία που αντιπροσωπεύει τη ασύγχρονη λειτουργία εγγραφής.

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Ασύγχρονα γράφει μια ακολουθία byte στην τρέχουσα ροή, προχωρά τη τρέχουσα θέση μέσα σε αυτή τη ροή κατά τον αριθμό των byte που γράφτηκαν, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte για εγγραφή. |
| offset | int32_t | Ένας δείκτης 0-βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποεύρος προς εγγραφή. |
| count | int32_t | Ο αριθμός των στοιχείων στο υποσύνολο προς εγγραφή. |
| cancellationToken | const Threading::CancellationToken\& | Το διακριτικό για την παρακολούθηση αιτημάτων ακύρωσης. |

### ReturnValue

Μία εργασία που αντιπροσωπεύει τη ασύγχρονη λειτουργία εγγραφής.

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
