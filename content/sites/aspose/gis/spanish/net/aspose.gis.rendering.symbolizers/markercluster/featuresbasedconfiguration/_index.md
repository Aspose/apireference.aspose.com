---
title: MarkerCluster.FeaturesBasedConfiguration
second_title: Referencia de API de Aspose.GIS para .NET
description: MarkerCluster propiedad. Una devolución de llamada que se usa para configurar este simbolizador antes de representar un centro de clúster.
type: docs
weight: 20
url: /es/net/aspose.gis.rendering.symbolizers/markercluster/featuresbasedconfiguration/
---
## MarkerCluster.FeaturesBasedConfiguration property

Una devolución de llamada que se usa para configurar este simbolizador antes de representar un centro de clúster.

```csharp
public Action<IEnumerable<Feature>, MarkerCluster> FeaturesBasedConfiguration { get; set; }
```

### Observaciones

Esta devolución de llamada se invoca antes de representar cada centro de clúster. Acepta características que están a punto de renderizarse y un clon de este simbolizador. Al cambiar las propiedades del clon, es posible actualizar el comportamiento del simbolizador en función de los atributos de las entidades.

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerCluster](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../markercluster/)
* asamblea [Aspose.GIS](../../../)


