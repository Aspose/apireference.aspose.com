---
title: "System::Xml::XmlDeclaration::get_Encoding μέθοδος"
linktitle: "get_Encoding"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDeclaration::get_Encoding μέθοδος. Επιστρέφει το επίπεδο κωδικοποίησης του εγγράφου XML σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Επιστρέφει το επίπεδο κωδικοποίησης του εγγράφου XML.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Το έγκυρο όνομα κωδικοποίησης χαρακτήρων.
## Παρατηρήσεις



Τα πιο συχνά υποστηριζόμενα ονόματα κωδικοποίησης χαρακτήρων για XML είναι τα εξής: |||
|-|-|
| Κατηγορία | Ονόματα Κωδικοποίησης |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (όπου "n" είναι ψηφίο από 1 έως 9) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Αυτή η τιμή είναι προαιρετική. Εάν δεν οριστεί τιμή, αυτή η μέθοδος επιστρέφει [String::Empty](../../../system/string/empty/). Εάν δεν περιλαμβάνεται χαρακτηριστικό κωδικοποίησης, υποτίθεται κωδικοποίηση UTF-8 όταν το έγγραφο γράφεται ή αποθηκεύεται.
## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
