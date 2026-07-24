---
title: "System::Runtime::Serialization::SerializationInfo κλάση"
linktitle: "SerializationInfo"
second_title: "Aspose.Page για C++"
description: "System::Runtime::Serialization::SerializationInfo κλάση. Διατηρεί σύνολο ονομαστικών πεδίων που αντιπροσωπεύουν το σειριοποιημένο αντικείμενο. Δεν έχει υλοποιηθεί. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον pointer για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Διατηρεί σύνολο ονομασμένων πεδίων που αντιπροσωπεύουν το σειριοποιημένο αντικείμενο. Δεν έχει υλοποιηθεί. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class SerializationInfo : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Τοποθετεί τιμή float. Δεν έχει υλοποιηθεί. |
| [AddValue](./addvalue/)(const System::String\&, short) | Τοποθετεί τιμή short. Δεν έχει υλοποιηθεί. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Τοποθετεί τιμή boolean. Δεν έχει υλοποιηθεί. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Τοποθετεί τιμή αντικειμένου. Δεν έχει υλοποιηθεί. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Τοποθετεί τιμή αντικειμένου με καθορισμένο τύπο. Δεν έχει υλοποιηθεί. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Ανακτά μια τιμή από το αποθηκευτικό χώρο [SerializationInfo](./). Δεν έχει υλοποιηθεί. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
