---
title: "Κλάση System::Xml::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs κλάση. Παρέχει δεδομένα για τα γεγονότα XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved και XmlDocument::NodeRemoving σε C++."
type: docs
weight: 2600
url: /el/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Παρέχει δεδομένα για τα συμβάντα **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** και **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Action](./get_action/)() | Επιστρέφει μια τιμή που υποδεικνύει τι τύπο γεγονότος αλλαγής κόμβου συμβαίνει. |
| [get_NewParent](./get_newparent/)() | Επιστρέφει την τιμή του [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) μετά την ολοκλήρωση της λειτουργίας. |
| [get_NewValue](./get_newvalue/)() | Επιστρέφει τη νέα τιμή του κόμβου. |
| [get_Node](./get_node/)() | Επιστρέφει το [XmlNode](../xmlnode/) που προστίθεται, αφαιρείται ή αλλάζει. |
| [get_OldParent](./get_oldparent/)() | Επιστρέφει την τιμή του [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) πριν ξεκινήσει η λειτουργία. |
| [get_OldValue](./get_oldvalue/)() | Επιστρέφει την αρχική τιμή του κόμβου. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlNodeChangedEventArgs](./). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
