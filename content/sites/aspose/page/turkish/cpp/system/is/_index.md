---
title: "System::Is yöntemi"
linktitle: "Mi"
second_title: "Aspose.Page için C++"
description: "System::Is yöntemi. Üst düzey eşleştirme işlevi. C++'da bir değere bir desen uygular."
type: docs
weight: 21900
url: /tr/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Üst düzey eşleştirme işlevi. Bir değere bir desen uygular.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Açıklama |
| --- | --- |
| A | Desen türü (Details::Pattern'ten türemelidir). |
| E | Eşleştirilecek değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| e | const E\& | Eşleştirilecek değer. |
| a | const A\& | Uygulanacak desen. |

### ReturnValue

Desen değere eşleşiyorsa true.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


'is' sabit desen çevirisini uygular.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Açıklama |
| --- | --- |
| ExpressionT | sol ifade türü. |
| ConstantT | sabit ifade türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| sol | const ExpressionT\& | denetlenecek ifade. |
| sabit | const ConstantT\& | sol ifadeyle karşılaştırılacak ifade. |

### ReturnValue

tip kontrolü başarılıysa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


'is' bildirim desen çevirisini uygular.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Açıklama |
| --- | --- |
| PatternT | kontrol edilecek tip. |
| ExpressionT | sol ifade türü. |
| ResultT | sonuç ifadesinin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| sol | const ExpressionT\& | denetlenecek ifade. |
| sonuç | ResultT\& | kontrol edilen tipe atanacak değişken. |

### ReturnValue

tip kontrolü başarılıysa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
