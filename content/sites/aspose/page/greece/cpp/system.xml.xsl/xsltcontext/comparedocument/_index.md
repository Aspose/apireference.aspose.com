---
title: "System::Xml::Xsl::XsltContext::CompareDocument μέθοδος"
linktitle: "CompareDocument"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument μέθοδος. Όταν παρακάμπτεται σε μια παράγωγη κλάση, συγκρίνει τα βασικά Uniform Resource Identifiers (URIs) δύο εγγράφων με βάση τη σειρά με την οποία τα έγγραφα φορτώθηκαν από τον επεξεργαστή XSLT (δηλαδή, την κλάση XslTransform) σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Όταν παρακάμπτεται σε μια παράγωγη κλάση, συγκρίνει τα βασικά Uniform Resource Identifiers (URIs) δύο εγγράφων με βάση τη σειρά με την οποία τα έγγραφα φορτώθηκαν από τον επεξεργαστή XSLT (δηλαδή, την κλάση [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | String | Το βασικό URI του πρώτου εγγράφου προς σύγκριση. |
| nextbaseUri | String | Το βασικό URI του δεύτερου εγγράφου προς σύγκριση. |

### ReturnValue

Μια ακέραια τιμή που περιγράφει τη σχετική σειρά των δύο βασικών URIs: -1 εάν το **baseUri** εμφανίζεται πριν από το **nextbaseUri**· 0 εάν τα δύο βασικά URIs είναι ταυτόσημα· και 1 εάν το **baseUri** εμφανίζεται μετά το **nextbaseUri**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
