---
title: "System::Collections::Generic::List::ConvertAll メソッド"
linktitle: "ConvertAll"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::List::ConvertAll メソッド。C++ で要素を別の型に変換したリストを作成します。"
type: docs
weight: 1300
url: /ja/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


要素を別の型に変換したリストを作成します。

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| パラメーター | 説明 |
| --- | --- |
| OutputType | 出力リストの要素型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) をアイテム変換に使用します。 |

### ReturnValue

変換された要素の新しく作成されたリスト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
