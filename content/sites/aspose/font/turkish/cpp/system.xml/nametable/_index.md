---
title: "System::Xml::NameTable sınıfı"
linktitle: "NameTable"
second_title: "Aspose.Font için C++"
description: "System::Xml::NameTable sınıfı. C++'da tek iş parçacıklı bir XmlNameTable uygular."
type: docs
weight: 500
url: /tr/cpp/system.xml/nametable/
---
## NameTable class


Tek iş parçacıklı bir [XmlNameTable](../xmlnametable/) uygular.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const String\&) override | Belirtilen dizeyi atomlaştırır ve [NameTable](./) içine ekler. |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Belirtilen dizeyi atomlaştırır ve [NameTable](./) içine ekler. |
| [Get](./get/)(const String\&) override | Belirtilen değere sahip atomlaştırılmış dizeyi döndürür. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomlaştırılmış dizeyi döndürür. |
| [NameTable](./nametable/)() | Yeni bir [NameTable](./) sınıf örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
