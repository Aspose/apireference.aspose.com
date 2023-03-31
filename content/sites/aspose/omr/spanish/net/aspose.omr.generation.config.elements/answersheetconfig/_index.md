---
title: Class AnswerSheetConfig
second_title: Referencia de API de Aspose.OMR para .NET
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig clase. Representa el elemento Hoja de respuestas. Permite agregar casillas de elección agrupadas en columnas y filas. Use la hoja de respuestas si desea incluir muchas preguntas en una página ya que están ubicadas cerca unas de otras.
type: docs
weight: 90
url: /es/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

Representa el elemento Hoja de respuestas. Permite agregar casillas de elección agrupadas en columnas y filas. Use la hoja de respuestas si desea incluir muchas preguntas en una página, ya que están ubicadas cerca unas de otras.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | El número de opciones de respuesta para cada pregunta en la hoja de respuestas. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | Cada valor representa un símbolo dentro de la burbuja. Debe tener el mismo conteo que[`AnswersCount`](./answerscount/) Ejemplo: nueva cadena[] {"A", "B", "C", "D"} Ejemplo: nueva cadena[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | El tipo de burbuja |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | Indica en que columna dibujar la hoja |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | Establece el número de columnas a dibujar. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | Determina el número total de preguntas en la hoja de respuestas. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | Nombre de la hoja de respuestas |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | El índice inicial de las preguntas numeración |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | Tipo de elemento omr. Campo obligatorio para serialización JSON. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | Margen vertical de la hoja de respuestas. Establecer en píxeles. |

## Campos

| Nombre | Descripción |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | El tamaño de una burbuja |

### Ver también

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* espacio de nombres [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* asamblea [Aspose.OMR](../../)


