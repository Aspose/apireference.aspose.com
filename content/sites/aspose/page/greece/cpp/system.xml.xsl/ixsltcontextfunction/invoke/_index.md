---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke μέθοδος"
linktitle: "Invoke"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke μέθοδος. Παρέχει τη μέθοδο για την εκτέλεση της λειτουργίας με τα δεδομένα ορίσματα στο δεδομένο πλαίσιο σε C++."
type: docs
weight: 500
url: /el/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Παρέχει τη μέθοδο για την κλήση της συνάρτησης με τα δεδομένα ορίσματα στο δεδομένο πλαίσιο.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Το πλαίσιο XSLT για την κλήση της λειτουργίας. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Τα ορίσματα της κλήσης της λειτουργίας. Κάθε όρισμα είναι ένα στοιχείο στον πίνακα. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Ο κόμβος πλαισίου για την κλήση της λειτουργίας. |

### ReturnValue

Ένα [Object](../../../system/object/) που αντιπροσωπεύει την τιμή επιστροφής της λειτουργίας.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
