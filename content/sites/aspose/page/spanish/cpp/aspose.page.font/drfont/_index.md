---
title: "Aspose::Page::Font::DrFont clase"
linktitle: "DrFont"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::Font::DrFont clase. Use esta clase en lugar de GDI+ Font en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.font/drfont/
---
## DrFont class


Use esta clase en lugar de GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina si el [System::Object](../../system/object/) especificado es igual a esta instancia. |
| [get_AscentLis](./get_ascentlis/)() | Ascenso de celda de esta fuente (lis). Esta es una distancia vertical desde la parte superior de la celda hasta la línea base de la celda. |
| [get_AscentPoints](./get_ascentpoints/)() | Devuelve el ascenso de la celda en puntos. |
| [get_CellHeightLis](./get_cellheightlis/)() | Devuelve la altura de celda de esta fuente (lis). Esto es un atajo para [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Atajo para [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Descenso de celda de esta fuente (lis). Esta es una distancia vertical desde la parte inferior de la celda hasta la línea base de la celda. |
| [get_DescentPoints](./get_descentpoints/)() | Devuelve el descenso de la celda en puntos. |
| [get_FamilyName](./get_familyname/)() | Obtiene el nombre de esta fuente. |
| [get_IsBold](./get_isbold/)() | Obtiene un valor que indica si esta instancia es negrita. |
| [get_IsItalic](./get_isitalic/)() | Obtiene un valor que indica si esta instancia es cursiva. |
| [get_LeadingLis](./get_leadinglis/)() | Devuelve el interlineado de esta fuente (lis). Esto es un atajo para [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Devuelve el interlineado de esta fuente (lis). Esto es un atajo para [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Devuelve el espaciado de celda de esta fuente (lis). Esta es una distancia vertical entre las líneas base de los dos glifos. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Devuelve el espaciado de celda de esta fuente (puntos). Esta es una distancia vertical entre las líneas base de los dos glifos. |
| [get_SizePoints](./get_sizepoints/)() | Obtiene el tamaño de esta fuente (puntos). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Obtiene las mayúsculas de la fuente. |
| [get_Style](./get_style/)() | Obtiene la fuente TrueType. |
| [get_StyleEx](./get_styleex/)() | Esta propiedad contiene información adicional sobre el estilo de la fuente. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Obtiene el ancho de carácter lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Devuelve el ancho del carácter (puntos). |
| [GetHashCode](./gethashcode/)() const override | Devuelve un código hash para esta instancia. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Devuelve la caja de texto de medición del texto en puntos. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Obtiene el ancho del texto lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Obtiene el ancho del texto en puntos. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Obtiene el ancho del texto en puntos. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Devuelve True para la fuente "Microsoft Sans Serif". Esta se representa mal con GDI+. Ver Test286 y Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Reemplaza el contenido de la fuente. |
| [set_SizePoints](./set_sizepoints/)(float) | Obtiene el tamaño de esta fuente (puntos). |
| [set_StyleEx](./set_styleex/)(int16_t) | Esta propiedad contiene información adicional sobre el estilo de la fuente. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
