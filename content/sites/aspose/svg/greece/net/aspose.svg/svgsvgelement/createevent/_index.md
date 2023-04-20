---
title: SVGSVGElement.CreateEvent
second_title: Aspose.SVG για Αναφορά API .NET
description: SVGSVGElement μέθοδος. Δημιουργεί έναEvent τύπου που υποστηρίζεται από την υλοποίηση.
type: docs
weight: 110
url: /el/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Δημιουργεί ένα[`Event`](../../../aspose.svg.dom.events/event/) τύπου που υποστηρίζεται από την υλοποίηση.

```csharp
public Event CreateEvent(string eventType)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| eventType | String | Η παράμετρος eventType καθορίζει τον τύπο του[`Event`](../../../aspose.svg.dom.events/event/) διεπαφή που θα δημιουργηθεί.  Αν το[`Event`](../../../aspose.svg.dom.events/event/)διεπαφή που καθορίστηκε υποστηρίζεται από την υλοποίηση αυτή η μέθοδος θα επιστρέψει ένα new [`Event`](../../../aspose.svg.dom.events/event/) του ζητούμενου τύπου διεπαφής. Εάν το[`Event`](../../../aspose.svg.dom.events/event/)πρόκειται να αποσταλεί μέσω του[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) μέθοδος η κατάλληλη [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) Η μέθοδος πρέπει να κληθεί μετά τη δημιουργία για να αρχικοποιηθεί η[`Event`](../../../aspose.svg.dom.events/event/) τιμές s. |

### Επιστρεφόμενη Αξία

Το νεοδημιουργημένο[`Event`](../../../aspose.svg.dom.events/event/)

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Αυξάνεται εάν η υλοποίηση δεν υποστηρίζει τον τύπο[`Event`](../../../aspose.svg.dom.events/event/) διεπαφή requested |

### Δείτε επίσης

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* χώρος ονομάτων [Aspose.Svg](../../svgsvgelement/)
* συνέλευση [Aspose.SVG](../../../)


