---
title: "System::Runtime::Serialization::SerializationInfo sınıfı"
linktitle: "SerializationInfo"
second_title: "Aspose.Page için C++"
description: "System::Runtime::Serialization::SerializationInfo sınıfı. Serileştirilmiş nesneyi temsil eden adlandırılmış alanların bir kümesini tutar. Uygulanmamıştır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu türün örneği yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın C++'da."
type: docs
weight: 400
url: /tr/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Serileştirilmiş nesneyi temsil eden adlandırılmış alanların bir kümesini tutar. Uygulanmadı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SerializationInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Float değer koyar. Uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, short) | Short değer koyar. Uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Boolean değer koyar. Uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Nesne değerini koyar. Uygulanmadı. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Belirtilen tipte nesne değerini koyar. Uygulanmadı. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Bir değeri [SerializationInfo](./) deposundan alır. Uygulanmadı. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
