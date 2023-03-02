---
title: Class LabelingRule
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Rendering.Labelings.LabelingRule τάξη. Ένας κανόνας που ορίζεται από το χρήστη γιαRuleBasedLabeling .
type: docs
weight: 1630
url: /el/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Ένας κανόνας που ορίζεται από το χρήστη για[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Καθορίζει εάν ο "κανόνας φίλτρου" θα πρέπει να εφαρμόζει ετικέτα στο χαρακτηριστικό. Εάν επιστρέφει`true` χρησιμοποιείται η επισήμανση. Διαφορετικά, η δυνατότητα παραλείπεται. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο κανόνας είναι "άλλος κανόνας". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο κανόνας είναι "φίλτρο-κανόνας". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Επισήμανση για εφαρμογή στο χαρακτηριστικό. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Δημιουργεί νέο κανόνα που εφαρμόζει μια επισήμανση στο χαρακτηριστικό κάθε φορά που δεν ταιριάζει με κανέναν κανόνα φίλτρου. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Δημιουργεί νέο κανόνα που εφαρμόζει μια ετικέτα στο χαρακτηριστικό κάθε φορά που περνάει το φίλτρο. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* συνέλευση [Aspose.GIS](../../)


