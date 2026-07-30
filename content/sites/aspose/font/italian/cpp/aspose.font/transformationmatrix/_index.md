---
title: "Aspose::Font::TransformationMatrix classe"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TransformationMatrix classe. Rappresenta una matrice di trasformazione 3x3 | A B 0 | | C D 0 | | TX TY 1 | in C++."
type: docs
weight: 3000
url: /it/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


Rappresenta una matrice di trasformazione 3x3 | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_A](./get_a/)() const | Ottiene il valore A della matrice di trasformazione. |
| [get_B](./get_b/)() const | Ottiene il valore B della matrice di trasformazione. |
| [get_C](./get_c/)() const | Ottiene il valore C della matrice di trasformazione. |
| [get_D](./get_d/)() const | Ottiene il valore D della matrice di trasformazione. |
| [get_TX](./get_tx/)() const | Ottiene il valore TX della matrice di trasformazione. |
| [get_TY](./get_ty/)() const | Ottiene il valore TY della matrice di trasformazione. |
| [idx_get](./idx_get/)(int32_t) | Fornisce l'accesso all'array sottostante. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | Moltiplica con un'altra matrice di trasformazione. Non modifica la matrice di trasformazione originale, restituisce un nuovo oggetto [TransformationMatrix](./). |
| [Scale](./scale/)(double, double, double\&, double\&) | Scala x e y con la matrice di trasformazione: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | Imposta il valore A della matrice di trasformazione. |
| [set_B](./set_b/)(double) | Imposta il valore B della matrice di trasformazione. |
| [set_C](./set_c/)(double) | Imposta il valore C della matrice di trasformazione. |
| [set_D](./set_d/)(double) | Imposta il valore D della matrice di trasformazione. |
| [set_TX](./set_tx/)(double) | Imposta il valore TX della matrice di trasformazione. |
| [set_TY](./set_ty/)(double) | Imposta il valore TY della matrice di trasformazione. |
| [ToArray](./toarray/)() | Alloca un nuovo array, copia la matrice di trasformazione e la restituisce. |
| [Transform](./transform/)(double, double, double\&, double\&) | Trasforma x e y con la matrice di trasformazione: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Crea una matrice di trasformazione standard 1 a 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | Accetta una matrice di trasformazione con la seguente rappresentazione di array: [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | Crea la matrice di trasformazione [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | Scala indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | Trasforma indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione. |
## Osservazioni


Trasforma le coordinate nel modo seguente: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
