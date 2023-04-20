---
title: SVGListBase1.RemoveItem
second_title: Referencia de API de Aspose.SVG para .NET
description: SVGListBase método. Elimina un elemento existente de la lista.
type: docs
weight: 100
url: /es/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Elimina un elemento existente de la lista.

```csharp
public T RemoveItem(ulong index)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| index | UInt64 | El índice del elemento que se va a eliminar. El primer elemento es el número 0. |

### Valor_devuelto

El elemento eliminado.

### Excepciones

| excepción | condición |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Código[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Se genera cuando la lista no se puede modificar. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Código[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Se genera si el número de índice es mayor o igual que numberOfItems. |

### Ver también

* class [SVGListBase&lt;T&gt;](../)
* espacio de nombres [Aspose.Svg.Collections](../../svglistbase-1/)
* asamblea [Aspose.SVG](../../../)


