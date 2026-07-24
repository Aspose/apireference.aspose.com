---
title: "Κλάση System::Xml::Schema::XmlSchemaInference"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaInference. Προσδιορίζει ένα σχήμα XML Schema Definition Language (XSD) από ένα έγγραφο XML. Η κλάση XmlSchemaInference δεν μπορεί να κληρονομηθεί σε C++."
type: docs
weight: 3700
url: /el/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Προσδιορίζει ένα σχήμα XML [Schema](../) Definition Language (XSD) από ένα έγγραφο XML. Η κλάση [XmlSchemaInference](./) δεν μπορεί να κληρονομηθεί.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Απαρίθμηση | Περιγραφή |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Επηρεάζει τις πληροφορίες εμφάνισης και τύπου που προκύπτουν από την κλάση [XmlSchemaInference](./) για στοιχεία και χαρακτηριστικά σε ένα έγγραφο XML. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Επιστρέφει την τιμή [XmlSchemaInference::InferenceOption](./inferenceoption/) που επηρεάζει τις δηλώσεις εμφάνισης σχήματος που προκύπτουν από το έγγραφο XML. |
| [get_TypeInference](./get_typeinference/)() | Επιστρέφει την τιμή [XmlSchemaInference::InferenceOption](./inferenceoption/) που επηρεάζει τους τύπους που προκύπτουν από το έγγραφο XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Προσδιορίζει ένα σχήμα XML [Schema](../) Definition Language (XSD) από το έγγραφο XML που περιέχεται στο αντικείμενο [XmlReader](../../system.xml/xmlreader/) που έχει οριστεί. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Προσδιορίζει ένα σχήμα XML [Schema](../) Definition Language (XSD) από το έγγραφο XML που περιέχεται στο αντικείμενο [XmlReader](../../system.xml/xmlreader/) που έχει οριστεί, και βελτιώνει το προκύπτον σχήμα χρησιμοποιώντας ένα υπάρχον σχήμα στο αντικείμενο [XmlSchemaSet](../xmlschemaset/) που έχει οριστεί με τον ίδιο στόχο namespace. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Ορίζει την τιμή [XmlSchemaInference::InferenceOption](./inferenceoption/) που επηρεάζει τις δηλώσεις εμφάνισης σχήματος που προκύπτουν από το έγγραφο XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Ορίζει την τιμή του [XmlSchemaInference::InferenceOption](./inferenceoption/) που επηρεάζει τους τύπους που προκύπτουν από το έγγραφο XML. |
| [XmlSchemaInference](./xmlschemainference/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaInference](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
