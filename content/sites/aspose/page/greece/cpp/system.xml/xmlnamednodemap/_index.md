---
title: "System::Xml::XmlNamedNodeMap κλάση"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNamedNodeMap κλάση. Αντιπροσωπεύει μια συλλογή κόμβων που μπορούν να προσπελαστούν κατά όνομα ή δείκτη σε C++."
type: docs
weight: 2200
url: /el/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Αναπαριστά μια συλλογή κόμβων που μπορούν να προσπελαστούν με όνομα ή δείκτη.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [begin](./begin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής. |
| [cbegin](./cbegin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής. |
| [cend](./cend/)() const | Λαμβάνει επαναλήπτη για ένα μη υπάρχον στοιχείο πίσω από το τελευταίο στοιχείο της συλλογής. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη για ένα μη υπάρχον στοιχείο πίσω από το τελευταίο στοιχείο της συλλογής. |
| virtual [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των κόμβων στο [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Παρέχει υποστήριξη για επανάληψη πάνω στη συλλογή κόμβων στο [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Ανακτά ένα [XmlNode](../xmlnode/) που καθορίζεται από το όνομα. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Ανακτά έναν κόμβο με τις αντίστοιχες τιμές των [XmlNode::get_LocalName](../xmlnode/get_localname/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [Item](./item/)(int32_t) | Ανακτά τον κόμβο στο καθορισμένο δείκτη στο [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Αφαιρεί τον κόμβο από το [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Αφαιρεί έναν κόμβο με τις αντίστοιχες τιμές των [XmlNode::get_LocalName](../xmlnode/get_localname/) και [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Προσθέτει ένα [XmlNode](../xmlnode/) χρησιμοποιώντας την τιμή του [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
