---
title: "System::Globalization::SortVersion sınıfı"
linktitle: "SortVersion"
second_title: "Aspose.Font için C++"
description: "System::Globalization::SortVersion sınıfı. Dize karşılaştırma ve sıralama için kullanılan Unicode sürümü hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2300
url: /tr/cpp/system.globalization/sortversion/
---
## SortVersion class


Unicode sürümü hakkında, dizeleri karşılaştırmak ve sıralamak için kullanılan bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Mevcut [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını kontrol eder. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Mevcut [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını kontrol eder. |
| [get_FullVersion](./get_fullversion/)() | Tam sürüm numarasını alır. |
| [get_SortId](./get_sortid/)() | Bu nesne için benzersiz tanımlayıcıyı alır. |
| [GetHashCode](./gethashcode/)() const override | Geçerli nesne için hash kodunu alır. |
| [operator!=](./operator!=/)(const SortVersion\&) | Geçerli [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olmadığını kontrol eder. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Mevcut [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını kontrol eder. |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI bilgisi. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
