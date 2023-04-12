---
title: Class Text
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Text τάξη. Η τάξη αντιπροσωπεύει το περιεχόμενο κειμένου.
type: docs
weight: 7490
url: /el/net/aspose.finance.xbrl.dom/text/
---
## Text class

Η τάξη αντιπροσωπεύει το περιεχόμενο κειμένου.

```csharp
public class Text : CharacterData
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Λαμβάνει το απόλυτο βασικό URI αυτού του κόμβου ή μηδενικό εάν η υλοποίηση δεν ήταν σε θέση να αποκτήσει ένα απόλυτο URI. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Λαμβάνει τους θυγατρικούς κόμβους. |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | Λαμβάνει ή ορίζει τα δεδομένα χαρακτήρων του κόμβου που υλοποιεί αυτήν τη διεπαφή. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Λαμβάνει το πρώτο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Βρίσκει εάν αυτός ο κόμβος έχει παιδιά. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Λαμβάνει το τελευταίο παιδί αυτού του κόμβου. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | Λαμβάνει τον αριθμό των μονάδων 16-bit που είναι διαθέσιμες μέσω δεδομένων. Αυτό μπορεί να έχει την τιμή μηδέν, δηλαδή, οι κόμβοι CharacterData μπορεί να είναι κενοί. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Λαμβάνει το τοπικό τμήμα του αναγνωρισμένου ονόματος αυτού του κόμβου. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Λαμβάνει το URI χώρου ονομάτων αυτού του κόμβου. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Λαμβάνει τον κόμβο αμέσως μετά από αυτόν τον κόμβο. Εάν δεν υπάρχει τέτοιος κόμβος, αυτός επιστρέφει null. |
| override [NodeName](../../aspose.finance.xbrl.dom/text/nodename/) { get; } | Παίρνει το όνομα αυτού του κειμένου. |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | Προσθέτει τη συμβολοσειρά στο τέλος των δεδομένων χαρακτήρων του κόμβου. |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | Αφαιρεί μια σειρά περιεχομένου από τον κόμβο. |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | Εισάγει μια συμβολοσειρά στην καθορισμένη μετατόπιση. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Αφαιρεί τον θυγατρικό κόμβο που υποδεικνύεται από το παλιό παιδί από τη λίστα των παιδιών. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Αντικαθιστά τον θυγατρικό κόμβο παλιό παιδί με νέο παιδί στη λίστα παιδιών και επιστρέφει τον παλιό θυγατρικό κόμβο. |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | Αντικαθιστά τους χαρακτήρες που ξεκινούν από την καθορισμένη μετατόπιση με την καθορισμένη συμβολοσειρά. |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | Εξάγει μια περιοχή δεδομένων από τον κόμβο. |

### Δείτε επίσης

* class [CharacterData](../characterdata/)
* χώρος ονομάτων [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* συνέλευση [Aspose.Finance](../../)


