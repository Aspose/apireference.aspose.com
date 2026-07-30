---
title: "System::Collections::Generic::operator== 方法"
linktitle: "operator=="
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::operator== 方法。使用 ''equals'' 语义比较两个键值对。对键和值均使用 operator == 或 EqualsTo 方法，以 C++ 中定义的为准。"
type: docs
weight: 5600
url: /zh/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


使用 'equals' 语义比较两个键值对。对键和值均使用 operator == 或 EqualsTo 方法，以定义的为准。

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
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

如果键和值都匹配则为 true，否则为 false。

## 另见

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
