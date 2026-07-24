---
title: "System::IO::Stream::ReadAsync μέθοδος"
linktitle: "ReadAsync"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::ReadAsync μέθοδος. Διαβάζει ασύγχρονα μια ακολουθία bytes από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των διαβασμένων bytes, και παρακολουθεί αιτήματα ακύρωσης σε C++."
type: docs
weight: 1900
url: /el/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας byte στον οποίο θα γραφτούν τα διαβασμένα bytes. |
| offset | int32_t | Μια θέση με βάση το 0 στο **buffer** για να ξεκινήσει η εγγραφή. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν. |

### ReturnValue

Μια εργασία που αντιπροσωπεύει την ασύγχρονη λειτουργία ανάγνωσης. Η τιμή της παραμέτρου TResult περιέχει το συνολικό αριθμό των bytes που διαβάστηκαν στο buffer. Η τιμή του αποτελέσματος μπορεί να είναι μικρότερη από τον αριθμό των αιτηθέντων bytes εάν ο αριθμός των διαθέσιμων bytes είναι μικρότερος από τον ζητούμενο, ή μπορεί να είναι 0 (μηδέν) εάν έχει φθάσει το τέλος της ροής.

## Δείτε επίσης

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας byte στον οποίο θα γραφτούν τα διαβασμένα bytes. |
| offset | int32_t | Μια θέση με βάση το 0 στο **buffer** για να ξεκινήσει η εγγραφή. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν. |
| cancellationToken | const Threading::CancellationToken\& | Το διακριτικό για την παρακολούθηση αιτημάτων ακύρωσης. |

### ReturnValue

Μια εργασία που αντιπροσωπεύει την ασύγχρονη λειτουργία ανάγνωσης. Η τιμή της παραμέτρου TResult περιέχει το συνολικό αριθμό των bytes που διαβάστηκαν στο buffer. Η τιμή του αποτελέσματος μπορεί να είναι μικρότερη από τον αριθμό των αιτηθέντων bytes εάν ο αριθμός των διαθέσιμων bytes είναι μικρότερος από τον ζητούμενο, ή μπορεί να είναι 0 (μηδέν) εάν έχει φθάσει το τέλος της ροής.

## Δείτε επίσης

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
