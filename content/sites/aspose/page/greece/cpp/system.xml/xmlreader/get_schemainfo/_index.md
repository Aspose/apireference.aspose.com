---
title: "System::Xml::XmlReader::get_SchemaInfo μέθοδος"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::get_SchemaInfo μέθοδος. Επιστρέφει τις πληροφορίες σχήματος που έχουν εκχωρηθεί στον τρέχον κόμβο ως αποτέλεσμα της επικύρωσης σχήματος σε C++."
type: docs
weight: 2200
url: /el/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Επιστρέφει τις πληροφορίες σχήματος που έχουν εκχωρηθεί στον τρέχοντα κόμβο ως αποτέλεσμα της επικύρωσης σχήματος.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Ένα αντικείμενο IXmlSchemaInfo που περιέχει τις πληροφορίες σχήματος για τον τρέχον κόμβο. Οι πληροφορίες [Schema](../../../system.xml.schema/) μπορούν να οριστούν σε στοιχεία, χαρακτηριστικά ή σε κόμβους κειμένου με μη μηδενική τιμή [XmlReader::get_ValueType](../get_valuetype/). Εάν ο τρέχων κόμβος δεν είναι ένας από τους παραπάνω τύπους κόμβων ή εάν η παρουσία [XmlReader](../) δεν αναφέρει πληροφορίες σχήματος, αυτή η μέθοδος επιστρέφει **nullptr**. Εάν αυτή η μέθοδος κληθεί από ένα αντικείμενο [XmlTextReader](../../xmltextreader/) ή [XmlValidatingReader](../../xmlvalidatingreader/), αυτή η μέθοδος πάντα επιστρέφει **nullptr**. Αυτές οι υλοποιήσεις [XmlReader](../) δεν εκθέτουν πληροφορίες σχήματος μέσω της μεθόδου get_SchemaInfo.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
