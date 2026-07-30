---
title: "System::Drawing::ImageFormatConverter sınıfı"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font için C++"
description: "System::Drawing::ImageFormatConverter sınıfı. ImageFormat nesnelerini bir veri tipinden diğerine dönüştürür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1400
url: /tr/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


ImageFormat nesnelerini bir veri tipinden diğerine dönüştürür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Nesneleri dönüştürür. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Nesneleri dönüştürür. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Nesneleri dönüştürür. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Dizgiyi nesneye dönüştürür. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Nesneyi belirli bir tipe dönüştürür. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Nesneyi belirli bir tipe dönüştürür. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Nesneyi belirli bir tipe dönüştürür. |
| [ImageFormatConverter](./imageformatconverter/)() | Yeni bir [ImageFormatConverter](./) örneği oluşturur. |
## Ayrıca Bakınız

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
