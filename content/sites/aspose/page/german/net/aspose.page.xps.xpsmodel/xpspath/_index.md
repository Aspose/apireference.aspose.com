---
title: Class XpsPath
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsModel.XpsPath klas. Klasse die Eigenschaften von PathElementen enthält. Dieses Element ist das einzige Mittel zum Hinzufügen von Vektorgrafiken und Bildern zu einer festen Seite. Es definiert eine einzelne Vektorgrafik die auf einer Seite gerendert werden soll.
type: docs
weight: 3250
url: /de/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Klasse, die Eigenschaften von Path-Elementen enthält. Dieses Element ist das einzige Mittel zum Hinzufügen von Vektorgrafiken und Bildern zu einer festen Seite. Es definiert eine einzelne Vektorgrafik, die auf einer Seite gerendert werden soll.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Gibt die Pfadgeometrieinstanz zurück/legt sie fest, die den gerenderten Bereich des Elements begrenzt. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Gibt die Anzahl der untergeordneten Elemente zurück. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Gibt die Geometrie des Pfads zurück/legt sie fest. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Gibt den Pinsel zurück/legt ihn fest, der verwendet wird, um die Geometrie zu malen, die durch die Data-Eigenschaft des Pfads angegeben wird. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Gibt das Hyperlink-Zielobjekt zurück/legt es fest. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Bietet Zugriff auf die untergeordneten Elemente des Elements nach Index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Gibt den Wert zurück/setzt ihn, der die einheitliche Transparenz des Elements definiert. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Gibt den Pinsel zurück/legt ihn fest und spezifiziert eine Maske aus Alpha-Werten , die auf die gleiche Weise wie das Opazitätsattribut auf das Element angewendet wird, aber unterschiedliche Alpha-Werte für verschiedene Bereiche des Elements zulässt. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Gibt die affine Transformationsmatrix zurück/setzt sie und erstellt einen neuen Koordinatenrahmen für alle Attribute des Elements und für alle untergeordneten Elemente (sofern vorhanden). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Gibt den zum Zeichnen des Strichs verwendeten Pinsel zurück/legt ihn fest. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Gibt das Array zurück/legt es fest, das die Länge der Striche und Lücken des Umrissstrichs angibt. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Gibt den Wert zurück/legt fest, der angibt, wie die Enden der einzelnen Striche gezeichnet werden. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Gibt den Startpunkt für die Wiederholung des Strich-Array-Musters zurück/legt ihn fest. Wenn dieser Wert weggelassen wird, wird das Strich-Array am Ursprung des Strichs ausgerichtet. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Gibt den Wert zurück/legt ihn fest, der die Form des Endes des letzten Strichs in einem Strich definiert. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Gibt den Wert zurück/setzt ihn, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Gibt das Verhältnis zwischen der maximalen Gehrungslänge und der Hälfte der Strichstärke zurück/setzt es fest. Dieser Wert ist nur dann von Bedeutung, wenn die`StrokeLineJoin` Attribut spezifiziert`Gehrung` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Gibt den Wert zurück/setzt ihn, der die Form des Anfangs des ersten Strichs in einem Strich definiert. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Gibt die Dicke eines Strichs in Einheiten von des effektiven Koordinatenraums (einschließlich der Rendertransformation des Pfads) zurück bzw. legt ihn fest. Der Strich wird über der Grenze der Geometrie gezeichnet, die durch die Dateneigenschaft des Pfadelements angegeben wird. Die Hälfte von StrokeThickness erstreckt sich außerhalb der durch die Data-Eigenschaft angegebenen Geometrie und die andere Hälfte erstreckt sich innerhalb der Geometrie. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Klont diesen Pfad. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Umsetzung vonIEnumerable Schnittstelle. |

### Siehe auch

* class [XpsContentElement](../xpscontentelement/)
* namensraum [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Montage [Aspose.Page](../../)


