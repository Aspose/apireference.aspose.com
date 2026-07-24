---
title: "Μέθοδος System::String::Compare"
linktitle: "Compare"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::String::Compare. Η σύγκριση λιγότερο-ίσο-μεγαλύτερο συγκρίνει δύο συμβολοσειρές σε C++."
type: docs
weight: 6200
url: /el/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-συγκρίνει δύο συμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| ignoreCase | bool | Καθορίζει αν η σύγκριση είναι ανεξάρτητη από πεζά/κεφαλαία. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Πολιτισμός που θα χρησιμοποιηθεί για τη σύγκριση. |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater-συγκρίνει δύο συμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| ignoreCase | bool | Καθορίζει αν η σύγκριση είναι ανεξάρτητη από πεζά/κεφαλαία. |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater-συγκρίνει δύο συμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| comparison_type | System::StringComparison | Λειτουργία [Comparison](../../comparison/). |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-συγκρίνει δύο υποσυμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| indexA | int | Αρχή της πρώτης υποσυμβολοσειράς. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| indexB | int | Αρχή της δεύτερης υποσυμβολοσειράς. |
| length | int | Αριθμός χαρακτήρων προς σύγκριση. |
| ignoreCase | bool | Καθορίζει αν η σύγκριση είναι ανεξάρτητη από πεζά/κεφαλαία. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Πολιτισμός που θα χρησιμοποιηθεί για τη σύγκριση. |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater-συγκρίνει δύο υποσυμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| indexA | int | Αρχή της πρώτης υποσυμβολοσειράς. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| indexB | int | Αρχή της δεύτερης υποσυμβολοσειράς. |
| length | int | Αριθμός χαρακτήρων προς σύγκριση. |
| ignoreCase | bool | Καθορίζει αν η σύγκριση είναι ανεξάρτητη από πεζά/κεφαλαία. |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater-συγκρίνει δύο συμβολοσειρές.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strA | const String\& | Πρώτη συμβολοσειρά για σύγκριση. |
| indexA | int | Αρχή της πρώτης υποσυμβολοσειράς. |
| strB | const String\& | Δεύτερη συμβολοσειρά για σύγκριση. |
| indexB | int | Αρχή της δεύτερης υποσυμβολοσειράς. |
| length | int | Αριθμός χαρακτήρων προς σύγκριση. |
| comparison_type | System::StringComparison | Λειτουργία [Comparison](../../comparison/). |

### ReturnValue

Αρνητική τιμή εάν η πρώτη υποσυμβολοσειρά είναι μικρότερη από τη δεύτερη, μηδέν εάν ταιριάζουν, θετική τιμή διαφορετικά.

## Δείτε επίσης

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
