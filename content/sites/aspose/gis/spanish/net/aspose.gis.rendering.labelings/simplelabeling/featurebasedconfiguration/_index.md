---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: Referencia de API de Aspose.GIS para .NET
description: SimpleLabeling propiedad. Una devolución de llamada que se usa para configurar este etiquetado antes de manejar una característica.
type: docs
weight: 20
url: /es/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

Una devolución de llamada que se usa para configurar este etiquetado antes de manejar una característica.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### Observaciones

Esta devolución de llamada se invoca antes de etiquetar cada función. Acepta una característica que está a punto de ser etiquetada y un clon de este etiquetado. Al cambiar las propiedades del clon, es posible actualizar el comportamiento del etiquetado en función de los atributos de la entidad.

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* espacio de nombres [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* asamblea [Aspose.GIS](../../../)


