---
title: Interface ICSSStyleSheet
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Dom.Css.ICSSStyleSheet interfaz. La interfaz CSSStyleSheet es una interfaz concreta que se utiliza para representar una hoja de estilo CSS es decir una hoja de estilo cuyo tipo de contenido es texto/css.
type: docs
weight: 660
url: /es/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

La interfaz CSSStyleSheet es una interfaz concreta que se utiliza para representar una hoja de estilo CSS, es decir, una hoja de estilo cuyo tipo de contenido es "texto/css".

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | La lista de todas las reglas CSS contenidas en la hoja de estilo. Esto incluye conjuntos de reglas y reglas-at. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | Si esta hoja de estilo proviene de una regla @import, el atributo ownRule contendrá CSSImportRule. En ese caso, el atributo ownNode en la interfaz StyleSheet será nulo. Si la hoja de estilo proviene de un elemento o una instrucción de procesamiento, el atributo ownRule será nulo y el atributo ownNode contendrá el Nodo. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | Se utiliza para eliminar una regla de la hoja de estilo. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | Se utiliza para insertar una nueva regla en la hoja de estilo. La nueva regla ahora pasa a formar parte de la cascada. |

### Ver también

* interface [IStyleSheet](../istylesheet/)
* espacio de nombres [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* asamblea [Aspose.SVG](../../)


