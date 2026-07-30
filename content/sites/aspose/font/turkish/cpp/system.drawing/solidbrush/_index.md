---
title: "System::Drawing::SolidBrush sınıfı"
linktitle: "SolidBrush"
second_title: "Aspose.Font için C++"
description: "System::Drawing::SolidBrush sınıfı. Tek renkli bir fırçayı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.drawing/solidbrush/
---
## SolidBrush class


Tek renkli bir fırçayı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SolidBrush : public System::Drawing::Brush
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını oluşturur. |
| [get_Color](./get_color/)() const | Bu fırçanın rengini döndürür. |
| [set_Color](./set_color/)(Color) | Bu fırçanın rengini ayarlar. |
| [SolidBrush](./solidbrush/)(const Color\&) | Yeni bir [SolidBrush](./) nesnesi oluşturur ve belirtilen renk ile başlatır. |
## Ayrıca Bakınız

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
