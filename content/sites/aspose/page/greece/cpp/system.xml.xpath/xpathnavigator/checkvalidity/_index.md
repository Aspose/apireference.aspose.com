---
title: "System::Xml::XPath::XPathNavigator::CheckValidity μέθοδος"
linktitle: "CheckValidity"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity μέθοδος. Επαληθεύει ότι τα δεδομένα XML στο XPathNavigator συμμορφώνονται με τη γλώσσα ορισμού XML Schema (XSD) σχήμα που παρέχεται σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Επαληθεύει ότι τα δεδομένα XML στο [XPathNavigator](../) συμμορφώνονται με τη γλώσσα ορισμού XML [Schema](../../../system.xml.schema/) (XSD) σχήμα που παρέχεται.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | Το XmlSchemaSet που περιέχει τα σχήματα που χρησιμοποιούνται για την επικύρωση των δεδομένων XML που περιέχονται στο [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | Το ValidationEventHandler που λαμβάνει πληροφορίες σχετικά με προειδοποιήσεις και σφάλματα επικύρωσης σχήματος. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
