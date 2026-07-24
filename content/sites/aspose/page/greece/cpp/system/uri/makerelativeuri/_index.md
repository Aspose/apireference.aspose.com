---
title: "System::Uri::MakeRelativeUri μέθοδος"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page για C++"
description: "System::Uri::MakeRelativeUri μέθοδος. Καθορίζει τη διαφορά μεταξύ των URI που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο Uri σε C++."
type: docs
weight: 3100
url: /el/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Καθορίζει τη διαφορά μεταξύ των URI που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενα [Uri](../).

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Το συγκριτικό |

### ReturnValue

Εάν το όνομα κεντρικού υπολογιστή και το σχήμα των URI που αντιπροσωπεύονται από το τρέχον αντικείμενο και το **toUri** είναι τα ίδια, τότε αυτή η μέθοδος επιστρέφει ένα σχετικό [Uri](../) που, όταν προσαρτηθεί στην τρέχουσα παρουσία URI, παράγει το **toUri**. Εάν το όνομα κεντρικού υπολογιστή ή το σχήμα είναι διαφορετικό, τότε αυτή η μέθοδος επιστρέφει ένα αντικείμενο [Uri](../) που αντιπροσωπεύει την παράμετρο **uri**.

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
