---
title: Rule.CreateFilterRule
second_title: Αναφορά Aspose.GIS για .NET API
description: Rule μέθοδος. Δημιουργεί νέο κανόνα που εφαρμόζει έναν συμβολοποιητή για να εμφανίζεται όποτε περνάει το φίλτρο.
type: docs
weight: 20
url: /el/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Δημιουργεί νέο κανόνα που εφαρμόζει έναν συμβολοποιητή για να εμφανίζεται όποτε περνάει το φίλτρο.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filter | Func`2 | Καθορίζει πότε πρέπει να χρησιμοποιείται ο συμβολιστής. |
| symbolizer | VectorSymbolizer | Συμβολιστής για εφαρμογή. |

### Επιστρεφόμενη Αξία

Νέο αντικείμενο κανόνα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το φίλτρο είναι`null`. |

### Δείτε επίσης

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* συνέλευση [Aspose.GIS](../../../)


