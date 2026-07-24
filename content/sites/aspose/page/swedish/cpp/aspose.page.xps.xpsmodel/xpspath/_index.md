---
title: "Aspose::Page::XPS::XpsModel::XpsPath klass"
linktitle: "XpsPath"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath klass. Klass som kapslar in egenskaper för Path‑elementet. Detta element är det enda sättet att lägga till vektorgrafik och bilder på en fast sida. Den definierar en enda vektorgrafik som ska renderas på en sida i C++."
type: docs
weight: 3000
url: /sv/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Klass som kapslar in Path-elementfunktioner. Detta element är det enda sättet att lägga till vektorgrafik och bilder på en fast sida. Det definierar en enskild vektorgrafik som ska renderas på en sida.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Klonar denna bana. |
| [get_Data](./get_data/)() | Returnerar/sätter geometrin för banan. |
| [get_Fill](./get_fill/)() | Returnerar/sätter penseln som används för att måla geometrin som anges av Data‑egenskapen för banan. |
| [get_Stroke](./get_stroke/)() | Returnerar/sätter penseln som används för att rita strecket. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Returnerar/sätter arrayen som specificerar längden på streck och mellanrum för konturstrecket. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Returnerar/sätter värdet som anger hur ändarna på varje streck ritas. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Returnerar/sätter startpunkten för att upprepa streckarray‑mönstret. Om detta värde utelämnas, justeras streckarrayen med ursprunget för strecket. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Returnerar/sätter värdet som definierar formen på slutet av det sista strecket i ett streck. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Returnerar/sätter värdet som definierar formen på början av det första strecket i ett streck. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Returnerar/sätter förhållandet mellan maximal snedkantslängd och hälften av strecktjockleken. Detta värde är betydelsefullt endast om attributet **StrokeLineJoin** specificerar **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Returnerar/sätter värdet som definierar formen på början av det första strecket i ett streck. |
| [get_StrokeThickness](./get_strokethickness/)() const | Returnerar/sätter tjockleken på ett streck, i enheter av det effektiva koordinatrymdet (inkluderar banans rendertransform). Strecket ritas ovanpå gränsen för geometrin som anges av Path‑elementets Data‑egenskap. Hälften av StrokeThickness sträcker sig utanför geometrin som anges av Data‑egenskapen och den andra hälften sträcker sig in i geometrin. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Returnerar/sätter geometrin för banan. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Returnerar/sätter penseln som används för att måla geometrin som anges av Data‑egenskapen för banan. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Returnerar/sätter penseln som används för att rita strecket. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Returnerar/sätter arrayen som specificerar längden på streck och mellanrum för konturstrecket. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Returnerar/sätter värdet som anger hur ändarna på varje streck ritas. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Returnerar/sätter startpunkten för att upprepa streckarray‑mönstret. Om detta värde utelämnas, justeras streckarrayen med ursprunget för strecket. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Returnerar/sätter värdet som definierar formen på slutet av det sista strecket i ett streck. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Returnerar/sätter värdet som definierar formen på början av det första strecket i ett streck. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Returnerar/sätter förhållandet mellan maximal snedkantslängd och hälften av strecktjockleken. Detta värde är betydelsefullt endast om attributet **StrokeLineJoin** specificerar **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Returnerar/sätter värdet som definierar formen på början av det första strecket i ett streck. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Returnerar/sätter tjockleken på ett streck, i enheter av det effektiva koordinatrymdet (inkluderar banans rendertransform). Strecket ritas ovanpå gränsen för geometrin som anges av Path‑elementets Data‑egenskap. Hälften av StrokeThickness sträcker sig utanför geometrin som anges av Data‑egenskapen och den andra hälften sträcker sig in i geometrin. |
## Se även

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
