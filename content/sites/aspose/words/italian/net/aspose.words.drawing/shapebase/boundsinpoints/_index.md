---
title: ShapeBase.BoundsInPoints
linktitle: BoundsInPoints
articleTitle: BoundsInPoints
second_title: Aspose.Words per .NET
description: ShapeBase BoundsInPoints proprietà. Ottiene la posizione e la dimensione del blocco contenitore della forma in punti rispetto allancoraggio della forma più in alto in C#.
type: docs
weight: 80
url: /it/net/aspose.words.drawing/shapebase/boundsinpoints/
---
## ShapeBase.BoundsInPoints property

Ottiene la posizione e la dimensione del blocco contenitore della forma in punti, rispetto all'ancoraggio della forma più in alto.

```csharp
public RectangleF BoundsInPoints { get; }
```

## Esempi

Mostra come verificare la forma contenente i limiti del blocco.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertShape(ShapeType.Line, RelativeHorizontalPosition.LeftMargin, 50,
    RelativeVerticalPosition.TopMargin, 50, 100, 100, WrapType.None);
shape.StrokeColor = Color.Orange;

// Anche se la riga stessa occupa poco spazio sulla pagina del documento,
// occupa un blocco contenitore rettangolare, la cui dimensione possiamo determinare utilizzando le proprietà "Bounds".
Assert.AreEqual(new RectangleF(50, 50, 100, 100), shape.Bounds);
Assert.AreEqual(new RectangleF(50, 50, 100, 100), shape.BoundsInPoints);

// Crea una forma di gruppo, quindi imposta la dimensione del blocco che lo contiene utilizzando la proprietà "Bounds".
GroupShape group = new GroupShape(doc);
group.Bounds = new RectangleF(0, 100, 250, 250);

Assert.AreEqual(new RectangleF(0, 100, 250, 250), group.BoundsInPoints);

// Crea un rettangolo, verifica la dimensione del blocco di delimitazione, quindi aggiungilo alla forma del gruppo.
shape = new Shape(doc, ShapeType.Rectangle)
{
    Width = 100,
    Height = 100,
    Left = 700,
    Top = 700
};

Assert.AreEqual(new RectangleF(700, 700, 100, 100), shape.BoundsInPoints);

group.AppendChild(shape);

// Il piano delle coordinate della forma del gruppo ha la sua origine nell'angolo in alto a sinistra del blocco che lo contiene,
// e le coordinate xey di (1000, 1000) nell'angolo in basso a destra.
// La forma del nostro gruppo ha una dimensione di 250x250 pt, quindi ogni 4 punti sul piano delle coordinate della forma del gruppo
// si traduce in 1pt nel piano delle coordinate del corpo del documento.
// Ogni forma che inseriamo si ridurrà anche di dimensioni di un fattore 4.
// La modifica nella proprietà "BoundsInPoints" della forma rifletterà questo.
Assert.AreEqual(new RectangleF(175, 275, 25, 25), shape.BoundsInPoints);

doc.FirstSection.Body.FirstParagraph.AppendChild(group);

// Inserisci una forma e posizionala all'esterno dei limiti del blocco contenitore della forma del gruppo.
shape = new Shape(doc, ShapeType.Rectangle)
{
    Width = 100,
    Height = 100,
    Left = 1000,
    Top = 1000
};

group.AppendChild(shape);

// L'impronta della forma del gruppo nel corpo del documento è aumentata, ma il blocco contenitore rimane lo stesso.
Assert.AreEqual(new RectangleF(0, 100, 250, 250), group.BoundsInPoints);
Assert.AreEqual(new RectangleF(250, 350, 25, 25), shape.BoundsInPoints);

doc.Save(ArtifactsDir + "Shape.Bounds.docx");
```

### Guarda anche

* class [ShapeBase](../)
* spazio dei nomi [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assemblea [Aspose.Words](../../../)
