---
title: "System::Drawing::Drawing2D::CustomLineCap sınıfı"
linktitle: "CustomLineCap"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Drawing2D::CustomLineCap sınıfı. Kullanıcı tanımlı bir çizgi ucu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Bir kullanıcı tanımlı çizgi ucunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CustomLineCap : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clone](./clone/)() | Geçerli nesnenin bir kopyasını döndürür. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Belirtilen özelliklere sahip bir kullanıcı tanımlı çizgi ucunu temsil eden [CustomLineCap](./) sınıfının yeni bir örneğini oluşturur. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [get_BaseCap](./get_basecap/)() const | Bu özel ucun oluşturulduğu temel çizgi ucunu döndürür. |
| [get_BaseInset](./get_baseinset/)() const | Çizgi ile uç arasındaki mesafeyi döndürür. |
| [get_StrokeJoin](./get_strokejoin/)() const | Bu özel ucun çizgilerinin nasıl birleştirileceğini belirleyen [LineJoin](../linejoin/) değerini döndürür. |
| [get_WidthScale](./get_widthscale/)() const | Bu özel ucun ölçeğini döndürür. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Geçerli nesne tarafından temsil edilen özel ucun başlangıç ve bitiş çizgi uçlarını alır. |
| [set_BaseCap](./set_basecap/)(LineCap) | Bu özel uc için temel çizgi ucu değerini ayarlar. |
| [set_BaseInset](./set_baseinset/)(float) | Çizgi ile uç arasındaki mesafeyi ayarlar. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Bu özel ucun çizgilerinin nasıl birleştirileceğini belirleyen [LineJoin](../linejoin/) değerini ayarlar. |
| [set_WidthScale](./set_widthscale/)(float) | Bu özel ucun ölçek değerini ayarlar. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Geçerli nesne tarafından temsil edilen özel ucun başlangıç ve bitiş çizgi uçlarını ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
