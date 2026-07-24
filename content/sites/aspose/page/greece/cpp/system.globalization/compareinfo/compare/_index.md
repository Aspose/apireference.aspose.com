---
title: "Μέθοδος System::Globalization::CompareInfo::Compare"
linktitle: "Compare"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Globalization::CompareInfo::Compare. Συγκρίνει συμβολοσειρές. Μόνο οι λειτουργίες Ordinal και OrdinalIgnoreCase υποστηρίζονται σε C++."
type: docs
weight: 200
url: /el/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


Συγκρίνει συμβολοσειρές. Υποστηρίζονται μόνο οι λειτουργίες Ordinal και OrdinalIgnoreCase.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ένα | const String\& | Συμβολοσειρά LHS. |
| b | const String\& | Συμβολοσειρά RHS. |
| options | CompareOptions | [String](../../../system/string/) τύπος σύγκρισης. |

### ReturnValue

Αρνητική τιμή εάν η συμβολοσειρά LHS προηγείται της RHS, μηδενική εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


Συγκρίνει συμβολοσειρές. Δεν έχει υλοποιηθεί.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| string1 | const String\& | Συμβολοσειρά LHS. |
| string2 | const String\& | Συμβολοσειρά RHS. |

### ReturnValue

Αρνητική τιμή εάν η συμβολοσειρά LHS προηγείται της RHS, μηδενική εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


Συγκρίνει το τελικό τμήμα μιας συμβολοσειράς με το τελικό τμήμα δεύτερης συμβολοσειράς. Δεν έχει υλοποιηθεί.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| string1 | const String\& | Πρώτη συμβολοσειρά. |
| offset1 | int | Αρχικός δείκτης των χαρακτήρων στο **string1**. |
| string2 | const String\& | Δεύτερη συμβολοσειρά. |
| offset2 | int | Αρχικός δείκτης των χαρακτήρων στο **string2**. |

### ReturnValue

Αρνητική τιμή εάν το τμήμα της πρώτης συμβολοσειράς προηγείται του τμήματος της δεύτερης συμβολοσειράς, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


Συγκρίνει το τελικό τμήμα μιας συμβολοσειράς με το τελικό τμήμα δεύτερης συμβολοσειράς χρησιμοποιώντας μεθόδους σύγκρισης συμβολοσειρών. Δεν έχει υλοποιηθεί.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| string1 | const String\& | Πρώτη συμβολοσειρά. |
| offset1 | int | Αρχικός δείκτης των χαρακτήρων στο **string1**. |
| string2 | const String\& | Δεύτερη συμβολοσειρά. |
| offset2 | int | Αρχικός δείκτης των χαρακτήρων στο **string2**. |
| options | CompareOptions | [String](../../../system/string/) επιλογές σύγκρισης. |

### ReturnValue

Αρνητική τιμή εάν το τμήμα της πρώτης συμβολοσειράς προηγείται του τμήματος της δεύτερης συμβολοσειράς, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


Συγκρίνει ένα τμήμα μιας συμβολοσειράς με ένα τμήμα δεύτερης συμβολοσειράς. Δεν έχει υλοποιηθεί.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| string1 | const String\& | Πρώτη συμβολοσειρά. |
| offset1 | int | Αρχικός δείκτης των χαρακτήρων στο **string1**. |
| length1 | int | Αριθμός χαρακτήρων στο **string1** για σύγκριση. |
| string2 | const String\& | Δεύτερη συμβολοσειρά. |
| offset2 | int | Αρχικός δείκτης των χαρακτήρων στο **string2**. |
| length2 | int | Αριθμός χαρακτήρων στο **string2** για σύγκριση. |

### ReturnValue

Αρνητική τιμή εάν το τμήμα της πρώτης συμβολοσειράς προηγείται του τμήματος της δεύτερης συμβολοσειράς, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


Συγκρίνει ένα τμήμα μιας συμβολοσειράς με ένα τμήμα δεύτερης συμβολοσειράς χρησιμοποιώντας μεθόδους σύγκρισης συμβολοσειρών. Δεν έχει υλοποιηθεί.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| string1 | const String\& | Πρώτη συμβολοσειρά. |
| offset1 | int | Αρχικός δείκτης των χαρακτήρων στο **string1**. |
| length1 | int | Αριθμός χαρακτήρων στο **string1** για σύγκριση. |
| string2 | const String\& | Δεύτερη συμβολοσειρά. |
| offset2 | int | Αρχικός δείκτης των χαρακτήρων στο **string2**. |
| length2 | int | Αριθμός χαρακτήρων στο **string2** για σύγκριση. |
| options | CompareOptions | [String](../../../system/string/) επιλογές σύγκρισης. |

### ReturnValue

Αρνητική τιμή εάν το τμήμα της πρώτης συμβολοσειράς προηγείται του τμήματος της δεύτερης συμβολοσειράς, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
