---
title: Class Document
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Document τάξη. Το Έγγραφο αντιπροσωπεύει ολόκληρο το έγγραφο HTML XML ή SVG. Εννοιολογικά είναι η ρίζα του δέντρου εγγράφου και παρέχει την κύρια πρόσβαση στα δεδομένα του εγγράφου.
type: docs
weight: 810
url: /el/net/aspose.svg.dom/document/
---
## Document class

Το Έγγραφο αντιπροσωπεύει ολόκληρο το έγγραφο HTML, XML ή SVG. Εννοιολογικά, είναι η ρίζα του δέντρου εγγράφου και παρέχει την κύρια πρόσβαση στα δεδομένα του εγγράφου.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Ένας NamedNodeMap που περιέχει τα χαρακτηριστικά αυτού του κόμβου (εάν είναι Στοιχείο) ή αλλιώς null. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | Το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Λαμβάνει την κωδικοποίηση του εγγράφου. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Λαμβάνει την κωδικοποίηση του εγγράφου. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Επιστρέφει τον τρέχοντα αριθμό κόμβων στοιχείων που είναι παιδιά αυτού του στοιχείου. 0 εάν αυτό το στοιχείο δεν έχει θυγατρικούς κόμβους που είναι τύπου node 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Μια λίστα κόμβων που περιέχει όλα τα παιδιά αυτού του κόμβου. Εάν δεν υπάρχουν παιδιά, αυτή είναι μια NodeList που δεν περιέχει κόμβους.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Επιστρέφει τα θυγατρικά στοιχεία. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Λαμβάνει τον τύπο περιεχομένου του εγγράφου. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Λαμβάνει το τρέχον περιβάλλον περιήγησης. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | Το χαρακτηριστικό defaultView IDL της διεπαφής Document, κατά τη λήψη, πρέπει να επιστρέψει το αντικείμενο WindowProxy του περιβάλλοντος περιήγησης αυτού του εγγράφου, εάν αυτό το Έγγραφο έχει συσχετισμένο περιβάλλον περιήγησης, ή μηδενικό διαφορετικά. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | Η δήλωση τύπου εγγράφου που σχετίζεται με αυτό το έγγραφο. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | Αυτό είναι ένα χαρακτηριστικό ευκολίας που επιτρέπει την άμεση πρόσβαση στον θυγατρικό κόμβο που είναι το στοιχείο εγγράφου του εγγράφου. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | Η θέση του εγγράφου ή μηδενική εάν δεν έχει καθοριστεί ή εάν το Έγγραφο δημιουργήθηκε χρησιμοποιώντας το DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Επιστρέφει τον πρώτο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | Το αντικείμενο DOMImplementation που χειρίζεται αυτό το έγγραφο. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Λαμβάνει την κωδικοποίηση του εγγράφου. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Το τελευταίο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Επιστρέφει τον τελευταίο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Επιστρέφει το τοπικό τμήμα του αναγνωρισμένου ονόματος αυτού του κόμβου. Για κόμβους οποιουδήποτε τύπου εκτός από ELEMENT_NODE και ATTRIBUTE_NODE και κόμβους που έχουν δημιουργηθεί με μια μέθοδο DOM Level 1, όπως Document.createElement(), αυτό είναι πάντα null. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | Η θέση του εγγράφου. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Το URI χώρου ονομάτων αυτού του κόμβου ή μηδενικό εάν δεν έχει καθοριστεί. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Επιστρέφει τον επόμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κανένα στοιχείο αδελφούς κόμβους που έρχονται μετά από αυτό στο δέντρο εγγράφων. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Ο κόμβος αμέσως μετά από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | Το όνομα αυτού του κόμβου, ανάλογα με τον τύπο του. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | Ένας κωδικός που αντιπροσωπεύει τον τύπο του υποκείμενου αντικειμένου. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Η τιμή αυτού του κόμβου, ανάλογα με τον τύπο του. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Λαμβάνει την προέλευση του εγγράφου. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Λαμβάνει το έγγραφο κατόχου. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Παίρνει τον γονέα[`Element`](../element/) αυτού του κόμβου. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Ο γονέας αυτού του κόμβου. Όλοι οι κόμβοι, εκτός από τα Attr, Document, DocumentFragment, Entity και Notation, μπορεί να έχουν γονέα. Ωστόσο, εάν ένας κόμβος έχει μόλις δημιουργηθεί και δεν έχει προστεθεί ακόμη στο δέντρο, ή εάν έχει αφαιρεθεί από το δέντρο, αυτό είναι null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Το πρόθεμα χώρου ονομάτων αυτού του κόμβου ή μηδενικό εάν δεν έχει καθοριστεί. Όταν ορίζεται ότι είναι null, η ρύθμιση του δεν έχει effect |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Επιστρέφει τον προηγούμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κόμβους αδερφού στοιχείου που βρίσκονται πριν από αυτό στο δέντρο εγγράφων. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Ο κόμβος αμέσως πριν από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Επιστρέφει την ετοιμότητα του εγγράφου. Η "φόρτωση" κατά τη φόρτωση του εγγράφου, "διαδραστική" μόλις ολοκληρωθεί η ανάλυση αλλά εξακολουθεί να φορτώνει υπο-πόρους και "ολοκληρώνεται" μόλις φορτωθεί. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | Χαρακτηριστικό που προσδιορίζει εάν επιβάλλεται έλεγχος σφαλμάτων ή όχι. Όταν οριστεί σε false, η υλοποίηση είναι ελεύθερη να μην δοκιμάζει κάθε πιθανή περίπτωση σφάλματος που κανονικά ορίζεται σε λειτουργίες DOM και να μην δημιουργεί καμία εξαίρεση DOME στις λειτουργίες DOM ή να αναφέρει σφάλματα κατά τη χρήση της Document.normalizeDocument(). Σε περίπτωση λάθους, η συμπεριφορά είναι απροσδιόριστη. Αυτό το χαρακτηριστικό είναι αληθές από προεπιλογή. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | Μια λίστα που περιέχει όλα τα φύλλα στυλ ρητά συνδεδεμένα ή ενσωματωμένα σε ένα έγγραφο. Για έγγραφα HTML, αυτό περιλαμβάνει εξωτερικά φύλλα στυλ, που περιλαμβάνονται μέσω του στοιχείου HTML LINK και ενσωματωμένα στοιχεία STYLE. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Αυτό το χαρακτηριστικό επιστρέφει το περιεχόμενο κειμένου αυτού του κόμβου και των απογόνων του. Όταν ορίζεται ότι είναι μηδενικό, η ρύθμιση του δεν έχει αποτέλεσμα. Κατά τη ρύθμιση, τυχόν παιδιά που μπορεί να έχει αυτός ο κόμβος αφαιρούνται και, εάν η νέα συμβολοσειρά δεν είναι κενή ή μηδενική, αντικαθίστανται από έναν μόνο κόμβο κειμένου που περιέχει τη συμβολοσειρά στην οποία έχει οριστεί αυτό το χαρακτηριστικό. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | Ένα χαρακτηριστικό που προσδιορίζει, ως μέρος της δήλωσης XML, εάν αυτό το έγγραφο είναι αυτόνομο. Αυτό είναι ψευδές όταν δεν καθορίζεται. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | Ένα χαρακτηριστικό που προσδιορίζει, ως μέρος της δήλωσης XML, τον αριθμό έκδοσης αυτού του εγγράφου. Εάν δεν υπάρχει δήλωση και εάν αυτό το έγγραφο υποστηρίζει τη δυνατότητα "XML", η τιμή είναι "1.0". Εάν αυτό το έγγραφο δεν υποστηρίζει τη δυνατότητα "XML", η τιμή είναι πάντα null. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Προσθέτει τον κόμβο newChild στο τέλος της λίστας των παιδιών αυτού του κόμβου. Εάν το newChild βρίσκεται ήδη στο δέντρο, πρώτα αφαιρείται. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Επιστρέφει ένα αντίγραφο αυτού του κόμβου, δηλαδή, χρησιμεύει ως γενικός κατασκευαστής αντιγράφων για κόμβους. Ο διπλότυπος κόμβος δεν έχει γονικό (parentNode είναι null) και δεν έχει δεδομένα χρήστη. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Επιστρέφει ένα αντίγραφο αυτού του κόμβου, δηλαδή, χρησιμεύει ως γενικός κατασκευαστής αντιγράφων για κόμβους. Ο διπλότυπος κόμβος δεν έχει γονικό (parentNode είναι null) και δεν έχει δεδομένα χρήστη. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | Δημιουργεί ένα Attr του συγκεκριμένου ονόματος. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | Δημιουργεί ένα χαρακτηριστικό του δεδομένου αναγνωρισμένου ονόματος και χώρου ονομάτων URI. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | Δημιουργεί έναν κόμβο ενότητας CDATAS του οποίου η τιμή είναι η καθορισμένη συμβολοσειρά. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | Δημιουργεί έναν κόμβο σχολίων με την καθορισμένη συμβολοσειρά. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Δημιουργεί ένα κενό αντικείμενο DocumentFragment. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | Δημιουργεί έναν κόμβο DocumentType. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | Δημιουργεί ένα στοιχείο του καθορισμένου τύπου. Σημειώστε ότι η εμφάνιση που επιστράφηκε υλοποιεί τη διεπαφή Element, επομένως τα χαρακτηριστικά μπορούν να καθοριστούν απευθείας στο επιστρεφόμενο αντικείμενο. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | Δημιουργεί ένα στοιχείο του συγκεκριμένου ονόματος και χώρου ονομάτων URI. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | Δημιουργεί ένα αντικείμενο EntityReference. Επιπλέον, εάν η αναφερόμενη οντότητα είναι γνωστή, η θυγατρική λίστα του κόμβου EntityReference γίνεται ίδια με αυτή του αντίστοιχου κόμβου Entity. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | Δημιουργεί ένα[`Event`](../../aspose.svg.dom.events/event/) τύπου που υποστηρίζεται από την υλοποίηση. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | Δημιουργεί μια αναλυμένη έκφραση XPath με επιλυμένους χώρους ονομάτων. Αυτό είναι χρήσιμο όταν μια έκφραση θα επαναχρησιμοποιηθεί σε μια εφαρμογή, καθώς καθιστά δυνατή την να μεταγλωττίσει τη συμβολοσειρά έκφρασης σε μια πιο αποτελεσματική εσωτερική μορφή και να επιλύσει εκ των προτέρων όλα τα προθέματα χώρου ονομάτων που εμφανίζονται μέσα στην έκφραση. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | Δημιουργήστε ένα νέο NodeIterator πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | Δημιουργήστε ένα νέο NodeIterator πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | Δημιουργήστε ένα νέο NodeIterator πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | Προσαρμόζει οποιονδήποτε κόμβο DOM για την επίλυση χώρων ονομάτων, έτσι ώστε μια έκφραση XPath να μπορεί εύκολα να αξιολογηθεί σε σχέση με το περιβάλλον του κόμβου όπου εμφανίστηκε στο έγγραφο. Αυτός ο προσαρμογέας λειτουργεί όπως η μέθοδος DOM Level 3`lookupNamespaceURI` σε κόμβους για την επίλυση του namespaceURI από ένα δεδομένο πρόθεμα χρησιμοποιώντας τις τρέχουσες πληροφορίες που είναι διαθέσιμες στην ιεραρχία του κόμβου στο time lookupNamespaceURI καλείται, επιλύοντας επίσης σωστά το σιωπηρό πρόθεμα xml. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | Δημιουργεί έναν κόμβο ProcessingInstruction με το καθορισμένο όνομα και τις συμβολοσειρές δεδομένων. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | Δημιουργεί έναν κόμβο κειμένου με την καθορισμένη συμβολοσειρά. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | Δημιουργήστε ένα νέο TreeWalker πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | Δημιουργήστε ένα νέο TreeWalker πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | Δημιουργήστε ένα νέο TreeWalker πάνω από το υποδέντρο που έχει ρίζες στον καθορισμένο κόμβο . |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Αυτή η μέθοδος επιτρέπει την αποστολή συμβάντων στο μοντέλο συμβάντων υλοποιήσεων. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Εκτελεί εργασίες που καθορίζονται από την εφαρμογή που σχετίζονται με την απελευθέρωση, την απελευθέρωση ή την επαναφορά μη διαχειριζόμενων πόρων. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | Αξιολογεί μια συμβολοσειρά έκφρασης XPath και επιστρέφει ένα αποτέλεσμα του καθορισμένου τύπου εάν είναι δυνατόν. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | Επιστρέφει το Στοιχείο που έχει ένα χαρακτηριστικό ID με τη δεδομένη τιμή. Εάν δεν υπάρχει τέτοιο στοιχείο, επιστρέφει μηδενικό. Εάν περισσότερα από ένα στοιχεία έχουν ένα χαρακτηριστικό ID με αυτήν την τιμή, αυτό που επιστρέφεται είναι απροσδιόριστο. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | Επιστρέφει ένα ζωντανό αντικείμενο NodeList που περιέχει όλα τα στοιχεία του εγγράφου που έχουν όλες τις κλάσεις που καθορίζονται στο όρισμα. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | Επιστρέφει μια NodeList με όλα τα στοιχεία με σειρά εγγράφου με ένα δεδομένο όνομα ετικέτας και περιέχονται στο έγγραφο. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | Επιστρέφει μια NodeList όλων των στοιχείων με ένα δεδομένο τοπικό όνομα και URI χώρου ονομάτων με σειρά εγγράφων. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Επιστρέφει εάν αυτός ο κόμβος (αν είναι στοιχείο) έχει κάποια χαρακτηριστικά |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Επιστρέφει εάν αυτός ο κόμβος έχει παιδιά. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | Εισάγει έναν κόμβο από άλλο έγγραφο σε αυτό το έγγραφο, χωρίς να τροποποιεί ή να αφαιρεί τον κόμβο προέλευσης από το αρχικό έγγραφο. αυτή η μέθοδος δημιουργεί ένα νέο αντίγραφο του κόμβου προέλευσης. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Εισάγει τον κόμβο πριν από το υπάρχον θυγατρικό θυγατρικό κόμβο. Εάν το παιδί είναι μηδενικό, εισαγάγετε τον κόμβο στο τέλος της λίστας παιδιών. Εάν το θυγατρικό είναι αντικείμενο DocumentFragment, όλα τα θυγατρικά του εισάγονται, με την ίδια σειρά, πριν από το θυγατρικό. Εάν το παιδί είναι ήδη στο δέντρο, αφαιρείται πρώτα. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Αυτή η μέθοδος ελέγχει εάν το καθορισμένο namespaceURI είναι ο προεπιλεγμένος χώρος ονομάτων ή όχι. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Ελέγχει εάν δύο κόμβοι είναι ίσοι. Αυτή η μέθοδος ελέγχει την ισότητα των κόμβων, όχι την ομοιότητα (δηλαδή, εάν οι δύο κόμβοι είναι αναφορές στο ίδιο αντικείμενο) που μπορεί να ελεγχθεί με το Node.isSameNode(). Όλοι οι κόμβοι που είναι ίδιοι θα είναι επίσης ίσοι, αν και το αντίστροφο μπορεί να μην ισχύει. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Επιστρέφει εάν αυτός ο κόμβος είναι ο ίδιος κόμβος με τον δεδομένο. Αυτή η μέθοδος παρέχει έναν τρόπο προσδιορισμού του εάν δύο αναφορές κόμβου που επιστρέφονται από την υλοποίηση αναφέρονται στο ίδιο αντικείμενο. Όταν δύο αναφορές κόμβου είναι αναφορές στο ίδιο αντικείμενο, ακόμη και αν μέσω διακομιστή μεσολάβησης, οι αναφορές μπορούν να χρησιμοποιούνται εντελώς εναλλακτικά, έτσι ώστε όλα τα χαρακτηριστικά να έχουν τις ίδιες τιμές και η κλήση της ίδιας μεθόδου DOM σε κάθε αναφορά έχει πάντα ακριβώς το ίδιο αποτέλεσμα. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Αναζητήστε το URI του χώρου ονομάτων που σχετίζεται με το δεδομένο πρόθεμα, ξεκινώντας από αυτόν τον κόμβο. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Αναζητήστε το πρόθεμα που σχετίζεται με το δεδομένο URI χώρου ονομάτων, ξεκινώντας από αυτόν τον κόμβο. Οι προεπιλεγμένες δηλώσεις χώρου ονομάτων αγνοούνται από αυτήν τη μέθοδο. Ανατρέξτε στην Αναζήτηση προθέματος χώρου ονομάτων για λεπτομέρειες σχετικά με τον αλγόριθμο που χρησιμοποιείται από αυτήν τη μέθοδο. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | Φορτώνει το έγγραφο με βάση το καθορισμένο αντικείμενο αιτήματος, αντικαθιστώντας το προηγούμενο περιεχόμενο. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | Φορτώνει το έγγραφο στον καθορισμένο Uniform Resource Locator (URL) στην τρέχουσα παρουσία, αντικαθιστώντας το προηγούμενο περιεχόμενο. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | Φορτώνει το έγγραφο στον καθορισμένο Uniform Resource Locator (URL) στην τρέχουσα παρουσία, αντικαθιστώντας το προηγούμενο περιεχόμενο. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | Φορτώνει το έγγραφο από καθορισμένο περιεχόμενο και χρησιμοποιεί το baseUri για την επίλυση σχετικών πόρων, αντικαθιστώντας το προηγούμενο περιεχόμενο. Η φόρτωση του εγγράφου ξεκινά από την τρέχουσα θέση στη ροή. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | Φορτώνει το έγγραφο από καθορισμένο περιεχόμενο και χρησιμοποιεί το baseUri για την επίλυση σχετικών πόρων, αντικαθιστώντας το προηγούμενο περιεχόμενο. Η φόρτωση του εγγράφου ξεκινά από την τρέχουσα θέση στη ροή. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | Φορτώνει το έγγραφο από καθορισμένο περιεχόμενο και χρησιμοποιεί το baseUri για την επίλυση σχετικών πόρων, αντικαθιστώντας το προηγούμενο περιεχόμενο. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | Φορτώνει το έγγραφο από καθορισμένο περιεχόμενο και χρησιμοποιεί το baseUri για την επίλυση σχετικών πόρων, αντικαθιστώντας το προηγούμενο περιεχόμενο. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Τοποθετεί όλους τους κόμβους κειμένου στο πλήρες βάθος του υποδέντρου κάτω από αυτόν τον κόμβο, συμπεριλαμβανομένων των κόμβων χαρακτηριστικών, σε μια "κανονική" μορφή όπου μόνο η δομή (π.χ. στοιχεία, σχόλια, οδηγίες επεξεργασίας, ενότητες CDATA και αναφορές οντοτήτων) διαχωρίζει το κείμενο κόμβοι, δηλαδή, δεν υπάρχουν ούτε γειτονικοί κόμβοι κειμένου ούτε κενοί κόμβοι κειμένου. Αυτό μπορεί να χρησιμοποιηθεί για να διασφαλιστεί ότι η προβολή DOM ενός εγγράφου είναι ίδια όπως αν είχε αποθηκευτεί και φορτωθεί ξανά και είναι χρήσιμο όταν οι λειτουργίες (όπως οι αναζητήσεις XPointer [XPointer]) που εξαρτώνται από μια συγκεκριμένη δομή δέντρου εγγράφου πρόκειται να να χρησιμοποιηθεί. Εάν η παράμετρος "normalize-characters" του αντικειμένου DOMConfiguration που είναι προσαρτημένο στο Node.ownerDocument είναι αληθής, αυτή η μέθοδος θα κανονικοποιήσει επίσης πλήρως τους χαρακτήρες των κόμβων κειμένου. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | Επιστρέφει το πρώτο Στοιχείο στο έγγραφο, το οποίο ταιριάζει με τον επιλογέα |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | Επιστρέφει μια NodeList με όλα τα στοιχεία του εγγράφου, τα οποία ταιριάζουν με τον selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το oldChild από τη λίστα των παιδιών και τον επιστρέφει. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | Αυτή η μέθοδος χρησιμοποιείται για την απόδοση των περιεχομένων του τρέχοντος εγγράφου σε μια καθορισμένη γραφική συσκευή. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο oldChild με newChild στη λίστα των παιδιών και επιστρέφει τον κόμβο oldChild. Εάν το newChild είναι αντικείμενο DocumentFragment, το oldChild αντικαθίσταται από όλα τα θυγατρικά DocumentFragment, τα οποία εισάγονται με την ίδια σειρά. Εάν το newChild βρίσκεται ήδη στο δέντρο, πρώτα αφαιρείται. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Επιστρέφει αString που αντιπροσωπεύει αυτήν την περίπτωση. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | Γράψτε μια συμβολοσειρά κειμένου σε μια ροή εγγράφου που ανοίγει από open(). Σημειώστε ότι η συνάρτηση θα παράγει ένα document το οποίο δεν οδηγείται απαραίτητα από ένα DTD και επομένως μπορεί να είναι παράγει ένα μη έγκυρο αποτέλεσμα στο πλαίσιο του εγγράφου. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | Γράψτε μια συμβολοσειρά κειμένου ακολουθούμενη από έναν χαρακτήρα νέας γραμμής σε μια ροή document που ανοίγει από το open(). Σημειώστε ότι η συνάρτηση θα παράγει ένα έγγραφο το οποίο δεν καθοδηγείται απαραίτητα από ένα DTD και επομένως μπορεί να παράγει ένα μη έγκυρο αποτέλεσμα στο πλαίσιο του document |

## Εκδηλώσεις

| Ονομα | Περιγραφή |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnAbort. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnBlur. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnCancel. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για την εκδήλωση OnCanplay. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnCanPlayThrough. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnChange. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnClick. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnCueChange. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnDblClick. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnDurationChange. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnEmptied. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για συμβάν OnEnded. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnError. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnFocus. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnInput. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnInvalid. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnKeyDown. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnKeyPress. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnKeyUp. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnLoad. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnLoadedData. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnLoadedMetadata. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnLoadStart. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseDown. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseEnter. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseLeave. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseMove. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseOut. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseOver. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseUp. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnMouseWheel. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnPause. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnPlay. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnPlaying. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnProgress. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnRateChange. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnReadyStateChange. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnReset. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnResize. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnScroll. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnSeeked. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnSeeking. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnSelect. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnShow. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnStalled. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnSubmit. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnSuspend. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnTimeUpdate. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnToggle. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnVolumeChange. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | Λαμβάνει ή ορίζει το πρόγραμμα χειρισμού συμβάντων για το συμβάν OnWaiting. |

### Δείτε επίσης

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* χώρος ονομάτων [Aspose.Svg.Dom](../../aspose.svg.dom/)
* συνέλευση [Aspose.SVG](../../)


