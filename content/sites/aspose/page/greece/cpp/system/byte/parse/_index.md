---
title: "System::Byte::Parse μέθοδος"
linktitle: "Parse"
second_title: "Aspose.Page για C++"
description: "System::Byte::Parse μέθοδος. Μετατρέπει το καθορισμένο κείμενο που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 8-bit ακέραιο χωρίς πρόσημο σε C++."
type: docs
weight: 100
url: /el/cpp/system/byte/parse/
---
## Byte::Parse(const String\&) method


Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο.

```cpp
static uint8_t System::Byte::Parse(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |

### ReturnValue

Το 8-bit ακέραιο χωρίς πρόσημο ίσο με τον αριθμό που αναπαρίσταται από το καθορισμένο κείμενο.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης.

```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |

### ReturnValue

Το 8-bit ακέραιο χωρίς πρόσημο ίσο με τον αριθμό που αναπαρίσταται από το καθορισμένο κείμενο.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού.

```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| styles | Globalization::NumberStyles | Ένας bitwise συνδυασμός τιμών του enum NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης του αριθμού ως κείμενο. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |

### ReturnValue

Το 8-bit ακέραιο χωρίς πρόσημο ίσο με τον αριθμό που αναπαρίσταται από το καθορισμένο κείμενο.

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::Parse(const String\&, std::nullptr_t) method




```cpp
static uint8_t System::Byte::Parse(const String &value, std::nullptr_t)
```

## Δείτε επίσης

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
