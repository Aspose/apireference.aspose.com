---
title: "System::Collections::Generic::KeyValuePair sınıfı"
linktitle: "KeyValuePair"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::KeyValuePair sınıfı. Anahtar ve değerin çifti. Bu tip yığıt (stack) üzerine tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 2900
url: /tr/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Anahtar ve değerin çifti. Bu tip yığıt üzerine tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../../system/smartptr/) sınıfını asla kullanmayın.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Key](./get_key/)() const | Anahtarı alır. |
| [get_Value](./get_value/)() const | Değeri alır. |
| [GetHashCode](./gethashcode/)() const | Anahtar ve değerin hash'lerini XORlayarak anahtar-değer çifti hash'ini hesaplar. |
| [IsNull](./isnull/)() const | Her zaman false döndürür. |
| [KeyValuePair](./keyvaluepair/)() | Boş anahtar-değer çifti başlatıcısı. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Yapıcı. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Tip dönüşüm yapıcı. |
| [operator<](./operator_/)(const KeyValuePair\&) const | [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/) sınıfından türetilen sınıflar için yama, hiçbir şeyi karşılaştırmaz. |
| [ToString](./tostring/)() const | Anahtar-değer çiftini dizeye dönüştürür. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
