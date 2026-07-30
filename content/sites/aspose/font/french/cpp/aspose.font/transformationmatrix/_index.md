---
title: "classe Aspose::Font::TransformationMatrix"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::TransformationMatrix. Représente une matrice de transformation 3x3 | A B 0 | | C D 0 | | TX TY 1 | en C++."
type: docs
weight: 3000
url: /fr/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


Représente une matrice de transformation 3x3 | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_A](./get_a/)() const | Obtient la valeur A de la matrice de transformation. |
| [get_B](./get_b/)() const | Obtient la valeur B de la matrice de transformation. |
| [get_C](./get_c/)() const | Obtient la valeur C de la matrice de transformation. |
| [get_D](./get_d/)() const | Obtient la valeur D de la matrice de transformation. |
| [get_TX](./get_tx/)() const | Obtient la valeur TX de la matrice de transformation. |
| [get_TY](./get_ty/)() const | Obtient la valeur de la matrice de transformation TY. |
| [idx_get](./idx_get/)(int32_t) | Fournit l'accès au tableau sous-jacent. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | Multiplie avec une autre matrice de transformation. Ne modifie pas la matrice de transformation originale, renvoie un nouvel objet [TransformationMatrix](./). |
| [Scale](./scale/)(double, double, double\&, double\&) | Mise à l'échelle de x et y avec la matrice de transformation : x1 = A*x + C*y ; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | Définit la valeur de la matrice de transformation A. |
| [set_B](./set_b/)(double) | Définit la valeur de la matrice de transformation B. |
| [set_C](./set_c/)(double) | Définit la valeur de la matrice de transformation C. |
| [set_D](./set_d/)(double) | Définit la valeur de la matrice de transformation D. |
| [set_TX](./set_tx/)(double) | Définit la valeur de la matrice de transformation TX. |
| [set_TY](./set_ty/)(double) | Définit la valeur de la matrice de transformation TY. |
| [ToArray](./toarray/)() | Alloue un nouveau tableau, copie la matrice de transformation et le renvoie. |
| [Transform](./transform/)(double, double, double\&, double\&) | Transforme x et y avec la matrice de transformation : x1 = A*x + C*y + TX ; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Crée une matrice de transformation standard 1 à 1 : [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | Accepte une matrice de transformation avec la représentation de tableau suivante : [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | Crée la matrice de transformation [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | Restaure l'échelle de x1 et y1 et renvoie x et y avant la matrice de transformation. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | Inverse la transformation de x1 et y1 et renvoie x et y avant la matrice de transformation. |
## Remarques


Transforme les coordonnées de la manière suivante : x1 = A*x + C*y + TX ; y1 = B*x + D*y + TY.
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
