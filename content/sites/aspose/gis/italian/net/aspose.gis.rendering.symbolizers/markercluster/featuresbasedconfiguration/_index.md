---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Riferimento API Aspose.GIS per .NET
description: MarkerCluster proprietà. Un callback che viene utilizzato per configurare questo simbolo prima di eseguire il rendering di un centro cluster.
type: docs
weight: 20
url: /it/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

Un callback che viene utilizzato per configurare questo simbolo prima di eseguire il rendering di un centro cluster.

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### Osservazioni

Questo callback viene richiamato prima del rendering di ogni centro cluster. Accetta caratteristiche che stanno per essere renderizzate e un clone di questo simbolizzatore. Modificando le proprietà del clone, è possibile aggiornare il comportamento del simbolizzatore in base agli attributi delle feature.

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* assemblea [Aspose.GIS](../../../)


