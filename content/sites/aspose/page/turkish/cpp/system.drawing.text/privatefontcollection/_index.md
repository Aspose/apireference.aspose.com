---
title: "System::Drawing::Text::PrivateFontCollection sınıfı"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Text::PrivateFontCollection sınıfı. İstemci uygulaması tarafından sağlanan yazı tipi ailelerinin bir koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


İstemci uygulaması tarafından sağlanan yazı tipi ailelerinin bir koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen yazı tipini koleksiyona ekler. |
| [AddFontFile](./addfontfile/)(const String\&) | Belirtilen dosyadan bir yazı tipini koleksiyona ekler. |
| [get_Families](./get_families/)() override | Geçerli nesne tarafından temsil edilen yazı tipi koleksiyonu ile ilişkili [FontFamily](../../system.drawing/fontfamily/) nesnelerinin bir dizisini döndürür. |
## Ayrıca Bakınız

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
