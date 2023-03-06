---
title: SimpleMarker.FeatureBasedConfiguration
second_title: Referencia de API de Aspose.GIS para .NET
description: SimpleMarker propiedad. Una devolución de llamada que se usa para configurar este símbolo antes de representar una característica.
type: docs
weight: 20
url: /es/net/aspose.gis.rendering.symbolizers/simplemarker/featurebasedconfiguration/
---
## SimpleMarker.FeatureBasedConfiguration property

Una devolución de llamada que se usa para configurar este símbolo antes de representar una característica.

```csharp
public Action<Feature, SimpleMarker> FeatureBasedConfiguration { get; set; }
```

### Observaciones

Esta devolución de llamada se invoca antes de representar cada función. Acepta una característica que está a punto de ser renderizada y un clon de este simbolizador. Al cambiar las propiedades del clon, es posible actualizar el comportamiento del simbolizador en función de los atributos de la entidad.

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleMarker](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../simplemarker/)
* asamblea [Aspose.GIS](../../../)


