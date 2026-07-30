---
title: "System::ComponentModel::TypeConverter class"
linktitle: "TypeConverter"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::TypeConverter class. Bileşen modelinde tür dönüşümünü yöneten sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1400
url: /tr/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Component modelinde tür dönüşümünü yöneten sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class TypeConverter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Nesneleri dönüştürür. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Nesneleri dönüştürür. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Dizgiyi nesneye dönüştürür. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Değişmez dizeyi nesneye dönüştürür. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Değişmez dizeyi nesneye dönüştürür. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Dizgiyi nesneye dönüştürür. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Dizgiyi nesneye dönüştürür. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Dizgiyi nesneye dönüştürür. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Nesneyi belirli bir tipe dönüştürür. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Nesneyi belirli bir tipe dönüştürür. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Nesneyi değişmez dizeye dönüştürür. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Nesneyi değişmez dizeye dönüştürür. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Nesneyi dizeye dönüştürür. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Nesneyi dizeye dönüştürür. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Nesneyi dizeye dönüştürür. |
| [TypeConverter](./typeconverter/)() | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
