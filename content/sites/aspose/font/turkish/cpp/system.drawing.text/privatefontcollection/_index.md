---
title: "System::Drawing::Text::PrivateFontCollection sınıfı"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Text::PrivateFontCollection sınıfı. İstemci uygulaması tarafından sağlanan yazı tipi ailelerinin bir koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneği oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'da fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 300
url: /tr/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


İstemci uygulaması tarafından sağlanan yazı tipi ailelerinin bir koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya new operatörüyle bu tipin örneği oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen yazı tipini koleksiyona ekler. |
| [AddFontFile](./addfontfile/)(const String\&) | Belirtilen dosyadan bir yazı tipini koleksiyona ekler. |
| [get_Families](./get_families/)() override | Geçerli nesne tarafından temsil edilen yazı tipi koleksiyonuyla ilişkili [FontFamily](../../system.drawing/fontfamily/) nesnelerinden oluşan bir dizi döndürür. |
## Ayrıca Bakınız

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
