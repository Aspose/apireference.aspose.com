---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "Aspose.Page για C++"
description: "System::IO::FileStream::ReadAsync method. Διαβάζει ασύγχρονα μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των διαβασμένων byte και παρακολουθεί αιτήματα ακύρωσης σε C++."
type: docs
weight: 1400
url: /el/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Ασύγχρονα διαβάζει μια ακολουθία byte από την τρέχουσα ροή, προχωρά τη θέση μέσα στη ροή κατά τον αριθμό των byte που διαβάστηκαν, και παρακολουθεί αιτήματα ακύρωσης.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
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
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
