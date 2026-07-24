---
title: "Κλάση System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::XmlNamespaceManager. Επίλυση, προσθήκη και αφαίρεση χώρων ονομάτων σε μια συλλογή και παροχή διαχείρισης εμβέλειας για αυτούς τους χώρους ονομάτων σε C++."
type: docs
weight: 2300
url: /el/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Επιλύει, προσθέτει και αφαιρεί χώρους ονομάτων σε μια συλλογή και παρέχει διαχείριση εμβέλειας για αυτούς τους χώρους ονομάτων.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Προσθέτει το δεδομένο χώρο ονομάτων στη συλλογή. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Επιστρέφει το URI του χώρου ονομάτων για τον προεπιλεγμένο χώρο ονομάτων. |
| virtual [get_NameTable](./get_nametable/)() | Επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτό το αντικείμενο. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν απαριθμητή για χρήση στην επανάληψη μέσω των χώρων ονομάτων στο [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Επιστρέφει μια συλλογή ονομάτων χώρων ονομάτων με κλειδί το πρόθεμα, η οποία μπορεί να χρησιμοποιηθεί για την απαρίθμηση των χώρων ονομάτων που είναι επί του παρόντος σε εμβέλεια. |
| virtual [HasNamespace](./hasnamespace/)(String) | Επιστρέφει μια τιμή που υποδεικνύει εάν το παρεχόμενο πρόθεμα έχει ορισμένο χώρο ονομάτων για την τρέχουσα ωθήμενη εμβέλεια. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Επιστρέφει το URI του χώρου ονομάτων για το συγκεκριμένο πρόθεμα. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Βρίσκει το πρόθεμα που δηλώθηκε για το δεδομένο URI χώρου ονομάτων. |
| virtual [PopScope](./popscope/)() | Αφαιρεί μια εμβέλεια χώρου ονομάτων από τη στοίβα. |
| virtual [PushScope](./pushscope/)() | Τοποθετεί μια εμβέλεια χώρου ονομάτων στη στοίβα. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Αφαιρεί το δεδομένο χώρο ονομάτων για το δεδομένο πρόθεμα. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlNamespaceManager](./) με το καθορισμένο [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
