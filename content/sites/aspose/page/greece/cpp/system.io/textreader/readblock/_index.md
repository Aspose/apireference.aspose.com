---
title: "Μέθοδος System::IO::TextReader::ReadBlock"
linktitle: "ReadBlock"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::TextReader::ReadBlock. Διαβάζει τον καθορισμένο μέγιστο αριθμό χαρακτήρων από τον τρέχοντα αναγνώστη κειμένου και γράφει τα δεδομένα σε μια ενδιάμεση μνήμη, ξεκινώντας από τον καθορισμένο δείκτη σε C++."
type: docs
weight: 500
url: /el/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Διαβάζει τον καθορισμένο μέγιστο αριθμό χαρακτήρων από τον τρέχοντα αναγνώστη κειμένου και γράφει τα δεδομένα σε μια προσωρινή μνήμη, ξεκινώντας από το καθορισμένο δείκτη.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<char_t\> | Μια ενδιάμεση μνήμη χαρακτήρων για την εγγραφή των διαβασμένων δεδομένων |
| δείκτης | int | Ένας δείκτης 0-βάσης στο **buffer** για να ξεκινήσει η εγγραφή |
| count | int | Ο μέγιστος αριθμός χαρακτήρων προς ανάγνωση |

### ReturnValue

Ο πραγματικός αριθμός χαρακτήρων που διαβάστηκαν

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
