---
title: "System::Int64::TryParse μέθοδος"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο TryParse της κλάσης System::Int64 σε C++."
type: docs
weight: 200
url: /el/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 64-bit υπογεγραμμένο ακέραιο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| styles | Globalization::NumberStyles | Ένας bitwise συνδυασμός τιμών του enum NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης του αριθμού ως κείμενο. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |
| αποτέλεσμα | int64_t\& | Η αναφορά σε μια μεταβλητή 64-bit υπογεγραμμένου ακέραιου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 64-bit υπογεγραμμένο ακέραιο.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| αποτέλεσμα | int64_t\& | Η αναφορά σε μια μεταβλητή 64-bit υπογεγραμμένου ακέραιου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
