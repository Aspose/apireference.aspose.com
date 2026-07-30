---
title: "System::ComponentModel::PropertyChangedEventArgs sınıfı"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::PropertyChangedEventArgs sınıfı. PropertyChanged olayı argümanları. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanarak bu tipin bir örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


PropertyChanged olayının argümanları. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanarak bu tipin bir örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI bilgisi. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | PropertyChanged olay argümanlarını başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
