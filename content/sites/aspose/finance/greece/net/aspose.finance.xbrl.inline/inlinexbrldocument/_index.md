---
title: Class InlineXbrlDocument
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Inline.InlineXbrlDocument τάξη. Ένα ενσωματωμένο έγγραφο XBRL.
type: docs
weight: 7790
url: /el/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Ένα ενσωματωμένο έγγραφο XBRL.

```csharp
public class InlineXbrlDocument : Document
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument/#constructor)(Stream) | Αρχικοποιεί μια νέα παρουσία του`InlineXbrlDocument` τάξη και την ανοίγει με ροή.. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_2)(string) | Αρχικοποιεί μια νέα παρουσία του`InlineXbrlDocument` τάξη και ανοίξτε ένα αρχείο. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_1)(Stream, LoadOptions) | Αρχικοποιεί μια νέα παρουσία του`InlineXbrlDocument` τάξη και την ανοίγει με ροή. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_3)(string, LoadOptions) | Αρχικοποιεί μια νέα παρουσία του`InlineXbrlDocument` τάξη και ανοίξτε ένα αρχείο. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences/) { get; } | Λαμβάνει τη συλλογή του[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference/) στο ενσωματωμένο έγγραφο XBRL. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Λαμβάνει το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | Λαμβάνει την κωδικοποίηση του εγγράφου. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | Παίρνει τα θυγατρικά στοιχεία. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Λαμβάνει τους θυγατρικούς κόμβους. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | Λαμβάνει τον τύπο περιεχομένου του εγγράφου. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts/) { get; } | Λαμβάνει τη συλλογή του[`Context`](../../aspose.finance.xbrl/context/) στο ενσωματωμένο έγγραφο XBRL. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations/) { get; } | Λαμβάνει τη συλλογή του[`InlineContinuation`](../inlinecontinuation/) στο ενσωματωμένο έγγραφο XBRL. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | Αυτό είναι ένα χαρακτηριστικό ευκολίας που επιτρέπει την άμεση πρόσβαση στον θυγατρικό κόμβο που είναι το στοιχείο εγγράφου του εγγράφου. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | Λαμβάνει το URI του εγγράφου. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts/) { get; } | Λαμβάνει τη συλλογή του[`InlineFact`](../inlinefact/) στο ενσωματωμένο έγγραφο XBRL. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Λαμβάνει το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes/) { get; } | Λαμβάνει τη συλλογή του[`InlineFootnote`](../inlinefootnote/) στο ενσωματωμένο έγγραφο XBRL. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Βρίσκει εάν αυτός ο κόμβος έχει παιδιά. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Λαμβάνει το τελευταίο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Λαμβάνει το τοπικό τμήμα του αναγνωρισμένου ονόματος αυτού του κόμβου. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Λαμβάνει το URI χώρου ονομάτων αυτού του κόμβου. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Λαμβάνει τον κόμβο αμέσως μετά από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | Λαμβάνει το όνομα του κόμβου του εγγράφου. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | Παίρνει τον τύπο κόμβου. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | Λαμβάνει ή ορίζει την τιμή αυτού του κόμβου, ανάλογα με τον τύπο του. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | Λαμβάνει το αντικείμενο εγγράφου που σχετίζεται με αυτόν τον κόμβο. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | Λαμβάνει τον γονικό κόμβο. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | Λαμβάνει ή ορίζει το πρόθεμα χώρου ονομάτων αυτού του κόμβου. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | Λαμβάνει τον κόμβο αμέσως πριν από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references/) { get; } | Λαμβάνει το[`InlineReferences`](../inlinereferences/) στο ενσωματωμένο έγγραφο XBRL. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships/) { get; } | Λαμβάνει τη συλλογή του[`InlineRelationship`](../inlinerelationship/) στο ενσωματωμένο έγγραφο XBRL. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences/) { get; } | Λαμβάνει τη συλλογή του[`RoleReference`](../../aspose.finance.xbrl/rolereference/) στο ενσωματωμένο έγγραφο XBRL. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Λαμβάνει ή ορίζει το περιεχόμενο κειμένου αυτού του κόμβου και των απογόνων του. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units/) { get; } | Λαμβάνει τη συλλογή του[`Unit`](../../aspose.finance.xbrl/unit/) στο ενσωματωμένο έγγραφο XBRL. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors/) { get; set; } | Λαμβάνει τη συλλογή του[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror/) στο ενσωματωμένο έγγραφο XBRL. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Προσθέτει τον κόμβο newChild στο τέλος της λίστας των παιδιών αυτού του κόμβου. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement/)(string, string) | Δημιουργεί ένα στοιχείο Html. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement/)(string, string) | Δημιουργεί ένα ενσωματωμένο στοιχείο xbrl. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement/)(string, string) | Δημιουργεί ένα στοιχείο παρουσίασης xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement/)(string, string) | Δημιουργεί ένα στοιχείο βάσης σύνδεσης xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl)() | Εξαγωγή σε αντικείμενο XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_1)(Stream) | Εξαγωγή σε ροή xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_2)(string) | Εξαγωγή σε αρχείο xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri/)(string) | Λαμβάνει το ArcroleType που έχει το καθορισμένο uri. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid/)(string) | Λαμβάνει το περιβάλλον που έχει το καθορισμένο αναγνωριστικό. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc/)(Loc) | Λαμβάνει την ιδέα από τον εντοπιστή. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname/)(string) | Παίρνει την έννοια που έχει το καθορισμένο όνομα. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid/)(string) | Λαμβάνει το περιβάλλον που έχει το καθορισμένο αναγνωριστικό. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference/)(string) | Λαμβάνει την αλυσίδα συνέχειας σύμφωνα με την αναφορά συνέχειας. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri/)(string) | Λαμβάνει το RoleType που έχει το καθορισμένο uri. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid/)(string) | Λαμβάνει τη μονάδα που έχει το καθορισμένο αναγνωριστικό. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid/)() | Ελέγχει εάν αυτό το έγγραφο inlince XBRL είναι έγκυρο. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects/)() | Εάν προσθέσετε, ενημερώσετε, αφαιρέσετε στοιχεία Inline Xbrl στο δέντρο DOM, αυτή η μέθοδος θα πρέπει να κληθεί για να ανανεώσει τα ενσωματωμένα αντικείμενα xbrl. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το παλιό παιδί από τη λίστα των παιδιών. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο παλιό παιδί με νέο παιδί στη λίστα παιδιών και επιστρέφει τον παλιό θυγατρικό κόμβο. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save)(Stream) | Δημιουργεί και αποθηκεύει το ενσωματωμένο αρχείο xbrl στη ροή. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_2)(string) | Δημιουργεί και αποθηκεύει το ενσωματωμένο αρχείο xbrl στο δίσκο. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_1)(Stream, SaveOptions) | Δημιουργεί και αποθηκεύει το ενσωματωμένο αρχείο xbrl στη ροή. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_3)(string, SaveOptions) | Δημιουργεί και αποθηκεύει το ενσωματωμένο αρχείο xbrl στο δίσκο. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate/)() | Επικυρώνει αυτό το ενσωματωμένο έγγραφο XBRL. |

### Δείτε επίσης

* class [Document](../../aspose.finance.xbrl.dom/document/)
* χώρος ονομάτων [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline/)
* συνέλευση [Aspose.Finance](../../)


