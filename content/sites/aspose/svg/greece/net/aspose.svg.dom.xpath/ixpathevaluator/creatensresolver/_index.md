---
title: IXPathEvaluator.CreateNSResolver
second_title: Aspose.SVG για Αναφορά API .NET
description: IXPathEvaluator μέθοδος. Προσαρμόζει οποιονδήποτε κόμβο DOM για την επίλυση χώρων ονομάτων έτσι ώστε μια έκφραση XPath να μπορεί εύκολα να αξιολογηθεί σε σχέση με το περιβάλλον του κόμβου όπου εμφανίστηκε στο έγγραφο. Αυτός ο προσαρμογέας λειτουργεί όπως η μέθοδος DOM Level 3lookupNamespaceURI σε κόμβους για την επίλυση του namespaceURI από ένα δεδομένο πρόθεμα χρησιμοποιώντας τις τρέχουσες πληροφορίες που είναι διαθέσιμες στην ιεραρχία του κόμβου στο time lookupNamespaceURI καλείται επιλύοντας επίσης σωστά το σιωπηρό πρόθεμα xml.
type: docs
weight: 20
url: /el/net/aspose.svg.dom.xpath/ixpathevaluator/creatensresolver/
---
## IXPathEvaluator.CreateNSResolver method

Προσαρμόζει οποιονδήποτε κόμβο DOM για την επίλυση χώρων ονομάτων, έτσι ώστε μια έκφραση XPath να μπορεί εύκολα να αξιολογηθεί σε σχέση με το περιβάλλον του κόμβου όπου εμφανίστηκε στο έγγραφο. Αυτός ο προσαρμογέας λειτουργεί όπως η μέθοδος DOM Level 3`lookupNamespaceURI` σε κόμβους για την επίλυση του namespaceURI από ένα δεδομένο πρόθεμα χρησιμοποιώντας τις τρέχουσες πληροφορίες που είναι διαθέσιμες στην ιεραρχία του κόμβου στο time lookupNamespaceURI καλείται, επιλύοντας επίσης σωστά το σιωπηρό πρόθεμα xml.

```csharp
public IXPathNSResolver CreateNSResolver(Node nodeResolver)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| nodeResolver | Node | Ο κόμβος που θα χρησιμοποιηθεί ως πλαίσιο για την ανάλυση χώρου ονομάτων. |

### Επιστρεφόμενη Αξία

[`IXPathNSResolver`](../../ixpathnsresolver/) που επιλύει χώρους ονομάτων σε σχέση με τους ορισμούς σε εύρος για έναν καθορισμένο κόμβο.

### Δείτε επίσης

* interface [IXPathNSResolver](../../ixpathnsresolver/)
* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathEvaluator](../)
* χώρος ονομάτων [Aspose.Svg.Dom.XPath](../../ixpathevaluator/)
* συνέλευση [Aspose.SVG](../../../)


