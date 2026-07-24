---
title: "System::Xml::XmlProcessingInstruction class"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlProcessingInstruction class. Αντιπροσωπεύει μια οδηγία επεξεργασίας, την οποία το XML ορίζει για τη διατήρηση πληροφοριών ειδικών για τον επεξεργαστή στο κείμενο του εγγράφου σε C++."
type: docs
weight: 3100
url: /el/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


Αντιπροσωπεύει μια οδηγία επεξεργασίας, την οποία το XML ορίζει για τη διατήρηση πληροφοριών ειδικών για τον επεξεργαστή στο κείμενο του εγγράφου.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| [get_Data](./get_data/)() | Επιστρέφει το περιεχόμενο της οδηγίας επεξεργασίας, εξαιρώντας τον προορισμό. |
| [get_InnerText](./get_innertext/)() override | Επιστρέφει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του. |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του κόμβου. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Target](./get_target/)() | Επιστρέφει τον προορισμό της οδηγίας επεξεργασίας. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή του κόμβου. |
| [set_Data](./set_data/)(const String\&) | Ορίζει το περιεχόμενο της οδηγίας επεξεργασίας, εξαιρώντας τον προορισμό. |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του. |
| [set_Value](./set_value/)(String) override | Ορίζει την τιμή του κόμβου. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει όλα τα παιδιά του κόμβου στον καθορισμένο [XmlWriter](../xmlwriter/). Επειδή οι κόμβοι ProcessingInstruction δεν έχουν παιδιά, αυτή η μέθοδος δεν έχει καμία επίδραση. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Αποθηκεύει τον κόμβο στον καθορισμένο [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
