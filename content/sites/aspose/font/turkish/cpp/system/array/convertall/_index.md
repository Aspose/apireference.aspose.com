---
title: "System::Array::ConvertAll yöntemi"
linktitle: "ConvertAll"
second_title: "Aspose.Font için C++"
description: "System::Array::ConvertAll yöntemi. Belirtilen diziden dönüştürülmüş elemanlarla yeni bir Array nesnesi oluşturur ve C++'ta belirtilen dönüştürücü temsilcisi kullanılarak OutputType türüne dönüştürülmüş elemanlarla doldurur."
type: docs
weight: 4800
url: /tr/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Belirtilen diziden dönüştürülmüş elemanlarla yeni bir [Array](../) nesnesi oluşturur ve belirtilen dönüştürücü temsilcisi kullanılarak **OutputType** türüne dönüştürülmüş elemanlarla doldurur.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parametre | Açıklama |
| --- | --- |
| InputType | Girdi dizisinin elemanlarının türü |
| OutputType | Sonuç dizisinin elemanlarının türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Bir [Array](../) nesnesi |
| converter | Converter\<InputType, OutputType\> | Girdi dizisinin her bir elemanını **OutputType** türündeki eşdeğer değerlere dönüştürmek için kullanılan bir [Converter](../../converter/) nesnesi |

### ReturnValue

**input_array** değerlerine eşdeğer **OutputType** türündeki değerleri içeren yeni bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Belirtilen diziden dönüştürülmüş elemanlarla yeni bir [Array](../) nesnesi oluşturur ve belirtilen dönüştürücü fonksiyon nesnesi kullanılarak **OutputType** türüne dönüştürülmüş elemanlarla doldurur.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parametre | Açıklama |
| --- | --- |
| InputType | Girdi dizisinin elemanlarının türü |
| OutputType | Sonuç dizisinin elemanlarının türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Bir [Array](../) nesnesi |
| dönüştürücü | std::function\<OutputType(InputType)> | Girdi dizisinin her bir elemanını **OutputType** türündeki eşdeğer değerlere dönüştürmek için kullanılan bir fonksiyon nesnesi |

### ReturnValue

**input_array** değerlerine eşdeğer **OutputType** türündeki değerleri içeren yeni bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
