---
title: MarkerLine.FeatureBasedConfiguration
second_title: Riferimento API Aspose.GIS per .NET
description: MarkerLine proprietà. Un callback utilizzato per configurare questo simbolizzatore prima di eseguire il rendering di una funzione.
type: docs
weight: 20
url: /it/net/aspose.gis.rendering.symbolizers/markerline/featurebasedconfiguration/
---
## MarkerLine.FeatureBasedConfiguration property

Un callback utilizzato per configurare questo simbolizzatore prima di eseguire il rendering di una funzione.

```csharp
public Action<Feature, MarkerLine> FeatureBasedConfiguration { get; set; }
```

### Osservazioni

Questa richiamata viene richiamata prima del rendering di ogni funzionalità. Accetta una caratteristica che sta per essere resa e un clone di questo simbolizzatore. Modificando le proprietà del clone, è possibile aggiornare il comportamento del simbolizzatore in base agli attributi della feature.

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerLine](../)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../markerline/)
* assemblea [Aspose.GIS](../../../)


