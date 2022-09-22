---
title: EncoderParameter
second_title: Справочник по API Aspose.Drawing для .NET
description: Используется для передачи значения или массива значений в кодировщик изображений.
type: docs
weight: 700
url: /ru/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Используется для передачи значения или массива значений в кодировщик изображений.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter) класс с указаннымEncoder object и одно 8-битное целое число без знака. УстанавливаетValueType свойство вValueTypeByte , и устанавливаетNumberOfValues свойство на 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и массив 8-битных целых чисел без знака. УстанавливаетValueType собственность наValueTypeByte , и устанавливаетNumberOfValues свойство на количество элементов в массиве. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и одно 64-битное целое число. УстанавливаетValueType свойство вValueTypeLong (32 бита) и устанавливает the NumberOfValues свойство до 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и массив 64-битных целых чисел. УстанавливаетValueType свойство дляValueTypeLong (32-разрядная версия) и устанавливает NumberOfValues свойство на количество элементов в массиве. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и одно 16-битное целое число. УстанавливаетValueType свойство вValueTypeShort , и устанавливаетNumberOfValues свойство на 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и массив 16-битных целых чисел. УстанавливаетValueType свойство дляValueTypeShort , и устанавливает the NumberOfValues свойство на количество элементов в массиве. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объекта и строки символов. Строка преобразуется в строку ASCII с завершающим нулем до того, как будет сохранена вEncoderParameter объект. УстанавливаетValueType свойство дляValueTypeAscii , и устанавливает NumberOfValues свойство на длину строки ASCII, включая терминатор NULL. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и одно 8-битное значение. УстанавливаетValueType свойство вValueTypeUndefined или жеValueTypeByte , и устанавливаетNumberOfValues свойство до 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и массив байтов. УстанавливаетValueType свойство дляValueTypeUndefined или ValueTypeByte , и устанавливаетNumberOfValues на количество элементов в массиве. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoderобъекта и пару 32-битных целых чисел. Пара целых чисел представляет дробь, первое целое число является числителем, а второе целое число является знаменателем. ЗадаетValueType собственность наValueTypeRational , и устанавливаетNumberOfValues свойство до 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и два массива 32-битных целых чисел. Два массива представляют собой массив дробей. УстанавливаетValueType собственность наValueTypeRational , и устанавливаетNumberOfValuesсвойство на количество elements в*numerator* массив, который должен совпадать с количеством elements в*denominator* множество. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и пару 64-битных целых чисел. Пара целых чисел представляет диапазон целых чисел, первое целое число является наименьшим числом в диапазоне, а второе целое число является наибольшим числом в диапазоне. ЗадаетValueType собственность наValueTypeLongRange , и устанавливаетNumberOfValues свойство до 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и два массива 64-битных целых чисел. Два массива представляют диапазоны целых чисел массива. УстанавливаетValueType собственность наValueTypeLongRange , и устанавливаетNumberOfValuesсвойство на количество elements в*rangebegin* массив, который должен совпадать с количеством elements в*rangeend* массив. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и три целых числа, которые определяют количество значений, тип данных значений, и указатель на значения, хранящиеся вEncoderParameter объект. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и четыре 32-битных целых числа. Четыре целых числа представляют собой диапазон дробей. Первые два целых числа представляют наименьшую дробь в диапазоне, а оставшиеся два целых числа представляют собой наибольшую дробь в диапазоне. УстанавливаетValueType свойство to ValueTypeRationalRange , и устанавливает NumberOfValues свойство до 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Инициализирует новый экземпляр[`EncoderParameter`](../encoderparameter)класс с указанным Encoder объект и четыре массива 32-битных целых чисел. Четыре массива представляют собой массив рациональных диапазонов. Рациональный диапазон — это набор всех дробей от минимального дробного значения до максимального дробного значения. УстанавливаетValueType собственность наValueTypeRationalRange , и устанавливаетNumberOfValues свойство на количество элементов in *numerator1* массив, который должен совпадать с количеством элементов в трех других массивах. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Получает или задаетEncoder объект, связанный с этимEncoderParameter object. Encoder Объект инкапсулирует глобальный уникальный идентификатор (GUID), который определяет категорию (например,Quality ,ColorDepth , илиCompression ) параметра, хранящегося в этомEncoderParameter объект. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Получает количество элементов в массиве значений, хранящихся в этомEncoderParameter объект. |

## Методы

| Имя | Описание |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Освобождает все ресурсы, используемые этимEncoderParameter объект. |

### Смотрите также

* пространство имен [System.Drawing.Imaging](../../system.drawing.imaging)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
