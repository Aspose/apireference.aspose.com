---
title: "Aspose::Font::TransformationMatrix class"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TransformationMatrix sınıfı. C++'da 3x3 dönüşüm matrisini temsil eder | A B 0 | | C D 0 | | TX TY 1 |."
type: docs
weight: 3000
url: /tr/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


3x3 dönüşüm matrisini temsil eder | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_A](./get_a/)() const | A dönüşüm matrisi değerini alır. |
| [get_B](./get_b/)() const | B dönüşüm matrisi değerini alır. |
| [get_C](./get_c/)() const | C dönüşüm matrisi değerini alır. |
| [get_D](./get_d/)() const | D dönüşüm matrisi değerini alır. |
| [get_TX](./get_tx/)() const | TX dönüşüm matrisi değerini alır. |
| [get_TY](./get_ty/)() const | TY dönüşüm matrisi değerini alır. |
| [idx_get](./idx_get/)(int32_t) | Temel diziye erişim sağlar. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | Başka bir dönüşüm matrisiyle çarpar. Orijinal dönüşüm matrisini değiştirmez, yeni bir [TransformationMatrix](./) nesnesi döndürür. |
| [Scale](./scale/)(double, double, double\&, double\&) | x ve y'yi dönüşüm matrisiyle ölçeklendirir: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | A dönüşüm matrisi değerini ayarlar. |
| [set_B](./set_b/)(double) | B dönüşüm matrisi değerini ayarlar. |
| [set_C](./set_c/)(double) | C dönüşüm matrisi değerini ayarlar. |
| [set_D](./set_d/)(double) | D dönüşüm matrisi değerini ayarlar. |
| [set_TX](./set_tx/)(double) | TX dönüşüm matrisi değerini ayarlar. |
| [set_TY](./set_ty/)(double) | TY dönüşüm matrisi değerini ayarlar. |
| [ToArray](./toarray/)() | Yeni bir dizi ayırır, dönüşüm matrisini kopyalar ve döndürür. |
| [Transform](./transform/)(double, double, double\&, double\&) | x ve y'yi dönüşüm matrisiyle dönüştürür: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Standart 1'e 1 dönüşüm matrisini oluşturur: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | Aşağıdaki dizi temsiliyle bir dönüşüm matrisini kabul eder: [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | [ A B C D TX TY ] dönüşüm matrisini oluşturur. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | x1 ve y1'i ölçek geri alır ve dönüşüm matrisinden önceki x ve y'yi döndürür. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | x1 ve y1'i geri dönüştürür ve dönüşüm matrisinden önceki x ve y'yi döndürür. |
## Açıklamalar


Koordinatları aşağıdaki şekilde dönüştürür: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
