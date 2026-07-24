---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. Καθορίζει τις επιλογές επικύρωσης σχήματος που χρησιμοποιούνται από τις κλάσεις XmlSchemaValidator και XmlReader σε C++."
type: docs
weight: 7900
url: /el/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Καθορίζει τις επιλογές επικύρωσης σχήματος που χρησιμοποιούνται από τις κλάσεις [XmlSchemaValidator](../xmlschemavalidator/) και [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Μην επεξεργαστείτε περιορισμούς ταυτότητας, ενσωματωμένα σχήματα, υποδείξεις τοποθεσίας σχήματος ή αναφέρετε προειδοποιήσεις επικύρωσης σχήματος. |
| ProcessInlineSchema | 1 | Επεξεργασία ενσωματωμένων σχημάτων που εντοπίζονται κατά την επικύρωση. |
| ProcessSchemaLocation | 2 | Επεξεργασία υποδείξεων τοποθεσίας σχήματος (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) που εντοπίζονται κατά την επικύρωση. |
| ReportValidationWarnings | 4 | Αναφορά προειδοποιήσεων επικύρωσης σχήματος που εντοπίζονται κατά την επικύρωση. |
| ProcessIdentityConstraints | 8 | Επεξεργασία περιορισμών ταυτότητας (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) που εντοπίζονται κατά την επικύρωση. |
| AllowXmlAttributes | 16 | Επιτρέψτε τα χαρακτηριστικά xml:* ακόμη και αν δεν ορίζονται στο σχήμα. Τα χαρακτηριστικά θα επικυρωθούν βάσει του τύπου δεδομένων τους. |

## Δείτε επίσης

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
