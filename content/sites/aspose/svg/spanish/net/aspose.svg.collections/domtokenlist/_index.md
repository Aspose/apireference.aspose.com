---
title: Class DOMTokenList
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Collections.DOMTokenList clase. La clase DOMTokenList representa un conjunto de tokens separados por espacios. Se indexa comenzando con 0 como con los objetos Array de JavaScript. DOMTokenList siempre distingue entre mayúsculas y minúsculas.
type: docs
weight: 10
url: /es/net/aspose.svg.collections/domtokenlist/
---
## DOMTokenList class

La clase DOMTokenList representa un conjunto de tokens separados por espacios. Se indexa comenzando con 0 como con los objetos Array de JavaScript. DOMTokenList siempre distingue entre mayúsculas y minúsculas.

```csharp
public class DOMTokenList : DOMObject, IEnumerable<string>
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Item](../../aspose.svg.collections/domtokenlist/item/) { get; } | Devuelve el elemento de la lista por su índice, o nulo si el índice es mayor o igual que la longitud de la lista. |
| [Length](../../aspose.svg.collections/domtokenlist/length/) { get; } | Devuelve un ulong que representa el número de tokens almacenados en esta lista. |
| [Value](../../aspose.svg.collections/domtokenlist/value/) { get; set; } | Obtiene o establece el valor de un atributo correspondiente. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.svg.collections/domtokenlist/add/)(params string[]) | Agrega los tokens especificados a la lista. |
| [Contains](../../aspose.svg.collections/domtokenlist/contains/)(string) | Devuelve verdadero si la lista contiene el token dado; de lo contrario, devuelve falso. |
| [GetEnumerator](../../aspose.svg.collections/domtokenlist/getenumerator/)() | Devuelve un enumerador que itera a través de la colección. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| [Remove](../../aspose.svg.collections/domtokenlist/remove/)(params string[]) | Elimina los tokens especificados de la lista. |
| [Replace](../../aspose.svg.collections/domtokenlist/replace/)(string, string) | Reemplaza un token existente con un nuevo token. No hace nada si el primer token no existe. |
| [Supports](../../aspose.svg.collections/domtokenlist/supports/)(string) | Devuelve verdadero si un token dado está en los tokens admitidos del atributo asociado. |
| [Toggle](../../aspose.svg.collections/domtokenlist/toggle/#toggle)(string) | Elimina el token de la lista si existe, o agrega el token a la lista si no existe. |
| [Toggle](../../aspose.svg.collections/domtokenlist/toggle/#toggle_1)(string, bool?) | Elimina el token de la lista si existe, o agrega el token a la lista si no existe. |

### Ver también

* class [DOMObject](../../aspose.svg.dom/domobject/)
* espacio de nombres [Aspose.Svg.Collections](../../aspose.svg.collections/)
* asamblea [Aspose.SVG](../../)


