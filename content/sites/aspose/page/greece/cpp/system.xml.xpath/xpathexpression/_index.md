---
title: "System::Xml::XPath::XPathExpression class"
linktitle: "XPathExpression"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathExpression class. Παρέχει μια τυποποιημένη κλάση που αντιπροσωπεύει μια μεταγλωττισμένη έκφραση XPath σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Παρέχει μια τυποποιημένη κλάση που αντιπροσωπεύει μια μεταγλωττισμένη έκφραση [XPath](../).

```cpp
class XPathExpression : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, ταξινομεί τους κόμβους που επιλέγονται από την έκφραση [XPath](../) σύμφωνα με το καθορισμένο αντικείμενο IComparer. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, ταξινομεί τους κόμβους που επιλέγονται από την έκφραση [XPath](../) σύμφωνα με τις παρεχόμενες παραμέτρους. |
| virtual [Clone](./clone/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει ένα κλώνο αυτού του [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | Μεταγλωττίζει την καθορισμένη έκφραση [XPath](../) και επιστρέφει ένα αντικείμενο [XPathExpression](./) που αντιπροσωπεύει την έκφραση [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Μεταγλωττίζει την καθορισμένη έκφραση [XPath](../), με το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση ονομάτων χώρου, και επιστρέφει ένα αντικείμενο [XPathExpression](./) που αντιπροσωπεύει την έκφραση [XPath](../). |
| virtual [get_Expression](./get_expression/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει μια **string** αναπαράσταση του [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει τον τύπο αποτελέσματος της έκφρασης [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, καθορίζει το αντικείμενο [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) που θα χρησιμοποιηθεί για την επίλυση ονομάτων χώρου. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, καθορίζει το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που θα χρησιμοποιηθεί για την επίλυση ονομάτων χώρου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
