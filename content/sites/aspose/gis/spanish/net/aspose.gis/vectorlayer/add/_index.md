---
title: VectorLayer.Add
second_title: Referencia de API de Aspose.GIS para .NET
description: VectorLayer método. Agrega una nueva entidad a la capa si es compatible con elVectorLayer sDriver .
type: docs
weight: 80
url: /es/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Agrega una nueva entidad a la capa, si es compatible con el[`VectorLayer`](../) s[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| feature | Feature | La característica a agregar. |

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | se lanza si la capa es de solo lectura. |

### Ver también

* class [Feature](../../feature/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Agrega una nueva entidad con el estilo especificado a la capa, si es compatible con el[`VectorLayer`](../) s[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| feature | Feature | La característica a agregar. |
| style | IFeatureStyle | El estilo de función. Usar`null` para indicar el estilo faltante. |

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | se lanza si la capa no admite estilos o si la capa es de solo lectura. |
| InvalidOperationException | se lanza si las capas editables no admiten estilos. |
| ArgumentException | se lanza si el estilo no coincide con el tipo de controlador. |

### Ver también

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* espacio de nombres [Aspose.Gis](../../vectorlayer/)
* asamblea [Aspose.GIS](../../../)


