---
title: "System::Drawing::Imaging::EncoderParameter sınıfı"
linktitle: "EncoderParameter"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Imaging::EncoderParameter sınıfı. Görüntü kodlayıcıya değerleri geçirmek için kullanılan bir kapsayıcı görevi görür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Görüntü kodlayıcıya değerleri geçirmek için kullanılan bir kapsayıcı görevi görür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EncoderParameter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Bir kesri temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Tam sayı değerleri aralığını temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Kesir aralığını temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Değerler dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Değerler dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Değerler dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Kesirler dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Tam sayı aralıkları dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Kesir aralıkları dizisini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Belirtilen tampondan okunan, belirtilen tipin belirtilen sayıda değerini temsil eden yeni bir [EncoderParameter](./) sınıf örneği oluşturur. |
| [get_Encoder](./get_encoder/)() const | Geçerli [EncoderParameter](./) nesnesiyle ilişkili [Encoder](../encoder/) nesnesini döndürür. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Geçerli nesne tarafından temsil edilen değer sayısını döndürür. |
| [get_Type](./get_type/)() const | Geçerli nesne tarafından temsil edilen değer(ler)in tipini döndürür. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Belirtilen [Encoder](../encoder/) nesnesini geçerli [EncoderParameter](./) nesnesiyle ilişkilendirir. |
| [~EncoderParameter](./~encoderparameter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
