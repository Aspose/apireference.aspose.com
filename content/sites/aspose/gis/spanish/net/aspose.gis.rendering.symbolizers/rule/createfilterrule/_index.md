---
title: Rule.CreateFilterRule
second_title: Referencia de API de Aspose.GIS para .NET
description: Rule método. Crea una nueva regla que aplica un símbolo a la entidad cada vez que pasa el filtro.
type: docs
weight: 20
url: /es/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Crea una nueva regla que aplica un símbolo a la entidad cada vez que pasa el filtro.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| filter | Func`2 | Determina cuándo se debe usar el símbolo. |
| symbolizer | VectorSymbolizer | Simbolizador a aplicar. |

### Valor_devuelto

Nuevo objeto de regla.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El filtro es`null`. |

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* asamblea [Aspose.GIS](../../../)


