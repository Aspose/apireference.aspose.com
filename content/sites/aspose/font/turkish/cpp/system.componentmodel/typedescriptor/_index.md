---
title: "System::ComponentModel::TypeDescriptor class"
linktitle: "TypeDescriptor"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::TypeDescriptor sınıfı. Çeviriden sonra TypeDescriptor kullanan kodun derlenebilmesi için sahte (dummy) sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1500
url: /tr/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


Çeviriden sonra TypeDescriptor kullanan kodun derlenebilmesi için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class TypeDescriptor : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
