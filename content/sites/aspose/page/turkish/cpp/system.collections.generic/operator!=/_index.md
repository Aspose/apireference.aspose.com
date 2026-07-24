---
title: "System::Collections::Generic::operator!= yöntemi"
linktitle: "operator!="
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::operator!= yöntemi. C++'ta ters ''equals'' semantiği kullanarak iki anahtar-değer çiftini karşılaştırır."
type: docs
weight: 5300
url: /tr/cpp/system.collections.generic/operator!=/
---
## System::Collections::Generic::operator!= method


Ters 'equals' semantiği kullanarak iki anahtar-değer çiftini karşılaştırır.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator!=(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
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

Hem anahtarlar hem de değerler eşleşmezse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
