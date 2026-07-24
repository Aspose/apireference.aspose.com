---
title: "System::DateTime::ParseExact μέθοδος"
linktitle: "ParseExact"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο ParseExact της κλάσης System::DateTime σε C++."
type: docs
weight: 6700
url: /el/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../) χρησιμοποιώντας τις καθορισμένες μορφές, τις πολιτισμικές πληροφορίες μορφής και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με μία ή περισσότερες από τις καθορισμένες μορφές. Εμφανίζει εξαίρεση εάν η μετατροπή αποτύχει.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
| μορφές | const ArrayPtr\<String\>\& | Ο πίνακας των μορφών συμβολοσειρών. |
| provider | const SharedPtr\<IFormatProvider\>\& | Το αντικείμενο [IFormatProvider](../../iformatprovider/) που παρέχει πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. |
| styles | Globalization::DateTimeStyles | Ένας bitwise συνδυασμός των τιμών της απαρίθμησης που παρέχει πρόσθετες πληροφορίες για **s**, για στοιχεία στυλ που ενδέχεται να υπάρχουν στο **s**, ή για τη μετατροπή του **s** σε αντικείμενο [DateTime](../). |

### ReturnValue

Μια νέα παρουσία της κλάσης [DateTime](../) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας ισοδύναμη με αυτή που αναπαρίσταται από τη συγκεκριμένη συμβολοσειρά.

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../) χρησιμοποιώντας τη συγκεκριμένη μορφή και τις πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με τη καθορισμένη μορφή. Εμφανίζει εξαίρεση εάν η μετατροπή αποτύχει.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
| μορφή | const String\& | Η μορφή συμβολοσειράς. |
| provider | const SharedPtr\<IFormatProvider\>\& | Το αντικείμενο [IFormatProvider](../../iformatprovider/) που παρέχει πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. |
| styles | Globalization::DateTimeStyles | Ένας bitwise συνδυασμός των τιμών της απαρίθμησης που παρέχει πρόσθετες πληροφορίες για **s**, για στοιχεία στυλ που ενδέχεται να υπάρχουν στο **s**, ή για τη μετατροπή του **s** σε αντικείμενο [DateTime](../). |

### ReturnValue

Μια νέα παρουσία της κλάσης [DateTime](../) που αντιπροσωπεύει την τιμή ημερομηνίας και ώρας ισοδύναμη με αυτή που αναπαρίσταται από τη συγκεκριμένη συμβολοσειρά.

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Δείτε επίσης

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
