---
title: Class Document
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Document τάξη. Το Έγγραφο αντιπροσωπεύει ολόκληρο το ενσωματωμένο έγγραφο xbrl. Εννοιολογικά είναι η ρίζα του δέντρου εγγράφου και παρέχει την κύρια πρόσβαση στα δεδομένα του εγγράφου.
type: docs
weight: 6690
url: /el/net/aspose.finance.xbrl.dom/document/
---
## Document class

Το Έγγραφο αντιπροσωπεύει ολόκληρο το ενσωματωμένο έγγραφο xbrl. Εννοιολογικά, είναι η ρίζα του δέντρου εγγράφου και παρέχει την κύρια πρόσβαση στα δεδομένα του εγγράφου.

```csharp
public class Document : Node
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Document](document/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Λαμβάνει το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | Λαμβάνει την κωδικοποίηση του εγγράφου. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | Παίρνει τα θυγατρικά στοιχεία. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Λαμβάνει τους θυγατρικούς κόμβους. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | Λαμβάνει τον τύπο περιεχομένου του εγγράφου. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | Αυτό είναι ένα χαρακτηριστικό ευκολίας που επιτρέπει την άμεση πρόσβαση στον θυγατρικό κόμβο που είναι το στοιχείο εγγράφου του εγγράφου. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | Λαμβάνει το URI του εγγράφου. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Λαμβάνει το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
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
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Λαμβάνει ή ορίζει το περιεχόμενο κειμένου αυτού του κόμβου και των απογόνων του. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Προσθέτει τον κόμβο newChild στο τέλος της λίστας των παιδιών αυτού του κόμβου. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το παλιό παιδί από τη λίστα των παιδιών. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο παλιό παιδί με νέο παιδί στη λίστα παιδιών και επιστρέφει τον παλιό θυγατρικό κόμβο. |

### Δείτε επίσης

* class [Node](../node/)
* χώρος ονομάτων [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* συνέλευση [Aspose.Finance](../../)


