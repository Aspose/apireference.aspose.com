---
title: LabelingRule.CreateFilterRule
second_title: Αναφορά Aspose.GIS για .NET API
description: LabelingRule μέθοδος. Δημιουργεί νέο κανόνα που εφαρμόζει μια ετικέτα στο χαρακτηριστικό κάθε φορά που περνάει το φίλτρο.
type: docs
weight: 20
url: /el/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Δημιουργεί νέο κανόνα που εφαρμόζει μια ετικέτα στο χαρακτηριστικό κάθε φορά που περνάει το φίλτρο.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filter | Func`2 | Καθορίζει πότε πρέπει να χρησιμοποιείται η επισήμανση. |
| labeling | Labeling | Επισήμανση για εφαρμογή. |

### Επιστρεφόμενη Αξία

Νέο αντικείμενο LabelingRule.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το φίλτρο είναι`null`. |

### Δείτε επίσης

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* συνέλευση [Aspose.GIS](../../../)


