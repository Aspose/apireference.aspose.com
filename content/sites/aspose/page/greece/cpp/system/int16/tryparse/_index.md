---
title: "System::Int16::TryParse μέθοδος"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο TryParse της κλάσης System::Int16 σε C++."
type: docs
weight: 200
url: /el/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 16-bit υπογεγραμμένο ακέραιο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και στυλ αριθμού.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| styles | Globalization::NumberStyles | Ένας bitwise συνδυασμός τιμών του enum NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης του αριθμού ως κείμενο. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |
| αποτέλεσμα | int16_t\& | Η αναφορά σε μια μεταβλητή 16-bit υπογεγραμμένου ακέραιου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 16-bit υπογεγραμμένο ακέραιο.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| αποτέλεσμα | int16_t\& | Η αναφορά σε μια μεταβλητή 16-bit υπογεγραμμένου ακέραιου όπου το αποτέλεσμα της μετατροπής τοποθετείται. |

### ReturnValue

Αληθές εάν η μετατροπή πέτυχε, διαφορετικά - ψευδές.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
