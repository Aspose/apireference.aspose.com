---
title: HTMLTableSectionElement.InsertRow
second_title: Referencia de API de Aspose.HTML para .NET
description: HTMLTableSectionElement método. Inserta una fila en esta sección. La nueva fila se inserta inmediatamente antes de la actualíndice fila en esta sección. Si índice es 1 o igual al número de filas en esta sección  se agrega la nueva fila.
type: docs
weight: 70
url: /es/net/aspose.html/htmltablesectionelement/insertrow/
---
## HTMLTableSectionElement.InsertRow method

Inserta una fila en esta sección. La nueva fila se inserta inmediatamente antes de la actual`índice` fila en esta sección. Si `índice` es -1 o igual al número de filas en esta sección , se agrega la nueva fila.

```csharp
public HTMLElement InsertRow(int index)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| index | Int32 | El número de fila donde insertar una nueva fila. Este índice comienza desde 0 y es relativo solo a las filas contenidas dentro de en esta sección, no a todas las filas de la tabla. |

### Valor_devuelto

La fila recién creada.

### Excepciones

| excepción | condición |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | INDEX_SIZE_ERR: se genera si el índice especificado es mayor que el número de filas o si el índice es un número negativo distinto de -1. @versión DOM Nivel 2 |

### Ver también

* class [HTMLElement](../../htmlelement/)
* class [HTMLTableSectionElement](../)
* espacio de nombres [Aspose.Html](../../htmltablesectionelement/)
* asamblea [Aspose.HTML](../../../)


