---
title: "System::ComponentModel::EnumConverter sınıfı"
linktitle: "EnumConverter"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::EnumConverter sınıfı. EnumConverter kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanarak bu tipin bir örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


EnumConverter kullanan çevrilmiş kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanarak bu tipin bir örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Türlerin dönüştürülebilir olup olmadığını kontrol eder; uygulanmadı. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Türlerin dönüştürülebilir olup olmadığını kontrol eder; uygulanmadı. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Gerçek tip dönüşümünü yapar; uygulanmadı. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Gerçek tip dönüşümünü yapar; uygulanmadı. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI bilgisi. |
| [get_EnumType](./get_enumtype/)() | [EnumConverter](./) ile çalıştığı enum tipini alır; uygulanmadı. |
## Ayrıca Bakınız

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
