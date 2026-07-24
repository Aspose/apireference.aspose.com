---
title: "System::BitConverter::ToString μέθοδος"
linktitle: "ToString"
second_title: "Aspose.Page για C++"
description: "System::BitConverter::ToString μέθοδος. Μετατρέπει όλες τις τιμές του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά. Η περίπτωση των γραμμάτων που θα χρησιμοποιηθούν στη δεκαεξαδική σημειογραφία και ο διαχωριστής που εισάγεται μεταξύ κάθε ζεύγους γειτονικών byte καθορίζονται μέσω των αντίστοιχων ορισμάτων σε C++."
type: docs
weight: 1200
url: /el/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Μετατρέπει όλες τις τιμές του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά. Η μορφή των γραμμάτων που θα χρησιμοποιηθούν στη δεκαεξαδική σημειογραφία και ο διαχωριστής που εισάγεται μεταξύ κάθε ζεύγους γειτονικών bytes καθορίζονται μέσω των αντίστοιχων ορισμάτων.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) που περιέχει byte προς μετατροπή |
| κεφαλαία | bool | Καθορίζει τη περίπτωση των γραμμάτων που θα χρησιμοποιηθούν στην τελική δεκαεξαδική αναπαράσταση |
| separator | const String\& | Μία συμβολοσειρά που χρησιμοποιείται ως διαχωριστής και εισάγεται μεταξύ κάθε ζεύγους γειτονικών byte στην τελική συμβολοσειρά |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Μετατρέπει τις τιμές του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά, ξεκινώντας από τον καθορισμένο δείκτη.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) που περιέχει byte προς μετατροπή |
| startIndex | int | Δείκτης στον καθορισμένο πίνακα από τον οποίο ξεκινά η μετατροπή |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Μετατρέπει μια περιοχή τιμών του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) που περιέχει byte προς μετατροπή |
| startIndex | int | Δείκτης στον καθορισμένο πίνακα από τον οποίο αρχίζει το εύρος των στοιχείων του πίνακα byte που θα μετατραπούν |
| length | int | Το μήκος του εύρους των στοιχείων του πίνακα byte που θα μετατραπούν |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
