---
title: "System::Xml::Xsl::IXsltContextVariable κλάση"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::IXsltContextVariable κλάση. Παρέχει μια διεπαφή σε μια δεδομένη μεταβλητή που ορίζεται στο φύλλο στυλ κατά την εκτέλεση σε χρόνο εκτέλεσης σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Παρέχει μια διεπαφή σε μια δεδομένη μεταβλητή που ορίζεται στο φύλλο στυλ κατά την εκτέλεση χρόνου εκτέλεσης.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Αξιολογεί τη μεταβλητή κατά την εκτέλεση και επιστρέφει ένα αντικείμενο που αντιπροσωπεύει την τιμή της μεταβλητής. |
| virtual [get_IsLocal](./get_islocal/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η μεταβλητή είναι τοπική. |
| virtual [get_IsParam](./get_isparam/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η μεταβλητή είναι παράμετρος του Extensible Stylesheet Language Transformations (XSLT). Αυτό μπορεί να είναι παράμετρος ενός φύλλου στυλ ή ενός προτύπου. |
| virtual [get_VariableType](./get_variabletype/)() | Επιστρέφει το XPathResultType που αντιπροσωπεύει τον τύπο της XML Path Language ([XPath](../../system.xml.xpath/)) της μεταβλητής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
