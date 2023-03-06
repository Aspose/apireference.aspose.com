---
title: Extent.Grow
second_title: Referencia de API de Aspose.GIS para .NET
description: Extent método. Aumenta esta extensión para que incluya el argumento.
type: docs
weight: 160
url: /es/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Aumenta esta extensión para que incluya el argumento.

```csharp
public void Grow(Extent extent)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| extent | Extent | Otra medida. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) de esta medida y el argumento no son ambos`null` y no iguales entre sí. |

### Observaciones

Si[`SpatialReferenceSystem`](../spatialreferencesystem/) de este SRS es`null` luego se actualiza con SRS del argumento.

### Ver también

* class [Extent](../)
* espacio de nombres [Aspose.Gis](../../extent/)
* asamblea [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Aumenta esta extensión para que incluya el punto especificado.

```csharp
public void Grow(double x, double y)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| x | Double | Coordenada X a incluir. |
| y | Double | Coordenada Y a incluir. |

### Ver también

* class [Extent](../)
* espacio de nombres [Aspose.Gis](../../extent/)
* asamblea [Aspose.GIS](../../../)


