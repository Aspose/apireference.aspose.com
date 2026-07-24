---
title: "System::Collections::Generic::BaseKVCollection κλάση"
linktitle: "BaseKVCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::BaseKVCollection κλάση. Περιέχει κοινό κώδικα για συλλογές κλειδιών ή τιμών. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Περιέχει κοινό κώδικα για συλλογές κλειδιών ή τιμών. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Parameter | Περιγραφή |
| --- | --- |
| Dict | [Dictionary](../dictionary/) τύπος. |
| KV | Τύπος κλειδιού ή τιμής, ανάλογα με το για ποιον χρησιμοποιείται η διεπαφή. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Δημιουργεί συλλογή. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Αντιγράφει δεδομένα σε υπάρχοντα στοιχεία του πίνακα. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Επιτρέπει τη μεταγλώττιση, αλλά στην πραγματικότητα δεν κάνει τίποτα καθώς αυτή η δομή δεν κατέχει δεδομένα. |

## Δείτε επίσης

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
