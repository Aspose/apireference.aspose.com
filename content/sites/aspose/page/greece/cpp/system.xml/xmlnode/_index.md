---
title: "System::Xml::XmlNode κλάση"
linktitle: "XmlNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode κλάση. Αντιπροσωπεύει έναν μοναδικό κόμβο στο έγγραφο XML σε C++."
type: docs
weight: 2500
url: /el/cpp/system.xml/xmlnode/
---
## XmlNode class


Αντιπροσωπεύει έναν μοναδικό κόμβο στο έγγραφο XML.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Προσθέτει τον καθορισμένο κόμβο στο τέλος της λίστας των παιδικών κόμβων αυτού του κόμβου. |
| virtual [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο αυτού του κόμβου. |
| virtual [CloneNode](./clonenode/)(bool) | Δημιουργεί ένα αντίγραφο του κόμβου, όταν παρακάμπτεται σε μια παράγωγη κλάση. |
| [CreateNavigator](./createnavigator/)() override | Δημιουργεί ένα XPathNavigator για την περιήγηση αυτού του αντικειμένου. |
| virtual [get_Attributes](./get_attributes/)() | Επιστρέφει ένα [XmlAttributeCollection](../xmlattributecollection/) που περιέχει τα χαρακτηριστικά αυτού του κόμβου. |
| virtual [get_BaseURI](./get_baseuri/)() | Επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| virtual [get_ChildNodes](./get_childnodes/)() | Επιστρέφει όλους τους υποκόμβους του κόμβου. |
| virtual [get_FirstChild](./get_firstchild/)() | Επιστρέφει τον πρώτο υποκόμβο του κόμβου. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν αυτός ο κόμβος έχει οποιουσδήποτε υποκόμβους. |
| virtual [get_InnerText](./get_innertext/)() | Επιστρέφει τις ενωμένες τιμές του κόμβου και όλων των υποκόμβων του. |
| virtual [get_InnerXml](./get_innerxml/)() | Επιστρέφει το markup που αντιπροσωπεύει μόνο τους υποκόμβους αυτού του κόμβου. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο κόμβος είναι μόνο για ανάγνωση. |
| virtual [get_LastChild](./get_lastchild/)() | Επιστρέφει τον τελευταίο υποκόμβο του κόμβου. |
| virtual [get_LocalName](./get_localname/)() | Επιστρέφει το τοπικό όνομα του κόμβου, όταν αντικατασταθεί σε μια κληρονομημένη κλάση. |
| virtual [get_Name](./get_name/)() | Επιστρέφει το πλήρες όνομα του κόμβου, όταν αντικατασταθεί σε μια κληρονομημένη κλάση. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Επιστρέφει το URI του ονοματοχώρου αυτού του κόμβου. |
| virtual [get_NextSibling](./get_nextsibling/)() | Επιστρέφει τον κόμβο που ακολουθεί αμέσως αυτόν τον κόμβο. |
| virtual [get_NodeType](./get_nodetype/)() | Επιστρέφει τον τύπο του τρέχοντος κόμβου, όταν αντικατασταθεί σε μια κληρονομημένη κλάση. |
| virtual [get_OuterXml](./get_outerxml/)() | Επιστρέφει το markup που περιέχει αυτόν τον κόμβο και όλους τους υποκόμβους του. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Επιστρέφει το [XmlDocument](../xmldocument/) στο οποίο ανήκει αυτός ο κόμβος. |
| virtual [get_ParentNode](./get_parentnode/)() | Επιστρέφει τον γονέα αυτού του κόμβου (για κόμβους που μπορούν να έχουν γονείς). |
| virtual [get_Prefix](./get_prefix/)() | Επιστρέφει το πρόθεμα ονοματοχώρου αυτού του κόμβου. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Επιστρέφει τον κόμβο που προηγείται αμέσως αυτού του κόμβου. |
| virtual [get_PreviousText](./get_previoustext/)() | Επιστρέφει τον κόμβο κειμένου που προηγείται αμέσως αυτού του κόμβου. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Επιστρέφει το σύνολο πληροφοριών μετά την επικύρωση σχήματος που έχει ανατεθεί σε αυτόν τον κόμβο ως αποτέλεσμα της επικύρωσης σχήματος. |
| virtual [get_Value](./get_value/)() | Επιστρέφει την τιμή του κόμβου. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν enumerator που επαναλαμβάνει τους υποκόμβους του τρέχοντος κόμβου. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Αναζητά τη πιο κοντινή δήλωση **xmlns** για το δεδομένο πρόθεμα που είναι εντός εμβέλειας του τρέχοντος κόμβου και επιστρέφει το URI του χώρου ονομάτων στη δήλωση. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Αναζητά τη πιο κοντινή δήλωση **xmlns** για το δεδομένο URI του χώρου ονομάτων που είναι εντός εμβέλειας του τρέχοντος κόμβου και επιστρέφει το πρόθεμα που ορίζεται σε αυτή τη δήλωση. |
| virtual [idx_get](./idx_get/)(String) | Επιστρέφει το πρώτο στοιχείο-υποκόμβο με το καθορισμένο [XmlNode::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | Επιστρέφει το πρώτο στοιχείο-υποκόμβο με τις καθορισμένες τιμές [XmlNode::get_LocalName](./get_localname/) και [XmlNode::get_NamespaceURI](./get_namespaceuri/). |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Εισάγει τον καθορισμένο κόμβο αμέσως μετά τον καθορισμένο κόμβο αναφοράς. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Εισάγει τον καθορισμένο κόμβο αμέσως πριν τον καθορισμένο κόμβο αναφοράς. |
| virtual [Normalize](./normalize/)() | Τοποθετεί όλους τους κόμβους [XmlText](../xmltext/) σε όλο το βάθος του υποδέντρου κάτω από αυτό το [XmlNode](./) σε μια "κανονική" μορφή όπου μόνο το markup (δηλαδή ετικέτες, σχόλια, οδηγίες επεξεργασίας, ενότητες CDATA και αναφορές οντοτήτων) διαχωρίζει τους κόμβους [XmlText](../xmltext/), δηλαδή δεν υπάρχουν διαδοχικοί κόμβοι [XmlText](../xmltext/). |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Προσθέτει τον καθορισμένο κόμβο στην αρχή της λίστας των υποκόμβων για αυτόν τον κόμβο. |
| virtual [RemoveAll](./removeall/)() | Αφαιρεί όλους τους υποκόμβους και/ή τα χαρακτηριστικά του τρέχοντος κόμβου. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Αφαιρεί τον καθορισμένο κόμβο-παιδί. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Αντικαθιστά τον κόμβο-παιδί **oldChild** με τον κόμβο **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | Επιλέγει μια λίστα κόμβων που ταιριάζουν με την έκφραση [XPath](../../system.xml.xpath/). |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Επιλέγει μια λίστα κόμβων που ταιριάζουν με την έκφραση [XPath](../../system.xml.xpath/). Όλα τα προθέματα που βρέθηκαν στην έκφραση [XPath](../../system.xml.xpath/) επιλύονται χρησιμοποιώντας το παρεχόμενο [XmlNamespaceManager](../xmlnamespacemanager/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Επιλέγει τον πρώτο [XmlNode](./) που ταιριάζει με την έκφραση [XPath](../../system.xml.xpath/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Επιλέγει τον πρώτο [XmlNode](./) που ταιριάζει με την έκφραση [XPath](../../system.xml.xpath/). Όλα τα προθέματα που βρέθηκαν στην έκφραση [XPath](../../system.xml.xpath/) επιλύονται χρησιμοποιώντας το παρεχόμενο [XmlNamespaceManager](../xmlnamespacemanager/). |
| virtual [set_InnerText](./set_innertext/)(String) | Ορίζει τις συνενωμένες τιμές του κόμβου και όλων των παιδικών του κόμβων. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Ορίζει τη σήμανση που αντιπροσωπεύει μόνο τους παιδικούς κόμβους αυτού του κόμβου. |
| virtual [set_Prefix](./set_prefix/)(String) | Ορίζει το πρόθεμα του χώρου ονομάτων αυτού του κόμβου. |
| virtual [set_Value](./set_value/)(String) | Ορίζει την τιμή του κόμβου. |
| virtual [Supports](./supports/)(String, String) | Δοκιμάζει αν η υλοποίηση DOM υλοποιεί μια συγκεκριμένη δυνατότητα. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Αποθηκεύει όλους τους παιδικούς κόμβους του κόμβου στο καθορισμένο [XmlWriter](../xmlwriter/), όταν αντικατασταθεί σε μια κληρονομημένη κλάση. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Αποθηκεύει τον τρέχοντα κόμβο στο καθορισμένο [XmlWriter](../xmlwriter/), όταν αντικατασταθεί σε μια κληρονομημένη κλάση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
