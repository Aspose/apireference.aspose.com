---
title: "System::Xml::XmlNameTable::Add μέθοδος"
linktitle: "Add"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNameTable::Add μέθοδος. Όταν αντικαθίσταται σε μια παράγωγη κλάση, ατομικοποιεί το καθορισμένο συμβολοσειρά και το προσθέτει στο XmlNameTable σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, ατομικοποιεί το καθορισμένο συμβολοσειρά και το προσθέτει στο [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | Ο πίνακας χαρακτήρων που περιέχει το όνομα προς προσθήκη. |
| offset | int32_t | Δείκτης μηδενικής βάσης στον πίνακα που καθορίζει τον πρώτο χαρακτήρα του ονόματος. |
| length | int32_t | Ο αριθμός των χαρακτήρων στο όνομα. |

### ReturnValue

Η νέα ατομικοποιημένη συμβολοσειρά ή η υπάρχουσα εάν υπάρχει ήδη. Εάν το length είναι μηδέν, επιστρέφεται το [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, ατομικοποιεί το καθορισμένο συμβολοσειρά και το προσθέτει στο [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| array | const String\& | Το όνομα προς προσθήκη. |

### ReturnValue

Η νέα ατομικοποιημένη συμβολοσειρά ή η υπάρχουσα εάν υπάρχει ήδη.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
