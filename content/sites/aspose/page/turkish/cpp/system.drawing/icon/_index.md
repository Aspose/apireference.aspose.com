---
title: "System::Drawing::Icon sınıfı"
linktitle: "Simge"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Icon sınıfı. Bir Windows simgesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.drawing/icon/
---
## Icon class


Bir [Windows](../../system.windows/) simgesini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Icon : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Height](./get_height/)() const | Simgesinin yüksekliğini döndürür. |
| [get_Width](./get_width/)() const | Simgesinin genişliğini döndürür. |
| [Icon](./icon/)(const String\&) | Belirtilen dosyadan bir simgeyi temsil eden yeni bir [Icon](./) sınıfı örneği oluşturur. |
| [ToBitmap](./tobitmap/)() | Mevcut nesneyi bir [Bitmap](../bitmap/) nesnesine dönüştürür. |
| virtual [~Icon](./~icon/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
