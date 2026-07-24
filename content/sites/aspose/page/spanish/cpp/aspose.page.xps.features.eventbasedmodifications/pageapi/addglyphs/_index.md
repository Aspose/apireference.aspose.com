---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs método"
linktitle: "AddGlyphs"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs método. Añade nuevos glifos a la página en C++."
type: docs
weight: 300
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Agrega nuevos glyphs a la página.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) recurso. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) tamaño. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | System::String | String a imprimir. |

### ReturnValue

Glifos añadidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Agrega nuevos glyphs a la página.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familia. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) tamaño. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) estilo. |
| originX | float | Coordenada X de origen de los glifos. |
| originY | float | Coordenada Y de origen de los glifos. |
| unicodeString | System::String | String a imprimir. |

### ReturnValue

Glifos añadidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
