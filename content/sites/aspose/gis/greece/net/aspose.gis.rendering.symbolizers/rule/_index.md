---
title: Class Rule
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Rendering.Symbolizers.Rule τάξη. Ένας κανόνας που ορίζεται από το χρήστη γιαRuleBasedSymbolizer .
type: docs
weight: 1920
url: /el/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Ένας κανόνας που ορίζεται από το χρήστη για[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Καθορίζει εάν ο "κανόνας φίλτρου" θα πρέπει να εφαρμόζει σύμβολο συμβολισμού στο χαρακτηριστικό. Εάν επιστρέφει`true` χρησιμοποιείται συμβολιστής. Διαφορετικά, η δυνατότητα παραλείπεται. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο κανόνας είναι "άλλος κανόνας". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτός ο κανόνας είναι "φίλτρο-κανόνας". |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Συμβολιστής για εφαρμογή στο χαρακτηριστικό. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Δημιουργεί νέο κανόνα που εφαρμόζει έναν συμβολισμό για να εμφανίζεται όποτε δεν ταιριάζει με κανέναν κανόνα φίλτρου. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Δημιουργεί νέο κανόνα που εφαρμόζει έναν συμβολοποιητή για να εμφανίζεται όποτε περνάει το φίλτρο. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* συνέλευση [Aspose.GIS](../../)


