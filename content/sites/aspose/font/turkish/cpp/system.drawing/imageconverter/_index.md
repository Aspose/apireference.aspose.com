---
title: "System::Drawing::ImageConverter sınıfı"
linktitle: "ImageConverter"
second_title: "Aspose.Font için C++"
description: "System::Drawing::ImageConverter sınıfı. Image nesnelerini bir veri tipinden diğerine dönüştürür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Converts [Image](../image/) nesnelerini bir veri tipinden diğerine dönüştürür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Nesneyi belirli bir tipe dönüştürür. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Nesneyi belirli bir tipe dönüştürür. |
| [ImageConverter](./imageconverter/)() | Yeni bir [ImageConverter](./) örneği oluşturur. |
## Ayrıca Bakınız

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
