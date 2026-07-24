---
title: "System::Xml::Schema::XmlSchemaComplexType κλάση"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaComplexType κλάση. Αντιπροσωπεύει το στοιχείο **complexType** από το XML Schema όπως ορίζεται από το Παγκόσμιο Ινστιτούτο Ιστού (W3C). Αυτή η κλάση ορίζει έναν σύνθετο τύπο που καθορίζει το σύνολο των χαρακτηριστικών και του περιεχομένου ενός στοιχείου σε C++."
type: docs
weight: 2100
url: /el/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Αντιπροσωπεύει το στοιχείο **complexType** από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση ορίζει έναν σύνθετο τύπο που καθορίζει το σύνολο των χαρακτηριστικών και του περιεχομένου ενός στοιχείου.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Επιστρέφει την τιμή για το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του σύνθετου τύπου. |
| [get_Attributes](./get_attributes/)() | Επιστρέφει τη συλλογή των χαρακτηριστικών για τον σύνθετο τύπο. |
| [get_AttributeUses](./get_attributeuses/)() | Επιστρέφει τη συλλογή όλων των συμμορφωμένων χαρακτηριστικών αυτού του σύνθετου τύπου και των βασικών του τύπων. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση για το **anyAttribute** αυτού του σύνθετου τύπου και των βασικών του τύπων. |
| [get_Block](./get_block/)() | Επιστρέφει το χαρακτηριστικό **block**. |
| [get_BlockResolved](./get_blockresolved/)() | Επιστρέφει την τιμή μετά τη μεταγλώττιση του τύπου στο σύνολο πληροφοριών μετά-επαλήθευσης σχήματος (infoset). Αυτή η τιμή υποδεικνύει πώς επιβάλλεται ο τύπος όταν χρησιμοποιείται το **xsi:type** στο έγγραφο παρουσίασης. |
| [get_ContentModel](./get_contentmodel/)() | Επιστρέφει το μετά-μεταγλώττιση [XmlSchemaContentModel](../xmlschemacontentmodel/) αυτού του σύνθετου τύπου. |
| [get_ContentType](./get_contenttype/)() | Επιστρέφει το μοντέλο περιεχομένου του σύνθετου τύπου που περιέχει την τιμή μετά τη μεταγλώττιση. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Επιστρέφει το στοιχείο που περιέχει την τιμή μετά τη μεταγλώττιση του στοιχείου [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | Επιστρέφει τις πληροφορίες που καθορίζουν αν το στοιχείο **complexType** μπορεί να χρησιμοποιηθεί στο έγγραφο παρουσίασης. |
| [get_IsMixed](./get_ismixed/)() override | Επιστρέφει πληροφορίες που καθορίζουν αν ο σύνθετος τύπος έχει μεικτό μοντέλο περιεχομένου (σήμανση εντός του περιεχομένου). |
| [get_Particle](./get_particle/)() | Επιστρέφει τον τύπο συνθέτη ως έναν από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Ορίζει την τιμή για το στοιχείο [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) του σύνθετου τύπου. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Ορίζει το χαρακτηριστικό **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Ορίζει το μετά-μεταγλώττιση [XmlSchemaContentModel](../xmlschemacontentmodel/) αυτού του σύνθετου τύπου. |
| [set_IsAbstract](./set_isabstract/)(bool) | Ορίζει τις πληροφορίες που καθορίζουν αν το στοιχείο **complexType** μπορεί να χρησιμοποιηθεί στο έγγραφο παρουσίασης. |
| [set_IsMixed](./set_ismixed/)(bool) override | Ορίζει πληροφορίες που καθορίζουν αν ο σύνθετος τύπος έχει μεικτό μοντέλο περιεχομένου (σήμανση εντός του περιεχομένου). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Ορίζει τον τύπο συνθέτη ως έναν από τις κλάσεις [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaComplexType](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
