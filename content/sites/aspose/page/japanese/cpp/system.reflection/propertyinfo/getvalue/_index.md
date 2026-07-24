---
title: "System::Reflection::PropertyInfo::GetValue メソッド"
linktitle: "GetValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::PropertyInfo::GetValue メソッド。C++ の特定オブジェクトからプロパティ値を取得します。"
type: docs
weight: 400
url: /ja/cpp/system.reflection/propertyinfo/getvalue/
---
## PropertyInfo::GetValue(System::SharedPtr\<System::Object\>) method


特定のオブジェクトからプロパティの値を取得します。

```cpp
System::SharedPtr<System::Object> System::Reflection::PropertyInfo::GetValue(System::SharedPtr<System::Object> obj)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | System::SharedPtr\<System::Object\> | プロパティを読み取るための [Object](../../../system/object/) |

### ReturnValue

指定されたオブジェクトの指定されたプロパティの値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::GetValue(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) method


特定のオブジェクトからプロパティの値を取得します。

```cpp
System::SharedPtr<System::Object> System::Reflection::PropertyInfo::GetValue(System::SharedPtr<System::Object> obj, System::ArrayPtr<System::SharedPtr<System::Object>> indexer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | System::SharedPtr\<System::Object\> | プロパティを読み取るための [Object](../../../system/object/) |
| インデクサ | System::ArrayPtr\<System::SharedPtr\<System::Object\>\> | これらはインデックス付きプロパティのオプションのインデックス値です。インデックスなしプロパティの場合、この値は null にする必要があります。 |

### ReturnValue

指定されたオブジェクトの指定されたプロパティの値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
