---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. Παρέχει πληροφορίες σχετικά με τη λειτουργία επικύρωσης των αντικαταστάσεων στοιχείων any και anyAttribute σε C++."
type: docs
weight: 7300
url: /el/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


Παρέχει πληροφορίες σχετικά με τη λειτουργία επικύρωσης των αντικαταστάσεων στοιχείων **any** και **anyAttribute**.

```cpp
enum class XmlSchemaContentProcessing
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Τα στοιχεία εγγράφου δεν επικυρώνονται. |
| Skip | 1 | Τα στοιχεία του εγγράφου πρέπει να αποτελούν καλά διαμορφωμένο XML και δεν επικυρώνονται από το σχήμα. |
| Lax | 2 | Εάν βρεθεί το σχετικό σχήμα, τα στοιχεία του εγγράφου θα επικυρωθούν. Διαφορετικά, δεν θα προκύψουν σφάλματα. |
| Strict | 3 | Ο επεξεργαστής σχήματος πρέπει να βρει ένα σχήμα που σχετίζεται με τον υποδεικνυόμενο χώρο ονομάτων για να επικυρώσει τα στοιχεία του εγγράφου. |

## Δείτε επίσης

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
