---
title: "System::Array::ConvertAll yöntemi"
linktitle: "ConvertAll"
second_title: "Aspose.Page için C++"
description: "System::Array::ConvertAll yöntemi. Belirtilen diziden dönüştürülmüş elemanlarla yeni bir Array nesnesi oluşturur ve bunu OutputType türüne dönüştürülmüş elemanlarla doldurur, belirtilen dönüştürücü temsilcisi kullanılarak C++'ta."
type: docs
weight: 4800
url: /tr/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Belirtilen diziden dönüştürülmüş elemanlarla yeni bir [Array](../) nesnesi oluşturur ve bunu **OutputType** türüne dönüştürülmüş elemanlarla doldurur, belirtilen dönüştürücü temsilcisi kullanılarak.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | Açıklama |
| --- | --- |
| InputType | Giriş dizisinin elemanlarının türü |
| OutputType | Sonuç dizisinin elemanlarının türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Bir [Array](../) nesnesi |
| converter | Converter\<InputType, OutputType\> | Giriş dizisinin her bir elemanını **OutputType** türündeki eşdeğer değerlere dönüştürmek için kullanılan bir [Converter](../../converter/) nesnesi |

### ReturnValue

**input_array** değerlerine eşdeğer **OutputType** türündeki değerleri içeren yeni bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Belirtilen diziden dönüştürülmüş elemanlarla yeni bir [Array](../) nesnesi oluşturur ve bunu **OutputType** türüne dönüştürülmüş elemanlarla doldurur, belirtilen dönüştürücü fonksiyon nesnesi kullanılarak.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | Açıklama |
| --- | --- |
| InputType | Giriş dizisinin elemanlarının türü |
| OutputType | Sonuç dizisinin elemanlarının türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Bir [Array](../) nesnesi |
| dönüştürücü | std::function\<OutputType(InputType)> | Giriş dizisinin her bir elemanını **OutputType** türündeki eşdeğer değerlere dönüştürmek için kullanılan bir fonksiyon nesnesi |

### ReturnValue

**input_array** değerlerine eşdeğer **OutputType** türündeki değerleri içeren yeni bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
