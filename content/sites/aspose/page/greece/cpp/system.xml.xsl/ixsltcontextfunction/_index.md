---
title: "System::Xml::Xsl::IXsltContextFunction κλάση"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::IXsltContextFunction κλάση. Παρέχει μια διεπαφή σε μια δεδομένη συνάρτηση που ορίζεται στο φύλλο στυλ Extensible Stylesheet Language for Transformations (XSLT) κατά την εκτέλεση χρόνου εκτέλεσης στην C++."
type: docs
weight: 100
url: /el/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Παρέχει μια διεπαφή σε μια συγκεκριμένη συνάρτηση που ορίζεται στο φύλλο στυλ Extensible Stylesheet Language for Transformations (XSLT) κατά την εκτέλεση.

```cpp
class IXsltContextFunction : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Επιστρέφει τους παρεχόμενους τύπους XML Path Language ([XPath](../../system.xml.xpath/)) για τη λίστα ορισμάτων της συνάρτησης. Αυτές οι πληροφορίες μπορούν να χρησιμοποιηθούν για την ανακάλυψη της υπογραφής της συνάρτησης, η οποία σας επιτρέπει να διακρίνετε μεταξύ υπερφορτωμένων συναρτήσεων. |
| virtual [get_Maxargs](./get_maxargs/)() | Επιστρέφει τον μέγιστο αριθμό ορισμάτων για τη συνάρτηση. Αυτό επιτρέπει στον χρήστη να διακρίνει μεταξύ υπερφορτωμένων συναρτήσεων. |
| virtual [get_Minargs](./get_minargs/)() | Επιστρέφει τον ελάχιστο αριθμό ορισμάτων για τη συνάρτηση. Αυτό επιτρέπει στον χρήστη να διακρίνει μεταξύ υπερφορτωμένων συναρτήσεων. |
| virtual [get_ReturnType](./get_returntype/)() | Επιστρέφει το XPathResultType που αντιπροσωπεύει τον τύπο [XPath](../../system.xml.xpath/) που επιστρέφεται από τη συνάρτηση. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Παρέχει τη μέθοδο για την κλήση της συνάρτησης με τα δεδομένα ορίσματα στο δεδομένο πλαίσιο. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
