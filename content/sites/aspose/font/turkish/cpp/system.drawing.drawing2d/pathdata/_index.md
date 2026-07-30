---
title: "System::Drawing::Drawing2D::PathData sınıfı"
linktitle: "PathData"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Drawing2D::PathData sınıfı. Bir yolu temsil eden grafik verileri içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


Bir yolu temsil eden grafik verileri içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PathData : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Points](./get_points/)() | Bir yolu oluşturan noktaları içeren bir dizi döndürür. |
| [get_Types](./get_types/)() | **Points** dizisindeki ilgili noktaların türlerini belirten değerleri içeren bir dizi döndürür. |
| [PathData](./pathdata/)() | Boş bir [PathData](./) nesnesi oluşturur. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | Bir yol oluşturan noktaları içeren bir dizi ayarlar. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | **Points** dizisindeki ilgili noktaların türlerini belirten değerleri içeren bir dizi ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
