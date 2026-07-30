---
title: "System::Drawing::Imaging::FrameDimension sınıfı"
linktitle: "FrameDimension"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::FrameDimension sınıfı. Bir görüntünün çerçeve boyutlarını elde eden özellikler sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.drawing.imaging/framedimension/
---
## FrameDimension class


Bir görüntünün çerçeve boyutlarını elde eden özellikler sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class FrameDimension : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(FrameDimensionPtr) | Belirtilen [FrameDimension](./) nesnesinin geçerli nesneyle eşdeğer olup olmadığını belirler. |
| [FrameDimension](./framedimension/)(const System::Guid\&) | Yeni bir [FrameDimension](./) nesnesi oluşturur ve belirtilen GUID ile başlatır. |
| [get_Guid](./get_guid/)() const | Geçerli nesneyle ilişkili GUID'i döndürür. |
| static [get_Page](./get_page/)() | Sayfa boyutunu döndürür. |
| static [get_Resolution](./get_resolution/)() | Çözünürlük boyutunu döndürür. |
| static [get_Time](./get_time/)() | Zaman boyutunu döndürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
