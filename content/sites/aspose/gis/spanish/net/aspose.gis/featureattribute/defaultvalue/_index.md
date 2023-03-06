---
title: FeatureAttribute.DefaultValue
second_title: Referencia de API de Aspose.GIS para .NET
description: FeatureAttribute propiedad. Obtiene o establece un valor para el atributo que indica que faltan datos.
type: docs
weight: 50
url: /es/net/aspose.gis/featureattribute/defaultvalue/
---
## FeatureAttribute.DefaultValue property

Obtiene o establece un valor para el atributo, que indica que faltan datos.

```csharp
public object DefaultValue { get; set; }
```

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | El atributo está bloqueado. |
| InvalidOperationException | El atributo no permite`nulo` valores. |

### Observaciones

Este es el valor que representa una información faltante, cuando un atributo no permite la`nulo`value. Para los atributos que permiten`nulo` valores ([`CanBeNull`](../canbenull/) ==`verdadero` ),`DefaultValue` es`nulo` a menos que se cambie explícitamente.

### Ver también

* class [FeatureAttribute](../)
* espacio de nombres [Aspose.Gis](../../featureattribute/)
* asamblea [Aspose.GIS](../../../)


