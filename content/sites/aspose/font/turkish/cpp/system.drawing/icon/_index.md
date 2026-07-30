---
title: "System::Drawing::Icon sınıfı"
linktitle: "Icon"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Icon sınıfı. Bir Windows simgesini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.drawing/icon/
---
## Icon class


Bir [Windows](../../system.windows/) simgesini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Icon : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Height](./get_height/)() const | Simgesinin yüksekliğini döndürür. |
| [get_Width](./get_width/)() const | Simgesinin genişliğini döndürür. |
| [Icon](./icon/)(const String\&) | Belirtilen dosyadan bir simgeyi temsil eden yeni bir [Icon](./) sınıf örneği oluşturur. |
| [ToBitmap](./tobitmap/)() | Geçerli nesneyi bir [Bitmap](../bitmap/) nesnesine dönüştürür. |
| virtual [~Icon](./~icon/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
