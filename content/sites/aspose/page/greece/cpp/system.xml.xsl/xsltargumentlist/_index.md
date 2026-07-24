---
title: "System::Xml::Xsl::XsltArgumentList κλάση"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltArgumentList κλάση. Περιέχει έναν μεταβλητό αριθμό ορισμάτων που είναι είτε παράμετροι XSLT είτε αντικείμενα επέκτασης σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Περιέχει έναν μεταβλητό αριθμό ορισμάτων που είναι είτε παράμετροι XSLT είτε αντικείμενα επέκτασης.

```cpp
class XsltArgumentList : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Προσθέτει ένα νέο αντικείμενο στη [XsltArgumentList](./) και το συσχετίζει με το URI του ονοματοχώρου. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Προσθέτει μια παράμετρο στη [XsltArgumentList](./) και τη συσχετίζει με το όνομα που είναι προσδιορισμένο από το namespace. |
| [Clear](./clear/)() | Αφαιρεί όλες τις παραμέτρους και τα αντικείμενα επέκτασης από τη [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Επιστρέφει το αντικείμενο που συσχετίζεται με το δεδομένο namespace. |
| [GetParam](./getparam/)(const String\&, const String\&) | Επιστρέφει την παράμετρο που συσχετίζεται με το όνομα που είναι προσδιορισμένο από το namespace. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Αφαιρεί το αντικείμενο με το URI του χώρου ονομάτων από το [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Αφαιρεί την παράμετρο από το [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Δημιουργεί μια νέα παρουσία του [XsltArgumentList](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
