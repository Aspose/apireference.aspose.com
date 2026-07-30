---
title: "System::Runtime::Serialization::SerializationInfo sınıfı"
linktitle: "SerializationInfo"
second_title: "Aspose.Font için C++"
description: "System::Runtime::Serialization::SerializationInfo sınıfı. Serileştirilmiş nesneyi temsil eden adlandırılmış alanların bir kümesini tutar. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Serileştirilmiş nesneyi temsil eden adlandırılmış alanların bir kümesini tutar. Henüz uygulanmadı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SerializationInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Float değerini koyar. Henüz uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, short) | Short değerini koyar. Henüz uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Boolean değerini koyar. Henüz uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Nesne değerini koyar. Henüz uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Belirtilen tipte nesne değerini koyar. Henüz uygulanmadı. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | [SerializationInfo](./) deposundan bir değer alır. Henüz uygulanmadı. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
