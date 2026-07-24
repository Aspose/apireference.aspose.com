---
title: "System::Compare method"
linktitle: "Compare"
second_title: "Aspose.Page için C++"
description: "System::Compare yöntemi. C++'da iki değeri karşılaştırır."
type: docs
weight: 15800
url: /tr/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


İki değeri karşılaştırır.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Açıklama |
| --- | --- |
| TA | İlk karşılaştırılanın türü |
| TB | İkinci karşılaştırılanın türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| a | const TA\& | İlk karşılaştırılan |
| b | const TB\& | İkinci karşılaştırılan |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


İki kayan nokta değerini karşılaştırır.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| Parameter | Açıklama |
| --- | --- |
| TA | İlk karşılaştırılanın türü |
| TB | İkinci karşılaştırılanın türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| a | const TA\& | İlk karşılaştırılan |
| b | const TB\& | İkinci karşılaştırılan |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
