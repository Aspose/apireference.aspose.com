---
title: Class NodeFilter
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Traversal.Filters.NodeFilter τάξη. Τα φίλτρα είναι αντικείμενα που ξέρουν πώς να φιλτράρουν κόμβους.
type: docs
weight: 1210
url: /el/net/aspose.svg.dom.traversal.filters/nodefilter/
---
## NodeFilter class

Τα φίλτρα είναι αντικείμενα που ξέρουν πώς να "φιλτράρουν" κόμβους.

```csharp
public abstract class NodeFilter : DOMObject, INodeFilter
```

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [AcceptNode](../../aspose.svg.dom.traversal.filters/nodefilter/acceptnode/)(Node) | Ελέγξτε εάν ένας καθορισμένος κόμβος είναι ορατός στη λογική προβολή του a TreeWalker ή του NodeIterator. Αυτή η συνάρτηση θα κληθεί από την υλοποίηση του TreeWalker and NodeIterator. κανονικά δεν καλείται απευθείας από τον κωδικό χρήστη . (Αν και θα μπορούσατε να το κάνετε αν θέλετε να χρησιμοποιήσετε το φίλτρο same για να καθοδηγήσετε τη λογική της εφαρμογής σας.) |
| override [GetPlatformType](../../aspose.svg.dom.traversal.filters/nodefilter/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [FILTER_ACCEPT](../../aspose.svg.dom.traversal.filters/nodefilter/filter_accept/) | Αποδοχή του κόμβου. Οι μέθοδοι πλοήγησης που ορίζονται για NodeIterator ή TreeWalker θα επιστρέψουν αυτόν τον κόμβο . |
| const [FILTER_REJECT](../../aspose.svg.dom.traversal.filters/nodefilter/filter_reject/) | Απόρριψη του κόμβου. Οι μέθοδοι πλοήγησης που ορίζονται για NodeIterator ή TreeWalker δεν θα επιστρέψουν αυτόν τον κόμβο. Για το TreeWalker, τα παιδιά αυτού του κόμβου θα απορριφθούν επίσης. Οι NodeIterators το αντιμετωπίζουν ως συνώνυμο για το FILTER_SKIP. |
| const [FILTER_SKIP](../../aspose.svg.dom.traversal.filters/nodefilter/filter_skip/) | Παράλειψη αυτού του μεμονωμένου κόμβου. Οι μέθοδοι πλοήγησης που ορίζονται για NodeIterator ή TreeWalker δεν θα επιστρέψουν αυτόν τον κόμβο. Και για το NodeIterator και για TreeWalker, τα παιδιά αυτού του κόμβου θα εξακολουθούν να θεωρούνται . |
| const [SHOW_ALL](../../aspose.svg.dom.traversal.filters/nodefilter/show_all/) | Εμφάνιση όλων των κόμβων. |
| const [SHOW_ATTRIBUTE](../../aspose.svg.dom.traversal.filters/nodefilter/show_attribute/) | Εμφάνιση κόμβων Attr. Αυτό έχει νόημα μόνο όταν δημιουργείτε έναν επαναλήπτη ή ένα δέντρο-περιπατητή με έναν κόμβο χαρακτηριστικών ως ρίζα . σε αυτήν την περίπτωση, σημαίνει ότι ο κόμβος χαρακτηριστικών θα εμφανιστεί στην πρώτη θέση της επανάληψης ή της διέλευσης. Δεδομένου ότι τα χαρακτηριστικά δεν είναι ποτέ παιδιά άλλων κόμβων, δεν εμφανίζονται κατά τη διέλευση πάνω από το δέντρο εγγράφων. |
| const [SHOW_CDATA_SECTION](../../aspose.svg.dom.traversal.filters/nodefilter/show_cdata_section/) | Εμφάνιση κόμβων ενοτήτων CDATAS. |
| const [SHOW_COMMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_comment/) | Εμφάνιση κόμβων σχολίων. |
| const [SHOW_DOCUMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_document/) | Εμφάνιση κόμβων εγγράφων. |
| const [SHOW_DOCUMENT_FRAGMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_document_fragment/) | Εμφάνιση κόμβων DocumentFragment. |
| const [SHOW_DOCUMENT_TYPE](../../aspose.svg.dom.traversal.filters/nodefilter/show_document_type/) | Εμφάνιση κόμβων DocumentType. |
| const [SHOW_ELEMENT](../../aspose.svg.dom.traversal.filters/nodefilter/show_element/) | Εμφάνιση κόμβων στοιχείων. |
| const [SHOW_ENTITY](../../aspose.svg.dom.traversal.filters/nodefilter/show_entity/) | Εμφάνιση κόμβων οντοτήτων. Αυτό έχει νόημα μόνο όταν δημιουργείτε έναν επαναλήπτη ή ένα δέντρο-περιπατητή με έναν κόμβο οντότητας ως ρίζα . σε αυτήν την περίπτωση, σημαίνει ότι ο κόμβος Entity θα εμφανιστεί στην πρώτη θέση της διέλευσης. Εφόσον οι οντότητες δεν αποτελούν μέρος του δέντρου εγγράφων, δεν εμφανίζονται όταν το διέρχεται από το δέντρο εγγράφων. |
| const [SHOW_ENTITY_REFERENCE](../../aspose.svg.dom.traversal.filters/nodefilter/show_entity_reference/) | Εμφάνιση κόμβων EntityReference. |
| const [SHOW_NOTATION](../../aspose.svg.dom.traversal.filters/nodefilter/show_notation/) | Εμφάνιση κόμβων σημειογραφίας. Αυτό έχει νόημα μόνο όταν δημιουργείτε έναν επαναλήπτη ή ένα δέντρο-περιπατητή με έναν κόμβο Σημειογραφίας ως ρίζα . σε αυτήν την περίπτωση, σημαίνει ότι ο κόμβος σημειογραφίας θα εμφανιστεί στην πρώτη θέση της διέλευσης . Δεδομένου ότι οι συμβολισμοί δεν αποτελούν μέρος του δέντρου εγγράφων, δεν εμφανίζονται κατά τη διέλευση πάνω από το δέντρο εγγράφων. |
| const [SHOW_PROCESSING_INSTRUCTION](../../aspose.svg.dom.traversal.filters/nodefilter/show_processing_instruction/) | Εμφάνιση κόμβων ProcessingInstruction. |
| const [SHOW_TEXT](../../aspose.svg.dom.traversal.filters/nodefilter/show_text/) | Εμφάνιση κόμβων κειμένου. |

### Δείτε επίσης

* class [DOMObject](../../aspose.svg.dom/domobject/)
* interface [INodeFilter](../../aspose.svg.dom.traversal/inodefilter/)
* χώρος ονομάτων [Aspose.Svg.Dom.Traversal.Filters](../../aspose.svg.dom.traversal.filters/)
* συνέλευση [Aspose.SVG](../../)


