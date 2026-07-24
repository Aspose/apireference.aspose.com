---
title: "System::ComponentModel::TypeDescriptor sınıfı"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::TypeDescriptor sınıfı. Çeviriden sonra TypeDescriptor kullanan kodun derlenebilmesi için sahte (dummy) sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


Türkçeye çevrildikten sonra derlenebilmesi için TypeDescriptor kullanan kod için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

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
* Library [Aspose.Page for C++](../../)
