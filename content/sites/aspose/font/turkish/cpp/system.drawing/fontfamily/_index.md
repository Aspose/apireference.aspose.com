---
title: "System::Drawing::FontFamily sınıfı"
linktitle: "FontFamily"
second_title: "Aspose.Font için C++"
description: "System::Drawing::FontFamily sınıfı. Benzer temel tasarımı paylaşan bir grup yazı tipini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 900
url: /tr/cpp/system.drawing/fontfamily/
---
## FontFamily class


Benzer temel tasarımı paylaşan bir grup yazı tipini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class FontFamily : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Geçerli [FontFamily](./) nesnesinin bir kopyasını döndürür. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Geçerli ve belirtilen nesnelerin aynı olup olmadığını belirler. |
| [FontFamily](./fontfamily/)(const String\&) | Belirtilen adla bir yazı tipi ailesini temsil eden yeni bir [FontFamily](./) sınıf örneği oluşturur. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Belirtilen adla belirtilen FontCollection içinde yeni bir [FontFamily](./) örneği oluşturur. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Belirtilen genel yazı tipi ailesinden yeni bir [FontFamily](./) örneği oluşturur. |
| static [get_Families](./get_families/)() | Geçerli grafik bağlamıyla ilişkili tüm [FontFamily](./) nesnelerini içeren bir dizi döndürür. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Genel Monospace yazı tipi ailesini temsil eden bir [FontFamily](./) nesnesi döndürür. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Genel Sans Serif yazı tipi ailesini temsil eden bir [FontFamily](./) nesnesi döndürür. |
| static [get_GenericSerif](./get_genericserif/)() | Genel Serif yazı tipi ailesini temsil eden bir [FontFamily](./) nesnesi döndürür. |
| [get_Name](./get_name/)() const | Geçerli nesne tarafından temsil edilen yazı tipi ailesinin adını döndürür. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Belirtilen yazı tipi stili için geçerli nesne tarafından temsil edilen yazı tipi ailesinin hücre yükselişini döndürür. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Belirtilen yazı tipi stili için geçerli nesne tarafından temsil edilen yazı tipi ailesinin hücre alçalmasını döndürür. |
| [GetEmHeight](./getemheight/)(FontStyle) | Belirtilen stil için yazı tipi tasarım birimlerinde em karesinin yüksekliğini döndürür. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Belirtilen yazı tipi stili için geçerli nesne tarafından temsil edilen yazı tipi ailesinin satır aralığını döndürür. |
| [GetName](./getname/)(int) const | Geçerli nesne tarafından temsil edilen yazı tipi ailesinin adını döndürür. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Belirtilen yazı tipi stilinin mevcut olup olmadığını belirler. |
| virtual [~FontFamily](./~fontfamily/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
