---
title: "System::Drawing::Imaging::EncoderParameter sınıfı"
linktitle: "EncoderParameter"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::EncoderParameter sınıfı. Bir görüntü kodlayıcıya değerleri geçirmek için kullanılan bir kapsayıcı görevi görür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Bir görüntü kodlayıcıya değerleri geçirmek için kullanılan bir kapsayıcı görevi görür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EncoderParameter : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | [EncoderParameter](./) sınıfının bir kesri temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | [EncoderParameter](./) sınıfının tam sayı değerleri aralığını temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | [EncoderParameter](./) sınıfının kesir aralığını temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | [EncoderParameter](./) sınıfının yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | [EncoderParameter](./) sınıfının değerler dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | [EncoderParameter](./) sınıfının değerler dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | [EncoderParameter](./) sınıfının değerler dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | [EncoderParameter](./) sınıfının kesirler dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | [EncoderParameter](./) sınıfının tam sayı aralıkları dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | [EncoderParameter](./) sınıfının kesir aralıkları dizisini temsil eden yeni bir örneğini oluşturur. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | [EncoderParameter](./) sınıfının belirtilen tampondan okunan, belirtilen tipteki belirtilen sayıda değeri temsil eden yeni bir örneğini oluşturur. |
| [get_Encoder](./get_encoder/)() const | Geçerli [Encoder](../encoder/) nesnesiyle ilişkili [EncoderParameter](./) nesnesini döndürür. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Geçerli nesne tarafından temsil edilen değerin sayısını döndürür. |
| [get_Type](./get_type/)() const | Geçerli nesne tarafından temsil edilen değer(ler)in tipini döndürür. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Belirtilen [Encoder](../encoder/) nesnesini geçerli [EncoderParameter](./) nesnesiyle ilişkilendirir. |
| [~EncoderParameter](./~encoderparameter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
