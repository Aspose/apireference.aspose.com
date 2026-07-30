---
title: "System::Drawing::Text::FontCollection sınıfı"
linktitle: "FontCollection"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Text::FontCollection sınıfı. Yüklü ve özel yazı tipi koleksiyonları için temel bir sınıftır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.drawing.text/fontcollection/
---
## FontCollection class


Yüklü ve özel yazı tipi koleksiyonları için temel bir sınıftır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FontCollection : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Mevcut nesne tarafından edinilen işletim sistemi kaynaklarını serbest bırakır. |
| virtual [get_Families](./get_families/)() | Geçerli nesne tarafından temsil edilen yazı tipi koleksiyonuyla ilişkili [FontFamily](../../system.drawing/fontfamily/) nesnelerinden oluşan bir dizi döndürür. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
