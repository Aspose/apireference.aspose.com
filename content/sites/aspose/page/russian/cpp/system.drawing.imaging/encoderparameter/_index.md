---
title: "Класс System::Drawing::Imaging::EncoderParameter"
linktitle: "EncoderParameter"
second_title: "Aspose.Page для C++"
description: "Класс System::Drawing::Imaging::EncoderParameter. Служит контейнером, используемым для передачи значений кодировщику изображения. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 600
url: /ru/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Служит контейнером, используемым для передачи значений кодировщику изображения. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class EncoderParameter : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий дробь. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий диапазон целочисленных значений. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий диапазон дробей. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Создаёт новый экземпляр класса [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий массив значений. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий массив значений. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий массив значений. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий массив дробей. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Создаёт новый экземпляр класса [EncoderParameter](./), представляющий массив диапазонов целых чисел. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Создает новый экземпляр класса [EncoderParameter](./), представляющий массив диапазонов дробей. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Создает новый экземпляр класса [EncoderParameter](./), представляющий указанное количество значений указанного типа, считываемых из указанного буфера. |
| [get_Encoder](./get_encoder/)() const | Возвращает объект [Encoder](../encoder/), связанный с текущим объектом [EncoderParameter](./). |
| [get_NumberOfValues](./get_numberofvalues/)() const | Возвращает количество значений, представленных текущим объектом. |
| [get_Type](./get_type/)() const | Возвращает тип значений, представленных текущим объектом. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Связывает указанный объект [Encoder](../encoder/) с текущим объектом [EncoderParameter](./). |
| [~EncoderParameter](./~encoderparameter/)() | Деструктор. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
