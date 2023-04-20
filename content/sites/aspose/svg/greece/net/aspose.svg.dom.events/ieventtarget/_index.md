---
title: Interface IEventTarget
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Events.IEventTarget διεπαφή. ΤοEventTarget Η διασύνδεση υλοποιείται από όλους τους κόμβους σε μια υλοποίηση που υποστηρίζει το μοντέλο συμβάντων DOM. Επομένως αυτή η διεπαφή μπορεί να αποκτηθεί χρησιμοποιώντας μεθόδους casting ειδικά για δέσμευση σε μια παρουσία της διεπαφής του κόμβου. Η διεπαφή επιτρέπει την εγγραφή και την αφαίρεση των ακρόασης συμβάντων σε έναEventTarget και αποστολή εκδηλώσεων σε αυτόIEventTarget .
type: docs
weight: 960
url: /el/net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

Το[`EventTarget`](../../aspose.svg.dom/eventtarget/) Η διασύνδεση υλοποιείται από όλους τους κόμβους σε μια υλοποίηση που υποστηρίζει το μοντέλο συμβάντων DOM. Επομένως, αυτή η διεπαφή μπορεί να αποκτηθεί χρησιμοποιώντας μεθόδους casting ειδικά για δέσμευση σε μια παρουσία της διεπαφής του κόμβου. Η διεπαφή επιτρέπει την εγγραφή και την αφαίρεση των ακρόασης συμβάντων σε ένα[`EventTarget`](../../aspose.svg.dom/eventtarget/) και αποστολή εκδηλώσεων σε αυτό`IEventTarget` .

```csharp
public interface IEventTarget
```

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την εγγραφή των ακροατών συμβάντων στον στόχο συμβάντος. |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | Αυτή η μέθοδος επιτρέπει την αποστολή συμβάντων στο μοντέλο συμβάντων υλοποιήσεων. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../ieventlistener/) αφαιρείται από ένα[`EventTarget`](../../aspose.svg.dom/eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | Αυτή η μέθοδος επιτρέπει την αφαίρεση των ακροατών συμβάντων από τον στόχο συμβάντος. Εάν[`IEventListener`](../ieventlistener/) αφαιρείται από ένα[`EventTarget`](../../aspose.svg.dom/eventtarget/) ενώ επεξεργάζεται ένα συμβάν, δεν θα ενεργοποιηθεί από τις τρέχουσες ενέργειες. Δεν είναι δυνατή η επίκληση των Ακροατών συμβάντων μετά την αφαίρεση. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* συνέλευση [Aspose.SVG](../../)


