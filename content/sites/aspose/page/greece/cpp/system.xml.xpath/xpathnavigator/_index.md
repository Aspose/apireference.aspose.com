---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator class. Παρέχει ένα μοντέλο κέρσορα για την περιήγηση και την επεξεργασία δεδομένων XML σε C++."
type: docs
weight: 500
url: /el/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Παρέχει ένα μοντέλο κέρσορα για πλοήγηση και επεξεργασία δεδομένων XML.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Επιστρέφει ένα αντικείμενο [XmlWriter](../../system.xml/xmlwriter/) που χρησιμοποιείται για τη δημιουργία ενός ή περισσότερων νέων κόμβων-παιδιών στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου. |
| virtual [AppendChild](./appendchild/)(String) | Δημιουργεί έναν νέο κόμβο-παιδί στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά δεδομένων XML. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Δημιουργεί έναν νέο κόμβο-παιδί στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου χρησιμοποιώντας τα περιεχόμενα XML του αντικειμένου [XmlReader](../../system.xml/xmlreader/) που έχει καθοριστεί. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Δημιουργεί έναν νέο κόμβο-παιδί στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου χρησιμοποιώντας τους κόμβους στο [XPathNavigator](./) που έχει καθοριστεί. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Δημιουργεί έναν νέο κόμβο στοιχείου-παιδί στο τέλος της λίστας των κόμβων-παιδιών του τρέχοντος κόμβου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την τιμή που δόθηκε. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Επαληθεύει ότι τα δεδομένα XML στο [XPathNavigator](./) συμμορφώνονται με το σχήμα γλώσσας ορισμού XML [Schema](../../system.xml.schema/) (XSD) που παρέχεται. |
| virtual [Clone](./clone/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, δημιουργεί ένα νέο [XPathNavigator](./) τοποθετημένο στον ίδιο κόμβο με αυτό το [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Συγκρίνει τη θέση του τρέχοντος [XPathNavigator](./) με τη θέση του καθορισμένου [XPathNavigator](./). |
| virtual [Compile](./compile/)(String) | Συγκεντρώνει μια συμβολοσειρά που αντιπροσωπεύει μια έκφραση [XPath](../) και επιστρέφει ένα αντικείμενο [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Δημιουργεί έναν κόμβο χαρακτηριστικού στον τρέχοντα κόμβο στοιχείου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την τιμή που δόθηκε. |
| virtual [CreateAttributes](./createattributes/)() | Επιστρέφει ένα αντικείμενο [XmlWriter](../../system.xml/xmlwriter/) που χρησιμοποιείται για τη δημιουργία νέων χαρακτηριστικών στο τρέχον στοιχείο. |
| [CreateNavigator](./createnavigator/)() override | Επιστρέφει ένα αντίγραφο του [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Διαγράφει μια σειρά αδελφών κόμβων από τον τρέχοντα κόμβο έως τον καθορισμένο κόμβο. |
| virtual [DeleteSelf](./deleteself/)() | Διαγράφει τον τρέχοντα κόμβο και τους κόμβους-παιδιά του. |
| virtual [Evaluate](./evaluate/)(String) | Αξιολογεί την καθορισμένη έκφραση [XPath](../) και επιστρέφει το τυποποιημένο αποτέλεσμα. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Αξιολογεί την καθορισμένη έκφραση [XPath](../) και επιστρέφει το τυποποιημένο αποτέλεσμα, χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονοματοχώρου στην έκφραση [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Αξιολογεί το [XPathExpression](../xpathexpression/) και επιστρέφει το τυποποιημένο αποτέλεσμα. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Χρησιμοποιεί το παρεχόμενο πλαίσιο για την αξιολόγηση του [XPathExpression](../xpathexpression/), και επιστρέφει το τυποποιημένο αποτέλεσμα. |
| virtual [get_BaseURI](./get_baseuri/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει το βασικό URI για τον τρέχοντα κόμβο. |
| virtual [get_CanEdit](./get_canedit/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XPathNavigator](./) μπορεί να επεξεργαστεί τα υποκείμενα δεδομένα XML. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος έχει οποιαδήποτε χαρακτηριστικά. |
| virtual [get_HasChildren](./get_haschildren/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος έχει οποιουσδήποτε κόμβους-παιδιά. |
| virtual [get_InnerXml](./get_innerxml/)() | Επιστρέφει το σήμανση που αντιπροσωπεύει τους κόμβους-παιδιά του τρέχοντος κόμβου. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα κενό στοιχείο χωρίς ετικέτα κλεισίματος. |
| [get_IsNode](./get_isnode/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος αντιπροσωπεύει έναν κόμβο [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει το [XPathNavigator::get_Name](./get_name/) του τρέχοντος κόμβου χωρίς κανένα πρόθεμα ονοματοχώρου. |
| virtual [get_Name](./get_name/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, επιστρέφει το URI του ονόματος χώρου του τρέχοντος κόμβου. |
| virtual [get_NameTable](./get_nametable/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, επιστρέφει το [XmlNameTable](../../system.xml/xmlnametable/) του [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Επιστρέφει ένα [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) που χρησιμοποιείται για σύγκριση ισότητας αντικειμένων [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | Όταν παρακαμφθεί σε μια παράγωγη κλάση, επιστρέφει το [XPathNodeType](../xpathnodetype/) του τρέχοντος κόμβου. |
| virtual [get_OuterXml](./get_outerxml/)() | Επιστρέφει το σήμανση που αντιπροσωπεύει τις εναρκτήριες και κλειστικές ετικέτες του τρέχοντος κόμβου και των θυγατρικών του. |
| virtual [get_Prefix](./get_prefix/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει το πρόθεμα του χώρου ονομάτων που σχετίζεται με τον τρέχοντα κόμβο. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Επιστρέφει τις πληροφορίες σχήματος που έχουν εκχωρηθεί στον τρέχοντα κόμβο ως αποτέλεσμα της επικύρωσης σχήματος. |
| [get_TypedValue](./get_typedvalue/)() override | Επιστρέφει τον τρέχοντα κόμβο ως ένα boxed object του πιο κατάλληλου τύπου. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Χρησιμοποιείται από υλοποιήσεις του [XPathNavigator](./) που παρέχουν μια "εικονική" προβολή XML πάνω σε αποθήκη, για να παρέχουν πρόσβαση στα υποκείμενα αντικείμενα. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| virtual [get_XmlLang](./get_xmllang/)() | Επιστρέφει το πεδίο **xml:lang** για τον τρέχοντα κόμβο. |
| [get_XmlType](./get_xmltype/)() override | Επιστρέφει τις πληροφορίες XmlSchemaType για τον τρέχοντα κόμβο. |
| virtual [GetAttribute](./getattribute/)(String, String) | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| virtual [GetNamespace](./getnamespace/)(String) | Επιστρέφει την τιμή του κόμβου ονόματος χώρου που αντιστοιχεί στο καθορισμένο τοπικό όνομα. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Επιστρέφει τα ονόματα χώρου εντός εμβέλειας του τρέχοντος κόμβου. |
| virtual [InsertAfter](./insertafter/)() | Επιστρέφει ένα αντικείμενο [XmlWriter](../../system.xml/xmlwriter/) που χρησιμοποιείται για τη δημιουργία ενός νέου αδελφικού κόμβου μετά τον τρέχοντα επιλεγμένο κόμβο. |
| virtual [InsertAfter](./insertafter/)(String) | Δημιουργεί έναν νέο αδελφικό κόμβο μετά τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά XML. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Δημιουργεί έναν νέο αδελφικό κόμβο μετά τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας το περιεχόμενο XML του καθορισμένου αντικειμένου [XmlReader](../../system.xml/xmlreader/). |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Δημιουργεί έναν νέο αδελφικό κόμβο μετά τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας τους κόμβους του καθορισμένου αντικειμένου [XPathNavigator](./). |
| virtual [InsertBefore](./insertbefore/)() | Επιστρέφει ένα αντικείμενο [XmlWriter](../../system.xml/xmlwriter/) που χρησιμοποιείται για τη δημιουργία ενός νέου αδελφικού κόμβου πριν τον τρέχοντα επιλεγμένο κόμβο. |
| virtual [InsertBefore](./insertbefore/)(String) | Δημιουργεί έναν νέο αδελφικό κόμβο πριν τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά XML. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Δημιουργεί έναν νέο αδελφικό κόμβο πριν τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας το περιεχόμενο XML του καθορισμένου αντικειμένου [XmlReader](../../system.xml/xmlreader/). |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Δημιουργεί έναν νέο αδελφικό κόμβο πριν τον τρέχοντα επιλεγμένο κόμβο χρησιμοποιώντας τους κόμβους του καθορισμένου [XPathNavigator](./). |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Δημιουργεί ένα νέο αδελφικό στοιχείο μετά τον τρέχοντα κόμβο χρησιμοποιώντας το καθορισμένο πρόθεμα ονόματος χώρου, το τοπικό όνομα και το URI του ονόματος χώρου, με την καθορισμένη τιμή. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Δημιουργεί ένα νέο στοιχείο αδερφό πριν από τον τρέχοντα κόμβο χρησιμοποιώντας το καθορισμένο πρόθεμα ονοματοχώρου, το τοπικό όνομα και το καθορισμένο URI ονοματοχώρου, με την καθορισμένη τιμή. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Καθορίζει εάν το καθορισμένο [XPathNavigator](./) είναι απόγονος του τρέχοντος [XPathNavigator](./). |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, καθορίζει εάν ο τρέχων [XPathNavigator](./) βρίσκεται στην ίδια θέση με το καθορισμένο [XPathNavigator](./). |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Επιστρέφει το URI του χώρου ονομάτων για το συγκεκριμένο πρόθεμα. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Επιστρέφει το πρόθεμα που δηλώθηκε για το καθορισμένο URI ονοματοχώρου. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Καθορίζει εάν ο τρέχων κόμβος ταιριάζει με το καθορισμένο [XPathExpression](../xpathexpression/). |
| virtual [Matches](./matches/)(String) | Καθορίζει εάν ο τρέχων κόμβος ταιριάζει με την καθορισμένη έκφραση [XPath](../). |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στην ίδια θέση με το καθορισμένο [XPathNavigator](./). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Μετακινεί το [XPathNavigator](./) στο χαρακτηριστικό με το αντίστοιχο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [MoveToChild](./movetochild/)(String, String) | Μετακινεί το [XPathNavigator](./) στον υποκόμβο με το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Μετακινεί το [XPathNavigator](./) στον υποκόμβο του καθορισμένου [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToFirst](./movetofirst/)() | Μετακινεί το [XPathNavigator](./) στον πρώτο αδερφό κόμβο του τρέχοντος κόμβου. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στο πρώτο χαρακτηριστικό του τρέχοντος κόμβου. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον πρώτο υποκόμβο του τρέχοντος κόμβου. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον πρώτο κόμβο ονοματοχώρου που ταιριάζει με το καθορισμένο [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Μετακινεί το [XPathNavigator](./) στον πρώτο κόμβο ονοματοχώρου του τρέχοντος κόμβου. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Μετακινεί το [XPathNavigator](./) στο στοιχείο με το τοπικό όνομα και το URI ονοματοχώρου που καθορίζονται με τη σειρά του εγγράφου. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Μετακινεί το [XPathNavigator](./) στο στοιχείο με το τοπικό όνομα και το URI ονοματοχώρου που καθορίζονται, μέχρι το καθορισμένο όριο, με τη σειρά του εγγράφου. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Μετακινεί το [XPathNavigator](./) στο επόμενο στοιχείο του καθορισμένου [XPathNodeType](../xpathnodetype/) με τη σειρά του εγγράφου. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Μετακινεί το [XPathNavigator](./) στο επόμενο στοιχείο του καθορισμένου [XPathNodeType](../xpathnodetype/), μέχρι το καθορισμένο όριο, με τη σειρά του εγγράφου. |
| virtual [MoveToId](./movetoid/)(String) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινείται στον κόμβο που έχει ένα χαρακτηριστικό τύπου **ID** του οποίου η τιμή ταιριάζει με το καθορισμένο [String](../../system/string/). |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Μετακινεί το [XPathNavigator](./) στον κόμβο ονοματοχώρου με το καθορισμένο πρόθεμα ονοματοχώρου. |
| virtual [MoveToNext](./movetonext/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον επόμενο αδερφό κόμβο του τρέχοντος κόμβου. |
| virtual [MoveToNext](./movetonext/)(String, String) | Μετακινεί το [XPathNavigator](./) στον επόμενο αδερφό κόμβο με το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Μετακινεί το [XPathNavigator](./) στον επόμενο αδερφό κόμβο του τρέχοντος κόμβου που ταιριάζει με το καθορισμένο [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Όταν παρακάμπτεται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στο επόμενο χαρακτηριστικό. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον επόμενο κόμβο ονοματοχώρου που ταιριάζει με το καθορισμένο [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToNextNamespace](./movetonextnamespace/)() | Μετακινεί το [XPathNavigator](./) στον επόμενο κόμβο ονοματοχώρου. |
| virtual [MoveToParent](./movetoparent/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον γονικό κόμβο του τρέχοντος κόμβου. |
| virtual [MoveToPrevious](./movetoprevious/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινεί το [XPathNavigator](./) στον προηγούμενο αδελφό κόμβο του τρέχοντος κόμβου. |
| virtual [MoveToRoot](./movetoroot/)() | Μετακινεί το [XPathNavigator](./) στον ριζικό κόμβο στον οποίο ανήκει ο τρέχων κόμβος. |
| virtual [PrependChild](./prependchild/)() | Επιστρέφει ένα αντικείμενο [XmlWriter](../../system.xml/xmlwriter/) που χρησιμοποιείται για τη δημιουργία ενός νέου θυγατρικού κόμβου στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου. |
| virtual [PrependChild](./prependchild/)(String) | Δημιουργεί έναν νέο θυγατρικό κόμβο στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά XML. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Δημιουργεί έναν νέο θυγατρικό κόμβο στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας το περιεχόμενο XML του καθορισμένου αντικειμένου [XmlReader](../../system.xml/xmlreader/). |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Δημιουργεί έναν νέο θυγατρικό κόμβο στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας τους κόμβους του καθορισμένου αντικειμένου [XPathNavigator](./). |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Δημιουργεί ένα νέο θυγατρικό στοιχείο στην αρχή της λίστας των θυγατρικών κόμβων του τρέχοντος κόμβου χρησιμοποιώντας το πρόθεμα ονοματοχώρου, το τοπικό όνομα και το URI ονοματοχώρου που έχουν καθοριστεί με την καθορισμένη τιμή. |
| virtual [ReadSubtree](./readsubtree/)() | Επιστρέφει ένα αντικείμενο [XmlReader](../../system.xml/xmlreader/) που περιέχει τον τρέχοντα κόμβο και τους θυγατρικούς του κόμβους. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Αντικαθιστά μια σειρά αδελφών κόμβων από τον τρέχοντα κόμβο έως τον καθορισμένο κόμβο. |
| virtual [ReplaceSelf](./replaceself/)(String) | Αντικαθιστά τον τρέχοντα κόμβο με το περιεχόμενο της καθορισμένης συμβολοσειράς. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Αντικαθιστά τον τρέχοντα κόμβο με το περιεχόμενο του καθορισμένου αντικειμένου [XmlReader](../../system.xml/xmlreader/). |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Αντικαθιστά τον τρέχοντα κόμβο με το περιεχόμενο του καθορισμένου αντικειμένου [XPathNavigator](./). |
| virtual [Select](./select/)(String) | Επιλέγει ένα σύνολο κόμβων, χρησιμοποιώντας την καθορισμένη έκφραση [XPath](../). |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Επιλέγει ένα σύνολο κόμβων χρησιμοποιώντας την καθορισμένη έκφραση [XPath](../) με το καθορισμένο αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) για την επίλυση προθεμάτων ονοματοχώρου. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Επιλέγει ένα σύνολο κόμβων χρησιμοποιώντας την καθορισμένη [XPathExpression](../xpathexpression/). |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Επιλέγει όλους τους προγονικούς κόμβους του τρέχοντος κόμβου που έχουν ταιριαστό [XPathNodeType](../xpathnodetype/). |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Επιλέγει όλους τους προγονικούς κόμβους του τρέχοντος κόμβου που έχουν το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Επιλέγει όλους τους θυγατρικούς κόμβους του τρέχοντος κόμβου που έχουν ταιριαστό [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Επιλέγει όλους τους θυγατρικούς κόμβους του τρέχοντος κόμβου που έχουν το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Επιλέγει όλους τους απογόνους κόμβους του τρέχοντος κόμβου που έχουν ταιριαστό [XPathNodeType](../xpathnodetype/). |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Επιλέγει όλους τους απογόνους κόμβους του τρέχοντος κόμβου με το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Επιλέγει έναν μόνο κόμβο στο [XPathNavigator](./) χρησιμοποιώντας το καθορισμένο ερώτημα [XPath](../). |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Επιλέγει έναν μοναδικό κόμβο στο αντικείμενο [XPathNavigator](./) χρησιμοποιώντας το καθορισμένο ερώτημα [XPath](../) με το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονομάτων χώρου. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Επιλέγει έναν μοναδικό κόμβο στο [XPathNavigator](./) χρησιμοποιώντας το καθορισμένο αντικείμενο [XPathExpression](../xpathexpression/). |
| virtual [set_InnerXml](./set_innerxml/)(String) | Ορίζει τη σήμανση που αντιπροσωπεύει τους θυγατρικούς κόμβους του τρέχοντος κόμβου. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Ορίζει τη σήμανση που αντιπροσωπεύει τις εναρκτήριες και κλειστικές ετικέτες του τρέχοντος κόμβου και των θυγατρικών του κόμβων. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Ορίζει την τυποποιημένη τιμή του τρέχοντος κόμβου. |
| virtual [SetValue](./setvalue/)(String) | Ορίζει την τιμή του τρέχοντος κόμβου. |
| [ToString](./tostring/)() const override | Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Επιστρέφει την τιμή του τρέχοντος κόμβου ως τον καθορισμένο Τύπο, χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που έχει καθοριστεί για την επίλυση προθεμάτων ονομάτων χώρου. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Μεταδίδει τον τρέχοντα κόμβο και τους θυγατρικούς του κόμβους στο καθορισμένο αντικείμενο [XmlWriter](../../system.xml/xmlwriter/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
