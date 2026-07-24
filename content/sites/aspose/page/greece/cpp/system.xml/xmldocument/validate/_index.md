---
title: "Μέθοδος System::Xml::XmlDocument::Validate"
linktitle: "Επικύρωση"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument::Validate μέθοδος. Επικυρώνει το XmlDocument έναντι των σχημάτων XML Schema Definition Language (XSD) που περιέχονται στη λίστα XmlDocument::get_Schemas σε C++."
type: docs
weight: 4300
url: /el/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Επικυρώνει το [XmlDocument](../) έναντι των σχημάτων XML [Schema](../../../system.xml.schema/) Definition Language (XSD) που περιέχονται στη λίστα [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Το αντικείμενο [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) που λαμβάνει πληροφορίες σχετικά με προειδοποιήσεις και σφάλματα επικύρωσης σχήματος. |

## Δείτε επίσης

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Επικυρώνει το αντικείμενο [XmlNode](../../xmlnode/) που καθορίζεται έναντι των σχημάτων XML [Schema](../../../system.xml.schema/) Definition Language (XSD) στη λίστα [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Το αντικείμενο [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) που λαμβάνει πληροφορίες σχετικά με προειδοποιήσεις και σφάλματα επικύρωσης σχήματος. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Το αντικείμενο [XmlNode](../../xmlnode/) που δημιουργείται από ένα [XmlDocument](../) για επικύρωση. |

## Δείτε επίσης

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
