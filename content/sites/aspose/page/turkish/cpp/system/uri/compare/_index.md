---
title: "System::Uri::Compare yöntemi"
linktitle: "Compare"
second_title: "Aspose.Page için C++"
description: "System::Uri::Compare yöntemi. Belirtilen Uri nesnelerini, belirtilen karşılaştırma kurallarını kullanarak C++'ta karşılaştırır."
type: docs
weight: 3500
url: /tr/cpp/system/uri/compare/
---
## Uri::Compare method


Belirtilen [Uri](../) nesnelerini, belirtilen karşılaştırma kurallarını kullanarak karşılaştırır.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | İlk karşılaştırılan |
| uri2 | const SharedPtr\<Uri\>\& | İkinci karşılaştırılan |
| partsToCompare | UriComponents | **uri1** ve **uri2**'nin karşılaştırılacak bölümlerini belirtir |
| compareFormat | UriFormat | URI bileşenleri karşılaştırıldığında kullanılan karakter kaçışını belirtir |
| comparisonType | StringComparison | [StringComparison](../../stringcomparison/) değerlerinden biri |

### ReturnValue

**uri1** **uri2**'den küçükse negatif bir değer; uri1 ve uri2 eşitse 0; **uri1** **uri2**'den büyükse pozitif bir değer

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
