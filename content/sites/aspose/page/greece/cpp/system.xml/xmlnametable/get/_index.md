---
title: "System::Xml::XmlNameTable::Get μέθοδος"
linktitle: "Ανάκτηση"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNameTable::Get μέθοδος. Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει την ατομικοποιημένη συμβολοσειρά που περιέχει τους ίδιους χαρακτήρες με το καθορισμένο εύρος χαρακτήρων στον δεδομένο πίνακα σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιστρέφει τη ατομικοποιημένη συμβολοσειρά που περιέχει τους ίδιους χαρακτήρες με το καθορισμένο εύρος χαρακτήρων στον δεδομένο πίνακα.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | Ο πίνακας χαρακτήρων που περιέχει το όνομα προς αναζήτηση. |
| offset | int32_t | Ο δείκτης μηδενικής βάσης στον πίνακα που καθορίζει τον πρώτο χαρακτήρα του ονόματος. |
| length | int32_t | Ο αριθμός των χαρακτήρων στο όνομα. |

### ReturnValue

Η ατομικοποιημένη συμβολοσειρά ή **nullptr** εάν η συμβολοσειρά δεν έχει ήδη ατομικοποιηθεί. Εάν το **length** είναι μηδέν, επιστρέφεται το [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιστρέφει τη ατομικοποιημένη συμβολοσειρά που περιέχει την ίδια τιμή με τη συγκεκριμένη συμβολοσειρά.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| array | const String\& | Το όνομα για αναζήτηση. |

### ReturnValue

Η ατομική συμβολοσειρά ή **nullptr** εάν η συμβολοσειρά δεν έχει ήδη ατομικοποιηθεί.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
