---
title: "System::Xml::Xsl::XsltContext::ResolveFunction μέθοδος"
linktitle: "ResolveFunction"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction μέθοδος. Όταν παρακάμπτεται σε μια κληρονομημένη κλάση, επιλύει μια αναφορά συνάρτησης και επιστρέφει ένα IXsltContextFunction που αντιπροσωπεύει τη συνάρτηση. Το IXsltContextFunction χρησιμοποιείται κατά την εκτέλεση για να λάβει την τιμή επιστροφής της συνάρτησης σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Όταν παρακάμπτεται σε μια κληρονομημένη κλάση, επιλύει μια αναφορά συνάρτησης και επιστρέφει ένα [IXsltContextFunction](../../ixsltcontextfunction/) που αντιπροσωπεύει τη συνάρτηση. Το [IXsltContextFunction](../../ixsltcontextfunction/) χρησιμοποιείται κατά την εκτέλεση για να λάβει την τιμή επιστροφής της συνάρτησης.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | String | Το πρόθεμα της συνάρτησης όπως εμφανίζεται στην έκφραση [XPath](../../../system.xml.xpath/). |
| όνομα | String | Το όνομα της συνάρτησης. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Ένας πίνακας τύπων ορισμάτων για τη συνάρτηση που επιλύεται. Αυτό σας επιτρέπει να επιλέξετε μεταξύ μεθόδων με το ίδιο όνομα (για παράδειγμα, υπερφορτωμένες μεθόδους). |

### ReturnValue

Ένα [IXsltContextFunction](../../ixsltcontextfunction/) που αντιπροσωπεύει τη συνάρτηση.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
