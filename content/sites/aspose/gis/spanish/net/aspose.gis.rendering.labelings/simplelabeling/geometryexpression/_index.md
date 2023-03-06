---
title: SimpleLabeling.GeometryExpression
second_title: Referencia de API de Aspose.GIS para .NET
description: SimpleLabeling propiedad. Proporciona una forma de sustituir la geometría de la característica con una modificada para el etiquetado. Esta devolución de llamada se invoca primero despuésFeatureBasedConfiguration . El valor predeterminado esnull utilice la geometría característica tal como está.
type: docs
weight: 70
url: /es/net/aspose.gis.rendering.labelings/simplelabeling/geometryexpression/
---
## SimpleLabeling.GeometryExpression property

Proporciona una forma de sustituir la geometría de la característica con una modificada para el etiquetado. Esta devolución de llamada se invoca primero después[`FeatureBasedConfiguration`](../featurebasedconfiguration/) . El valor predeterminado es`null` (utilice la geometría característica tal como está).

```csharp
public Func<Feature, IGeometry> GeometryExpression { get; set; }
```

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SimpleLabeling](../)
* espacio de nombres [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* asamblea [Aspose.GIS](../../../)


