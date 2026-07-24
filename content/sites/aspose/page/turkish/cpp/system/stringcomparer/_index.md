---
title: "System::StringComparer class"
linktitle: "StringComparer"
second_title: "Aspose.Page için C++"
description: "System::StringComparer sınıfı. Dizeleri farklı karşılaştırma modlarıyla karşılaştırır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya new operatörüyle bu tipin örneği oluşturulmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 5900
url: /tr/cpp/system/stringcomparer/
---
## StringComparer class


Farklı karşılaştırma modlarını kullanarak dizeleri karşılaştırır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Mevcut ayarları kullanarak iki dizeyi karşılaştırır. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Kültüre özgü karşılaştırıcı oluşturur. |
| [Equals](./equals/)(String, String) const override | Mevcut ayarları kullanarak iki dizenin eşit olup olmadığını denetler. |
| static [get_CurrentCulture](./get_currentculture/)() | Mevcut kültür karşılaştırıcı tek örnek. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Mevcut kültür büyük/küçük harf duyarsız karşılaştırıcı tek örnek. |
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
* Library [Aspose.Page for C++](../../)
