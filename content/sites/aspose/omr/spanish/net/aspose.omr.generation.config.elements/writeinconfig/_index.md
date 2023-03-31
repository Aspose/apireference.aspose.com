---
title: Class WriteInConfig
second_title: Referencia de API de Aspose.OMR para .NET
description: Aspose.OMR.Generation.Config.Elements.WriteInConfig clase. Representa el elemento de escritura. Usado para campos escritos a mano. Tras el reconocimiento se recorta como imagen y se coloca en la carpeta.
type: docs
weight: 400
url: /es/net/aspose.omr.generation.config.elements/writeinconfig/
---
## WriteInConfig class

Representa el elemento de escritura. Usado para campos escritos a mano. Tras el reconocimiento, se recorta como imagen y se coloca en la carpeta.

```csharp
public class WriteInConfig : BaseConfig
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [WriteInConfig](writeinconfig/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Adaptive](../../aspose.omr.generation.config.elements/writeinconfig/adaptive/) { get; set; } | Establezca el comportamiento de dibujo en adaptativo. Comportamiento adaptativo dibujar escritura en función de la altura principal |
| [Color](../../aspose.omr.generation.config.elements/writeinconfig/color/) { get; set; } | El color de la[`Hint`](./hint/) |
| [FontFamily](../../aspose.omr.generation.config.elements/writeinconfig/fontfamily/) { get; set; } | La familia tipográfica del[`Hint`](./hint/) |
| [FontSize](../../aspose.omr.generation.config.elements/writeinconfig/fontsize/) { get; set; } | El tamaño de la[`Hint`](./hint/) fuente |
| [FontStyle](../../aspose.omr.generation.config.elements/writeinconfig/fontstyle/) { get; set; } | El estilo del[`Hint`](./hint/) |
| [Hint](../../aspose.omr.generation.config.elements/writeinconfig/hint/) { get; set; } | Texto después del área de escritura. Por defecto se usa "escribir" |
| override [Name](../../aspose.omr.generation.config.elements/writeinconfig/name/) { get; set; } | Nombre del área de escritura y nombre de la imagen cuando se reconoce. |
| [Required](../../aspose.omr.generation.config.elements/writeinconfig/required/) { get; set; } | ¿Se requiere recortar el campo de escritura |
| override [Type](../../aspose.omr.generation.config.elements/writeinconfig/type/) { get; set; } | Tipo de elemento omr. Campo obligatorio para serialización JSON. |

### Ver también

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* espacio de nombres [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* asamblea [Aspose.OMR](../../)


