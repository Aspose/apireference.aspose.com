---
title: "System::ObjectExt::UnknownToObject メソッド"
linktitle: "UnknownToObject"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::UnknownToObject メソッド。未知の型を Object に変換し、C++ におけるスマートポインタ型と値型の両方の状況を処理します。"
type: docs
weight: 1800
url: /ja/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


未知の型を [Object](../../object/) に変換し、スマートポインタ型と値型の両方の状況を処理します。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) に変換する型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) に変換します。 |

### ReturnValue

[Object](../../object/) へのスマートポインタで、変換されたポインタまたはボックス化された値のいずれかです。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


未知の型を [Object](../../object/) に変換し、スマートポインタ型と値型の両方の状況を処理します。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) に変換する型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T | [Object](../../object/) に変換します。 |

### ReturnValue

[Object](../../object/) へのスマートポインタで、変換されたポインタまたはボックス化された値のいずれかです。

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
