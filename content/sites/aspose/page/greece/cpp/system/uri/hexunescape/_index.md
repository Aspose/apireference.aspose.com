---
title: "System::Uri::HexUnescape μέθοδος"
linktitle: "HexUnescape"
second_title: "Aspose.Page για C++"
description: "System::Uri::HexUnescape μέθοδος. Μετατρέπει την καθορισμένη δεκαεξαδική αναπαράσταση ενός χαρακτήρα σε χαρακτήρα σε C++."
type: docs
weight: 4000
url: /el/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Μετατρέπει την καθορισμένη δεκαεξαδική αναπαράσταση ενός χαρακτήρα σε χαρακτήρα.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| πρότυπο | const String\& | Μια συμβολοσειρά που περιέχει τη δεκαεξαδική αναπαράσταση ενός χαρακτήρα |
| δείκτης | int32_t\& | Η θέση στο **pattern** όπου αρχίζει η δεκαεξαδική αναπαράσταση ενός χαρακτήρα |

### ReturnValue

Ο χαρακτήρας που αναπαρίσταται από την δεκαεξαδική κωδικοποίηση στη θέση **index**. Εάν ο χαρακτήρας στη **index** δεν είναι δεκαεξαδικά κωδικοποιημένος, επιστρέφεται ο χαρακτήρας στη **index**. Η τιμή της **index** αυξάνεται ώστε να δείχνει τον χαρακτήρα που ακολουθεί αυτόν που επιστράφηκε.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
