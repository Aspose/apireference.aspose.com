---
title: "System::Uri::Compare μέθοδος"
linktitle: "Compare"
second_title: "Aspose.Page για C++"
description: "System::Uri::Compare μέθοδος. Συγκρίνει τα καθορισμένα αντικείμενα Uri χρησιμοποιώντας τους καθορισμένους κανόνες σύγκρισης σε C++."
type: docs
weight: 3500
url: /el/cpp/system/uri/compare/
---
## Uri::Compare method


Συγκρίνει τα καθορισμένα αντικείμενα [Uri](../) χρησιμοποιώντας τους καθορισμένους κανόνες σύγκρισης.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Ο πρώτος συγκριτέος |
| uri2 | const SharedPtr\<Uri\>\& | Ο δεύτερος συγκριτέος |
| partsToCompare | UriComponents | Καθορίζει τα τμήματα του **uri1** και **uri2** για σύγκριση |
| compareFormat | UriFormat | Καθορίζει την διαφυγή χαρακτήρων που χρησιμοποιείται όταν συγκρίνονται τα στοιχεία των URI |
| comparisonType | StringComparison | Μία από τις τιμές του [StringComparison](../../stringcomparison/) |

### ReturnValue

Μια αρνητική τιμή εάν το **uri1** είναι μικρότερο από το **uri2**· 0 εάν τα uri1 και uri2 είναι ίσα· μια θετική τιμή εάν το **uri1** είναι μεγαλύτερο από το **uri2**

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
