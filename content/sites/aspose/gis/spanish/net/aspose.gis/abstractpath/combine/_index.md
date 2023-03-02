---
title: AbstractPath.Combine
second_title: Referencia de API de Aspose.GIS para .NET
description: AbstractPath método. Combina estoAbstractPath con componentes de ruta especificados.
type: docs
weight: 50
url: /es/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Combina esto[`AbstractPath`](../) con componentes de ruta especificados.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| location | String | Un componente de ruta para agregar a este[`AbstractPath`](../). |

### Valor_devuelto

Un nuevo[`AbstractPath`](../) apuntando a un[`Location`](../location/) que es una combinación de ubicaciones de este[`AbstractPath`](../)and el argumento.

### Observaciones

Por lo general, este método no debe ser anulado por un heredero. La implementación predeterminada concatena este[`Location`](../location/) con el argumento y llama al[`WithLocation`](../withlocation/) Método con la cadena concatenada como argumento. El resultado de la combinación se define de la siguiente forma:  Si el argumento comienza con el[`Separator`](../separator/), el resultado de la combinación es igual al argumento; De lo contrario, si[`Location`](../location/) termina con el[`Separator`](../separator/) , el resultado de la combinación es igual a` +`; De lo contrario, el resultado es igual a` + +`

### Ver también

* class [AbstractPath](../)
* espacio de nombres [Aspose.Gis](../../abstractpath/)
* asamblea [Aspose.GIS](../../../)


