---
title: "System::StringComparer sınıfı"
linktitle: "StringComparer"
second_title: "Aspose.Font için C++"
description: "System::StringComparer sınıfı. Dizeleri farklı karşılaştırma modlarıyla karşılaştırır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 5900
url: /tr/cpp/system/stringcomparer/
---
## StringComparer class


Dizeleri farklı karşılaştırma modlarıyla karşılaştırır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | İki diziyi geçerli ayarları kullanarak karşılaştırır. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Kültüre özgü karşılaştırıcı oluşturur. |
| [Equals](./equals/)(String, String) const override | İki dizenin geçerli ayarları kullanarak eşit olup olmadığını denetler. |
| static [get_CurrentCulture](./get_currentculture/)() | Geçerli kültür karşılaştırıcı tek örnek. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Geçerli kültür büyük/küçük harf duyarsız karşılaştırıcı tek örnek. |
| static [get_InvariantCulture](./get_invariantculture/)() | Değişmez kültür karşılaştırıcı tek örnek. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Değişmez kültür büyük/küçük harf duyarsız karşılaştırıcı tek örnek. |
| static [get_Ordinal](./get_ordinal/)() | Sıralı karşılaştırıcı tek örnek. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Sıralı büyük/küçük harf duyarsız karşılaştırıcı tek örnek. |
| [GetHashCode](./gethashcode/)(String) const override | Dizenin karma kodunu alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [args_type](./args_type/) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
