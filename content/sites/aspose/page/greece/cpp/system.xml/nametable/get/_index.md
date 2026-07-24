---
title: "System::Xml::NameTable::Get method"
linktitle: "Ανάκτηση"
second_title: "Aspose.Page για C++"
description: "System::Xml::NameTable::Get method. Επιστρέφει το ατομικοποιημένο κείμενο που περιέχει τους ίδιους χαρακτήρες με το καθορισμένο εύρος χαρακτήρων στον δεδομένο πίνακα σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Επιστρέφει τη ατομική συμβολοσειρά που περιέχει τους ίδιους χαρακτήρες όπως το καθορισμένο εύρος χαρακτήρων στον δεδομένο πίνακα.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κλειδί | const ArrayPtr\<char16_t\>\& | Ο πίνακας χαρακτήρων που περιέχει το όνομα προς εύρεση. |
| έναρξη | int32_t | Ο δείκτης μηδενικής βάσης στον πίνακα που καθορίζει τον πρώτο χαρακτήρα του ονόματος. |
| len | int32_t | Ο αριθμός των χαρακτήρων στο όνομα. |

### ReturnValue

Το ατομικοποιημένο κείμενο ή **nullptr** εάν το κείμενο δεν έχει ήδη ατομικοποιηθεί. Εάν το **len** είναι μηδέν, επιστρέφεται το [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Επιστρέφει τη ατομικοποιημένη συμβολοσειρά με την καθορισμένη τιμή.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Το όνομα προς εύρεση. |

### ReturnValue

Το αντικείμενο ατομικοποιημένου κειμένου ή **nullptr** εάν το κείμενο δεν έχει ήδη ατομικοποιηθεί.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
