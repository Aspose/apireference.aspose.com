---
title: "Κλάση Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page για C++"
description: "Κλάση Aspose::Page::Plugins::IOperationResult. Γενική διεπαφή αποτελέσματος λειτουργίας που ορίζει κοινές μεθόδους που πρέπει να υλοποιήσει το συγκεκριμένο αποτέλεσμα λειτουργίας plugin σε C++."
type: docs
weight: 700
url: /el/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Γενική διεπαφή αποτελέσματος λειτουργίας που ορίζει κοινές μεθόδους που πρέπει να υλοποιήσει το συγκεκριμένο αποτέλεσμα λειτουργίας plugin.

```cpp
class IOperationResult : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_Data](./get_data/)() | Λαμβάνει ακατέργαστα δεδομένα. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Δείχνει αν το αποτέλεσμα είναι ένας πίνακας byte. |
| virtual [get_IsFile](./get_isfile/)() | Δείχνει αν το αποτέλεσμα είναι διαδρομή προς αρχείο εξόδου. |
| virtual [get_IsStream](./get_isstream/)() | Δείχνει αν το αποτέλεσμα είναι ροή εξόδου. |
| virtual [get_IsString](./get_isstring/)() | Δείχνει αν το αποτέλεσμα είναι κείμενο συμβολοσειράς. |
| virtual [ToFile](./tofile/)() | Προσπαθεί να μετατρέψει το αποτέλεσμα στο αρχείο. |
| virtual [ToStream](./tostream/)() | Προσπαθεί να μετατρέψει το αποτέλεσμα σε αντικείμενο ροής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
