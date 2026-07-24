---
title: "System::GetHashCode metodu"
linktitle: "KarmaKodAl"
second_title: "Aspose.Page için C++"
description: "System::GetHashCode metodu. std::thread::id için özelleştirme; C++'ta belirtilen thread nesnesi için hash kodunu döndürür."
type: docs
weight: 21200
url: /tr/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


std::thread::id için özelleştirme; belirtilen thread nesnesi için hash kodunu döndürür.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Belirtilen skaler değer için bir hash kodu döndürür.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Fonksiyonun hash kodu ürettiği değerin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Hash kodu üretilecek değer |

### ReturnValue

Belirtilen değer için üretilen hash kodu

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Belirtilen nesne için bir karma kodu döndürür.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Fonksiyonun karma kodu ürettiği nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Karma kodu üretilecek nesneyi işaret eden [SmartPtr](../smartptr/) |

### ReturnValue

Belirtilen nesne için oluşturulan karma kodu

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Belirtilen nesne (istisna) için bir karma kodu döndürür.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Fonksiyonun karma kodu ürettiği nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Karma kodu üretilecek nesneyi içeren [Exception](../exception/) sarmalayıcı |

### ReturnValue

Belirtilen nesne için oluşturulan karma kodu

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


Belirtilen nesne akıllı işaretçi ya da istisna olmadığında bir karma kodu döndürür.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Fonksiyonun karma kodu ürettiği nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Karma kodu üretilecek nesneye const referans |

### ReturnValue

Belirtilen nesne için oluşturulan karma kodu

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
