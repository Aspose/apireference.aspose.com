---
title: "System::Uri::MakeRelative μέθοδος"
linktitle: "MakeRelative"
second_title: "Aspose.Page για C++"
description: "System::Uri::MakeRelative μέθοδος. Καθορίζει τη διαφορά μεταξύ δύο αντικειμένων Uri σε C++."
type: docs
weight: 3000
url: /el/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Καθορίζει τη διαφορά μεταξύ δύο αντικειμένων [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | Το URI για σύγκριση με το τρέχον URI |

### ReturnValue

Εάν το όνομα κεντρικού υπολογιστή και το σχήμα των URI που αντιπροσωπεύονται από το τρέχον αντικείμενο και **toUri** είναι τα ίδια, τότε αυτή η μέθοδος επιστρέφει ένα [String](../../string/) που αντιπροσωπεύει ένα σχετικό [Uri](../), όταν προσαρτηθεί στο τρέχον αντικείμενο URI, παράγει **toUri**. Εάν το όνομα κεντρικού υπολογιστή ή το σχήμα είναι διαφορετικό, τότε αυτή η μέθοδος επιστρέφει ένα [String](../../string/) που αντιπροσωπεύει την παράμετρο **uri**.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
