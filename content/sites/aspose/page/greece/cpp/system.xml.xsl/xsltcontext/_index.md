---
title: "System::Xml::Xsl::XsltContext κλάση"
linktitle: "XsltContext"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltContext κλάση. Περιλαμβάνει το τρέχον πλαίσιο εκτέλεσης του επεξεργαστή Extensible Stylesheet Language for Transformations (XSLT), επιτρέποντας στην XML Path Language (XPath) να επιλύει συναρτήσεις, παραμέτρους και ονοματικούς χώρους μέσα σε εκφράσεις XPath στην C++."
type: docs
weight: 500
url: /el/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Περιλαμβάνει το τρέχον πλαίσιο εκτέλεσης του επεξεργαστή Extensible Stylesheet Language for Transformations (XSLT), επιτρέποντας στην XML Path Language ([XPath](../../system.xml.xpath/)) να επιλύει συναρτήσεις, παραμέτρους και ονοματικούς χώρους μέσα σε εκφράσεις [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, συγκρίνει τα βασικά Uniform Resource Identifiers (URIs) δύο εγγράφων με βάση τη σειρά με την οποία τα έγγραφα φορτώθηκαν από τον επεξεργαστή XSLT (δηλαδή, την κλάση [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, λαμβάνει μια τιμή που υποδεικνύει εάν θα συμπεριληφθούν κόμβοι λευκού διαστήματος στην έξοδο. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, αξιολογεί εάν θα διατηρηθούν οι κόμβοι λευκού διαστήματος ή θα αφαιρεθούν για το δεδομένο πλαίσιο. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιλύει μια αναφορά συνάρτησης και επιστρέφει ένα [IXsltContextFunction](../ixsltcontextfunction/) που αντιπροσωπεύει τη συνάρτηση. Το [IXsltContextFunction](../ixsltcontextfunction/) χρησιμοποιείται κατά την εκτέλεση για να ληφθεί η τιμή επιστροφής της συνάρτησης. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιλύει μια αναφορά μεταβλητής και επιστρέφει ένα [IXsltContextVariable](../ixsltcontextvariable/) που αντιπροσωπεύει τη μεταβλητή. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
