---
title: Interface IMediaList
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Css.IMediaList διεπαφή. Η διεπαφή MediaList παρέχει την αφαίρεση μιας ταξινομημένης συλλογής μέσων χωρίς να ορίζει ή να περιορίζει τον τρόπο υλοποίησης αυτής της συλλογής. Μια κενή λίστα είναι ίδια με μια λίστα που περιέχει το μέσο όλα.
type: docs
weight: 730
url: /el/net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

Η διεπαφή MediaList παρέχει την αφαίρεση μιας ταξινομημένης συλλογής μέσων, χωρίς να ορίζει ή να περιορίζει τον τρόπο υλοποίησης αυτής της συλλογής. Μια κενή λίστα είναι ίδια με μια λίστα που περιέχει το μέσο "όλα".

```csharp
public interface IMediaList : IEnumerable<string>
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | Επιστρέφει το ευρετήριο στη λίστα. Εάν το ευρετήριο είναι μεγαλύτερο ή ίσο με τον αριθμό των μέσων στη λίστα, αυτό επιστρέφει null. Το ευρετήριο των μέσων ενημέρωσης. |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | Ο αριθμός των μέσων στη λίστα. Το εύρος των έγκυρων μέσων είναι από 0 έως μήκος-1 συμπεριλαμβανομένου. |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | Η αναλύσιμη αναπαράσταση κειμένου της λίστας πολυμέσων. Αυτή είναι μια λίστα πολυμέσων διαχωρισμένη με κόμματα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | Προσθέτει το μέσο newMedium στο τέλος της λίστας. Εάν το newMedium χρησιμοποιείται ήδη, πρώτα αφαιρείται. |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | Διαγράφει το μέσο που υποδεικνύεται από το oldMedium από τη λίστα. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* συνέλευση [Aspose.SVG](../../)


