---
title: "System::DateTime::TryParseExact μέθοδος"
linktitle: "TryParseExact"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο TryParseExact της κλάσης System::DateTime σε C++."
type: docs
weight: 7000
url: /el/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../) χρησιμοποιώντας τις καθορισμένες μορφές, πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με μία ή περισσότερες από τις καθορισμένες μορφές.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
| μορφές | const ArrayPtr\<String\>\& | Ο πίνακας των μορφών συμβολοσειρών. |
| provider | const SharedPtr\<IFormatProvider\>\& | Το αντικείμενο [IFormatProvider](../../iformatprovider/) που παρέχει πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. |
| styles | Globalization::DateTimeStyles | Ένας bitwise συνδυασμός των τιμών της απαρίθμησης που παρέχει πρόσθετες πληροφορίες για **s**, για στοιχεία στυλ που ενδέχεται να υπάρχουν στο **s**, ή για τη μετατροπή του **s** σε αντικείμενο [DateTime](../). |
| αποτέλεσμα | DateTime\& | Το όρισμα εξόδου που, εάν η μετατροπή είναι επιτυχής, περιέχει το αποτέλεσμα της μετατροπής. |

### ReturnValue

Αληθές εάν η μετατροπή είναι επιτυχής, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../) χρησιμοποιώντας τη καθορισμένη μορφή, πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ. Η μορφή της αναπαράστασης συμβολοσειράς πρέπει να ταιριάζει ακριβώς με τη καθορισμένη μορφή.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
| μορφή | const String\& | Η μορφή συμβολοσειράς. |
| provider | const SharedPtr\<IFormatProvider\>\& | Το αντικείμενο [IFormatProvider](../../iformatprovider/) που παρέχει πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό. |
| styles | Globalization::DateTimeStyles | Ένας bitwise συνδυασμός των τιμών της απαρίθμησης που παρέχει πρόσθετες πληροφορίες για **s**, για στοιχεία στυλ που ενδέχεται να υπάρχουν στο **s**, ή για τη μετατροπή του **s** σε αντικείμενο [DateTime](../). |
| αποτέλεσμα | DateTime\& | Το όρισμα εξόδου που, εάν η μετατροπή είναι επιτυχής, περιέχει το αποτέλεσμα της μετατροπής. |

### ReturnValue

Αληθές εάν η μετατροπή είναι επιτυχής, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
