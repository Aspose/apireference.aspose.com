---
title: "System::Collections::Generic::List::ConvertAll yöntemi"
linktitle: "ConvertAll"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::List::ConvertAll yöntemi. C++'de farklı bir tipe dönüştürülmüş öğelerden bir liste oluşturur."
type: docs
weight: 1300
url: /tr/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Farklı türe dönüştürülmüş öğelerden bir liste oluşturur.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parameter | Açıklama |
| --- | --- |
| OutputType | Çıktı liste öğesi tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) öğe dönüşümü için kullanılacak. |

### ReturnValue

Dönüştürülmüş öğelerden yeni oluşturulmuş bir liste.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
