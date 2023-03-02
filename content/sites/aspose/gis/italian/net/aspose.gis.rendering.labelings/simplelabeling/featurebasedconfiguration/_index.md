---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Riferimento API Aspose.GIS per .NET
description: SimpleLabeling proprietà. Un callback utilizzato per configurare questa etichettatura prima di gestire una funzione.
type: docs
weight: 20
url: /it/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

Un callback utilizzato per configurare questa etichettatura prima di gestire una funzione.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### Osservazioni

Questa richiamata viene richiamata prima di etichettare ogni caratteristica. Accetta una caratteristica che sta per essere etichettata e un clone di questa etichettatura. Modificando le proprietà del clone, è possibile aggiornare il comportamento dell'etichettatura in base agli attributi della feature.

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* spazio dei nomi [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* assemblea [Aspose.GIS](../../../)


