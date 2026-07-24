---
title: "System::DateTime::TryParse μέθοδος"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο TryParse της κλάσης System::DateTime σε C++."
type: docs
weight: 6900
url: /el/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../) χρησιμοποιώντας τις καθορισμένες πληροφορίες μορφοποίησης ειδικές για τον πολιτισμό και το στυλ.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
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
## DateTime::TryParse(const String\&, DateTime\&) method


Μετατρέπει την καθορισμένη αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας σε ισοδύναμο αντικείμενο [DateTime](../).

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | Η αναπαράσταση συμβολοσειράς μιας τιμής ημερομηνίας και ώρας για μετατροπή. |
| αποτέλεσμα | DateTime\& | Το όρισμα εξόδου που, εάν η μετατροπή είναι επιτυχής, περιέχει το αποτέλεσμα της μετατροπής. |

### ReturnValue

Αληθές εάν η μετατροπή είναι επιτυχής, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
