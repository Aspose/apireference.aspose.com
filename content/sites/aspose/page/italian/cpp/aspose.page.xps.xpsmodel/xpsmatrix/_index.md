---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix classe"
linktitle: "XpsMatrix"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix classe. Classe che incapsula le caratteristiche dell'elemento proprietà MatrixTransform. Questo elemento definisce una trasformazione matriciale affine arbitraria utilizzata per manipolare i sistemi di coordinate degli elementi in C++."
type: docs
weight: 2600
url: /it/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Classe che incapsula le funzionalità dell'elemento proprietà MatrixTransform. Questo elemento definisce una trasformazione matriciale affine arbitraria usata per manipolare i sistemi di coordinate degli elementi.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Clona questa matrice di trasformazione. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se l'oggetto specificato [System::Object](../../system/object/) è uguale a questa istanza. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | L'implementazione reale. |
| [get_IsIdentity](./get_isidentity/)() | Restituisce un valore che indica se questa istanza è la matrice identità. |
| [get_M11](./get_m11/)() | Restituisce l'elemento M11. |
| [get_M12](./get_m12/)() | Restituisce l'elemento M12. |
| [get_M21](./get_m21/)() | Restituisce l'elemento M21. |
| [get_M22](./get_m22/)() | Restituisce l'elemento M22. |
| [get_M31](./get_m31/)() | Restituisce l'elemento M31. |
| [get_M32](./get_m32/)() | Restituisce l'elemento M32. |
| [GetHashCode](./gethashcode/)() const override | Restituisce un codice hash per questa istanza. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Moltiplica questa matrice per la matrice specificata da *matrix* nell'ordine specificato da *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Moltiplica questa matrice per la matrice specificata da *matrix* nell'ordine predefinito (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Moltiplica questa matrice per la matrice specificata da *matrix* nell'ordine specificato da *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Moltiplica questa matrice per la matrice specificata da *matrix* nell'ordine predefinito (Prepend). |
| [Reset](./reset/)() | Ripristina questa Matrix alla matrice identità. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Applica una rotazione in senso orario di *angle* a questa Matrix nell'ordine specificato da *matrixOrder*. |
| [Rotate](./rotate/)(float) | Applica una rotazione in senso orario di *angle* a questa Matrix nell'ordine predefinito (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Applica una rotazione in senso orario di *angle* attorno a *pivot* a questa Matrix nell'ordine specificato da *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Applica una rotazione in senso orario di *angle* attorno a *pivot* a questa Matrix nell'ordine predefinito (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrix nell'ordine specificato da *matrixOrder*. |
| [Scale](./scale/)(float, float) | Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrix nell'ordine predefinito (Prepend). |
| [Skew](./skew/)(double, double) | Applica la trasformazione di inclinazione specificata a questa Matrix. |
| [ToString](./tostring/)() const override | Restituisce la rappresentazione stringa di questa istanza di [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | Applica la trasformazione affine rappresentata da questa Matrix a un rettangolo specificato. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Applica la trasformazione affine rappresentata da questa Matrix a un punto specificato. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Applica la trasformazione affine rappresentata da questa Matrix a una parte specificata di un array di punti. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Applica la trasformazione affine rappresentata da questa Matrix a un array di punti specificato. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Applica il vettore di traslazione specificato a questa Matrix nell'ordine specificato da *matrixOrder*. |
| [Translate](./translate/)(float, float) | Applica il vettore di traslazione specificato a questa Matrix. |
## Vedi anche

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
