---
title: ImageAttributes
second_title: Referencia de Aspose.Drawing para .NET API
description: Contiene información sobre cómo se manipulan los colores del mapa de bits y del metarchivo durante el renderizado.
type: docs
weight: 740
url: /es/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Contiene información sobre cómo se manipulan los colores del mapa de bits y del metarchivo durante el renderizado.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ImageAttributes](imageattributes)() | Inicializa una nueva instancia del[`ImageAttributes`](../imageattributes) clase. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Borra la tabla de reasignación de color del pincel de esteImageAttributes objeto. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | Borra la clave de color (rango de transparencia) para la categoría predeterminada. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | Borra la clave de color (rango de transparencia) para una categoría específica. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | Borra la matriz de ajuste de color para la categoría predeterminada. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | Borra la matriz de ajuste de color para una categoría específica. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | Deshabilita la corrección gamma para la categoría predeterminada. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | Deshabilita la corrección gamma para una categoría específica. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | Borra la configuración NoOp para la categoría predeterminada. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | Borra la configuración de NoOp para una categoría específica. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | Borra la configuración del canal de salida CMYK (cian-magenta-amarillo-negro) para la categoría predeterminada. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | Borra la configuración del canal de salida (cian-magenta-amarillo-negro) para una categoría específica. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | Borra la configuración del perfil de color del canal de salida para la categoría predeterminada. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Borra la configuración del perfil de color del canal de salida para una categoría específica. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | Borra la tabla de reasignación de color para la categoría predeterminada. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | Borra la tabla de reasignación de colores para una categoría específica. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | Borra el valor de umbral para la categoría predeterminada. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | Borra el valor de umbral para una categoría específica. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Crea una copia exacta de esteImageAttributes objeto. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Libera todos los recursos utilizados por esteImageAttributes objeto. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Ajusta los colores de una paleta de acuerdo con la configuración de ajuste de una categoría específica. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Establece la tabla de reasignación de color para la categoría de pincel. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | Establece la clave de color para la categoría predeterminada. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | Establece la clave de color (rango de transparencia) para una categoría específica. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | Establece la matriz de ajuste de color y la matriz de ajuste de escala de grises para la categoría predeterminada. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Establece la matriz de ajuste de color y la matriz de ajuste de escala de grises para la categoría predeterminada. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Establece la matriz de ajuste de color y la matriz de ajuste de escala de grises para una categoría específica. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | Establece la matriz de ajuste de color para la categoría predeterminada. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Establece la matriz de ajuste de color para la categoría predeterminada. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Establece la matriz de ajuste de color para una categoría específica. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | Establece el valor gamma para la categoría predeterminada. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | Establece el valor gamma para una categoría específica. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | Desactiva el ajuste de color para la categoría predeterminada. Puede llamar al[`ClearNoOp`](./clearnoop) método para restablecer la configuración de ajuste de color que estaba en su lugar antes de la llamada al[`SetNoOp`](./setnoop) método. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | Desactiva el ajuste de color para una categoría específica. Puedes llamar al[`ClearNoOp`](./clearnoop) método para restablecer la configuración de ajuste de color que estaba en su lugar antes de la llamada al[`SetNoOp`](./setnoop) método. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | Establece el canal de salida CMYK (cian-magenta-amarillo-negro) para la categoría predeterminada. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Establece el canal de salida CMYK (cian-magenta-amarillo-negro) para una categoría específica. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | Establece el archivo de perfil de color del canal de salida para la categoría predeterminada. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Establece el archivo de perfil de color del canal de salida para una categoría específica. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | Establece la tabla de reasignación de colores para la categoría predeterminada. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | Establece la tabla de reasignación de colores para una categoría específica. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | Establece el umbral (rango de transparencia) para la categoría predeterminada. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | Establece el umbral (rango de transparencia) para una categoría específica. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | Establece el modo de ajuste que se utiliza para decidir cómo colocar una textura en mosaico en una forma o en los límites de la forma. Una textura se coloca en mosaico en una forma para rellenarla cuando la textura es más pequeña que la forma que está rellenando. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | Establece el modo de ajuste y el color utilizado para decidir cómo colocar una textura en mosaico en una forma o en los límites de la forma. Una textura se coloca en mosaico en una forma para rellenarla cuando la textura es más pequeña que la forma que está rellenando. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | Establece el modo de ajuste y el color utilizado para decidir cómo colocar una textura en mosaico en una forma o en los límites de la forma. Una textura se coloca en mosaico en una forma para rellenarla cuando la textura es más pequeña que la forma que está rellenando. |

### Ver también

* espacio de nombres [System.Drawing.Imaging](../../system.drawing.imaging)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
