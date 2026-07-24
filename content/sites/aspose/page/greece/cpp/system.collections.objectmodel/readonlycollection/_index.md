---
title: "System::Collections::ObjectModel::ReadOnlyCollection class"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection class. Τυλίγει συγκεκριμένο κοντέινερ για πρόσβαση σε λειτουργία μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Τυλίγει συγκεκριμένο κοντέινερ για πρόσβαση σε λειτουργία μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το κοντέινερ περιέχει συγκεκριμένο στοιχείο. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Αντιγράφει τα στοιχεία του κοντέινερ σε υπάρχοντα στοιχεία του πίνακα. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων του κοντέινερ. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Ελέγχει αν η συλλογή είναι μόνο για ανάγνωση. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή της συλλογής. |
| [idx_get](./idx_get/)(int) const override | Λαμβάνει το στοιχείο σε συγκεκριμένη θέση. |
| [IndexOf](./indexof/)(const T\&) const override | Αναζητά συγκεκριμένο στοιχείο στη συλλογή. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Τυλίγει μια συλλογή μόνο για ανάγνωση γύρω από συγκεκριμένη συλλογή. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Δεν κάνει τίποτα καθώς η συλλογή μόνο για ανάγνωση απλώς τυλίγει δεδομένα και δεν αποθηκεύει τίποτα. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Υλοποιημένη διεπαφή. |
| [IEnumeratorPtr](./ienumeratorptr/) | Κοντέινερ με ίδια στοιχεία. |
| [ValueType](./valuetype/) | Τύπος τιμής. |

## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
