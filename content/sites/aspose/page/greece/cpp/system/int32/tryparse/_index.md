---
title: "System::Int32::TryParse μέθοδος"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο TryParse της κλάσης System::Int32 σε C++."
type: docs
weight: 200
url: /el/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Μετατρέπει το συγκεκριμένο συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 32-bit υπογεγραμμένο ακέραιο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| styles | Globalization::NumberStyles | Ένας bitwise συνδυασμός τιμών του enum NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης του αριθμού ως κείμενο. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |
| αποτέλεσμα | int32_t\& | Η αναφορά σε μια μεταβλητή 32-bit υπογεγραμμένου ακεραίου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Μετατρέπει το συγκεκριμένο συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 32-bit υπογεγραμμένο ακέραιο.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| αποτέλεσμα | int32_t\& | Η αναφορά σε μια μεταβλητή 32-bit υπογεγραμμένου ακεραίου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
