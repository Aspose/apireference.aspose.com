---
title: "Aspose::Page::XPS::XpsModel::XpsPath class"
linktitle: "XpsPath"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath class. Klasse, die die Merkmale des Path-Elements kapselt. Dieses Element ist das einzige Mittel, um Vektorgrafiken und Bilder zu einer festen Seite hinzuzufügen. Es definiert eine einzelne Vektorgrafik, die auf einer Seite in C++ gerendert wird."
type: docs
weight: 3000
url: /de/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Klasse, die Path-Elementeigenschaften kapselt. Dieses Element ist das einzige Mittel, um Vektorgrafiken und Bilder zu einer FixedPage hinzuzufügen. Es definiert eine einzelne Vektorgrafik, die auf einer Seite gerendert wird.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Kopiert diesen Pfad. |
| [get_Data](./get_data/)() | Gibt die Geometrie des Pfades zurück bzw. setzt sie. |
| [get_Fill](./get_fill/)() | Gibt den Pinsel zurück bzw. setzt ihn, der zum Malen der durch die Data-Eigenschaft des Pfades angegebenen Geometrie verwendet wird. |
| [get_Stroke](./get_stroke/)() | Gibt den Pinsel zurück bzw. setzt ihn, der zum Zeichnen der Kontur verwendet wird. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Gibt das Array zurück bzw. setzt es, das die Länge von Strichen und Lücken der Kontur definiert. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Gibt den Wert zurück bzw. setzt ihn, der angibt, wie die Enden jedes Strichs gezeichnet werden. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Gibt den Startpunkt für die Wiederholung des Strich-Array-Musters zurück bzw. setzt ihn. Wenn dieser Wert weggelassen wird, richtet sich das Strich-Array nach dem Ursprung der Kontur aus. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Gibt den Wert zurück bzw. setzt ihn, der die Form des Endes des letzten Strichs in einer Kontur definiert. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Gibt den Wert zurück bzw. setzt ihn, der die Form des Beginns des ersten Strichs in einer Kontur definiert. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Gibt das Verhältnis zwischen der maximalen Gehrungslänge und der Hälfte der Konturstärke zurück bzw. setzt es. Dieser Wert ist nur von Bedeutung, wenn das Attribut **StrokeLineJoin** **Miter** angibt. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Gibt den Wert zurück bzw. setzt ihn, der die Form des Beginns des ersten Strichs in einer Kontur definiert. |
| [get_StrokeThickness](./get_strokethickness/)() const | Gibt die Dicke einer Kontur zurück bzw. setzt sie, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfades). Die Kontur wird über der Begrenzung der durch die Data-Eigenschaft des Path-Elements angegebenen Geometrie gezeichnet. Die Hälfte der StrokeThickness erstreckt sich außerhalb der durch die Data-Eigenschaft angegebenen Geometrie und die andere Hälfte innerhalb der Geometrie. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Gibt die Geometrie des Pfades zurück bzw. setzt sie. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Gibt den Pinsel zurück bzw. setzt ihn, der zum Malen der durch die Data-Eigenschaft des Pfades angegebenen Geometrie verwendet wird. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Gibt den Pinsel zurück bzw. setzt ihn, der zum Zeichnen der Kontur verwendet wird. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Gibt das Array zurück bzw. setzt es, das die Länge von Strichen und Lücken der Kontur definiert. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Gibt den Wert zurück bzw. setzt ihn, der angibt, wie die Enden jedes Strichs gezeichnet werden. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Gibt den Startpunkt für die Wiederholung des Strich-Array-Musters zurück bzw. setzt ihn. Wenn dieser Wert weggelassen wird, richtet sich das Strich-Array nach dem Ursprung der Kontur aus. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Gibt den Wert zurück bzw. setzt ihn, der die Form des Endes des letzten Strichs in einer Kontur definiert. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Gibt den Wert zurück bzw. setzt ihn, der die Form des Beginns des ersten Strichs in einer Kontur definiert. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Gibt das Verhältnis zwischen der maximalen Gehrungslänge und der Hälfte der Konturstärke zurück bzw. setzt es. Dieser Wert ist nur von Bedeutung, wenn das Attribut **StrokeLineJoin** **Miter** angibt. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Gibt den Wert zurück bzw. setzt ihn, der die Form des Beginns des ersten Strichs in einer Kontur definiert. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Gibt die Dicke einer Kontur zurück bzw. setzt sie, in Einheiten des effektiven Koordinatenraums (einschließlich der Render-Transformation des Pfades). Die Kontur wird über der Begrenzung der durch die Data-Eigenschaft des Path-Elements angegebenen Geometrie gezeichnet. Die Hälfte der StrokeThickness erstreckt sich außerhalb der durch die Data-Eigenschaft angegebenen Geometrie und die andere Hälfte innerhalb der Geometrie. |
## Siehe auch

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
