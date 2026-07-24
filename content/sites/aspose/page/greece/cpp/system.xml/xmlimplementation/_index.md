---
title: "System::Xml::XmlImplementation κλάση"
linktitle: "XmlImplementation"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlImplementation κλάση. Ορίζει το πλαίσιο για ένα σύνολο αντικειμένων XmlDocument σε C++."
type: docs
weight: 2000
url: /el/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Ορίζει το πλαίσιο για ένα σύνολο αντικειμένων [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Δημιουργεί ένα νέο [XmlDocument](../xmldocument/). |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Δοκιμάζει εάν η υλοποίηση του Μοντέλου Εγγράφου [Object](../../system/object/) (DOM) υλοποιεί μια συγκεκριμένη δυνατότητα. |
| [XmlImplementation](./xmlimplementation/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlImplementation](./) με το καθορισμένο [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
