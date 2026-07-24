---
title: "System::Globalization::SortVersion sınıfı"
linktitle: "SortVersion"
second_title: "Aspose.Page için C++"
description: "System::Globalization::SortVersion sınıfı. Unicode sürümü hakkında, dize karşılaştırma ve sıralama için kullanılan bilgileri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2300
url: /tr/cpp/system.globalization/sortversion/
---
## SortVersion class


Unicode sürümü hakkında, dize karşılaştırma ve sıralama için kullanılan bilgileri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Geçerli [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını denetler. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Geçerli [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını denetler. |
| [get_FullVersion](./get_fullversion/)() | Tam sürüm numarasını alır. |
| [get_SortId](./get_sortid/)() | Bu nesne için benzersiz tanımlayıcıyı alır. |
| [GetHashCode](./gethashcode/)() const override | Geçerli nesne için karma kodunu alır. |
| [operator!=](./operator!=/)(const SortVersion\&) | Geçerli [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olmadığını kontrol eder. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Geçerli [SortVersion](./) örneğinin belirtilen [SortVersion](./) nesnesine eşit olup olmadığını denetler. |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI bilgisi. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
