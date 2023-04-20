---
title: EventTarget.AddEventListener
second_title: Aspose.SVG για Αναφορά API .NET
description: EventTarget μέθοδος. Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος.
type: docs
weight: 10
url: /el/net/aspose.svg.dom/eventtarget/addeventlistener/
---
## AddEventListener(string, DOMEventHandler, bool) {#addeventlistener}

Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος.

```csharp
public void AddEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type | String | Ο τύπος συμβάντος για τον οποίο εγγράφεται ο χρήστης |
| handler | DOMEventHandler | Παίρνει ένα[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler/) να κληθεί όταν συμβεί το συμβάν. |
| useCapture | Boolean | Εάν ισχύει, το useCapture υποδεικνύει ότι ο χρήστης επιθυμεί να ξεκινήσει τη λήψη. Μετά την έναρξη της λήψης, όλα τα συμβάντα του καθορισμένου τύπου θα αποσταλούν στο registered [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) πριν αποσταλεί σε οποιονδήποτε στόχο συμβάντων κάτω από αυτούς στο δέντρο.[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) προορίζεται για χρήση σύλληψης. |

### Παρατηρήσεις

Εάν α[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) προστίθεται σε ένα[`EventTarget`](../) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες, αλλά μπορεί να ενεργοποιηθεί κατά τη διάρκεια ενός μεταγενέστερου σταδίου ροής συμβάντος, όπως η φάση δημιουργίας φυσαλίδων.

Εάν είναι εγγεγραμμένοι πολλαπλοί ίδιοι ακροατές συμβάντων στο ίδιο[`EventTarget`](../)με τις ίδιες παραμέτρους οι διπλές εμφανίσεις απορρίπτονται. Δεν προκαλούν το[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) να κληθούν δύο φορές και αφού απορρίπτονται δεν χρειάζεται να αφαιρεθούν με το [`RemoveEventListener`](../removeeventlistener/) μέθοδος.

### Δείτε επίσης

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/)
* class [EventTarget](../)
* χώρος ονομάτων [Aspose.Svg.Dom](../../eventtarget/)
* συνέλευση [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener) {#addeventlistener_1}

Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος.

```csharp
public void AddEventListener(string type, IEventListener listener)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type | String | Ο τύπος συμβάντος για τον οποίο εγγράφεται ο χρήστης |
| listener | IEventListener | Λαμβάνει μια διεπαφή που υλοποιείται από τον χρήστη η οποία περιέχει τις μεθόδους που θα κληθούν όταν συμβεί το συμβάν. |

### Παρατηρήσεις

Εάν α[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) προστίθεται σε ένα[`EventTarget`](../) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες, αλλά μπορεί να ενεργοποιηθεί κατά τη διάρκεια ενός μεταγενέστερου σταδίου ροής συμβάντος, όπως η φάση δημιουργίας φυσαλίδων.

Εάν είναι εγγεγραμμένοι πολλαπλοί ίδιοι ακροατές συμβάντων στο ίδιο[`EventTarget`](../)με τις ίδιες παραμέτρους οι διπλές εμφανίσεις απορρίπτονται. Δεν προκαλούν το[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) να κληθούν δύο φορές και αφού απορρίπτονται δεν χρειάζεται να αφαιρεθούν με το [`RemoveEventListener`](../removeeventlistener/) μέθοδος.

### Δείτε επίσης

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* χώρος ονομάτων [Aspose.Svg.Dom](../../eventtarget/)
* συνέλευση [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener, bool) {#addeventlistener_2}

Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος.

```csharp
public void AddEventListener(string type, IEventListener listener, bool useCapture)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type | String | Ο τύπος συμβάντος για τον οποίο εγγράφεται ο χρήστης |
| listener | IEventListener | Λαμβάνει μια διεπαφή που υλοποιείται από τον χρήστη η οποία περιέχει τις μεθόδους που θα κληθούν όταν συμβεί το συμβάν. |
| useCapture | Boolean | Εάν ισχύει, το useCapture υποδεικνύει ότι ο χρήστης επιθυμεί να ξεκινήσει τη λήψη. Μετά την έναρξη της λήψης, όλα τα συμβάντα του καθορισμένου τύπου θα αποσταλούν στο registered [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) πριν αποσταλεί σε οποιονδήποτε στόχο συμβάντων κάτω από αυτούς στο δέντρο.[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) προορίζεται για χρήση σύλληψης. |

### Παρατηρήσεις

Εάν α[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) προστίθεται σε ένα[`EventTarget`](../) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες, αλλά μπορεί να ενεργοποιηθεί κατά τη διάρκεια ενός μεταγενέστερου σταδίου ροής συμβάντος, όπως η φάση δημιουργίας φυσαλίδων.

Εάν είναι εγγεγραμμένοι πολλαπλοί ίδιοι ακροατές συμβάντων στο ίδιο[`EventTarget`](../)με τις ίδιες παραμέτρους οι διπλές εμφανίσεις απορρίπτονται. Δεν προκαλούν το[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) να κληθούν δύο φορές και αφού απορρίπτονται δεν χρειάζεται να αφαιρεθούν με το [`RemoveEventListener`](../removeeventlistener/) μέθοδος.

### Δείτε επίσης

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* χώρος ονομάτων [Aspose.Svg.Dom](../../eventtarget/)
* συνέλευση [Aspose.SVG](../../../)


