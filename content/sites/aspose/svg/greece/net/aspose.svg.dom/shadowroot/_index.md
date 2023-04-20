---
title: Class ShadowRoot
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.ShadowRoot τάξη. Το ShadowRoot είναι ένας ριζικός κόμβος του δέντρου σκιάς.
type: docs
weight: 1180
url: /el/net/aspose.svg.dom/shadowroot/
---
## ShadowRoot class

Το ShadowRoot είναι ένας ριζικός κόμβος του δέντρου σκιάς.

```csharp
public class ShadowRoot : DocumentFragment
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Ένας NamedNodeMap που περιέχει τα χαρακτηριστικά αυτού του κόμβου (εάν είναι Στοιχείο) ή αλλιώς null. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [ChildElementCount](../../aspose.svg.dom/documentfragment/childelementcount/) { get; } | Επιστρέφει τον τρέχοντα αριθμό κόμβων στοιχείων που είναι παιδιά αυτού του στοιχείου. 0 εάν αυτό το στοιχείο δεν έχει θυγατρικούς κόμβους που είναι τύπου node 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Μια λίστα κόμβων που περιέχει όλα τα παιδιά αυτού του κόμβου. Εάν δεν υπάρχουν παιδιά, αυτή είναι μια NodeList που δεν περιέχει κόμβους.. |
| [Children](../../aspose.svg.dom/documentfragment/children/) { get; } | Επιστρέφει τα θυγατρικά στοιχεία του τρέχοντος στοιχείου. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [FirstElementChild](../../aspose.svg.dom/documentfragment/firstelementchild/) { get; } | Επιστρέφει τον πρώτο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| [Host](../../aspose.svg.dom/shadowroot/host/) { get; } | Ο κεντρικός υπολογιστής είναι ένα στοιχείο που περιέχει αυτό το ShadowRoot. |
| [InnerHTML](../../aspose.svg.dom/documentfragment/innerhtml/) { get; set; } | Επιστρέφει ένα τμήμα HTML ή XML που αντιπροσωπεύει τα περιεχόμενα του στοιχείου. Μπορεί να οριστεί, ώστε να αντικατασταθούν τα περιεχόμενα του στοιχείου με κόμβους που έχουν αναλυθεί από τη δεδομένη συμβολοσειρά. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Το τελευταίο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [LastElementChild](../../aspose.svg.dom/documentfragment/lastelementchild/) { get; } | Επιστρέφει τον τελευταίο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Επιστρέφει το τοπικό τμήμα του αναγνωρισμένου ονόματος αυτού του κόμβου. Για κόμβους οποιουδήποτε τύπου εκτός από ELEMENT_NODE και ATTRIBUTE_NODE και κόμβους που έχουν δημιουργηθεί με μια μέθοδο DOM Level 1, όπως Document.createElement(), αυτό είναι πάντα null. |
| [Mode](../../aspose.svg.dom/shadowroot/mode/) { get; } | Λειτουργία στην οποία λειτουργεί αυτό το ShadowRoot. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Το URI χώρου ονομάτων αυτού του κόμβου ή μηδενικό εάν δεν έχει καθοριστεί. |
| [NextElementSibling](../../aspose.svg.dom/documentfragment/nextelementsibling/) { get; } | Επιστρέφει τον επόμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κανένα στοιχείο αδελφούς κόμβους που έρχονται μετά από αυτό στο δέντρο εγγράφων. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Ο κόμβος αμέσως μετά από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| override [NodeName](../../aspose.svg.dom/documentfragment/nodename/) { get; } | Το όνομα αυτού του κόμβου, ανάλογα με τον τύπο του. |
| override [NodeType](../../aspose.svg.dom/documentfragment/nodetype/) { get; } | Ένας κωδικός που αντιπροσωπεύει τον τύπο του υποκείμενου αντικειμένου. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Η τιμή αυτού του κόμβου, ανάλογα με τον τύπο του. |
| [OuterHTML](../../aspose.svg.dom/documentfragment/outerhtml/) { get; set; } | Επιστρέφει ένα τμήμα HTML ή XML που αντιπροσωπεύει το στοιχείο και τα περιεχόμενά του. Μπορεί να οριστεί, για να αντικατασταθεί το στοιχείο με κόμβους που έχουν αναλυθεί από τη δεδομένη συμβολοσειρά. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Το αντικείμενο Document που σχετίζεται με αυτόν τον κόμβο. Αυτό είναι επίσης το αντικείμενο Document που χρησιμοποιείται για τη δημιουργία νέων κόμβων. Όταν αυτός ο κόμβος είναι ένα έγγραφο ή ένας τύπος εγγράφου που δεν χρησιμοποιείται ακόμη με κανένα έγγραφο, αυτό είναι null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Παίρνει τον γονέα[`Element`](../element/) αυτού του κόμβου. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Ο γονέας αυτού του κόμβου. Όλοι οι κόμβοι, εκτός από τα Attr, Document, DocumentFragment, Entity και Notation, μπορεί να έχουν γονέα. Ωστόσο, εάν ένας κόμβος έχει μόλις δημιουργηθεί και δεν έχει προστεθεί ακόμη στο δέντρο, ή εάν έχει αφαιρεθεί από το δέντρο, αυτό είναι null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Το πρόθεμα χώρου ονομάτων αυτού του κόμβου ή μηδενικό εάν δεν έχει καθοριστεί. Όταν ορίζεται ότι είναι null, η ρύθμιση του δεν έχει effect |
| [PreviousElementSibling](../../aspose.svg.dom/documentfragment/previouselementsibling/) { get; } | Επιστρέφει τον προηγούμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κόμβους αδερφού στοιχείου που βρίσκονται πριν από αυτό στο δέντρο εγγράφων. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Ο κόμβος αμέσως πριν από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| override [TextContent](../../aspose.svg.dom/documentfragment/textcontent/) { get; set; } | Αυτό το χαρακτηριστικό επιστρέφει το περιεχόμενο κειμένου αυτού του κόμβου και των απογόνων του. Όταν ορίζεται ότι είναι μηδενικό, η ρύθμιση του δεν έχει αποτέλεσμα. Κατά τη ρύθμιση, τυχόν παιδιά που μπορεί να έχει αυτός ο κόμβος αφαιρούνται και, εάν η νέα συμβολοσειρά δεν είναι κενή ή μηδενική, αντικαθίστανται από έναν μόνο κόμβο κειμένου που περιέχει τη συμβολοσειρά στην οποία έχει οριστεί αυτό το χαρακτηριστικό. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Προσθέτει τον κόμβο newChild στο τέλος της λίστας των παιδιών αυτού του κόμβου. Εάν το newChild βρίσκεται ήδη στο δέντρο, πρώτα αφαιρείται. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Επιστρέφει ένα αντίγραφο αυτού του κόμβου, δηλαδή, χρησιμεύει ως γενικός κατασκευαστής αντιγράφων για κόμβους. Ο διπλότυπος κόμβος δεν έχει γονικό (parentNode είναι null) και δεν έχει δεδομένα χρήστη. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Επιστρέφει ένα αντίγραφο αυτού του κόμβου, δηλαδή, χρησιμεύει ως γενικός κατασκευαστής αντιγράφων για κόμβους. Ο διπλότυπος κόμβος δεν έχει γονικό (parentNode είναι null) και δεν έχει δεδομένα χρήστη. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Αυτή η μέθοδος επιτρέπει την αποστολή συμβάντων στο μοντέλο συμβάντων υλοποιήσεων. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Εκτελεί εργασίες που καθορίζονται από την εφαρμογή που σχετίζονται με την απελευθέρωση, την απελευθέρωση ή την επαναφορά μη διαχειριζόμενων πόρων. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Επιστρέφει εάν αυτός ο κόμβος (αν είναι στοιχείο) έχει κάποια χαρακτηριστικά |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Επιστρέφει εάν αυτός ο κόμβος έχει παιδιά. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Εισάγει τον κόμβο πριν από το υπάρχον θυγατρικό θυγατρικό κόμβο. Εάν το παιδί είναι μηδενικό, εισαγάγετε τον κόμβο στο τέλος της λίστας παιδιών. Εάν το θυγατρικό είναι αντικείμενο DocumentFragment, όλα τα θυγατρικά του εισάγονται, με την ίδια σειρά, πριν από το θυγατρικό. Εάν το παιδί είναι ήδη στο δέντρο, αφαιρείται πρώτα. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Αυτή η μέθοδος ελέγχει εάν το καθορισμένο namespaceURI είναι ο προεπιλεγμένος χώρος ονομάτων ή όχι. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Ελέγχει εάν δύο κόμβοι είναι ίσοι. Αυτή η μέθοδος ελέγχει την ισότητα των κόμβων, όχι την ομοιότητα (δηλαδή, εάν οι δύο κόμβοι είναι αναφορές στο ίδιο αντικείμενο) που μπορεί να ελεγχθεί με το Node.isSameNode(). Όλοι οι κόμβοι που είναι ίδιοι θα είναι επίσης ίσοι, αν και το αντίστροφο μπορεί να μην ισχύει. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Επιστρέφει εάν αυτός ο κόμβος είναι ο ίδιος κόμβος με τον δεδομένο. Αυτή η μέθοδος παρέχει έναν τρόπο προσδιορισμού του εάν δύο αναφορές κόμβου που επιστρέφονται από την υλοποίηση αναφέρονται στο ίδιο αντικείμενο. Όταν δύο αναφορές κόμβου είναι αναφορές στο ίδιο αντικείμενο, ακόμη και αν μέσω διακομιστή μεσολάβησης, οι αναφορές μπορούν να χρησιμοποιούνται εντελώς εναλλακτικά, έτσι ώστε όλα τα χαρακτηριστικά να έχουν τις ίδιες τιμές και η κλήση της ίδιας μεθόδου DOM σε κάθε αναφορά έχει πάντα ακριβώς το ίδιο αποτέλεσμα. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Αναζητήστε το URI του χώρου ονομάτων που σχετίζεται με το δεδομένο πρόθεμα, ξεκινώντας από αυτόν τον κόμβο. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Αναζητήστε το πρόθεμα που σχετίζεται με το δεδομένο URI χώρου ονομάτων, ξεκινώντας από αυτόν τον κόμβο. Οι προεπιλεγμένες δηλώσεις χώρου ονομάτων αγνοούνται από αυτήν τη μέθοδο. Ανατρέξτε στην Αναζήτηση προθέματος χώρου ονομάτων για λεπτομέρειες σχετικά με τον αλγόριθμο που χρησιμοποιείται από αυτήν τη μέθοδο. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Τοποθετεί όλους τους κόμβους κειμένου στο πλήρες βάθος του υποδέντρου κάτω από αυτόν τον κόμβο, συμπεριλαμβανομένων των κόμβων χαρακτηριστικών, σε μια "κανονική" μορφή όπου μόνο η δομή (π.χ. στοιχεία, σχόλια, οδηγίες επεξεργασίας, ενότητες CDATA και αναφορές οντοτήτων) διαχωρίζει το κείμενο κόμβοι, δηλαδή, δεν υπάρχουν ούτε γειτονικοί κόμβοι κειμένου ούτε κενοί κόμβοι κειμένου. Αυτό μπορεί να χρησιμοποιηθεί για να διασφαλιστεί ότι η προβολή DOM ενός εγγράφου είναι ίδια όπως αν είχε αποθηκευτεί και φορτωθεί ξανά και είναι χρήσιμο όταν οι λειτουργίες (όπως οι αναζητήσεις XPointer [XPointer]) που εξαρτώνται από μια συγκεκριμένη δομή δέντρου εγγράφου πρόκειται να να χρησιμοποιηθεί. Εάν η παράμετρος "normalize-characters" του αντικειμένου DOMConfiguration που είναι προσαρτημένο στο Node.ownerDocument είναι αληθής, αυτή η μέθοδος θα κανονικοποιήσει επίσης πλήρως τους χαρακτήρες των κόμβων κειμένου. |
| [QuerySelector](../../aspose.svg.dom/documentfragment/queryselector/)(string) | Επιστρέφει το πρώτο Στοιχείο στο έγγραφο, το οποίο ταιριάζει με τον επιλογέα |
| [QuerySelectorAll](../../aspose.svg.dom/documentfragment/queryselectorall/)(string) | Επιστρέφει μια NodeList με όλα τα στοιχεία του εγγράφου, τα οποία ταιριάζουν με τον selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το oldChild από τη λίστα των παιδιών και τον επιστρέφει. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) αφαιρείται από ένα[`EventTarget`](../eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο oldChild με newChild στη λίστα των παιδιών και επιστρέφει τον κόμβο oldChild. Εάν το newChild είναι αντικείμενο DocumentFragment, το oldChild αντικαθίσταται από όλα τα θυγατρικά DocumentFragment, τα οποία εισάγονται με την ίδια σειρά. Εάν το newChild βρίσκεται ήδη στο δέντρο, πρώτα αφαιρείται. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Επιστρέφει αString που αντιπροσωπεύει αυτήν την περίπτωση. |

### Δείτε επίσης

* class [DocumentFragment](../documentfragment/)
* χώρος ονομάτων [Aspose.Svg.Dom](../../aspose.svg.dom/)
* συνέλευση [Aspose.SVG](../../)


