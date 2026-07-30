---
title: "System::Drawing::Drawing2D::LinearGradientBrush class"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush class. Rappresenta un pennello a gradiente lineare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Rappresenta un pennello a gradiente lineare. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia dell'oggetto corrente. |
| [get_Blend](./get_blend/)() const | Restituisce una sfumatura che specifica i fattori e le posizioni dei colori di base per questo pennello. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Restituisce un valore che indica che la correzione gamma è abilitata per questo pennello. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Restituisce un oggetto [ColorBlend](../colorblend/) che definisce un gradiente lineare multicolore. |
| [get_LinearColors](./get_linearcolors/)() const | Restituisce i colori di inizio e fine di questo gradiente. |
| [get_Rectangle](./get_rectangle/)() | Restituisce un rettangolo di delimitazione. |
| [get_Transform](./get_transform/)() const | Restituisce una copia di un oggetto [Matrix](../matrix/) che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [get_WrapMode](./get_wrapmode/)() const | Restituisce la modalità di avvolgimento. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | Informazioni RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Costruisce una nuova istanza di [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Costruisce una nuova istanza di [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Costruisce una nuova istanza di [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Costruisce una nuova istanza di [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Costruisce una nuova istanza di [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Moltiplica la matrice di trasformazione dell'oggetto corrente per la matrice specificata. |
| [ResetTransform](./resettransform/)() | Reimposta la matrice di trasformazione dell'oggetto corrente. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Ruota la matrice di trasformazione dell'oggetto corrente. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Scala la matrice di trasformazione dell'oggetto corrente. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Imposta una sfumatura che specifica i fattori e le posizioni dei colori di base per questo pennello. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Imposta lo stato della correzione gamma per questo pennello. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Imposta un oggetto [ColorBlend](../colorblend/) che definisce una sfumatura lineare multicolore. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Imposta i colori di partenza e di fine di questa sfumatura. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Imposta un oggetto [Matrix](../matrix/) che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Imposta la modalità di avvolgimento. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NON IMPLEMENTATO. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NON IMPLEMENTATO. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Trasla la matrice di trasformazione dell'oggetto corrente. |
## Vedi anche

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
