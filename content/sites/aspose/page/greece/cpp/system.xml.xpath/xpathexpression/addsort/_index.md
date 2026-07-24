---
title: "System::Xml::XPath::XPathExpression::AddSort μέθοδος"
linktitle: "AddSort"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathExpression::AddSort μέθοδος. Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, ταξινομεί τους κόμβους που επιλέγονται από την έκφραση XPath σύμφωνα με το καθορισμένο αντικείμενο IComparer σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, ταξινομεί τους κόμβους που επιλέγονται από την έκφραση [XPath](../../) σύμφωνα με το καθορισμένο αντικείμενο IComparer.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Ένα αντικείμενο που αντιπροσωπεύει το κλειδί ταξινόμησης. Αυτό μπορεί να είναι η τιμή **string** του κόμβου ή ένα αντικείμενο [XPathExpression](../) με μια μεταγλωττισμένη έκφραση [XPath](../../). |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Ένα αντικείμενο IComparer που παρέχει τις συγκρίσεις συγκεκριμένων τύπων δεδομένων για τη σύγκριση δύο αντικειμένων για ισοδυναμία. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, ταξινομεί τους κόμβους που επιλέγονται από την έκφραση [XPath](../../) σύμφωνα με τις παρεχόμενες παραμέτρους.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Ένα αντικείμενο που αντιπροσωπεύει το κλειδί ταξινόμησης. Αυτό μπορεί να είναι η τιμή **string** του κόμβου ή ένα αντικείμενο [XPathExpression](../) με μια μεταγλωττισμένη έκφραση [XPath](../../). |
| order | XmlSortOrder | Μια τιμή [XmlSortOrder](../../xmlsortorder/) που υποδεικνύει τη σειρά ταξινόμησης. |
| caseOrder | XmlCaseOrder | Μια τιμή [XmlCaseOrder](../../xmlcaseorder/) που υποδεικνύει πώς να ταξινομηθούν τα κεφαλαία και πεζά γράμματα. |
| lang | String | Η γλώσσα που θα χρησιμοποιηθεί για τη σύγκριση. Χρησιμοποιεί την κλάση [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) που μπορεί να περαστεί στη μέθοδο [String::Compare](../../../system/string/compare/) για τους τύπους γλώσσας, για παράδειγμα, \"us-en\" για τα αγγλικά των Η.Π.Α. Εάν καθοριστεί κενή συμβολοσειρά, το περιβάλλον του συστήματος χρησιμοποιείται για τον καθορισμό του [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | Μια τιμή [XmlDataType](../../xmldatatype/) που υποδεικνύει τη σειρά ταξινόμησης για τον τύπο δεδομένων. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
