---
title: "System::Uri::TryCreate μέθοδος"
linktitle: "TryCreate"
second_title: "Aspose.Page για C++"
description: "System::Uri::TryCreate method. Δημιουργεί ένα αντικείμενο Uri από τη συγκεκριμένη βάση και σχετικές URI σε C++."
type: docs
weight: 4400
url: /el/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Δημιουργεί ένα [Uri](../) αντικείμενο από τη συγκεκριμένη βάση και σχετικές URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Η βασική URI |
| relativeUri | const SharedPtr\<Uri\>\& | Η σχετική URI που προστίθεται στη βασική URI |
| result | SharedPtr\<Uri\>\& | Το όρισμα εξόδου που, εάν η κατασκευή επιτύχει, δείχνει στο νεοδημιουργημένο αντικείμενο [Uri](../) κατά την επιστροφή της μεθόδου |

### ReturnValue

Αληθές εάν η κατασκευή επιτύχει, διαφορετικά - ψευδές

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Δημιουργεί ένα [Uri](../) αντικείμενο από το καθορισμένο αντικείμενο [Uri](../) που αντιπροσωπεύει τη βασική URI και την αναπαράσταση κειμένου της σχετικής URI.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Η βασική URI |
| relativeUri | const String\& | Η σχετική URI που προστίθεται στη βασική URI |
| result | SharedPtr\<Uri\>\& | Το όρισμα εξόδου που, εάν η κατασκευή επιτύχει, δείχνει στο νεοδημιουργημένο αντικείμενο [Uri](../) κατά την επιστροφή της μεθόδου |

### ReturnValue

Αληθές εάν η κατασκευή επιτύχει, διαφορετικά - ψευδές

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Δημιουργεί ένα αντικείμενο [Uri](../) που αντιπροσωπεύει τη συγκεκριμένη URI· ένα όρισμα καθορίζει τον τύπο της URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| uriString | const String\& | Η συμβολοσειρά URI που θα αντιπροσωπευθεί από το αντικείμενο που δημιουργείται |
| uriKind | UriKind | Καθορίζει τον τύπο της URI |
| result | SharedPtr\<Uri\>\& | Το όρισμα εξόδου που, εάν η κατασκευή επιτύχει, δείχνει στο νεοδημιουργημένο αντικείμενο [Uri](../) κατά την επιστροφή της μεθόδου |

### ReturnValue

Αληθές εάν η κατασκευή επιτύχει, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
