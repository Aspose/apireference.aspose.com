---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace μέθοδος"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace μέθοδος. Όταν παρακάμπτεται σε μια παράγωγη κλάση, αξιολογεί αν πρέπει να διατηρηθούν οι κόμβοι λευκού διαστήματος ή να αφαιρεθούν για το δεδομένο πλαίσιο σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, αξιολογεί εάν θα διατηρηθούν οι κόμβοι λευκού διαστήματος ή θα αφαιρεθούν για το δεδομένο πλαίσιο.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| node | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Ο κόμβος λευκού διαστήματος που πρέπει να διατηρηθεί ή να αφαιρεθεί στο τρέχον πλαίσιο. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
