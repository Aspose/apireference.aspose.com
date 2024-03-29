---
title: SVGListBase1.ReplaceItem
second_title: Referencia de API de Aspose.HTML para .NET
description: SVGListBase método. Reemplaza un elemento existente en la lista con un nuevo elemento.
type: docs
weight: 110
url: /es/net/aspose.html.dom.svg.collections/svglistbase-1/replaceitem/
---
## SVGListBase&lt;T&gt;.ReplaceItem method

Reemplaza un elemento existente en la lista con un nuevo elemento.

```csharp
public T ReplaceItem(T newItem, ulong index)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| newItem | T | El elemento que se va a insertar en la lista. |
| index | UInt64 | El índice del elemento que se va a reemplazar. El primer elemento es el número 0. |

### Valor_devuelto

El elemento insertado.

### Excepciones

| excepción | condición |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | Código[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.html.dom/domexception/no_modification_allowed_err/). Se genera cuando la lista no se puede modificar. |
| [DOMException](../../../aspose.html.dom/domexception/) | Código[`INDEX_SIZE_ERR`](../../../aspose.html.dom/domexception/index_size_err/). Se genera si el número de índice es mayor o igual que numberOfItems. |

### Ver también

* class [SVGListBase&lt;T&gt;](../)
* espacio de nombres [Aspose.Html.Dom.Svg.Collections](../../svglistbase-1/)
* asamblea [Aspose.HTML](../../../)


