---
title: "System::Collections::Generic::operator== yöntemi"
linktitle: "operator=="
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::operator== yöntemi. İki anahtar-değer çiftini ''equals'' (eşitlik) semantiğiyle karşılaştırır. Her iki anahtar ve değer için C++'ta tanımlı olan operator == ya da EqualsTo yöntemini kullanır."
type: docs
weight: 5600
url: /tr/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


İki anahtar-değer çiftini 'equals' semantiğiyle karşılaştırır. Her iki anahtar ve değer için tanımlı olan operator == ya da EqualsTo yöntemini kullanır.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parametre | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| sol | const KeyValuePair\<TKey, TValue\>\& | Sol taraf operandı. |
| sağ | const KeyValuePair\<TKey, TValue\>\& | Sağ taraf operandı. |

### ReturnValue

Her iki anahtar ve değer eşleşiyorsa doğru, aksi takdirde yanlıştır.

## Ayrıca Bakınız

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
