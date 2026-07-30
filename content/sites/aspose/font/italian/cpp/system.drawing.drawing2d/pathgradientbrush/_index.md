---
title: "System::Drawing::Drawing2D::PathGradientBrush classe"
linktitle: "PathGradientBrush"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::PathGradientBrush classe. Rappresenta un pennello che riempie l'interno di un oggetto GraphicsPath con una sfumatura. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Rappresenta un pennello che riempie l'interno di un oggetto [GraphicsPath](../graphicspath/) con una sfumatura. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia dell'oggetto corrente. |
| [get_Blend](./get_blend/)() const | NON IMPLEMENTATO. |
| [get_CenterColor](./get_centercolor/)() const | Restituisce un colore che si trova al centro del percorso riempito dall'oggetto corrente. |
| [get_CenterPoint](./get_centerpoint/)() const | Ottiene il punto centrale della sfumatura. |
| [get_FocusScales](./get_focusscales/)() const | Ottiene il punto focale per la caduta della sfumatura. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Restituisce un valore che definisce una sfumatura lineare multicolore. |
| [get_Rectangle](./get_rectangle/)() | NON IMPLEMENTATO. |
| [get_SurroundColors](./get_surroundcolors/)() const | Restituisce i colori che corrispondono ai punti nel percorso che questo [PathGradientBrush](./) riempie. |
| [get_Transform](./get_transform/)() const | Restituisce una copia di un oggetto [Matrix](../matrix/) che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [get_WrapMode](./get_wrapmode/)() const | Restituisce la modalità di avvolgimento. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Moltiplica la matrice di trasformazione dell'oggetto corrente per la matrice specificata. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | Informazioni RTTI. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Costruisce una nuova istanza della classe [PathGradientBrush](./). |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Costruisce una nuova istanza della classe [PathGradientBrush](./). |
| [ResetTransform](./resettransform/)() | Reimposta la matrice di trasformazione dell'oggetto corrente affinché diventi una matrice identità. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Ruota la trasformazione geometrica locale dell'angolo specificato nell'ordine specificato. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Scala la trasformazione geometrica locale dei fattori specificati nell'ordine specificato. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Imposta una sfumatura che specifica i fattori e le posizioni dei colori di base per questo pennello. |
| [set_CenterColor](./set_centercolor/)(Color) | Imposta un colore che si trova al centro del percorso riempito dall'oggetto corrente. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Imposta il punto centrale della sfumatura. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Imposta il punto focale per la caduta della sfumatura. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Imposta un valore che definisce una sfumatura lineare multicolore. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Imposta i colori che corrispondono ai punti nel percorso che questo [PathGradientBrush](./) riempie. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Imposta un oggetto [Matrix](../matrix/) che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Imposta la modalità di avvolgimento. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NON IMPLEMENTATO. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NON IMPLEMENTATO. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Trasla la trasformazione geometrica locale delle dimensioni specificate nell'ordine specificato. |
## Vedi anche

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
