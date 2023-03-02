---
title: MarkerLine.FeatureBasedConfiguration
second_title: Referencia de API de Aspose.GIS para .NET
description: MarkerLine propiedad. Una devolución de llamada que se usa para configurar este símbolo antes de representar una característica.
type: docs
weight: 20
url: /es/net/aspose.gis.rendering.symbolizers/markerline/featurebasedconfiguration/
---
## MarkerLine.FeatureBasedConfiguration property

Una devolución de llamada que se usa para configurar este símbolo antes de representar una característica.

```csharp
public Action<Feature, MarkerLine> FeatureBasedConfiguration { get; set; }
```

### Observaciones

Esta devolución de llamada se invoca antes de representar cada función. Acepta una característica que está a punto de ser renderizada y un clon de este simbolizador. Al cambiar las propiedades del clon, es posible actualizar el comportamiento del simbolizador en función de los atributos de la entidad.

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [MarkerLine](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../markerline/)
* asamblea [Aspose.GIS](../../../)


