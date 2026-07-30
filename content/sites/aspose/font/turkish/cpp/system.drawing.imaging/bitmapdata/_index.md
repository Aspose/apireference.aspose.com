---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::BitmapData sınıfı. Bir bitmap görüntüsünün bir dizi özelliğini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Bir bitmap görüntüsünün bir dizi özelliğini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class BitmapData : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Height](./get_height/)() const | Görüntünün yüksekliğini piksel olarak döndürür. |
| [get_PixelFormat](./get_pixelformat/)() const | Bitmap görüntüsünün piksel biçimini döndürür. |
| [get_Scan0](./get_scan0/)() const | Bitmap'teki ilk piksel verisinin adresini döndürür. |
| [get_Stride](./get_stride/)() const | Görüntünün satır genişliğini bayt cinsinden döndürür. |
| [get_Width](./get_width/)() const | Görüntünün genişliğini piksel olarak döndürür. |
| [set_Height](./set_height/)(int) | Görüntünün yüksekliğini piksel olarak ayarlar. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Bitmap görüntüsünün piksel biçimini ayarlar. |
| [set_Scan0](./set_scan0/)(IntPtr) | Bitmap'teki ilk piksel verisinin adresini ayarlar. |
| [set_Stride](./set_stride/)(int) | Görüntünün satır genişliğini bayt cinsinden ayarlar. |
| [set_Width](./set_width/)(int) | Görüntünün genişliğini piksel olarak ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
