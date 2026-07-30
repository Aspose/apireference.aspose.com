---
title: "System::Collections::Generic::operator!= 方法"
linktitle: "operator!="
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::operator!= 方法。使用 C++ 中的逆 ''equals'' 语义比较两个键值对。"
type: docs
weight: 5300
url: /zh/cpp/system.collections.generic/operator!=/
---
## System::Collections::Generic::operator!= method


使用逆 'equals' 语义比较两个键值对。

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator!=(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TValue | 值类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 左 | const KeyValuePair\<TKey, TValue\>\& | 左侧操作数。 |
| 右 | const KeyValuePair\<TKey, TValue\>\& | 右侧操作数。 |

### ReturnValue

如果键和值都不匹配则为 True，否则为 false。

## 另见

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
