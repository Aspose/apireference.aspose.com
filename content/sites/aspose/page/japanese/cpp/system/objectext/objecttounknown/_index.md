---
title: "System::ObjectExt::ObjectToUnknown メソッド"
linktitle: "ObjectToUnknown"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::ObjectToUnknown メソッド。Object を未知の型に変換し、C++ におけるスマートポインタ型とボックス化された値の両方の状況を処理します。"
type: docs
weight: 1200
url: /ja/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) を未知の型に変換し、スマートポインタ型とボックス化された値の両方の状況を処理します。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) を変換する型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) に変換します。 |

### ReturnValue

アンボックスされた値または変換されたポインタのいずれか。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) を未知の型に変換し、スマートポインタ型とボックス化された値の両方の状況を処理します。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) を変換する型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) に変換します。 |

### ReturnValue

アンボックスされた値または変換されたポインタのいずれか。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
