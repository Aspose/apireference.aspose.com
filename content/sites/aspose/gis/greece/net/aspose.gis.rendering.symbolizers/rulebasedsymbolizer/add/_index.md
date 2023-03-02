---
title: RuleBasedSymbolizer.Add
second_title: Αναφορά Aspose.GIS για .NET API
description: RuleBasedSymbolizer μέθοδος. Προσθέτει νέαRule .
type: docs
weight: 40
url: /el/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Προσθέτει νέα[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filter | Func`2 | Καθορίζει πότε πρέπει να εφαρμόζεται ο συμβολιστής σε ένα χαρακτηριστικό. |
| symbolizer | VectorSymbolizer | Συμβολιστής για εφαρμογή σε ένα χαρακτηριστικό όταν*filter* επιστρέφει αληθινό. |

### Δείτε επίσης

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Προσθέτει έναν κανόνα.

```csharp
public void Add(Rule rule)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rule | Rule | Κανόνας για προσθήκη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* συνέλευση [Aspose.GIS](../../../)


