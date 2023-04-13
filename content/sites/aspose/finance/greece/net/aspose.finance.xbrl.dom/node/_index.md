---
title: Class Node
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Node τάξη. Η κλάση Node είναι ο κύριος τύπος δεδομένων για ολόκληρο το Μοντέλο αντικειμένου εγγράφου. Αντιπροσωπεύει έναν μόνο κόμβο στο δέντρο εγγράφων.
type: docs
weight: 7460
url: /el/net/aspose.finance.xbrl.dom/node/
---
## Node class

Η κλάση Node είναι ο κύριος τύπος δεδομένων για ολόκληρο το Μοντέλο αντικειμένου εγγράφου. Αντιπροσωπεύει έναν μόνο κόμβο στο δέντρο εγγράφων.

```csharp
public abstract class Node
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Λαμβάνει το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Λαμβάνει τους θυγατρικούς κόμβους. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Λαμβάνει το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Βρίσκει εάν αυτός ο κόμβος έχει παιδιά. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Λαμβάνει το τελευταίο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Λαμβάνει το τοπικό τμήμα του αναγνωρισμένου ονόματος αυτού του κόμβου. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Λαμβάνει το URI χώρου ονομάτων αυτού του κόμβου. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Λαμβάνει τον κόμβο αμέσως μετά από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | Λαμβάνει το όνομα του κόμβου, ανάλογα με τον τύπο του. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | Παίρνει τον τύπο κόμβου. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | Λαμβάνει ή ορίζει την τιμή αυτού του κόμβου, ανάλογα με τον τύπο του. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | Λαμβάνει το αντικείμενο εγγράφου που σχετίζεται με αυτόν τον κόμβο. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | Λαμβάνει τον γονικό κόμβο. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | Λαμβάνει ή ορίζει το πρόθεμα χώρου ονομάτων αυτού του κόμβου. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | Λαμβάνει τον κόμβο αμέσως πριν από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Λαμβάνει ή ορίζει το περιεχόμενο κειμένου αυτού του κόμβου και των απογόνων του. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Προσθέτει τον κόμβο newChild στο τέλος της λίστας των παιδιών αυτού του κόμβου. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το παλιό παιδί από τη λίστα των παιδιών. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο παλιό παιδί με νέο παιδί στη λίστα παιδιών και επιστρέφει τον παλιό θυγατρικό κόμβο. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | Τύπος κόμβου σχολίων. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | Τύπος κόμβου εγγράφου. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | Τύπος κόμβου τύπου εγγράφου. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | Τύπος κόμβου στοιχείου. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | Τύπος κόμβου εντολών επεξεργασίας. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | Τύπος κόμβου κειμένου. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* συνέλευση [Aspose.Finance](../../)


