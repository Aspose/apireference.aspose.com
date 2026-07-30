---
title: "System::Is yöntemi"
linktitle: "Mi"
second_title: "Aspose.Font için C++"
description: "System::Is yöntemi. Üst düzey eşleştirme işlevi. C++'da bir değere desen uygular."
type: docs
weight: 22000
url: /tr/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Üst düzey eşleştirme işlevi. Bir değere desen uygular.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parametre | Açıklama |
| --- | --- |
| A | Desen türü (Details::Pattern'ten türemelidir). |
| E | Eşleştirilecek değerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| e | const E\\& | Karşılaştırılacak değer. |
| a | const A\\& | Uygulanacak desen. |

### ReturnValue

Desen değere eşleşiyorsa doğru.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


'is' sabit desen çevirisini uygular.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parametre | Açıklama |
| --- | --- |
| ExpressionT | sol ifade türü. |
| ConstantT | sabit ifadenin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| sol | const ExpressionT\& | denetlenecek ifade. |
| sabit | const ConstantT\& | soldaki ile karşılaştırılacak ifade. |

### ReturnValue

tip kontrolü başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


'is' bildirim deseni çevirisini uygular.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parametre | Açıklama |
| --- | --- |
| PatternT | kontrol edilecek tip. |
| ExpressionT | sol ifade türü. |
| ResultT | sonuç ifadesinin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| sol | const ExpressionT\& | denetlenecek ifade. |
| result | ResultT\& | kontrol edilen tipe atanacak değişken. |

### ReturnValue

tip kontrolü başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
