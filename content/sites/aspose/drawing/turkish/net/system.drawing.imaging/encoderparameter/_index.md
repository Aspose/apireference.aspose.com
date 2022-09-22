---
title: EncoderParameter
second_title: Aspose.Drawing for .NET API Referansı
description: Bir görüntü kodlayıcıya bir değer veya bir dizi değer iletmek için kullanılır.
type: docs
weight: 700
url: /tr/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Bir görüntü kodlayıcıya bir değer veya bir dizi değer iletmek için kullanılır.

```csharp
public sealed class EncoderParameter : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter) belirtilen sınıfEncoder object ve bir işaretsiz 8 bit tam sayı. ayarlarValueType property içinValueTypeByte ve ayarlarNumberOfValues özelliğinden 1. 'ye |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve işaretsiz 8 bitlik tamsayılar dizisi. ValueType mülkValueTypeByte , ve ayarlarNumberOfValues dizideki öğelerin sayısı için özellik. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir 64 bit tam sayı. ayarlarValueType property içinValueTypeLong (32 bit) ve the değerini ayarlarNumberOfValues 1. için özellik |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir dizi 64 bit tam sayı. ayarlarValueType özelliğiValueTypeLong (32 bit) ve set NumberOfValues dizideki öğelerin sayısı için özellik. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir, 16 bit tam sayı. ayarlarValueType property içinValueTypeShort ve ayarlarNumberOfValues özelliğinden 1. 'ye |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir dizi 16 bit tam sayı. ayarlarValueType özelliğiValueTypeShort , ve the değerini ayarlarNumberOfValues dizideki öğelerin sayısı için özellik. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir karakter dizisi. Dize, dizininde depolanmadan önce boş sonlandırılmış bir ASCII dizesine dönüştürülür.EncoderParameter nesne. ayarlarValueType özelliğiValueTypeAscii , ve set NumberOfValues NULL sonlandırıcı dahil olmak üzere ASCII dizesinin uzunluğuna özellik. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir 8 bitlik değer. ayarlarValueType property içinValueTypeUndefined veyaValueTypeByte , ve ayarlarNumberOfValues 1. için özellik |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir bayt dizisi. ayarlarValueType özelliğiValueTypeUndefined or ValueTypeByte ve ayarlarNumberOfValues dizideki öğe sayısına özelliği. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncodernesne ve bir çift 32 bit tam sayı. Tam sayı çifti bir kesri temsil eder, birinci tam sayı pay ve ikinci tam sayı paydadır. ValueType mülkValueTypeRational , ve ayarlarNumberOfValues 1. için özellik |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve iki 32 bit tamsayı dizisi. İki dizi, bir kesir dizisini temsil eder. ValueType mülkValueTypeRational , ve ayarlarNumberOfValuesiçindeki element sayısına özellik*numerator* içindeki element sayısıyla aynı olması gereken dizi*denominator* dizi. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve bir çift 64 bit tam sayı. Tam sayı çifti bir tamsayı aralığını temsil eder, ilk tam sayı aralıktaki en küçük sayıdır ve ikinci tam sayı aralıktaki en büyük sayıdır. ValueType mülkValueTypeLongRange , ve ayarlarNumberOfValues 1. için özellik |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve iki 64-bit tamsayı dizisi. İki dizi, bir dizi tamsayı aralığını temsil eder. ValueType mülkValueTypeLongRange , ve ayarlarNumberOfValuesiçindeki element sayısına özellik*rangebegin* içindeki element sayısıyla aynı olması gereken dizi*rangeend* dizi. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve değerlerin sayısını, değerlerin veri türünü, ve içinde depolanan değerlere bir işaretçiyi belirten üç tamsayıEncoderParameter nesne. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve dört, 32 bit tamsayı. Dört tam sayı, bir kesir aralığını temsil eder. İlk iki tam sayı, aralıktaki en küçük kesri ve kalan iki tam sayı, aralıktaki en büyük kesri temsil eder. ayarlarValueType özellik to ValueTypeRationalRange , ve set NumberOfValues 1. için özellik |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Yeni bir örneğini başlatır[`EncoderParameter`](../encoderparameter)Belirtilen ile sınıfEncoder nesne ve 32 bit tamsayılardan oluşan dört dizi. Dört dizi, bir dizinin rasyonel aralıklarını temsil eder. Rasyonel aralık, minimum kesirli değerden maksimum kesirli değere kadar tüm kesirlerin kümesidir. ValueType mülkValueTypeRationalRange , ve ayarlarNumberOfValues özelliği, in içindeki öğelerin sayısına*numerator1* diğer üç dizideki öğe sayısıyla aynı olması gereken dizi. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Alır veya ayarlarEncoder bununla ilişkili nesneEncoderParameter nesne. Encoder nesne, kategori 'yi belirten genel olarak benzersiz tanımlayıcıyı (GUID) içine alır (örneğinQuality ,ColorDepth , veyaCompression ) burada saklanan parametreninEncoderParameter nesne. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Burada depolanan değerler dizisindeki öğelerin sayısını alır.EncoderParameter nesne. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Bunun kullandığı tüm kaynakları serbest bırakırEncoderParameter nesne. |

### Ayrıca bakınız

* ad alanı [System.Drawing.Imaging](../../system.drawing.imaging)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
