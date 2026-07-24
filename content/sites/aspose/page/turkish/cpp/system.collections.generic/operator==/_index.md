---
title: "System::Collections::Generic::operator== yöntemi"
linktitle: "operator=="
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::operator== yöntemi. İki anahtar-değer çiftini ''equals'' (eşitlik) semantiğiyle karşılaştırır. C++'ta tanımlı olan, anahtarlar ve değerler için operator == ya da EqualsTo yöntemini kullanır."
type: docs
weight: 5600
url: /tr/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


İki anahtar-değer çiftini 'equals' semantiğiyle karşılaştırır. Anahtarlar ve değerler için tanımlı olan operator == ya da EqualsTo yöntemini kullanır.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parameter | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| sol | const KeyValuePair\<TKey, TValue\>\& | LHS operandı. |
| sağ | const KeyValuePair\<TKey, TValue\>\& | Sağ taraf operandı. |

### ReturnValue

Anahtarlar ve değerler eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
