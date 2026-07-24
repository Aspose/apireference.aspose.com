---
title: "System::Decimal::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page για C++"
description: "System::Decimal::TryParse method. Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στην ισοδύναμη τιμή Decimal σε C++."
type: docs
weight: 5800
url: /el/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στην ισοδύναμη τιμή [Decimal](../).

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή |
| result | Decimal\& | Η αναφορά σε μια μεταβλητή [Decimal](../) όπου το αποτέλεσμα της μετατροπής τοποθετείται |

### ReturnValue

Αληθές εάν η μετατροπή ολοκληρώθηκε επιτυχώς, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Μετατρέπει τη συγκεκριμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στην ισοδύναμη τιμή [Decimal](../) χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά προς μετατροπή |
| styles | Globalization::NumberStyles | Μια δυαδική συνδυαστική τιμή των τιμών της απαρίθμησης NumberStyles που καθορίζει το επιτρεπόμενο στυλ της αναπαράστασης συμβολοσειράς ενός αριθμού |
| πάροχος | const SharedPtr\<IFormatProvider\>\& | Ένας δείκτης σε ένα αντικείμενο που περιέχει τις πληροφορίες μορφοποίησης της συμβολοσειράς |
| αποτέλεσμα | Decimal\& | Ένα όρισμα εξόδου· περιέχει το αποτέλεσμα της μετατροπής |

### ReturnValue

Αληθές εάν η μετατροπή ολοκληρώθηκε επιτυχώς, διαφορετικά - ψευδές

## Δείτε επίσης

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
