---
title: "Aspose::Font::TransformationMatrix Klasse"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TransformationMatrix Klasse. Stellt eine 3x3-Transformationsmatrix dar | A B 0 | | C D 0 | | TX TY 1 | in C++."
type: docs
weight: 3000
url: /de/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


Stellt eine 3x3-Transformationsmatrix dar | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_A](./get_a/)() const | Liefert den A-Wert der Transformationsmatrix. |
| [get_B](./get_b/)() const | Liefert den B-Wert der Transformationsmatrix. |
| [get_C](./get_c/)() const | Liefert den C-Wert der Transformationsmatrix. |
| [get_D](./get_d/)() const | Liefert den D-Wert der Transformationsmatrix. |
| [get_TX](./get_tx/)() const | Liefert den TX-Wert der Transformationsmatrix. |
| [get_TY](./get_ty/)() const | Liefert den TY-Wert der Transformationsmatrix. |
| [idx_get](./idx_get/)(int32_t) | Stellt Zugriff auf das zugrunde liegende Array bereit. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | Multipliziert mit einer anderen Transformationsmatrix. Ändert die ursprüngliche Transformationsmatrix nicht und gibt ein neues [TransformationMatrix](./)-Objekt zurück. |
| [Scale](./scale/)(double, double, double\&, double\&) | Skaliert x und y mit der Transformationsmatrix: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | Setzt den A-Wert der Transformationsmatrix. |
| [set_B](./set_b/)(double) | Setzt den B-Wert der Transformationsmatrix. |
| [set_C](./set_c/)(double) | Setzt den C-Wert der Transformationsmatrix. |
| [set_D](./set_d/)(double) | Setzt den D-Wert der Transformationsmatrix. |
| [set_TX](./set_tx/)(double) | Setzt den TX-Wert der Transformationsmatrix. |
| [set_TY](./set_ty/)(double) | Setzt den TY-Wert der Transformationsmatrix. |
| [ToArray](./toarray/)() | Allokiert ein neues Array, kopiert die Transformationsmatrix und gibt es zurück. |
| [Transform](./transform/)(double, double, double\&, double\&) | Transformiert x und y mit der Transformationsmatrix: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Erstellt eine standardmäßige 1-zu-1-Transformationsmatrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | Akzeptiert eine Transformationsmatrix mit folgender Array-Darstellung: [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | Erstellt Transformationsmatrix [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | Skaliert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | Transformiert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück. |
## Hinweise


Transformiert Koordinaten auf folgende Weise: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
