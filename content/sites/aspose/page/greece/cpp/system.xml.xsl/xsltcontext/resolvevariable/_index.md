---
title: "System::Xml::Xsl::XsltContext::ResolveVariable μέθοδος"
linktitle: "ResolveVariable"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable μέθοδος. Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιλύει μια αναφορά μεταβλητής και επιστρέφει ένα IXsltContextVariable που αντιπροσωπεύει τη μεταβλητή σε C++."
type: docs
weight: 500
url: /el/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιλύει μια αναφορά μεταβλητής και επιστρέφει ένα [IXsltContextVariable](../../ixsltcontextvariable/) που αντιπροσωπεύει τη μεταβλητή.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | String | Το πρόθεμα της μεταβλητής όπως εμφανίζεται στην έκφραση [XPath](../../../system.xml.xpath/). |
| όνομα | String | Το όνομα της μεταβλητής. |

### ReturnValue

Ένα [IXsltContextVariable](../../ixsltcontextvariable/) που αντιπροσωπεύει τη μεταβλητή κατά την εκτέλεση.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
