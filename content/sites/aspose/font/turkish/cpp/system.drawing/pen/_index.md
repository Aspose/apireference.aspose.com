---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Pen sınıfı. Çizilen çizgi ve eğrilerin renk, genişlik vb. gibi özelliklerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.drawing/pen/
---
## Pen class


Çizilen çizgi ve eğrilerin renk, genişlik vb. gibi özelliklerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Pen : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Geçerli nesnenin bir kopyasını döndürür. |
| [Dispose](./dispose/)() | Mevcut nesne tarafından edinilen tüm işletim kaynaklarını serbest bırakır. |
| [get_Alignment](./get_alignment/)() const | Mevcut [Pen](./) nesnesinin hizalamasını gösteren bir değer döndürür. |
| [get_Brush](./get_brush/)() | Bu kalemin [Brush](../brush/) nesnesini döndürür. |
| [get_Color](./get_color/)() const | Bu kalemin rengini döndürür. |
| [get_CompoundArray](./get_compoundarray/)() const | Bileşik bir kalemi belirten değerler dizisini döndürür. |
| [get_DashCap](./get_dashcap/)() const | Kesikli bir çizginin her iki ucunda kullanılan ucu gösteren bir değer döndürür. |
| [get_DashOffset](./get_dashoffset/)() const | Bir çizginin başlangıcından kesik desenin başlangıcına olan mesafeyi döndürür. |
| [get_DashPattern](./get_dashpattern/)() const | Kesikli bir çizgide özel kesik desenini gösteren bir dizi döndürür. |
| [get_DashStyle](./get_dashstyle/)() const | Geçerli [Pen](./) nesnesinin tire stilini gösteren bir değer döndürür. |
| [get_EndCap](./get_endcap/)() const | Geçerli [Pen](./) nesnesinin bitiş çizgi ucunu gösteren bir değer döndürür. |
| [get_LineJoin](./get_linejoin/)() const | Bu [Pen](./) nesnesi tarafından çizilen çizgilerin nasıl birleştirildiğini gösteren bir değer döndürür. |
| [get_MiterLimit](./get_miterlimit/)() const | Köşeli bir köşedeki birleşim kalınlığının sınırını döndürür. |
| [get_PenType](./get_pentype/)() const | UYGULANMADI. |
| [get_StartCap](./get_startcap/)() const | Geçerli [Pen](./) nesnesinin başlangıç çizgi ucunu gösteren bir değer döndürür. |
| [get_Transform](./get_transform/)() | Geçerli nesne tarafından temsil edilen kalem için geometrik dönüşümleri belirten bir Matrix nesnesinin kopyasını döndürür. |
| [get_Width](./get_width/)() const | Geçerli [Pen](./) nesnesinin genişliğini döndürür. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Geçerli nesnenin dönüşüm matrisini belirtilen matrisle çarpar. |
| [Pen](./pen/)(const Color\&) | Belirtilen rengi temsil eden yeni bir [Pen](./) nesnesi oluşturur. |
| [Pen](./pen/)(const Color\&, float) | Belirtilen renk ve genişliği temsil eden yeni bir [Pen](./) nesnesi oluşturur. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Yeni bir [Pen](./) nesnesi oluşturur ve belirtilen [Brush](../brush/) nesnesiyle başlatır. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Yeni bir [Pen](./) nesnesi oluşturur ve belirtilen [Brush](../brush/) nesnesiyle başlatır. |
| [ResetTransform](./resettransform/)() | Geçerli nesnenin dönüşüm matrisini bir birim (identity) matris haline gelecek şekilde sıfırlar. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen açıyla ve belirtilen sırayla döndürür. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen faktörlerle ve belirtilen sırayla ölçeklendirir. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Geçerli [Pen](./) nesnesinin hizalamasını ayarlar. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Bu kalemin [Brush](../brush/) nesnesini ayarlar. |
| [set_Color](./set_color/)(const Color\&) | Bu kalemin rengini ayarlar. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Bir bileşik kalemi belirten değerler dizisini ayarlar. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Özel bitiş çizgi ucunu ayarlar. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Özel başlangıç çizgi ucunu ayarlar. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Kesikli bir çizginin her iki ucunda kullanılan ucu belirten bir değeri ayarlar. |
| [set_DashOffset](./set_dashoffset/)(float) | Bir çizginin başlangıcından tire deseninin başlangıcına olan mesafeyi ayarlar. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Kesikli bir çizgide özel tire desenini belirten bir dizi ayarlar. Dizi, dönüşümlü tire ve boşluk uzunluklarını belirten sayılardan oluşur. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Geçerli [Pen](./) nesnesinin tire stilini belirten bir değeri ayarlar. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Geçerli [Pen](./) nesnesinin bitiş çizgi ucunu ayarlar. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Bu [Pen](./) nesnesi tarafından çizilen çizgilerin nasıl birleştirildiğini belirten bir değeri ayarlar. |
| [set_MiterLimit](./set_miterlimit/)(float) | Köşeli bir köşedeki birleşim kalınlığının sınırını ayarlar. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Geçerli [Pen](./) nesnesinin başlangıç çizgi ucunu ayarlar. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Geçerli nesne tarafından temsil edilen kalem için geometrik dönüşümleri belirten bir Matrix nesnesi ayarlar. |
| [set_Width](./set_width/)(float) | Geçerli [Pen](./) nesnesinin genişliğini ayarlar. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | UYGULANMADI. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen boyutlarla ve belirtilen sırayla çevirir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
