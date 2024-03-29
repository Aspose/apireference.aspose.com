---
title: ITextureUnit
second_title: Справочник по Aspose.3D для .NET API
description: ITextureUnit./itextureunit представляет собой текстуру в памяти которая совместно используется графическим и центральным процессорами и может быть сэмплирована шейдером  гдеTexture../aspose.threed.shading/texture представляет собой только ссылку на внешний файл. Более подробную информацию можно найти https//en.wikipedia.org/wiki/Texture_mapping_unit
type: docs
weight: 1950
url: /ru/net/aspose.threed.render/itextureunit/
---
## ITextureUnit interface

[`ITextureUnit`](../itextureunit) представляет собой текстуру в памяти, которая совместно используется графическим и центральным процессорами и может быть сэмплирована шейдером, , где[`Texture`](../../aspose.threed.shading/texture) представляет собой только ссылку на внешний файл. Более подробную информацию можно найти https://en.wikipedia.org/wiki/Texture_mapping_unit

```csharp
public interface ITextureUnit : IDisposable
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Depth](../../aspose.threed.render/itextureunit/depth) { get; } | Получает высоту этой текстуры, для не-3D текстуры это всегда 1. |
| [Height](../../aspose.threed.render/itextureunit/height) { get; } | Получает высоту этой текстуры. |
| [Magnification](../../aspose.threed.render/itextureunit/magnification) { get; set; } | Получает или задает режим фильтра для увеличения. |
| [Minification](../../aspose.threed.render/itextureunit/minification) { get; set; } | Получает или задает режим фильтра для минимизации. |
| [Mipmap](../../aspose.threed.render/itextureunit/mipmap) { get; set; } | Получает или задает режим фильтра для mipmap. |
| [Scale](../../aspose.threed.render/itextureunit/scale) { get; set; } | Получает или задает масштаб координаты UV. |
| [Scroll](../../aspose.threed.render/itextureunit/scroll) { get; set; } | Получает или задает прокрутку координаты UV. |
| [Type](../../aspose.threed.render/itextureunit/type) { get; } | Получает тип этого текстурного блока. |
| [UWrap](../../aspose.threed.render/itextureunit/uwrap) { get; set; } | Получает или задает режим переноса для координаты U текстуры. |
| [VWrap](../../aspose.threed.render/itextureunit/vwrap) { get; set; } | Получает или задает режим переноса для координаты V текстуры. |
| [Width](../../aspose.threed.render/itextureunit/width) { get; } | Получает ширину этой текстуры. |
| [WWrap](../../aspose.threed.render/itextureunit/wwrap) { get; set; } | Получает или задает режим переноса координаты W текстуры. |

### Смотрите также

* пространство имен [Aspose.ThreeD.Render](../../aspose.threed.render)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
