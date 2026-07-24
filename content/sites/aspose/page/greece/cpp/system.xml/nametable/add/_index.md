---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page για C++"
description: "System::Xml::NameTable::Add method. Ατομικοποιεί το καθορισμένο κείμενο και το προσθέτει στον NameTable σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Ατομικοποιεί το καθορισμένο κείμενο και το προσθέτει στον [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κλειδί | const ArrayPtr\<char16_t\>\& | Ο πίνακας χαρακτήρων που περιέχει το κείμενο προς προσθήκη. |
| έναρξη | int32_t | Ο μηδενικός δείκτης στον πίνακα που καθορίζει τον πρώτο χαρακτήρα του κειμένου. |
| len | int32_t | Ο αριθμός των χαρακτήρων στο κείμενο. |

### ReturnValue

Το ατομικοποιημένο κείμενο ή το υπάρχον κείμενο εάν υπάρχει ήδη στον [NameTable](../). Εάν το **len** είναι μηδέν, επιστρέφεται το [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


Ατομικοποιεί το καθορισμένο κείμενο και το προσθέτει στον [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κλειδί | const String\& | Το κείμενο προς προσθήκη. |

### ReturnValue

Το ατομικοποιημένο κείμενο ή το υπάρχον κείμενο εάν υπάρχει ήδη στον [NameTable](../).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
