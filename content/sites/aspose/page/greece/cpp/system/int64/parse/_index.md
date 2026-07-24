---
title: "System::Int64::Parse μέθοδος"
linktitle: "Parse"
second_title: "Aspose.Page για C++"
description: "System::Int64::Parse μέθοδος. Μετατρέπει τη δοσμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού στον ισοδύναμο 64-bit υπογεγραμμένο ακέραιο σε C++."
type: docs
weight: 100
url: /el/cpp/system/int64/parse/
---
## Int64::Parse(const String\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 64-bit υπογεγραμμένο ακέραιο.

```cpp
static int64_t System::Int64::Parse(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |

### ReturnValue

Ο 64-bit υπογεγραμμένος ακέραιος ίσος με τον αριθμό που αναπαρίσταται από τη δοσμένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 64-bit υπογεγραμμένο ακέραιο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης.

```cpp
static int64_t System::Int64::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |

### ReturnValue

Ο 64-bit υπογεγραμμένος ακέραιος ίσος με τον αριθμό που αναπαρίσταται από τη δοσμένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση ενός αριθμού σε ισοδύναμο 64-bit υπογεγραμμένο ακέραιο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού.

```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή. |
| styles | Globalization::NumberStyles | Ένας bitwise συνδυασμός τιμών του enum NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης του αριθμού ως κείμενο. |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης του κειμένου. |

### ReturnValue

Ο 64-bit υπογεγραμμένος ακέραιος ίσος με τον αριθμό που αναπαρίσταται από τη δοσμένη συμβολοσειρά.

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static int64_t System::Int64::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::Parse(const String\&, std::nullptr_t) method




```cpp
static int64_t System::Int64::Parse(const String &value, std::nullptr_t)
```

## Δείτε επίσης

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
