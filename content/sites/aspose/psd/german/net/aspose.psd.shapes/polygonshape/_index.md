---
title: Class PolygonShape
second_title: Aspose.PSD für .NET-API-Referenz
description: Aspose.PSD.Shapes.PolygonShape klas. Stellt eine Polygonform dar.
type: docs
weight: 5510
url: /de/net/aspose.psd.shapes/polygonshape/
---
## PolygonShape class

Stellt eine Polygonform dar.

```csharp
public class PolygonShape : Shape, IOrderedShape
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PolygonShape](polygonshape/#constructor)() | Initialisiert eine neue Instanz von`PolygonShape` Klasse. |
| [PolygonShape](polygonshape/#constructor_1)(PointF[]) | Initialisiert eine neue Instanz von`PolygonShape` Klasse. |
| [PolygonShape](polygonshape/#constructor_2)(PointF[], bool) | Initialisiert eine neue Instanz von`PolygonShape` Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [Bounds](../../aspose.psd.shapes/polygonshape/bounds/) { get; } | Ruft die Grenzen des Objekts ab. |
| override [Center](../../aspose.psd.shapes/polygonshape/center/) { get; } | Ruft den Mittelpunkt der Form ab. |
| virtual [EndPoint](../../aspose.psd.shapes/polygonshape/endpoint/) { get; } | Ruft den Endformpunkt ab. |
| override [HasSegments](../../aspose.psd.shapes/polygonshape/hassegments/) { get; } | Ruft einen Wert ab, der angibt, ob die Form Segmente hat. |
| [IsClosed](../../aspose.psd.shapes/polygonshape/isclosed/) { get; set; } | Ruft einen Wert ab oder legt einen Wert fest, der angibt, ob die Form geschlossen ist. |
| [Points](../../aspose.psd.shapes/polygonshape/points/) { get; set; } | Holt oder setzt die Kurvenpunkte. |
| override [Segments](../../aspose.psd.shapes/polygonshape/segments/) { get; } | Ruft die Formsegmente ab. |
| virtual [StartPoint](../../aspose.psd.shapes/polygonshape/startpoint/) { get; } | Ruft den Anfangsformpunkt ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [GetBounds](../../aspose.psd.shapes/polygonshape/getbounds/#getbounds)(Matrix) | Ruft die Grenzen des Objekts ab. |
| override [GetBounds](../../aspose.psd.shapes/polygonshape/getbounds/#getbounds_1)(Matrix, Pen) | Ruft die Grenzen des Objekts ab. |
| [Reverse](../../aspose.psd.shapes/polygonshape/reverse/)() | Kehrt die Reihenfolge der Punkte für diese Form um. |
| override [Transform](../../aspose.psd.shapes/polygonshape/transform/)(Matrix) | Wendet die angegebene Transformation auf die Form an. |

### Beispiele

Dieses Beispiel erstellt ein neues Image und zeichnet eine Vielzahl von Formen mithilfe von Figures und GraphicsPath auf der Image-Oberfläche

```csharp
[C#]

//Eine Instanz von Image erstellen
using (Aspose.PSD.Image image = new Aspose.PSD.FileFormats.Psd.PsdImage(500, 500))
{
    //Eine Instanz der Graphics-Klasse erstellen und initialisieren
    Aspose.PSD.Graphics graphics = new Aspose.PSD.Graphics(image);

    //Grafikoberfläche löschen
    graphics.Clear(Color.Wheat);

    //Eine Instanz der GraphicsPath-Klasse erstellen
    Aspose.PSD.GraphicsPath graphicspath = new Aspose.PSD.GraphicsPath();

    //Eine Instanz der Figure-Klasse erstellen
    Aspose.PSD.Figure figure1 = new Aspose.PSD.Figure();

    //Shape zum Figure-Objekt hinzufügen
    figure1.AddShape(new Aspose.PSD.Shapes.EllipseShape(new RectangleF(50, 50, 300, 300)));
    figure1.AddShape(new Aspose.PSD.Shapes.PieShape(new Rectangle(new Point(110, 110), new Size(200, 200)), 0, 90));

    //Eine Instanz der Figure-Klasse erstellen
    Aspose.PSD.Figure figure2 = new Aspose.PSD.Figure();

    //Shape zum Figure-Objekt hinzufügen
    figure2.AddShape(new Aspose.PSD.Shapes.ArcShape(new RectangleF(10, 10, 300, 300), 0, 45));
    figure2.AddShape(new Aspose.PSD.Shapes.PolygonShape(new[] { new PointF(150, 10), new PointF(150, 200), new PointF(250, 300), new PointF(350, 400) }, true));
    figure2.AddShape(new Aspose.PSD.Shapes.RectangleShape(new Rectangle(new Point(250, 250), new Size(200, 200))));

    //Figure-Objekt zu GraphicsPath hinzufügen
    graphicspath.AddFigures(new[] { figure1, figure2 });

    // Pfad mit Stiftobjekt der Farbe Schwarz zeichnen
    graphics.DrawPath(new Pen(Aspose.PSD.Color.Black, 2), graphicspath);

    // Exportoptionen erstellen und initialisieren.
    Aspose.PSD.ImageOptions.BmpOptions options = new Aspose.PSD.ImageOptions.BmpOptions();

    // Alle Änderungen speichern.
    image.Save("c:\\temp\\output.bmp", options);
}
```

### Siehe auch

* class [Shape](../../aspose.psd/shape/)
* interface [IOrderedShape](../../aspose.psd/iorderedshape/)
* namensraum [Aspose.PSD.Shapes](../../aspose.psd.shapes/)
* Montage [Aspose.PSD](../../)


