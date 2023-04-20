---
title: IXPathResult.SnapshotItem
second_title: Referencia de API de Aspose.SVG para .NET
description: IXPathResult método. Devuelve elíndice º elemento en la colección de instantáneas. Siíndicees mayor que o igual al número de nodos en la lista este método devuelvenulo . A diferencia del resultado del iterador  la instantánea no se vuelve inválida pero es posible que no se corresponda con el documento actual si está mutado.
type: docs
weight: 90
url: /es/net/aspose.svg.dom.xpath/ixpathresult/snapshotitem/
---
## IXPathResult.SnapshotItem method

Devuelve el`índice` º elemento en la colección de instantáneas. Si`índice`es mayor que o igual al número de nodos en la lista, este método devuelve`nulo` . A diferencia del resultado del iterador , la instantánea no se vuelve inválida, pero es posible que no se corresponda con el documento actual si está mutado.

```csharp
public Node SnapshotItem(int index)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| index | Int32 | Índice en la colección de instantáneas. |

### Valor_devuelto

El nodo en el`índice` ª posición en el`lista de nodos` , o`nulo` si no es un índice válido.

### Excepciones

| excepción | condición |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: planteado si`tipo de resultado` no es `Instantánea de nodo desordenado` tipo o`Instantánea de nodo ordenado` tipo. |

### Ver también

* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathResult](../)
* espacio de nombres [Aspose.Svg.Dom.XPath](../../ixpathresult/)
* asamblea [Aspose.SVG](../../../)


