---
title: "System::Xml::Schema::XmlSchemaGroupRef κλάση"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaGroupRef κλάση. Αντιπροσωπεύει το στοιχείο **group** με το χαρακτηριστικό **ref** από το XML Schema όπως ορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση χρησιμοποιείται μέσα σε σύνθετους τύπους που αναφέρονται σε ένα **group** που ορίζεται στο επίπεδο **schema** σε C++."
type: docs
weight: 3300
url: /el/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Αντιπροσωπεύει το στοιχείο **group** με το χαρακτηριστικό **ref** από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση χρησιμοποιείται μέσα σε σύνθετους τύπους που αναφέρονται σε ένα **group** που ορίζεται στο επίπεδο **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Particle](./get_particle/)() | Επιστρέφει μία από τις κλάσεις [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/), η οποία περιέχει την ερμηνεία μετά τη μεταγλώττιση της τιμής **Particle**. |
| [get_RefName](./get_refname/)() | Επιστρέφει το όνομα ενός **group** που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα ενός **group** που ορίζεται σε αυτό το σχήμα (ή σε άλλο σχήμα που υποδεικνύεται από τον καθορισμένο χώρο ονομάτων). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaGroupRef](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
